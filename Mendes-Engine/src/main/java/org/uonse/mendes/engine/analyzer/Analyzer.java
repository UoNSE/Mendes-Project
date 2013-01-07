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
package org.uonse.mendes.engine.analyzer;

import org.uonse.mendes.engine.parser.ParsedData;

/**
 * This interface defines an Analyzer which is capable of taking parsed data (A
 * list of keywords and frequencies from the document) and performing an
 * analysis on them.
 *
 * @author Trent Houliston
 */
public interface Analyzer
{

	/**
	 * Analyze the data which has been parsed into our results data (the matrix)
	 *
	 * @param data the data to be parsed
	 *
	 * @return the results of the analysis of this data
	 */
	public AnalysisResult analyze(ParsedData data);
}
