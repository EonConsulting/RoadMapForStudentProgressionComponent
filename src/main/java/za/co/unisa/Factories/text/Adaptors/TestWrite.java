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
package za.co.unisa.Factories.text.Adaptors;

import za.co.unisa.Factories.text.Text;

/**
 * In this example, you don’t have to touch any of the Framework classes,
 * if you are adding a new TextType. You just need to add the new TextType 
 * entry in the Text type enum class, which is used by only the client class.
 * @author Mufaro Benedict
 */
public class TestWrite {

    public TestWrite() {
    }
    /**
	 * Main test method
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			TextFactory factory = TextFactory.INSTANCE;
			Text  text = factory.createText(TextTypes.CSV.name());
			text.write();
			text = factory.createText(TextTypes.XML.name());
			text.write();
			text= factory.createText(TextTypes.JSON.name());
			text.write();
			// when you add another output change csv1 to the output type
                   //     text = factory.createText("CSV1");
		//	text.write();
		} catch (Exception e) {
				System.out.println(e.getMessage());
		}
	}
}
