package de.pnku.mstv_mtv;

import de.pnku.mstv_mtv.init.MtvBlockCopperInit;
import de.pnku.mstv_mtv.init.MtvBlockInit;
import de.pnku.mstv_mtv.init.MtvItemCopperInit;
import de.pnku.mstv_mtv.init.MtvItemInit;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.resources.ResourceLocation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class MoreTorchVariants implements ModInitializer {

	public static final String MOD_ID = "quad-mstv-mtv";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	
	@Override
	public void onInitialize() {
		MtvBlockInit.registerTorchBlocks();
		MtvItemInit.registerTorchItems();
		if (hasCopperTorch()) {
			MtvBlockCopperInit.registerCopperTorchBlocks();
			MtvItemCopperInit.registerCopperTorchItems();
		}
	}

	public static ResourceLocation asId(String path) {
		return ResourceLocation.fromNamespaceAndPath(MOD_ID, path);
	}

	public static boolean hasCopperTorch() {
		try {
			boolean isDev = FabricLoader.getInstance().isDevelopmentEnvironment();
			String className = isDev ? "net.minecraft.world.level.block.Blocks" : "net.minecraft.class_2246";
			String fieldName = isDev ? "COPPER_TORCH" : "field_61902";
			Class<?> blocksClass = Class.forName(className);
			blocksClass.getDeclaredField(fieldName);
			return true;
		} catch (ClassNotFoundException | NoSuchFieldException e) {
			return false;
		}
	}

}
