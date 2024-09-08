package de.pnku.mstv_mtv;

import de.pnku.mstv_mtv.init.MtvBlockInit;
import net.fabricmc.api.ClientModInitializer;

import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.level.block.Block;


public class MoreTorchVariantsClient implements ClientModInitializer {

	
	@Override
	public void onInitializeClient() {
		for (Block torchBlock : MtvBlockInit.more_torch_blocks) {
			BlockRenderLayerMap.INSTANCE.putBlock(torchBlock, RenderType.cutout());
		}
	}

}
