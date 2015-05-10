
package com.sinfonier.bolts;



public class Clasificador  extends BaseSinfonierBolt {

    //TO-DO: Declare variables

    //private String var;
    //private String name;

    public (String xmlFile) {
        super(xmlFile);
    }

    @Override
    public void userprepare() {

        // TO-DO: Init values. Code here runs once

        //this.var = "value";

        // Get Param (getField value of "param_name" from input box)
        //this.name = (String)this.getParam("param_name");
    }

    @Override
    public void userexecute() {

        // TO-DO: Write your code here. This code runs once by each input tuple
        // You can use the following functions to process it

         //Map<String, Object> json=this.getJson();

        // salida=new JSONArray();  
        
        //String texto= (String) json.get("text");

        //String id= original.getString("id");

        //this.setJSon(salida);


        //this.addField("Tweet",texto);
        //this.addField("id",id);
        
        // Mandatory. Emit the tuple to the next bolt
        this.emit();
        
    }
    public void usercleanup() {
    }

}



