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
package org.uonse.mendes.server.database;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;
import org.hibernate.annotations.Index;

/**
 * This Entity holds the list of keywords in the system as well as their
 * synonyms. Each of the keywords must have a parent set being either itself (if
 * it is a root word) or to a root word.
 *
 * @author Trent Houliston
 */
@Entity
@Table(name = "keyword")
public class Keyword implements java.io.Serializable
{

	private String keyword;
	private Keyword parent;
	private Set<Keyword> children = new HashSet<Keyword>(0);

	/**
	 * Constructs a new empty Keyword instance.
	 */
	protected Keyword()
	{
	}

	/**
	 * Constructs a new Keyword instance while setting the Keyword and setting
	 * the parent to be itself. (a root keyword)
	 *
	 * @param keyword The keyword to set
	 */
	public Keyword(String keyword)
	{
		this.keyword = keyword;
		this.parent = this;
	}

	/**
	 * Constructs a new Keyword instance while setting the Keyword and parent
	 * values.
	 *
	 * @param keyword The keyword to set
	 * @param parent  The parent keyword to set
	 */
	public Keyword(String keyword, Keyword parent)
	{
		this.keyword = keyword;
		this.parent = parent;
	}

	/**
	 * The Keyword column, contains the keyword and is the primary key
	 *
	 * @return the keyword
	 */
	@Id
	@Column(name = "keyword", nullable = false, length = 200)
	@Index(name = "ix_keyword")
	public String getKeyword()
	{
		return this.keyword;
	}

	/**
	 * Sets the keyword for this object
	 *
	 * @param keyword the keyword to set
	 */
	public void setKeyword(String keyword)
	{
		this.keyword = keyword;
	}

	/**
	 * This is the parent of this keyword. The parent should always be a keyword
	 * (a word with itself as its parent)
	 *
	 * @return the parent of this keyword (should be a root keyword)
	 */
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "parent", nullable = false)
	@Index(name = "ix_parent")
	public Keyword getParent()
	{
		return this.parent;
	}

	/**
	 * Sets the parent keyword, should be either itself (if it's a root keyword)
	 * or another root keyword
	 *
	 * @param parent the parent keyword to set
	 */
	public void setParent(Keyword parent)
	{
		this.parent = parent;
	}

	/**
	 * This gets all the synonym keywords of a root keyword, or should be null
	 * if this is not a root keyword
	 *
	 * @return the set of synonym keywords that have this as the parent
	 */
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "parent", cascade = CascadeType.ALL)
	public Set<Keyword> getChildren()
	{
		return this.children;
	}

	/**
	 * Sets the keywords that are the children of this keyword
	 *
	 * @param children the children keywords to set
	 */
	public void setChildren(Set<Keyword> children)
	{
		this.children = children;
	}
}
