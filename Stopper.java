/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinfonier.bolts;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author portatil
 */
public class Stopper extends BaseSinfonierBolt {

    private String stopperURL;
    private String fieldToParse;
    private Set<String> words=new HashSet<String>();
    public Stopper(String path) {
        
        
        super(path);
        
    }

    @Override
    public void userprepare() {
        this.stopperURL=this.getParam("textField");
        this.fieldToParse=this.getParam("tagToParse");
        try {
            read();
        } catch (IOException ex) {
            Logger.getLogger(Stopper.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void userexecute() {
        
        String texto=(String)this.getField(fieldToParse);
        
        String aux[]=texto.split(" ");
        String result="";
        for(int i=0;i<aux.length;i++)
        {
            if(!words.contains(aux[i]))
            {
                
                result+=aux[i]+" ";
            }            
        }

        
        this.addField("Stopper", result);
        this.emit();
        
        
    }
    private void read() throws MalformedURLException, IOException
    {
        URL url= new URL(stopperURL);
        URLConnection con=url.openConnection();
        con.connect();
        
        BufferedReader file=new BufferedReader(new InputStreamReader(con.getInputStream()));
        
        String lin;
        
        while((lin=file.readLine())!=null)
        {
            words.add(lin.trim());
        }
        file.close();
    }
    @Override
    public void usercleanup() {
        
    }
    
}
