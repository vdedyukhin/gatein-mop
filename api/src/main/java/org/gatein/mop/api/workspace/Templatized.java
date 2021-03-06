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
package org.gatein.mop.api.workspace;

import org.gatein.mop.api.Scope;

/**
 * The templatized aspect defined by a related template and a scope that defines the template scope.
 *
 * @author <a href="mailto:julien.viet@exoplatform.com">Julien Viet</a>
 * @version $Revision$
 */
public interface Templatized
{

   /**
    * Returns the page template or null if no page template exists.
    *
    * @return the page template
    */
   Page getTemplate();

   /**
    * Updates the page template.
    *
    * @param template the page template
    */
   void setTemplate(Page template);

   /**
    * Returns the scope of the related template.
    *
    * @return the template scope
    */
   Scope getScope();

   /**
    * Set the scope of the related template.
    *
    * @param scope the scope
    */
   void setScope(Scope scope);

}
