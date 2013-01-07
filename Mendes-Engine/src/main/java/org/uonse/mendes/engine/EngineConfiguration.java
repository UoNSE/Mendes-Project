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
package org.uonse.mendes.engine;

/**
 * This class holds the configuration data for the Engine, (what parser to use,
 * the parameters for the parser etc)
 *
 * @author Trent Houliston
 */
public class EngineConfiguration
{

	private String parser;
	private String analyzer;

	/**
	 * Constructs a new EngineConfiguration which uses the selected parser and
	 * analyzer
	 *
	 * @param parser   the parser to use
	 * @param analyzer the analyzer to use
	 */
	public EngineConfiguration(String parser, String analyzer)
	{
		this.parser = parser;
		this.analyzer = analyzer;
	}

	/**
	 * Gets the parser
	 *
	 * @return the parser
	 */
	public String getParser()
	{
		return parser;
	}

	/**
	 * Sets the parser
	 *
	 * @param parser the parser to set
	 */
	public void setParser(String parser)
	{
		this.parser = parser;
	}

	/**
	 * Gets the analyzer
	 *
	 * @return the analyzer
	 */
	public String getAnalyzer()
	{
		return analyzer;
	}

	/**
	 * Sets the analyzer
	 *
	 * @param analyzer the analyzer to set
	 */
	public void setAnalyzer(String analyzer)
	{
		this.analyzer = analyzer;
	}
}
