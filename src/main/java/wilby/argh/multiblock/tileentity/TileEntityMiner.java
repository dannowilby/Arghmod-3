package wilby.argh.multiblock.tileentity;

import net.minecraft.nbt.NBTTagCompound;
import wilby.argh.multiblock.MultiblockMiner;

public class TileEntityMiner extends TileEntityMultiblock
{
	
	public TileEntityMiner()
	{
		super("miner");
	}
	
	@Override
	public void update()
	{
		super.update();
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
