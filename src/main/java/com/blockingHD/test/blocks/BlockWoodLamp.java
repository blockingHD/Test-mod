package com.blockingHD.test.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockWoodLamp extends BlockTest {

	public BlockWoodLamp() {

		super(Material.wood);
		GameRegistry.registerBlock(this, "WoodLamp");
		this.setUnlocalizedName("WoodLamp");
		this.setHardness(2);
		this.setResistance(5);
		this.setLightLevel(1);

	}

	@Override
	@SideOnly(Side.SERVER)
	public boolean onBlockActivated(World world, BlockPos pos,
			IBlockState state, EntityPlayer EntityPlayer, EnumFacing side,
			float hitX, float hitY, float hitZ) {

		// logHelper.info(pos);
		IBlockState state0 = Blocks.birch_fence.getDefaultState();
		IBlockState state1 = Blocks.air.getDefaultState();

		if (world.isAirBlock(pos.add(0, 1, 0))) {
			world.setBlockState(pos.add(0, 1, 0), state0);
		}
		// logHelper.info(state);

		return true;
	}

}
