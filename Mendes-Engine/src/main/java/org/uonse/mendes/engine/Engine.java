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
 * This class is responsible for managing the global operations of the Engine.
 *
 * @author Trent Houliston
 */
public class Engine
{

	/**
	 * Startup the engine. This involves starting up the agent manager, updating
	 * and setting up the database, and setting up the interface to be used by
	 * the client.
	 */
	public void startup()
	{
	}

	/**
	 * Shutdown the engine. This involves stopping the agent manager and
	 * informing all of the active agents, closing all connections to the
	 * database, and finishing all active requests by the client.
	 */
	public void shutdown()
	{
	}

	/**
	 * This constructs singleton Engine object
	 */
	private Engine()
	{
	}

	/**
	 * This method is overloaded as you should not be able to clone a singleton
	 * object
	 *
	 * @return does not return, throws exception
	 *
	 * @throws CloneNotSupportedException
	 */
	@Override
	public Object clone() throws CloneNotSupportedException
	{
		throw new CloneNotSupportedException();
	}

	public static Engine getEngine()
	{
		return Singleton.INSTANCE;
	}

	/**
	 * This class holds the singleton instance of the Engine
	 */
	private static final class Singleton
	{

		/**
		 * The singleton instance of the engine
		 */
		private static final Engine INSTANCE = new Engine();
	}
}
