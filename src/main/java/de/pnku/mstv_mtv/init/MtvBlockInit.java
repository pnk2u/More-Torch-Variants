package de.pnku.mstv_mtv.init;

import de.pnku.mstv_mtv.MoreTorchVariants;
import net.minecraft.core.Registry;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.PushReaction;

import java.util.ArrayList;
import java.util.List;

import static de.pnku.mstv_mtv.MoreTorchVariants.*;
import static net.minecraft.world.level.block.Blocks.litBlockEmission;

public class MtvBlockInit {


    
    // Fire Torch Blocks + Fire Wall Torch Blocks + Fire Torch Items (Reverse Order)
    public static final Block WARPED_TORCH = createTorchBlock("warped");
    public static final Block WARPED_WALL_TORCH = createTorchBlock("warped", WARPED_TORCH);

    public static final Block CRIMSON_TORCH = createTorchBlock("crimson");
    public static final Block CRIMSON_WALL_TORCH = createTorchBlock("crimson", CRIMSON_TORCH);

    public static final Block BAMBOO_TORCH = createTorchBlock("bamboo");
    public static final Block BAMBOO_WALL_TORCH = createTorchBlock("bamboo", BAMBOO_TORCH);

    public static final Block CHERRY_TORCH = createTorchBlock("cherry");
    public static final Block CHERRY_WALL_TORCH = createTorchBlock("cherry", CHERRY_TORCH);

    public static final Block MANGROVE_TORCH = createTorchBlock("mangrove");
    public static final Block MANGROVE_WALL_TORCH = createTorchBlock("mangrove", MANGROVE_TORCH);

    public static final Block DARK_OAK_TORCH = createTorchBlock("dark_oak");
    public static final Block DARK_OAK_WALL_TORCH = createTorchBlock("dark_oak", DARK_OAK_TORCH);

    public static final Block ACACIA_TORCH = createTorchBlock("acacia");
    public static final Block ACACIA_WALL_TORCH = createTorchBlock("acacia", ACACIA_TORCH);

    public static final Block JUNGLE_TORCH = createTorchBlock("jungle");
    public static final Block JUNGLE_WALL_TORCH = createTorchBlock("jungle", JUNGLE_TORCH);

    public static final Block BIRCH_TORCH = createTorchBlock("birch");
    public static final Block BIRCH_WALL_TORCH = createTorchBlock("birch", BIRCH_TORCH);

    public static final Block SPRUCE_TORCH = createTorchBlock("spruce");
    public static final Block SPRUCE_WALL_TORCH = createTorchBlock("spruce", SPRUCE_TORCH);

    
    // Soul Torch BLocks + Soul Wall Torch Blocks + Soul Torch Items (Reverse Order)
    public static final Block WARPED_SOUL_TORCH = createTorchBlock("warped", "soul");
    public static final Block WARPED_SOUL_WALL_TORCH = createTorchBlock("warped", WARPED_SOUL_TORCH, "soul");

    public static final Block CRIMSON_SOUL_TORCH = createTorchBlock("crimson", "soul");
    public static final Block CRIMSON_SOUL_WALL_TORCH = createTorchBlock("crimson", CRIMSON_SOUL_TORCH, "soul");

    public static final Block BAMBOO_SOUL_TORCH = createTorchBlock("bamboo", "soul");
    public static final Block BAMBOO_SOUL_WALL_TORCH = createTorchBlock("bamboo", BAMBOO_SOUL_TORCH, "soul");

    public static final Block CHERRY_SOUL_TORCH = createTorchBlock("cherry", "soul");
    public static final Block CHERRY_SOUL_WALL_TORCH = createTorchBlock("cherry", CHERRY_SOUL_TORCH, "soul");

    public static final Block MANGROVE_SOUL_TORCH = createTorchBlock("mangrove", "soul");
    public static final Block MANGROVE_SOUL_WALL_TORCH = createTorchBlock("mangrove", MANGROVE_SOUL_TORCH, "soul");

    public static final Block DARK_OAK_SOUL_TORCH = createTorchBlock("dark_oak", "soul");
    public static final Block DARK_OAK_SOUL_WALL_TORCH = createTorchBlock("dark_oak", DARK_OAK_SOUL_TORCH, "soul");

