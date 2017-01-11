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

package za.co.unisa.observers.observerObjects;

import za.co.unisa.observers.Observer;
import za.co.unisa.observers.Subject;

/**
 *
 * @author Mufaro Benedict
 */
public class ListObserver extends Observer{
/**
 * constructor of the observer object registration and attachment 
 * @param subject 
 */
   @SuppressWarnings("LeakingThisInConstructor")
   public ListObserver(Subject subject){
      this.subject = subject;
      this.subject.attach(this);
   }
/**
 * implementation of the update method if necessary 
 */
   @Override
   public void update() {
     System.out.println( "Octal String List View: " + Integer.toOctalString( subject.getState() ) ); 
   }
}
