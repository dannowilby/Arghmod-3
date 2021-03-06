package wilby.argh.multiblock.tileentity;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.energy.IEnergyStorage;
import wilby.argh.multiblock.MultiblockSmeltery;
import wilby.argh.util.ArghLogger;

public class TileEntitySmeltery extends TileEntityMultiblock
{

	public TileEntitySmeltery()
	{
		super("smeltery");
	}
	
	@Override
	public void update()
	{	
		if(world.getWorldTime() % 20 == 0)
		{
			ArghLogger.log("Ticking away!");
		}
	}
	
	public NBTTagCompound writeToNBT(NBTTagCompound compound)
	{
		super.writeToNBT(compound);
		
		return compound;
	}
	
	public void readFromNBT(NBTTagCompound compound)
	{
		super.readFromNBT(compound);
	}
}
