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
package org.uonse.mendes.engine.analyzer.analyzers;

import org.uonse.mendes.engine.analyzer.AnalysisResult;
import org.uonse.mendes.engine.analyzer.Analyzer;
import org.uonse.mendes.engine.parser.ParsedData;

/**
 * This class performs the analysis on the data using the amount of overlap
 * between the keywords in the data
 *
 * @author Trent Houliston
 */
public class AdjacencyAnalyzer implements Analyzer
{

	/**
	 * {@inheritDoc}
	 */
	@Override
	public AnalysisResult analyze(ParsedData data)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}
}
