package de.pnku.mstv_mtv;

import de.pnku.mstv_mtv.init.MtvBlockCopperInit;
import de.pnku.mstv_mtv.init.MtvBlockInit;
import de.pnku.mstv_mtv.init.MtvItemCopperInit;
import de.pnku.mstv_mtv.init.MtvItemInit;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.resources.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class MoreTorchVariants implements ModInitializer {

	public static final String MOD_ID = "quad-mstv-mtv";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	
	@Override
	public void onInitialize() {
		MtvBlockInit.registerTorchBlocks();
		MtvItemInit.registerTorchItems();
		MtvBlockCopperInit.registerCopperTorchBlocks();
		MtvItemCopperInit.registerCopperTorchItems();
	}

	public static Identifier asId(String path) {
		return Identifier.fromNamespaceAndPath(MOD_ID, path);
	}

}
