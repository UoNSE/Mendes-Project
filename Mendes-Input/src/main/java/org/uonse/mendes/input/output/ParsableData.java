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
package org.uonse.mendes.input.output;

import java.net.URI;

/**
 * This interface is used by the Engine to get the data needed to analyze. The
 * object which is returned to the Engine must implement this interface.
 *
 * @author Trent Houliston
 */
public interface ParsableData
{

	/**
	 * Gets the URI of the source this parsed data object came from.
	 *
	 * @return the source URI of this data
	 */
	public URI getSourceURI();

	/**
	 * Gets the raw text content of the data (the cleaned text as a string)
	 *
	 * @return the raw text content of the data
	 */
	public String getText();

	/**
	 * Gets the timestamp of when this data was created (if available, otherwise
	 * the current time)
	 *
	 * @return the timestamp of when this data was created
	 */
	public long getTimestamp();
}