    public static final Block ACACIA_SOUL_TORCH = createTorchBlock("acacia", "soul");
    public static final Block ACACIA_SOUL_WALL_TORCH = createTorchBlock("acacia", ACACIA_SOUL_TORCH, "soul");

    public static final Block JUNGLE_SOUL_TORCH = createTorchBlock("jungle", "soul");
    public static final Block JUNGLE_SOUL_WALL_TORCH = createTorchBlock("jungle", JUNGLE_SOUL_TORCH, "soul");

    public static final Block BIRCH_SOUL_TORCH = createTorchBlock("birch", "soul");
    public static final Block BIRCH_SOUL_WALL_TORCH = createTorchBlock("birch", BIRCH_SOUL_TORCH, "soul");

    public static final Block SPRUCE_SOUL_TORCH = createTorchBlock("spruce", "soul");
    public static final Block SPRUCE_SOUL_WALL_TORCH = createTorchBlock("spruce", SPRUCE_SOUL_TORCH, "soul");


    // Redstone Torch BLocks + Redstone Wall Torch Blocks + Redstone Torch Items (Reverse Order)
    public static final Block WARPED_REDSTONE_TORCH = createTorchBlock("warped", "redstone");
    public static final Block WARPED_REDSTONE_WALL_TORCH = createTorchBlock("warped", WARPED_REDSTONE_TORCH, "redstone");

    public static final Block CRIMSON_REDSTONE_TORCH = createTorchBlock("crimson", "redstone");
    public static final Block CRIMSON_REDSTONE_WALL_TORCH = createTorchBlock("crimson", CRIMSON_REDSTONE_TORCH, "redstone");

    public static final Block BAMBOO_REDSTONE_TORCH = createTorchBlock("bamboo", "redstone");
    public static final Block BAMBOO_REDSTONE_WALL_TORCH = createTorchBlock("bamboo", BAMBOO_REDSTONE_TORCH, "redstone");

    public static final Block CHERRY_REDSTONE_TORCH = createTorchBlock("cherry", "redstone");
    public static final Block CHERRY_REDSTONE_WALL_TORCH = createTorchBlock("cherry", CHERRY_REDSTONE_TORCH, "redstone");

    public static final Block MANGROVE_REDSTONE_TORCH = createTorchBlock("mangrove", "redstone");
    public static final Block MANGROVE_REDSTONE_WALL_TORCH = createTorchBlock("mangrove", MANGROVE_REDSTONE_TORCH, "redstone");

    public static final Block DARK_OAK_REDSTONE_TORCH = createTorchBlock("dark_oak", "redstone");
    public static final Block DARK_OAK_REDSTONE_WALL_TORCH = createTorchBlock("dark_oak", DARK_OAK_REDSTONE_TORCH, "redstone");

    public static final Block ACACIA_REDSTONE_TORCH = createTorchBlock("acacia", "redstone");
    public static final Block ACACIA_REDSTONE_WALL_TORCH = createTorchBlock("acacia", ACACIA_REDSTONE_TORCH, "redstone");

    public static final Block JUNGLE_REDSTONE_TORCH = createTorchBlock("jungle", "redstone");
    public static final Block JUNGLE_REDSTONE_WALL_TORCH = createTorchBlock("jungle", JUNGLE_REDSTONE_TORCH, "redstone");

    public static final Block BIRCH_REDSTONE_TORCH = createTorchBlock("birch", "redstone");
    public static final Block BIRCH_REDSTONE_WALL_TORCH = createTorchBlock("birch", BIRCH_REDSTONE_TORCH, "redstone");

    public static final Block SPRUCE_REDSTONE_TORCH = createTorchBlock("spruce", "redstone");
    public static final Block SPRUCE_REDSTONE_WALL_TORCH = createTorchBlock("spruce", SPRUCE_REDSTONE_TORCH, "redstone");

    public static List<Block> more_torch_blocks = new ArrayList<>();

    private static Block createTorchBlock(String woodType) {
        return createTorchBlock(woodType, null, "");
    }

    private static Block createTorchBlock(String woodType, Block standingTorchBlock) {
        return createTorchBlock(woodType, standingTorchBlock, "");
    }

    private static Block createTorchBlock(String woodType, String torchType) {
        return createTorchBlock(woodType, null, torchType);
    }

