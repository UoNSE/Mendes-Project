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

import java.net.URI;
import java.util.HashMap;

/**
 * This object holds the parsed data (the keywords to frequency map) as well as
 * maintaining the metadata to do with the source and timestamp.
 *
 * @author Trent Houliston
 */
public class ParsedData
{

	/**
	 * The keywords to frequency map for this parsed data
	 */
	public final HashMap<String, Integer> keywords = new HashMap<String, Integer>(0);
	/**
	 * The source of this data
	 */
	public final URI source;
	/**
	 * The timestamp of when this data was created
	 */
	public final long timestamp;

	/**
	 * Constructs a new ParsedData object with the passed source and timestamp
	 *
	 * @param source    the source to set
	 * @param timestamp the timestamp to set
	 */
	public ParsedData(URI source, long timestamp)
	{
		this.source = source;
		this.timestamp = timestamp;
	}
}
