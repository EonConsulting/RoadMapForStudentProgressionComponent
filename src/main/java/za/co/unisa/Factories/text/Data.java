/*
 * Copyright (c) 2016, University of South Africa and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 */
package za.co.unisa.Factories.text;

/**
 *
 * @author Mufaro Benedict
 */
import java.math.BigDecimal;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
public class Data {
    
     static ArrayList<String> emptags = new ArrayList<String>();

     static HashMap<String, String> databaseMetadata = new HashMap<String, String>();

     static HashMap<String, String> tagsTometadata = new HashMap<String, String>();


    private String name;
    private BigDecimal salary;
    private int age;
public Data(){}
    public Data(String name, BigDecimal salary, int age) {
        this.name = name;
        this.salary = salary;
        this.age = age;
    }

     public void populate(){
      emptags.add("Name");

      emptags.add("Salary");

      emptags.add("Age");



      databaseMetadata.put("NAM","MUFARO");
      databaseMetadata.put("SAL","120500");
      databaseMetadata.put("AGE","32");

      tagsTometadata.put("Name","NAM");
      tagsTometadata.put("Salary","SAL");
      tagsTometadata.put("Age","AGE");

   }
     public void xml(){
             
       //       Data d = new Data();
  //    d.populate();
populate();

  System.out.println(emptags);
      try{
         DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
         DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
         Document doc = docBuilder.newDocument();
         Element rootElement = doc.createElement("Developers");
         doc.appendChild(rootElement);
         for(int i=0;i<emptags.size();i++){
            Element newElement = doc.createElement(emptags.get(i));
            if(tagsTometadata.containsKey(emptags.get(i))){
               if(databaseMetadata.containsKey(tagsTometadata.get(emptags.get(i)))){
                  newElement.appendChild(doc.createTextNode(databaseMetadata.get(tagsTometadata.get(emptags.get(i)))));
               }
            }

            rootElement.appendChild(newElement);
         }
         TransformerFactory transformerFactory = TransformerFactory.newInstance();
         Transformer transformer = transformerFactory.newTransformer();
         DOMSource source = new DOMSource(doc);
      //   StreamResult result = new StreamResult(new File("C:\\users\\Arun\\Desktop\\file1.xml"));

         // Output to console for testing
          StreamResult result = new StreamResult(System.out);

         transformer.transform(source, result);

       //  System.out.println("File saved!");

      }
      catch(Exception e){
         e.printStackTrace();
      }
        
     }
    //...

    String getName() {
      return name;
       //To change body of generated methods, choose Tools | Templates.
    
    }

    Object getSalary() {
        return salary; //To change body of generated methods, choose Tools | Templates.
    }

    Object getAge() {
        return age; //To change body of generated methods, choose Tools | Templates.
    }
}