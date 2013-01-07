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

import java.util.Collections;
import java.util.List;
import org.uonse.mendes.engine.analyzer.AnalysisResult;
import org.uonse.mendes.input.InputConfiguration;

/**
 * This is the API entry point for the Engine component of the System. It
 * contains the methods which are used to interact with the engine.
 *
 * @author Trent Houliston
 */
public class Engine
{

	/**
	 * Runs the engine with the configuration for the Engine and the Input and
	 * returns the AnalysisResult object that results from it.
	 *
	 * @param inputConfig  the configuration for the Input system (options for
	 *                        where the data comes from)
	 * @param engineConfig the configuration for the engine (how the data will
	 *                        be parsed)
	 *
	 * @return the results of the analysis
	 */
	public AnalysisResult runEngine(InputConfiguration inputConfig, EngineConfiguration engineConfig)
	{
		//TODO WRITE

		//TODO get data from the Input group

		//TODO send that data to the selected parser module

		//TODO send that data to the selected analysis module

		//TODO return the data from the analysis module
		throw new UnsupportedOperationException("Not yet implemented");
	}

	/**
	 * Returns a list of the names of each of the parsers which are available to
	 * use.
	 *
	 * @return a list of the names of all the parsers
	 */
	public List<String> getParsers()
	{
		//TODO return a list of all the parsers
		return Collections.<String>emptyList();
	}

	/**
	 * Returns a list of all the analyzers which are available to use.
	 *
	 * @return a list of the names of all the analyzers
	 */
	public List<String> getAnalyzers()
	{
		//TODO return a list of all the analyzers
		return Collections.<String>emptyList();
	}

	/**
	 * Gets the instance of the Engine
	 *
	 * @return the Engine
	 */
	public Engine getInstance()
	{
		return Singleton.INSTANCE;
	}

	/**
	 * This is the singleton holder class for the Engine
	 */
	private static class Singleton
	{

		/**
		 * The Engine Instance
		 */
		private static final Engine INSTANCE = new Engine();
	}
}
