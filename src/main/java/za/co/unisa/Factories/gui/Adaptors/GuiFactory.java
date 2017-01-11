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
package za.co.unisa.Factories.gui.Adaptors;


/**
 *
 * @author Mufaro Benedict
 */
import java.util.HashMap;
import java.util.Map;
import za.co.unisa.Factories.gui.Gui;

public enum  GuiFactory {
  INSTANCE;
  private Map<String, Gui> texts = new HashMap<String, Gui>();
	
	public Gui createGui(String guiType)
			throws Exception {
		Gui gui = texts.get(guiType);
		if (gui != null) {
				return gui;
		} else {
			try {
				String name = Gui.class.getPackage().getName();
				gui = (Gui) Class.forName(name+"."+guiType).newInstance();
				texts.put(guiType, gui);
				return gui;
			} catch (Exception e) {
					throw new Exception("\nThe GUI type is unknown!");
			}
		}

	}

}
