package myplugin1;

import com.nomagic.magicdraw.core.Application;
import com.nomagic.magicdraw.plugins.Plugin;

public class MyPlugin1 extends Plugin
{
	public static boolean initialized;
	
	@Override
	public void init()
	{
		initialized = true;
		Application.getInstance().getGUILog().showMessage("My Plug-in 1 initialized.");
	}

	@Override
	public boolean close()
	{
		return true;
	}

	@Override
	public boolean isSupported()
	{
		return true;
	}
}
