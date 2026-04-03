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
		if (versionIsAtLeast(1,21,9)) {
			MtvBlockCopperInit.registerCopperTorchBlocks();
			MtvItemCopperInit.registerCopperTorchItems();
		}
	}

	public static Identifier asId(String path) {
		return Identifier.fromNamespaceAndPath(MOD_ID, path);
	}

	public static boolean versionIsAtLeast(int major, int minor, int patch) {
		try {
			var minecraft = FabricLoader.getInstance().getModContainer("minecraft");
			if (minecraft.isEmpty()) throw new Exception("Couldn't find Minecraft.");
			String[] semVer = minecraft.get().getMetadata().getVersion().getFriendlyString().split("-", 2)[0].split("\\.");
			int x = Integer.parseInt(semVer[0]), y = Integer.parseInt(semVer[1]), z = Integer.parseInt(semVer[2]);
			return x > major || (x == major && (y > minor || (y == minor && z >= patch)));
		} catch (Exception e) {
			LOGGER.error("Error checking Minecraft version", e);
			return false;
		}
	}

}
