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
		//TODO write the parser
		throw new UnsupportedOperationException("Not supported yet.");
	}
}
