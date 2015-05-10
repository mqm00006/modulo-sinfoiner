
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
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class Clasificador  extends BaseSinfonierBolt {

    //TO-DO: Declare variables

    private String var;


    public (String xmlFile) {
        super(xmlFile);
    }

    @Override
    public void userprepare() {

        // TO-DO: Init values. Code here runs once

       /* this.var = "value";

        // Get Param (getField value of "param_name" from input box)
        this.name = (String)this.getParam("param_name");*/
    }

    @Override
    public void userexecute() {

        // TO-DO: Write your code here. This code runs once by each input tuple
        // You can use the following functions to process it

        JSONArray original= new JSONArray(this.getJson);

        JSONArray salida=new JSONArray();  
        
        String texto= original.getString("text");

        String id= original.getString("id");

        this.setJSon(salida);

        this.addField("Tweet",texto);
        this.addField("id",id);
        
        // Mandatory. Emit the tuple to the next bolt
        this.emit();
        
    }
    public void usercleanup() {
    }

}



