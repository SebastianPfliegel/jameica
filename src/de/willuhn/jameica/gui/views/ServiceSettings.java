/**********************************************************************
 * $Source: /cvsroot/jameica/jameica/src/de/willuhn/jameica/gui/views/Attic/ServiceSettings.java,v $
 * $Revision: 1.8 $
 * $Date: 2004/03/24 00:46:03 $
 * $Author: willuhn $
 * $Locker:  $
 * $State: Exp $
 *
 * Copyright (c) by willuhn.webdesign
 * All rights reserved
 *
 **********************************************************************/

package de.willuhn.jameica.gui.views;

import de.willuhn.jameica.Jameica;
import de.willuhn.jameica.PluginLoader;
import de.willuhn.jameica.gui.GUI;
import de.willuhn.jameica.gui.controller.ServiceSettingsControl;
import de.willuhn.util.ApplicationException;
import de.willuhn.util.I18N;

/**
 * 
 */
public class ServiceSettings extends AbstractView
{

  /**
   * @see de.willuhn.jameica.gui.views.AbstractView#bind()
   */
  public void bind() throws Exception
  {
		ServiceSettingsControl control = new ServiceSettingsControl(this);
		
		I18N i18n = PluginLoader.getPlugin(Jameica.class).getResources().getI18N();

		GUI.getView().setTitle(i18n.tr("Eigenschaften des Services") + " " + control.getServiceData());

  }

  /**
   * @see de.willuhn.jameica.gui.views.AbstractView#unbind()
   */
  public void unbind() throws ApplicationException
  {
  }

}


/**********************************************************************
 * $Log: ServiceSettings.java,v $
 * Revision 1.8  2004/03/24 00:46:03  willuhn
 * @C refactoring
 *
 * Revision 1.7  2004/03/03 22:27:10  willuhn
 * @N help texts
 * @C refactoring
 *
 * Revision 1.6  2004/02/22 20:05:21  willuhn
 * @N new Logo panel
 *
 * Revision 1.5  2004/02/20 20:45:24  willuhn
 * *** empty log message ***
 *
 * Revision 1.4  2004/02/11 00:10:42  willuhn
 * *** empty log message ***
 *
 * Revision 1.3  2004/01/23 00:29:03  willuhn
 * *** empty log message ***
 *
 * Revision 1.2  2004/01/08 20:50:32  willuhn
 * @N database stuff separated from jameica
 *
 * Revision 1.1  2004/01/06 01:27:30  willuhn
 * @N table order
 *
 **********************************************************************/