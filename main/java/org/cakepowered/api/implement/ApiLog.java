package org.cakepowered.api.implement;

import org.apache.logging.log4j.Level;
import org.cakepowered.api.base.Log;

import net.minecraftforge.fml.common.FMLLog;

public class ApiLog implements Log{

	public String plugin;
	
	public ApiLog(String plugin){
		this.plugin = plugin;
	}
	
	@Override
	public void error(Object s) {
		FMLLog.log(plugin+"[DEBUG]", Level.ERROR, String.valueOf(s));
	}

	@Override
	public void debug(String s) {
		FMLLog.log(plugin, Level.DEBUG, s);
	}

	@Override
	public void info(String s) {
		FMLLog.log(plugin, Level.INFO, s);
	}

	@Override
	public void warn(String s) {
		FMLLog.log(plugin, Level.WARN, s);
	}

	@Override
	public void raw(Object s) {
		FMLLog.log(plugin, Level.INFO, String.valueOf(s));
	}

}
