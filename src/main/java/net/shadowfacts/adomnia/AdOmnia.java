package net.shadowfacts.adomnia;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.shadowfacts.adomnia.proxy.CommonProxy;
import net.shadowfacts.shadowcore.Log;

/**
 * The main mod class.
 * @author shadowfacts
 */


@Mod(modid = AdOmnia.modId, name = AdOmnia.displayName, version = AdOmnia.version, dependencies = AdOmnia.depString)
public class AdOmnia {
	// Mod info
	public static final String modId = "adomnia";
	public static final String displayName = "AdOmnia";
	public static final String version = "@VERSION@";
	public static final String depString = "required-after:shadowcore@[0.0.1,)";
	private static final String clientProxyString = "net.shadowfacts.adomnia.proxy.ClientProxy";
	private static final String serverProxyString = "net.shadowfacts.adomnia.proxy.CommonProxy";

	// The mod instance
	@Mod.Instance(value=AdOmnia.modId)
	public static AdOmnia instance;

	// Proxy stuff
	@SidedProxy(clientSide = AdOmnia.clientProxyString, serverSide = AdOmnia.serverProxyString)
	public static CommonProxy proxy;

	// Logger
	public static final Log log = new Log(modId);


	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {

	}

	@Mod.EventHandler
	public void load(FMLInitializationEvent event) {

	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {

	}


}
