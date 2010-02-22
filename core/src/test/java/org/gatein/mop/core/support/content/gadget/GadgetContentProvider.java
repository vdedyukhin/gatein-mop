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
package org.gatein.mop.core.support.content.gadget;

import org.gatein.mop.spi.content.ContentProvider;
import org.gatein.mop.spi.content.StateContainer;

import java.util.List;

/**
 * @author <a href="mailto:julien.viet@exoplatform.com">Julien Viet</a>
 * @version $Revision$
 */
public class GadgetContentProvider implements ContentProvider<Gadget>
{

   public Gadget combine(List<Gadget> states)
   {
      throw new UnsupportedOperationException();
   }

   public void setState(StateContainer container, Gadget state)
   {
      GadgetState prefs = (GadgetState)container.getState();
      if (prefs != null)
      {
         if (state == null)
         {
            container.setState(null);
         }
      }
      else
      {
         if (state != null)
         {
            prefs = container.create(GadgetState.class);
            prefs.setUserPrefs(state.getUserPref());
         }
      }
   }

   public Gadget getState(StateContainer container)
   {
      GadgetState prefs = (GadgetState)container.getState();
      if (prefs != null)
      {
         Gadget gadget = new Gadget();
         gadget.setUserPref(prefs.getUserPrefs());
         return gadget;
      }
      else
      {
         return null;
      }
   }

   public Class<Gadget> getStateType()
   {
      return Gadget.class;
   }
}
