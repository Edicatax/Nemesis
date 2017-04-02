package com.edicatad.nemesis;

import com.edicatad.nemesis.proxy.IProxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid=Nemesis.ID, name=Nemesis.NAME, version=Nemesis.VERSION)
public class Nemesis {
	public static final String ID = "nemesis";
	public static final String NAME = "Nemesis";
	public static final String VERSION = "0.10";
	public static final String CLIENT_PROXY = "com.edicatad.emvi.proxy.ClientProxy";
	public static final String SERVER_PROXY = "com.edicatad.emvi.proxy.CommonProxy";
	
	@SidedProxy(clientSide=CLIENT_PROXY, serverSide=SERVER_PROXY)
	public static IProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
		proxy.onPreInit(event);
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event){
		proxy.onInit(event);
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event){
		proxy.onPostInit(event);
	}
}
