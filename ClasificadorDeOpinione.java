
/*
    The MIT License (MIT)

    Copyright (c) 2015 sinfonier-project

    Permission is hereby granted, free of charge, to any person obtaining a copy
    of this software and associated documentation files (the "Software"), to deal
    in the Software without restriction, including without limitation the rights
    to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
    copies of the Software, and to permit persons to whom the Software is
    furnished to do so, subject to the following conditions:

    The above copyright notice and this permission notice shall be included in
    all copies or substantial portions of the Software.

    THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
    IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
    FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
    AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
    LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
    OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
    THE SOFTWARE.
*/

package com.sinfonier.bolts;
import java.util.*;
public class ClasificadorDeOpinione  extends BaseSinfonierBolt {

    //TO-DO: Declare variables

    
    private String texto;
    
    public ClasificadorDeOpinione(String xmlFile) {
        super(xmlFile);
    }

    @Override
    public void userprepare() {

        // TO-DO: Init values. Code here runs once
        

        

        // Get Param (get value of "param_name" from input box)
        this.texto = (String)this.getField("text");
        
    }

    @Override
    public void userexecute() {


        
        try{
            
            	
            
            //Map<String,Object> json2=new HashMap<String,Object>();
                

            
            this.emit();    

	}catch(Exception e){
		e.printStackTrace();
	}

       
        
    }

    @Override
    public void usercleanup() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    

}



