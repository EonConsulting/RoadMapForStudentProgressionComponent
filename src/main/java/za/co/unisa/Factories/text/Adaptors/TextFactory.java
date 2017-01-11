/*
 * Dont touch anything here
 */
package za.co.unisa.Factories.text.Adaptors;

import java.util.HashMap;
import java.util.Map;
import za.co.unisa.Factories.text.Text;

/**
 *
 * @author Mufaro Benedict
 */
public enum TextFactory {
 INSTANCE;


	private Map<String, Text> texts = new HashMap<String, Text>();
	
	public Text createText(String textType)
			throws Exception {
		Text text = texts.get(textType);
		if (text != null) {
				return text;
		} else {
			try {
				String name = Text.class.getPackage().getName();
				text = (Text) Class.forName(name+"."+textType).newInstance();
				texts.put(textType, text);
				return text;
			} catch (Exception e) {
					throw new Exception("\nThe text type is unknown!");
			}
		}

	}

}