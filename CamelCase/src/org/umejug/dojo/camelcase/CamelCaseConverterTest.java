package org.umejug.dojo.camelcase;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

// 1.
// Från: DettaÄrEnCamelCaseMening
// Till: Detta är en camel case mening
//
// 2.
// Omvänt.


public class CamelCaseConverterTest {

	@Test
	public void fromCamelCaseShouldReturnEmptyStringOnEmptyString() throws Exception {
		assertFromCamelCase("", "");
	}

	@Test
	public void oneWordCamelCaseShouldReturnSame() throws Exception {
		assertFromCamelCase("Test", "Test");
	}

	@Test
	public void canConvertCamelCaseSentenceToNormalSentence() throws Exception {
		assertFromCamelCase("DettaÄrEnCamelCaseMening", "Detta är en camel case mening");
	}

	@Test
	public void toCamelCaseShouldReturnEmptyStringOnEmptyString() throws Exception {
		assertThat(CamelCaseConverter.convertToCamelCase(""), is(""));
	}

	private void assertFromCamelCase(String textToConvert, String expected) {
		assertThat(CamelCaseConverter.convertFromCamelCase(textToConvert), is(expected));
	}

}