    private static Block createTorchBlock(String woodType, Block standingTorchBlock, String torchType) {
        SimpleParticleType flame;
        BlockBehaviour.Properties torchProperties;
        Block torchBlock;
        String torchTypeInName = torchType;
        if(!torchTypeInName.isEmpty()){torchTypeInName = "_" + torchTypeInName;}
        if(standingTorchBlock != null) {torchTypeInName += "_wall";}
        String torchName =  woodType + torchTypeInName + "_torch";
        switch (torchType) {
            case "soul" -> {
                flame = ParticleTypes.SOUL_FIRE_FLAME;
                torchProperties = BlockBehaviour.Properties.of().noCollission().instabreak().lightLevel(blockStatex -> 10).sound(SoundType.WOOD).pushReaction(PushReaction.DESTROY);
            }
            case "redstone" -> {
                flame = null;
                torchProperties = BlockBehaviour.Properties.of().noCollission().instabreak().lightLevel(litBlockEmission(7)).sound(SoundType.WOOD).pushReaction(PushReaction.DESTROY);
            }
            default -> {
                flame = ParticleTypes.FLAME;
                torchProperties = BlockBehaviour.Properties.of().noCollission().instabreak().lightLevel(blockStatex -> 14).sound(SoundType.WOOD).pushReaction(PushReaction.DESTROY);
            }
        }
        torchProperties.setId(ResourceKey.create(Registries.BLOCK, MoreTorchVariants.asId(torchName)));
        if (standingTorchBlock != null) {
            torchProperties.overrideLootTable(standingTorchBlock.getLootTable()).overrideDescription(standingTorchBlock.getDescriptionId());
        }
        if (woodType.matches("crimson|warped")) {
            torchProperties.sound(SoundType.NETHER_WOOD);
        }
        else if (woodType.equals("cherry")) {
            torchProperties.sound(SoundType.CHERRY_WOOD);
        }
        else if (woodType.equals("bamboo")) {
            torchProperties.sound(SoundType.BAMBOO_WOOD);
        }
        if (torchType.equals("redstone")) {
            if (standingTorchBlock != null) {
                torchBlock = new RedstoneWallTorchBlock(torchProperties);
            } else {
                torchBlock = new RedstoneTorchBlock(torchProperties);
            }
        } else if (standingTorchBlock != null) {
            torchBlock = new WallTorchBlock(flame, torchProperties);
        } else {
            torchBlock = new TorchBlock(flame, torchProperties);
        }
        LOGGER.info(torchProperties.toString());
        return torchBlock;
    }

    private static void registerTorchBlock(Block torchBlock, String torchName){
        Registry.register(BuiltInRegistries.BLOCK, asId(torchName), torchBlock);
    }

