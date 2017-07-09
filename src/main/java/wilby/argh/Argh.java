package wilby.argh;

import org.apache.logging.log4j.Logger;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import wilby.argh.common.CommonProxy;
import wilby.argh.common.blocks.BlockEvents;

@Mod(modid = Argh.MODID, version = Argh.VERSION, name = Argh.NAME)

public class Argh 
{
	public static final String MODID = "argh";
	public static final String VERSION = "3";
	public static final String NAME = "argh";
	    
	@SidedProxy(clientSide = "wilby.argh.client.ClientProxy", serverSide = "wilby.argh.common.CommonProxy")
	public static CommonProxy proxy = new CommonProxy();
	    
	@Instance("argh")
	public static Argh argh = new Argh();

	public static Logger modlogger;
	    
	@EventHandler
	public void preInit(FMLPreInitializationEvent e)
	{
		proxy.preInit(e);
	}
	
	@EventHandler
	public void init(FMLInitializationEvent e)
	{
		proxy.init(e);
		
		MinecraftForge.EVENT_BUS.register(new BlockEvents());
		
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent e)
	{
		proxy.postInit(e);
	}
}