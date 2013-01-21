/**
 * This file is part of Project Mendes.
 *
 * Project Mendes is free software: you can redistribute it and/or modify it
 * under the terms of the Lesser GNU General Public License as published by the
 * Free Software Foundation, either version 3 of the License, or (at your
 * option) any later version.
 *
 * Project Mendes is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the Lesser GNU General Public License for more
 * details.
 *
 * You should have received a copy of the Lesser GNU General Public License
 * along with Project Mendes. If not, see <http://www.gnu.org/licenses/>.
 */
package org.uonse.mendes.engine.parser.parsers;

import java.net.URI;
import java.util.HashMap;
import java.util.Scanner;
import org.junit.Test;
import org.uonse.mendes.engine.parser.ParsedData;
import org.uonse.mendes.input.output.ParsableData;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

/**
 * Unit test for {@link FrequencyAnalysisParser}
 *
 * @author Trent Houliston
 */
public class FrequencyAnalysisParserTest
{

	/**
	 * Tests the frequency analyser
	 */
	@Test
	public void testFrequencyAnalisis()
	{
		//Read in our sample document
		String sample = new Scanner(FrequencyAnalysisParser.class.getResourceAsStream("sampletext.txt"), "utf-8").useDelimiter("\\Z").next();

		//Mock our object
		ParsableData data = mock(ParsableData.class);
		when(data.getText()).thenReturn(sample);
		when(data.getTimestamp()).thenReturn(System.currentTimeMillis());
		when(data.getSourceURI()).thenReturn(URI.create("http://127.0.0.1/"));

		//Parse our data
		FrequencyAnalysisParser parser = new FrequencyAnalysisParser();
		ParsedData parse = parser.parse(data);

		//Build up our expected results
		HashMap<String, Integer> expected = new HashMap<String, Integer>(10);
		expected.put("mattis", 9);
		expected.put("habitant", 4);
		expected.put("neque", 7);
		expected.put("diam", 9);
		expected.put("pharetra", 7);
		expected.put("quisque", 7);
		expected.put("aenean", 4);
		expected.put("mauris", 22);
		expected.put("urna", 9);
		expected.put("dolor", 20);
		expected.put("facilisi", 2);
		expected.put("tellus", 16);
		expected.put("est", 10);
		expected.put("nibh", 12);
		expected.put("suspendisse", 7);
		expected.put("nostra", 1);
		expected.put("rutrum", 4);
		expected.put("elit", 13);
		expected.put("ante", 12);
		expected.put("semper", 5);
		expected.put("dictum", 6);
		expected.put("aptent", 1);
		expected.put("tristique", 9);
		expected.put("tempus", 7);
		expected.put("mollis", 7);
		expected.put("dapibus", 10);
		expected.put("faucibus", 6);
		expected.put("morbi", 8);
		expected.put("erat", 9);
		expected.put("adipiscing", 11);
		expected.put("sociosqu", 1);
		expected.put("vehicula", 10);
		expected.put("non", 18);
		expected.put("lacinia", 8);
		expected.put("arcu", 14);
		expected.put("ipsum", 17);
		expected.put("euismod", 6);
		expected.put("turpis", 13);
		expected.put("imperdiet", 11);
		expected.put("habitasse", 4);
		expected.put("pulvinar", 12);
		expected.put("aliquet", 12);
		expected.put("pretium", 10);
		expected.put("cursus", 5);
		expected.put("nullam", 7);
		expected.put("enim", 4);
		expected.put("duis", 9);
		expected.put("lobortis", 7);
		expected.put("fringilla", 3);
		expected.put("ultrices", 12);
		expected.put("facilisis", 9);
		expected.put("quis", 20);
		expected.put("consectetur", 8);
		expected.put("himenaeos", 1);
		expected.put("litora", 1);
		expected.put("varius", 11);
		expected.put("inceptos", 1);
		expected.put("pellentesque", 20);
		expected.put("tortor", 17);
		expected.put("dignissim", 9);
		expected.put("fames", 4);
		expected.put("vivamus", 8);
		expected.put("nec", 20);
		expected.put("mi", 7);
		expected.put("donec", 14);
		expected.put("convallis", 11);
		expected.put("etiam", 7);
		expected.put("porta", 6);
		expected.put("eu", 16);
		expected.put("lorem", 23);
		expected.put("platea", 4);
		expected.put("integer", 7);
		expected.put("quam", 12);
		expected.put("nunc", 11);
		expected.put("a", 22);
		expected.put("leo", 23);
		expected.put("ut", 32);
		expected.put("massa", 7);
		expected.put("scelerisque", 11);
		expected.put("sit", 27);
		expected.put("praesent", 8);
		expected.put("eget", 24);
		expected.put("posuere", 9);
		expected.put("sagittis", 11);
		expected.put("per", 2);
		expected.put("nulla", 27);
		expected.put("vel", 27);
		expected.put("orci", 14);
		expected.put("conubia", 1);
		expected.put("et", 37);
		expected.put("feugiat", 7);
		expected.put("netus", 4);
		expected.put("sodales", 6);
		expected.put("malesuada", 19);
		expected.put("proin", 7);
		expected.put("metus", 11);
		expected.put("consequat", 12);
		expected.put("molestie", 15);
		expected.put("taciti", 1);
		expected.put("ornare", 6);
		expected.put("congue", 5);
		expected.put("fusce", 8);
		expected.put("maecenas", 10);
		expected.put("amet", 27);
		expected.put("sapien", 10);
		expected.put("gravida", 6);
		expected.put("condimentum", 6);
		expected.put("rhoncus", 6);
		expected.put("libero", 18);
		expected.put("hac", 4);
		expected.put("justo", 11);
		expected.put("velit", 11);
		expected.put("volutpat", 7);
		expected.put("auctor", 12);
		expected.put("laoreet", 4);
		expected.put("class", 1);
		expected.put("vitae", 22);
		expected.put("lacus", 17);
		expected.put("phasellus", 6);
		expected.put("iaculis", 8);
		expected.put("lectus", 19);
		expected.put("dui", 12);
		expected.put("bibendum", 9);
		expected.put("fermentum", 2);
		expected.put("nam", 7);
		expected.put("tincidunt", 18);
		expected.put("tempor", 13);
		expected.put("commodo", 6);
		expected.put("hendrerit", 12);
		expected.put("blandit", 17);
		expected.put("sollicitudin", 10);
		expected.put("suscipit", 5);
		expected.put("dictumst", 4);
		expected.put("porttitor", 7);
		expected.put("felis", 10);
		expected.put("id", 24);
		expected.put("viverra", 10);
		expected.put("ullamcorper", 10);
		expected.put("aliquam", 9);
		expected.put("elementum", 12);
		expected.put("vestibulum", 23);
		expected.put("odio", 13);
		expected.put("eleifend", 9);
		expected.put("cras", 7);
		expected.put("ultricies", 8);
		expected.put("curabitur", 16);
		expected.put("interdum", 14);
		expected.put("magna", 11);
		expected.put("vulputate", 8);
		expected.put("torquent", 1);
		expected.put("augue", 17);
		expected.put("at", 27);
		expected.put("venenatis", 7);
		expected.put("accumsan", 7);
		expected.put("in", 26);
		expected.put("eros", 8);
		expected.put("placerat", 6);
		expected.put("senectus", 4);
		expected.put("sed", 42);
		expected.put("purus", 10);
		expected.put("risus", 11);
		expected.put("ac", 32);
		expected.put("ad", 1);
		expected.put("nisi", 16);
		expected.put("egestas", 17);
		expected.put("ligula", 15);
		expected.put("luctus", 5);
		expected.put("sem", 15);
		expected.put("nisl", 21);

		//Check that they are equal
		assertEquals("The returned keywords were not the expected result", parse.keywords, expected);
	}
}
