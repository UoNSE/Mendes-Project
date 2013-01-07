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
package org.uonse.mendes.engine.parser;

import org.uonse.mendes.input.output.ParsableData;

/**
 * This interface defines the parser which extracts the keywords from the raw
 * text we have been provided and returns an object which shows the keywords and
 * frequency in the data.
 *
 * @author Trent Houliston
 */
public interface Parser
{

	/**
	 * Parse the passed data from the Input system into a list of keywords and
	 * frequencies
	 *
	 * @param data the data to be parsed
	 *
	 * @return the keywords and frequency of the resulting data
	 */
	public ParsedData parse(ParsableData data);
}
