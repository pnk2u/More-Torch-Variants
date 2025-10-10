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

import static de.pnku.mstv_mtv.MoreTorchVariants.*;
import static de.pnku.mstv_mtv.init.MtvBlockInit.more_torch_blocks;

public class MtvBlockCopperInit {

    // Copper Torch BLocks + Copper Wall Torch Blocks + Copper Torch Items (Reverse Order)
    public static final Block WARPED_COPPER_TORCH = createTorchBlock("warped");
    public static final Block WARPED_COPPER_WALL_TORCH = createTorchBlock("warped", WARPED_COPPER_TORCH);

    public static final Block CRIMSON_COPPER_TORCH = createTorchBlock("crimson");
    public static final Block CRIMSON_COPPER_WALL_TORCH = createTorchBlock("crimson", CRIMSON_COPPER_TORCH);

    public static final Block BAMBOO_COPPER_TORCH = createTorchBlock("bamboo");
    public static final Block BAMBOO_COPPER_WALL_TORCH = createTorchBlock("bamboo", BAMBOO_COPPER_TORCH);

    public static final Block CHERRY_COPPER_TORCH = createTorchBlock("cherry");
    public static final Block CHERRY_COPPER_WALL_TORCH = createTorchBlock("cherry", CHERRY_COPPER_TORCH);

    public static final Block MANGROVE_COPPER_TORCH = createTorchBlock("mangrove");
    public static final Block MANGROVE_COPPER_WALL_TORCH = createTorchBlock("mangrove", MANGROVE_COPPER_TORCH);

    public static final Block DARK_OAK_COPPER_TORCH = createTorchBlock("dark_oak");
    public static final Block DARK_OAK_COPPER_WALL_TORCH = createTorchBlock("dark_oak", DARK_OAK_COPPER_TORCH);

    public static final Block PALE_OAK_COPPER_TORCH = createTorchBlock("pale_oak");
    public static final Block PALE_OAK_COPPER_WALL_TORCH = createTorchBlock("pale_oak", PALE_OAK_COPPER_TORCH);

    public static final Block ACACIA_COPPER_TORCH = createTorchBlock("acacia");
    public static final Block ACACIA_COPPER_WALL_TORCH = createTorchBlock("acacia", ACACIA_COPPER_TORCH);

    public static final Block JUNGLE_COPPER_TORCH = createTorchBlock("jungle");
    public static final Block JUNGLE_COPPER_WALL_TORCH = createTorchBlock("jungle", JUNGLE_COPPER_TORCH);

    public static final Block BIRCH_COPPER_TORCH = createTorchBlock("birch");
    public static final Block BIRCH_COPPER_WALL_TORCH = createTorchBlock("birch", BIRCH_COPPER_TORCH);

    public static final Block SPRUCE_COPPER_TORCH = createTorchBlock("spruce");
    public static final Block SPRUCE_COPPER_WALL_TORCH = createTorchBlock("spruce", SPRUCE_COPPER_TORCH);

    private static Block createTorchBlock(String woodType) {
        return createTorchBlock(woodType, null);
    }

    private static Block createTorchBlock(String woodType, Block standingTorchBlock) {
        SimpleParticleType flame;
        BlockBehaviour.Properties torchProperties;
        Block torchBlock;
        String torchTypeInName = "_copper";
        if(standingTorchBlock != null) {torchTypeInName += "_wall";}
        String torchName = woodType + torchTypeInName + "_torch";
        flame = ParticleTypes.COPPER_FIRE_FLAME;
        torchProperties = BlockBehaviour.Properties.of().noCollision().instabreak().lightLevel(blockStatex -> 14).sound(SoundType.WOOD).pushReaction(PushReaction.DESTROY);
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
        if (standingTorchBlock != null) {
            torchBlock = new WallTorchBlock(flame, torchProperties);
        } else {
            torchBlock = new TorchBlock(flame, torchProperties);
        }
        return torchBlock;
    }

    private static void registerTorchBlock(Block torchBlock, String torchName){
        Registry.register(BuiltInRegistries.BLOCK, asId(torchName), torchBlock);
        more_torch_blocks.add(torchBlock);
    }

    public static void registerCopperTorchBlocks(){
        registerTorchBlock(WARPED_COPPER_TORCH, "warped_copper_torch");
        registerTorchBlock(WARPED_COPPER_WALL_TORCH, "warped_copper_wall_torch");
        registerTorchBlock(CRIMSON_COPPER_TORCH, "crimson_copper_torch");
        registerTorchBlock(CRIMSON_COPPER_WALL_TORCH, "crimson_copper_wall_torch");
        registerTorchBlock(BAMBOO_COPPER_TORCH, "bamboo_copper_torch");
        registerTorchBlock(BAMBOO_COPPER_WALL_TORCH, "bamboo_copper_wall_torch");
        registerTorchBlock(CHERRY_COPPER_TORCH, "cherry_copper_torch");
        registerTorchBlock(CHERRY_COPPER_WALL_TORCH, "cherry_copper_wall_torch");
        registerTorchBlock(MANGROVE_COPPER_TORCH, "mangrove_copper_torch");
        registerTorchBlock(MANGROVE_COPPER_WALL_TORCH, "mangrove_copper_wall_torch");
        registerTorchBlock(DARK_OAK_COPPER_TORCH, "dark_oak_copper_torch");
        registerTorchBlock(DARK_OAK_COPPER_WALL_TORCH, "dark_oak_copper_wall_torch");
        registerTorchBlock(PALE_OAK_COPPER_TORCH, "pale_oak_copper_torch");
        registerTorchBlock(PALE_OAK_COPPER_WALL_TORCH, "pale_oak_copper_wall_torch");
        registerTorchBlock(ACACIA_COPPER_TORCH, "acacia_copper_torch");
        registerTorchBlock(ACACIA_COPPER_WALL_TORCH, "acacia_copper_wall_torch");
        registerTorchBlock(JUNGLE_COPPER_TORCH, "jungle_copper_torch");
        registerTorchBlock(JUNGLE_COPPER_WALL_TORCH, "jungle_copper_wall_torch");
        registerTorchBlock(BIRCH_COPPER_TORCH, "birch_copper_torch");
        registerTorchBlock(BIRCH_COPPER_WALL_TORCH, "birch_copper_wall_torch");
        registerTorchBlock(SPRUCE_COPPER_TORCH, "spruce_copper_torch");
        registerTorchBlock(SPRUCE_COPPER_WALL_TORCH, "spruce_copper_wall_torch");
    }
}