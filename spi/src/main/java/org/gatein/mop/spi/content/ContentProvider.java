/**
 * Copyright (C) 2009 eXo Platform SAS.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.gatein.mop.spi.content;

import java.util.List;

/**
 * A content provider that integrates with the mop.
 *
 * @author <a href="mailto:julien.viet@exoplatform.com">Julien Viet</a>
 * @version $Revision$
 * @param <E> the external state type
 * @param <I> the internal state type
 */
public interface ContentProvider<E, I>
{

   /**
    * Combines several states into a single state representation.
    *
    * @param states the various states to combine
    * @return the combined state
    */
   E combine(List<E> states);

   /**
    * Update the state container with the provided state.
    *
    * @param container the state container
    * @param state     the state
    */
   void setState(StateContainer<I> container, E state);

   /**
    * Returns the state attached to the provided container.
    *
    * @param container the container
    * @return the state
    */
   E getState(StateContainer<I> container);

   /**
    * Returns the class the represents the state as seen by the framework client.
    *
    * @return the external state class
    */
   Class<E> getExternalType();

   /**
    * Returns the class that represents the state as seen by the provider.
    *
    * @return the internal state class
    */
   Class<I> getInternalType();

}
