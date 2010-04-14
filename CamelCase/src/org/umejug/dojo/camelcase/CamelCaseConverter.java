package org.umejug.dojo.camelcase;

public class CamelCaseConverter {

	public static String convertFromCamelCase(String toConvert) {
		if ("".equals(toConvert)) {
			return "";
		}

		StringBuffer output = new StringBuffer();
		output.append(toConvert.charAt(0));

		for (int i = 1; i < toConvert.length(); i++) {
			char c = toConvert.charAt(i);

			if (Character.isUpperCase(c)) {
				output.append(' ').append(Character.toLowerCase(c));
			} else {
				output.append(c);
			}
		}
		return output.toString();
	}

	public static String convertToCamelCase(String toConvert) {
		return "";
	}
}
