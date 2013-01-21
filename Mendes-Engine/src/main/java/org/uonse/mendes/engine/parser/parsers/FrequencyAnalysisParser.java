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

import java.util.HashMap;
import java.util.Map;
import org.uonse.mendes.engine.parser.ParsedData;
import org.uonse.mendes.engine.parser.Parser;
import org.uonse.mendes.input.output.ParsableData;

/**
 * This Class is a basic analyzer which simply counts the occurrences of each of
 * the words in the passed document.
 *
 * @author Trent Houliston
 */
public class FrequencyAnalysisParser implements Parser
{

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ParsedData parse(ParsableData data)
	{
		//Get our frequency map
		Map<String, Integer> frequencies = getFrequencies(data.getText());

		//Return our parsed data
		return new ParsedData(data.getSourceURI(), data.getTimestamp(), frequencies);
	}

	/**
	 * This method calculates the number of times each token (consecutive non
	 * whitespace characters) appears in the passed {@link String}
	 *
	 * @param data the data to be parsed
	 *
	 * @return a map of keyword to frequencies
	 */
	private Map<String, Integer> getFrequencies(String data)
	{
		//Create a map to hold our results
		HashMap<String, Integer> map = new HashMap<String, Integer>(10);

		//We don't care about case or if there is punctuation at the end of a word
		String txt = data.toLowerCase().replaceAll("(\\w+)[.,;]+", "$1");

		//Go through the string word by word
		for (String s : txt.split("\\s+"))
		{
			//If we don't have the key yet then initialize it at 0
			if (!map.containsKey(s))
			{
				map.put(s, 0);
			}

			//Add one to the count
			map.put(s, map.get(s) + 1);
		}

		//Return the map
		return map;
	}
}
