
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


package com.sinfonier.spouts;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Clasificador extends BaseSinfonierSpout {

    private File file;
    private Scanner sc;

    public (String spoutName, String xmlPath) {
        super(spoutName, xmlPath);

    }

    public void useropen(){

        // TO-DO: Init values. Code here runs once.
        // In Spouts this function is very important. Must get an object than can
        // iterate to use it in usernextTuple()

        file = new File((String)this.getParam("file"));
        this.addField("erser");
        try {
            sc = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    public void usernextTuple(){

        // TO-DO: Write code here. This code reads an input tuple by each execution
        // You can use the same functions as in the Bolts to process it.
        // Tipically is to use this.addField to build the Tuple to emit.

        if (sc.hasNextLine()) {
            String row = sc.nextLine();
            System.out.println("SC ROW: "+row);
            String[] splitted = row.split(",");
            this.addField(splitted[0], splitted[1]);

            this.emit();
        }


    }
    public void userclose() {
    }
}


