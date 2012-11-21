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
package org.uonse.mendes.server;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import org.uonse.mendes.engine.Engine;

/**
 * Web application lifecycle listener.
 *
 * @author trent
 */
public class EngineStartup implements ServletContextListener
{

	@Override
	public void contextInitialized(ServletContextEvent sce)
	{
		Engine.getEngine().startup();
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce)
	{
		Engine.getEngine().shutdown();
	}
}