    public static void registerTorchBlocks(){
        registerTorchBlock(WARPED_TORCH, "warped_torch");
        registerTorchBlock(WARPED_WALL_TORCH, "warped_wall_torch");
        registerTorchBlock(CRIMSON_TORCH, "crimson_torch");
        registerTorchBlock(CRIMSON_WALL_TORCH, "crimson_wall_torch");
        registerTorchBlock(BAMBOO_TORCH, "bamboo_torch");
        registerTorchBlock(BAMBOO_WALL_TORCH, "bamboo_wall_torch");
        registerTorchBlock(CHERRY_TORCH, "cherry_torch");
        registerTorchBlock(CHERRY_WALL_TORCH, "cherry_wall_torch");
        registerTorchBlock(MANGROVE_TORCH, "mangrove_torch");
        registerTorchBlock(MANGROVE_WALL_TORCH, "mangrove_wall_torch");
        registerTorchBlock(DARK_OAK_TORCH, "dark_oak_torch");
        registerTorchBlock(DARK_OAK_WALL_TORCH, "dark_oak_wall_torch");
        registerTorchBlock(ACACIA_TORCH, "acacia_torch");
        registerTorchBlock(ACACIA_WALL_TORCH, "acacia_wall_torch");
        registerTorchBlock(JUNGLE_TORCH, "jungle_torch");
        registerTorchBlock(JUNGLE_WALL_TORCH, "jungle_wall_torch");
        registerTorchBlock(BIRCH_TORCH, "birch_torch");
        registerTorchBlock(BIRCH_WALL_TORCH, "birch_wall_torch");
        registerTorchBlock(SPRUCE_TORCH, "spruce_torch");
        registerTorchBlock(SPRUCE_WALL_TORCH, "spruce_wall_torch");
        registerTorchBlock(WARPED_SOUL_TORCH, "warped_soul_torch");
        registerTorchBlock(WARPED_SOUL_WALL_TORCH, "warped_soul_wall_torch");
        registerTorchBlock(CRIMSON_SOUL_TORCH, "crimson_soul_torch");
        registerTorchBlock(CRIMSON_SOUL_WALL_TORCH, "crimson_soul_wall_torch");
        registerTorchBlock(BAMBOO_SOUL_TORCH, "bamboo_soul_torch");
        registerTorchBlock(BAMBOO_SOUL_WALL_TORCH, "bamboo_soul_wall_torch");
        registerTorchBlock(CHERRY_SOUL_TORCH, "cherry_soul_torch");
        registerTorchBlock(CHERRY_SOUL_WALL_TORCH, "cherry_soul_wall_torch");
        registerTorchBlock(MANGROVE_SOUL_TORCH, "mangrove_soul_torch");
        registerTorchBlock(MANGROVE_SOUL_WALL_TORCH, "mangrove_soul_wall_torch");
        registerTorchBlock(DARK_OAK_SOUL_TORCH, "dark_oak_soul_torch");
        registerTorchBlock(DARK_OAK_SOUL_WALL_TORCH, "dark_oak_soul_wall_torch");
        registerTorchBlock(ACACIA_SOUL_TORCH, "acacia_soul_torch");
        registerTorchBlock(ACACIA_SOUL_WALL_TORCH, "acacia_soul_wall_torch");
        registerTorchBlock(JUNGLE_SOUL_TORCH, "jungle_soul_torch");
        registerTorchBlock(JUNGLE_SOUL_WALL_TORCH, "jungle_soul_wall_torch");
        registerTorchBlock(BIRCH_SOUL_TORCH, "birch_soul_torch");
        registerTorchBlock(BIRCH_SOUL_WALL_TORCH, "birch_soul_wall_torch");
        registerTorchBlock(SPRUCE_SOUL_TORCH, "spruce_soul_torch");
        registerTorchBlock(SPRUCE_SOUL_WALL_TORCH, "spruce_soul_wall_torch");
        registerTorchBlock(WARPED_REDSTONE_TORCH, "warped_redstone_torch");
        registerTorchBlock(WARPED_REDSTONE_WALL_TORCH, "warped_redstone_wall_torch");
        registerTorchBlock(CRIMSON_REDSTONE_TORCH, "crimson_redstone_torch");
        registerTorchBlock(CRIMSON_REDSTONE_WALL_TORCH, "crimson_redstone_wall_torch");
        registerTorchBlock(BAMBOO_REDSTONE_TORCH, "bamboo_redstone_torch");
        registerTorchBlock(BAMBOO_REDSTONE_WALL_TORCH, "bamboo_redstone_wall_torch");
        registerTorchBlock(CHERRY_REDSTONE_TORCH, "cherry_redstone_torch");
        registerTorchBlock(CHERRY_REDSTONE_WALL_TORCH, "cherry_redstone_wall_torch");
        registerTorchBlock(MANGROVE_REDSTONE_TORCH, "mangrove_redstone_torch");
        registerTorchBlock(MANGROVE_REDSTONE_WALL_TORCH, "mangrove_redstone_wall_torch");
        registerTorchBlock(DARK_OAK_REDSTONE_TORCH, "dark_oak_redstone_torch");
        registerTorchBlock(DARK_OAK_REDSTONE_WALL_TORCH, "dark_oak_redstone_wall_torch");
        registerTorchBlock(ACACIA_REDSTONE_TORCH, "acacia_redstone_torch");
        registerTorchBlock(ACACIA_REDSTONE_WALL_TORCH, "acacia_redstone_wall_torch");
        registerTorchBlock(JUNGLE_REDSTONE_TORCH, "jungle_redstone_torch");
        registerTorchBlock(JUNGLE_REDSTONE_WALL_TORCH, "jungle_redstone_wall_torch");
        registerTorchBlock(BIRCH_REDSTONE_TORCH, "birch_redstone_torch");
        registerTorchBlock(BIRCH_REDSTONE_WALL_TORCH, "birch_redstone_wall_torch");
        registerTorchBlock(SPRUCE_REDSTONE_TORCH, "spruce_redstone_torch");
        registerTorchBlock(SPRUCE_REDSTONE_WALL_TORCH, "spruce_redstone_wall_torch");
    }
}