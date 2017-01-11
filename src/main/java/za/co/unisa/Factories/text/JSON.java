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

import org.json.simple.JSONObject;

/**
 *
 * @author Mufaro Benedict
 */
public class JSON implements Text {

    public JSON() {
        
    }
    
    
    @Override
    public void write() {
        System.out.println("\nI am writing a JSON Text! below ");
         JSONObject obj = new JSONObject();

      obj.put("Name", "MUFARO");
      obj.put("Age", new Integer(32));
      obj.put("Salary", new Double(120500));
    //  obj.put("is_vip", new Boolean(true));

      System.out.print(obj);
        //To change body of generated methods, choose Tools | Templates.
    }
    
}
