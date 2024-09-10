package de.pnku.mstv_mtv;

import de.pnku.mstv_mtv.init.MtvBlockInit;
import net.fabricmc.api.ModInitializer;

import net.minecraft.resources.ResourceLocation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class MoreTorchVariants implements ModInitializer {

	public static final String MOD_ID = "quad-mstv-mtv";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	
	@Override
	public void onInitialize() {
		MtvBlockInit.register();
	}

	public static ResourceLocation asId(String path) {
		return ResourceLocation.fromNamespaceAndPath(MOD_ID, path);
	}

}
