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

import java.util.Arrays;

/**
 * This class holds the results of the analysis which are to be then used to
 * display this to the user
 *
 * @author Trent Houliston
 */
public class AnalysisResult
{

	private final String[] keywords;
	private final int[][] matrix;

	/**
	 * Makes a new AnalysisResults object with the Keywords and Matrix
	 *
	 * @param keywords the keywords that are for each of the indexes in the
	 *                    matrix
	 * @param matrix   the number of times the overlap of these two keywords
	 *                    occur together
	 */
	public AnalysisResult(String[] keywords, int[][] matrix)
	{
		this.keywords = Arrays.copyOf(keywords, keywords.length);
		this.matrix = Arrays.copyOf(matrix, matrix.length);
	}

	/**
	 * Gets the list of keywords
	 *
	 * @return the keywords
	 */
	public String[] getKeywords()
	{
		return keywords;
	}

	/**
	 * Gets the adjacency matrix
	 *
	 * @return the adjacencyMatrix
	 */
	public int[][] getMatrix()
	{
		return matrix;
	}
}
