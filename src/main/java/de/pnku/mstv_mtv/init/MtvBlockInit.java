package de.pnku.mstv_mtv.init;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.core.Direction;
import net.minecraft.core.Registry;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.StandingAndWallBlockItem;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;

import java.util.ArrayList;
import java.util.List;

import static de.pnku.mstv_mtv.MoreTorchVariants.asId;

public class MtvBlockInit {

    public static final List<Block> more_torch_blocks = new ArrayList<>();

    private static Block registerTorchBlock(String name, Block torchBlock) {
        more_torch_blocks.add(torchBlock);
        return Registry.register(BuiltInRegistries.BLOCK, asId(name), torchBlock);
    }

    public static Item registerFireTorchItem(String name, Item torchItem) {
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.FUNCTIONAL_BLOCKS).register(entries -> entries.addAfter(Items.TORCH, torchItem));
        return Registry.register(BuiltInRegistries.ITEM, asId(name), torchItem);
    }

    public static Item registerSoulTorchItem(String name, Item torchItem) {
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.FUNCTIONAL_BLOCKS).register(entries -> entries.addAfter(Items.SOUL_TORCH, torchItem));
        return Registry.register(BuiltInRegistries.ITEM, asId(name), torchItem);
    }

    public static Item registerRedstoneTorchItem(String name, Item torchItem) {
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.FUNCTIONAL_BLOCKS).register(entries -> entries.addAfter(Items.REDSTONE_TORCH, torchItem));
        return Registry.register(BuiltInRegistries.ITEM, asId(name), torchItem);
    }
    
    // Fire Torch Blocks + Fire Wall Torch Blocks + Fire Torch Items (Reverse Order)
    public static final Block WARPED_TORCH = registerTorchBlock("warped_torch", new TorchBlock(ParticleTypes.FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.TORCH).sound(SoundType.NETHER_WOOD)));
    public static final Block WARPED_WALL_TORCH = registerTorchBlock("warped_wall_torch",new WallTorchBlock(ParticleTypes.FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.WALL_TORCH).dropsLike(WARPED_TORCH).sound(SoundType.NETHER_WOOD)));
    public static final Item WARPED_TORCH_I = registerFireTorchItem("warped_torch", new StandingAndWallBlockItem(WARPED_TORCH, WARPED_WALL_TORCH, new Item.Properties(), Direction.DOWN ));

    public static final Block CRIMSON_TORCH = registerTorchBlock("crimson_torch", new TorchBlock(ParticleTypes.FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.TORCH).sound(SoundType.NETHER_WOOD)));
    public static final Block CRIMSON_WALL_TORCH = registerTorchBlock("crimson_wall_torch",new WallTorchBlock(ParticleTypes.FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.WALL_TORCH).dropsLike(CRIMSON_TORCH).sound(SoundType.NETHER_WOOD)));
    public static final Item CRIMSON_TORCH_I = registerFireTorchItem("crimson_torch", new StandingAndWallBlockItem(CRIMSON_TORCH, CRIMSON_WALL_TORCH, new Item.Properties(), Direction.DOWN ));

    public static final Block BAMBOO_TORCH = registerTorchBlock("bamboo_torch", new TorchBlock(ParticleTypes.FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.TORCH).sound(SoundType.BAMBOO_WOOD)));
    public static final Block BAMBOO_WALL_TORCH = registerTorchBlock("bamboo_wall_torch",new WallTorchBlock(ParticleTypes.FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.WALL_TORCH).dropsLike(BAMBOO_TORCH).sound(SoundType.BAMBOO_WOOD)));
    public static final Item BAMBOO_TORCH_I = registerFireTorchItem("bamboo_torch", new StandingAndWallBlockItem(BAMBOO_TORCH, BAMBOO_WALL_TORCH, new Item.Properties(), Direction.DOWN ));

    public static final Block CHERRY_TORCH = registerTorchBlock("cherry_torch", new TorchBlock(ParticleTypes.FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.TORCH).sound(SoundType.CHERRY_WOOD)));
    public static final Block CHERRY_WALL_TORCH = registerTorchBlock("cherry_wall_torch",new WallTorchBlock(ParticleTypes.FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.WALL_TORCH).dropsLike(CHERRY_TORCH).sound(SoundType.CHERRY_WOOD)));
    public static final Item CHERRY_TORCH_I = registerFireTorchItem("cherry_torch", new StandingAndWallBlockItem(CHERRY_TORCH, CHERRY_WALL_TORCH, new Item.Properties(), Direction.DOWN ));

    public static final Block MANGROVE_TORCH = registerTorchBlock("mangrove_torch", new TorchBlock(ParticleTypes.FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.TORCH)));
    public static final Block MANGROVE_WALL_TORCH = registerTorchBlock("mangrove_wall_torch",new WallTorchBlock(ParticleTypes.FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.WALL_TORCH).dropsLike(MANGROVE_TORCH)));
    public static final Item MANGROVE_TORCH_I = registerFireTorchItem("mangrove_torch", new StandingAndWallBlockItem(MANGROVE_TORCH, MANGROVE_WALL_TORCH, new Item.Properties(), Direction.DOWN ));

    public static final Block DARK_OAK_TORCH = registerTorchBlock("dark_oak_torch", new TorchBlock(ParticleTypes.FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.TORCH)));
    public static final Block DARK_OAK_WALL_TORCH = registerTorchBlock("dark_oak_wall_torch",new WallTorchBlock(ParticleTypes.FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.WALL_TORCH).dropsLike(DARK_OAK_TORCH)));
    public static final Item DARK_OAK_TORCH_I = registerFireTorchItem("dark_oak_torch", new StandingAndWallBlockItem(DARK_OAK_TORCH, DARK_OAK_WALL_TORCH, new Item.Properties(), Direction.DOWN ));

    public static final Block ACACIA_TORCH = registerTorchBlock("acacia_torch", new TorchBlock(ParticleTypes.FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.TORCH)));
    public static final Block ACACIA_WALL_TORCH = registerTorchBlock("acacia_wall_torch",new WallTorchBlock(ParticleTypes.FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.WALL_TORCH).dropsLike(ACACIA_TORCH)));
    public static final Item ACACIA_TORCH_I = registerFireTorchItem("acacia_torch", new StandingAndWallBlockItem(ACACIA_TORCH, ACACIA_WALL_TORCH, new Item.Properties(), Direction.DOWN ));

    public static final Block JUNGLE_TORCH = registerTorchBlock("jungle_torch", new TorchBlock(ParticleTypes.FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.TORCH)));
    public static final Block JUNGLE_WALL_TORCH = registerTorchBlock("jungle_wall_torch",new WallTorchBlock(ParticleTypes.FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.WALL_TORCH).dropsLike(JUNGLE_TORCH)));
    public static final Item JUNGLE_TORCH_I = registerFireTorchItem("jungle_torch", new StandingAndWallBlockItem(JUNGLE_TORCH, JUNGLE_WALL_TORCH, new Item.Properties(), Direction.DOWN ));

    public static final Block BIRCH_TORCH = registerTorchBlock("birch_torch", new TorchBlock(ParticleTypes.FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.TORCH)));
    public static final Block BIRCH_WALL_TORCH = registerTorchBlock("birch_wall_torch",new WallTorchBlock(ParticleTypes.FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.WALL_TORCH).dropsLike(BIRCH_TORCH)));
    public static final Item BIRCH_TORCH_I = registerFireTorchItem("birch_torch", new StandingAndWallBlockItem(BIRCH_TORCH, BIRCH_WALL_TORCH, new Item.Properties(), Direction.DOWN ));

    public static final Block SPRUCE_TORCH = registerTorchBlock("spruce_torch", new TorchBlock(ParticleTypes.FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.TORCH)));
    public static final Block SPRUCE_WALL_TORCH = registerTorchBlock("spruce_wall_torch",new WallTorchBlock(ParticleTypes.FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.WALL_TORCH).dropsLike(SPRUCE_TORCH)));
    public static final Item SPRUCE_TORCH_I = registerFireTorchItem("spruce_torch", new StandingAndWallBlockItem(SPRUCE_TORCH, SPRUCE_WALL_TORCH, new Item.Properties(), Direction.DOWN ));

    
    // Soul Torch BLocks + Soul Wall Torch Blocks + Soul Torch Items (Reverse Order)
    public static final Block WARPED_SOUL_TORCH = registerTorchBlock("warped_soul_torch", new TorchBlock(ParticleTypes.SOUL_FIRE_FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.SOUL_TORCH).sound(SoundType.NETHER_WOOD)));
    public static final Block WARPED_SOUL_WALL_TORCH = registerTorchBlock("warped_soul_wall_torch",new WallTorchBlock(ParticleTypes.SOUL_FIRE_FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.SOUL_WALL_TORCH).dropsLike(WARPED_SOUL_TORCH).sound(SoundType.NETHER_WOOD)));
    public static final Item WARPED_SOUL_TORCH_I = registerSoulTorchItem("warped_soul_torch", new StandingAndWallBlockItem(WARPED_SOUL_TORCH, WARPED_SOUL_WALL_TORCH, new Item.Properties(), Direction.DOWN ));

    public static final Block CRIMSON_SOUL_TORCH = registerTorchBlock("crimson_soul_torch", new TorchBlock(ParticleTypes.SOUL_FIRE_FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.SOUL_TORCH).sound(SoundType.NETHER_WOOD)));
    public static final Block CRIMSON_SOUL_WALL_TORCH = registerTorchBlock("crimson_soul_wall_torch",new WallTorchBlock(ParticleTypes.SOUL_FIRE_FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.SOUL_WALL_TORCH).dropsLike(CRIMSON_SOUL_TORCH).sound(SoundType.NETHER_WOOD)));
    public static final Item CRIMSON_SOUL_TORCH_I = registerSoulTorchItem("crimson_soul_torch", new StandingAndWallBlockItem(CRIMSON_SOUL_TORCH, CRIMSON_SOUL_WALL_TORCH, new Item.Properties(), Direction.DOWN ));

    public static final Block BAMBOO_SOUL_TORCH = registerTorchBlock("bamboo_soul_torch", new TorchBlock(ParticleTypes.SOUL_FIRE_FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.SOUL_TORCH).sound(SoundType.BAMBOO_WOOD)));
    public static final Block BAMBOO_SOUL_WALL_TORCH = registerTorchBlock("bamboo_soul_wall_torch",new WallTorchBlock(ParticleTypes.SOUL_FIRE_FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.SOUL_WALL_TORCH).dropsLike(BAMBOO_SOUL_TORCH).sound(SoundType.BAMBOO_WOOD)));
    public static final Item BAMBOO_SOUL_TORCH_I = registerSoulTorchItem("bamboo_soul_torch", new StandingAndWallBlockItem(BAMBOO_SOUL_TORCH, BAMBOO_SOUL_WALL_TORCH, new Item.Properties(), Direction.DOWN ));

    public static final Block CHERRY_SOUL_TORCH = registerTorchBlock("cherry_soul_torch", new TorchBlock(ParticleTypes.SOUL_FIRE_FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.SOUL_TORCH).sound(SoundType.CHERRY_WOOD)));
    public static final Block CHERRY_SOUL_WALL_TORCH = registerTorchBlock("cherry_soul_wall_torch",new WallTorchBlock(ParticleTypes.SOUL_FIRE_FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.SOUL_WALL_TORCH).dropsLike(CHERRY_SOUL_TORCH).sound(SoundType.CHERRY_WOOD)));
    public static final Item CHERRY_SOUL_TORCH_I = registerSoulTorchItem("cherry_soul_torch", new StandingAndWallBlockItem(CHERRY_SOUL_TORCH, CHERRY_SOUL_WALL_TORCH, new Item.Properties(), Direction.DOWN ));

    public static final Block MANGROVE_SOUL_TORCH = registerTorchBlock("mangrove_soul_torch", new TorchBlock(ParticleTypes.SOUL_FIRE_FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.SOUL_TORCH)));
    public static final Block MANGROVE_SOUL_WALL_TORCH = registerTorchBlock("mangrove_soul_wall_torch",new WallTorchBlock(ParticleTypes.SOUL_FIRE_FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.SOUL_WALL_TORCH).dropsLike(MANGROVE_SOUL_TORCH)));
    public static final Item MANGROVE_SOUL_TORCH_I = registerSoulTorchItem("mangrove_soul_torch", new StandingAndWallBlockItem(MANGROVE_SOUL_TORCH, MANGROVE_SOUL_WALL_TORCH, new Item.Properties(), Direction.DOWN ));

    public static final Block DARK_OAK_SOUL_TORCH = registerTorchBlock("dark_oak_soul_torch", new TorchBlock(ParticleTypes.SOUL_FIRE_FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.SOUL_TORCH)));
    public static final Block DARK_OAK_SOUL_WALL_TORCH = registerTorchBlock("dark_oak_soul_wall_torch",new WallTorchBlock(ParticleTypes.SOUL_FIRE_FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.SOUL_WALL_TORCH).dropsLike(DARK_OAK_SOUL_TORCH)));
    public static final Item DARK_OAK_SOUL_TORCH_I = registerSoulTorchItem("dark_oak_soul_torch", new StandingAndWallBlockItem(DARK_OAK_SOUL_TORCH, DARK_OAK_SOUL_WALL_TORCH, new Item.Properties(), Direction.DOWN ));

    public static final Block ACACIA_SOUL_TORCH = registerTorchBlock("acacia_soul_torch", new TorchBlock(ParticleTypes.SOUL_FIRE_FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.SOUL_TORCH)));
    public static final Block ACACIA_SOUL_WALL_TORCH = registerTorchBlock("acacia_soul_wall_torch",new WallTorchBlock(ParticleTypes.SOUL_FIRE_FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.SOUL_WALL_TORCH).dropsLike(ACACIA_SOUL_TORCH)));
    public static final Item ACACIA_SOUL_TORCH_I = registerSoulTorchItem("acacia_soul_torch", new StandingAndWallBlockItem(ACACIA_SOUL_TORCH, ACACIA_SOUL_WALL_TORCH, new Item.Properties(), Direction.DOWN ));

    public static final Block JUNGLE_SOUL_TORCH = registerTorchBlock("jungle_soul_torch", new TorchBlock(ParticleTypes.SOUL_FIRE_FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.SOUL_TORCH)));
    public static final Block JUNGLE_SOUL_WALL_TORCH = registerTorchBlock("jungle_soul_wall_torch",new WallTorchBlock(ParticleTypes.SOUL_FIRE_FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.SOUL_WALL_TORCH).dropsLike(JUNGLE_SOUL_TORCH)));
    public static final Item JUNGLE_SOUL_TORCH_I = registerSoulTorchItem("jungle_soul_torch", new StandingAndWallBlockItem(JUNGLE_SOUL_TORCH, JUNGLE_SOUL_WALL_TORCH, new Item.Properties(), Direction.DOWN ));

    public static final Block BIRCH_SOUL_TORCH = registerTorchBlock("birch_soul_torch", new TorchBlock(ParticleTypes.SOUL_FIRE_FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.SOUL_TORCH)));
    public static final Block BIRCH_SOUL_WALL_TORCH = registerTorchBlock("birch_soul_wall_torch",new WallTorchBlock(ParticleTypes.SOUL_FIRE_FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.SOUL_WALL_TORCH).dropsLike(BIRCH_SOUL_TORCH)));
    public static final Item BIRCH_SOUL_TORCH_I = registerSoulTorchItem("birch_soul_torch", new StandingAndWallBlockItem(BIRCH_SOUL_TORCH, BIRCH_SOUL_WALL_TORCH, new Item.Properties(), Direction.DOWN ));

    public static final Block SPRUCE_SOUL_TORCH = registerTorchBlock("spruce_soul_torch", new TorchBlock(ParticleTypes.SOUL_FIRE_FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.SOUL_TORCH)));
    public static final Block SPRUCE_SOUL_WALL_TORCH = registerTorchBlock("spruce_soul_wall_torch",new WallTorchBlock(ParticleTypes.SOUL_FIRE_FLAME, BlockBehaviour.Properties.ofFullCopy(Blocks.SOUL_WALL_TORCH).dropsLike(SPRUCE_SOUL_TORCH)));
    public static final Item SPRUCE_SOUL_TORCH_I = registerSoulTorchItem("spruce_soul_torch", new StandingAndWallBlockItem(SPRUCE_SOUL_TORCH, SPRUCE_SOUL_WALL_TORCH, new Item.Properties(), Direction.DOWN ));


    // Redstone Torch BLocks + Redstone Wall Torch Blocks + Redstone Torch Items (Reverse Order)
    public static final Block WARPED_REDSTONE_TORCH = registerTorchBlock("warped_redstone_torch", new RedstoneTorchBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_TORCH).sound(SoundType.NETHER_WOOD)));
    public static final Block WARPED_REDSTONE_WALL_TORCH = registerTorchBlock("warped_redstone_wall_torch",new RedstoneWallTorchBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_WALL_TORCH).dropsLike(WARPED_REDSTONE_TORCH).sound(SoundType.NETHER_WOOD)));
    public static final Item WARPED_REDSTONE_TORCH_I = registerRedstoneTorchItem("warped_redstone_torch", new StandingAndWallBlockItem(WARPED_REDSTONE_TORCH, WARPED_REDSTONE_WALL_TORCH, new Item.Properties(), Direction.DOWN ));

    public static final Block CRIMSON_REDSTONE_TORCH = registerTorchBlock("crimson_redstone_torch", new RedstoneTorchBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_TORCH).sound(SoundType.NETHER_WOOD)));
    public static final Block CRIMSON_REDSTONE_WALL_TORCH = registerTorchBlock("crimson_redstone_wall_torch",new RedstoneWallTorchBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_WALL_TORCH).dropsLike(CRIMSON_REDSTONE_TORCH).sound(SoundType.NETHER_WOOD)));
    public static final Item CRIMSON_REDSTONE_TORCH_I = registerRedstoneTorchItem("crimson_redstone_torch", new StandingAndWallBlockItem(CRIMSON_REDSTONE_TORCH, CRIMSON_REDSTONE_WALL_TORCH, new Item.Properties(), Direction.DOWN ));

    public static final Block BAMBOO_REDSTONE_TORCH = registerTorchBlock("bamboo_redstone_torch", new RedstoneTorchBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_TORCH).sound(SoundType.BAMBOO_WOOD)));
    public static final Block BAMBOO_REDSTONE_WALL_TORCH = registerTorchBlock("bamboo_redstone_wall_torch",new RedstoneWallTorchBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_WALL_TORCH).dropsLike(BAMBOO_REDSTONE_TORCH).sound(SoundType.BAMBOO_WOOD)));
    public static final Item BAMBOO_REDSTONE_TORCH_I = registerRedstoneTorchItem("bamboo_redstone_torch", new StandingAndWallBlockItem(BAMBOO_REDSTONE_TORCH, BAMBOO_REDSTONE_WALL_TORCH, new Item.Properties(), Direction.DOWN ));

    public static final Block CHERRY_REDSTONE_TORCH = registerTorchBlock("cherry_redstone_torch", new RedstoneTorchBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_TORCH).sound(SoundType.CHERRY_WOOD)));
    public static final Block CHERRY_REDSTONE_WALL_TORCH = registerTorchBlock("cherry_redstone_wall_torch",new RedstoneWallTorchBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_WALL_TORCH).dropsLike(CHERRY_REDSTONE_TORCH).sound(SoundType.CHERRY_WOOD)));
    public static final Item CHERRY_REDSTONE_TORCH_I = registerRedstoneTorchItem("cherry_redstone_torch", new StandingAndWallBlockItem(CHERRY_REDSTONE_TORCH, CHERRY_REDSTONE_WALL_TORCH, new Item.Properties(), Direction.DOWN ));

    public static final Block MANGROVE_REDSTONE_TORCH = registerTorchBlock("mangrove_redstone_torch", new RedstoneTorchBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_TORCH)));
    public static final Block MANGROVE_REDSTONE_WALL_TORCH = registerTorchBlock("mangrove_redstone_wall_torch",new RedstoneWallTorchBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_WALL_TORCH).dropsLike(MANGROVE_REDSTONE_TORCH)));
    public static final Item MANGROVE_REDSTONE_TORCH_I = registerRedstoneTorchItem("mangrove_redstone_torch", new StandingAndWallBlockItem(MANGROVE_REDSTONE_TORCH, MANGROVE_REDSTONE_WALL_TORCH, new Item.Properties(), Direction.DOWN ));

    public static final Block DARK_OAK_REDSTONE_TORCH = registerTorchBlock("dark_oak_redstone_torch", new RedstoneTorchBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_TORCH)));
    public static final Block DARK_OAK_REDSTONE_WALL_TORCH = registerTorchBlock("dark_oak_redstone_wall_torch",new RedstoneWallTorchBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_WALL_TORCH).dropsLike(DARK_OAK_REDSTONE_TORCH)));
    public static final Item DARK_OAK_REDSTONE_TORCH_I = registerRedstoneTorchItem("dark_oak_redstone_torch", new StandingAndWallBlockItem(DARK_OAK_REDSTONE_TORCH, DARK_OAK_REDSTONE_WALL_TORCH, new Item.Properties(), Direction.DOWN ));

    public static final Block ACACIA_REDSTONE_TORCH = registerTorchBlock("acacia_redstone_torch", new RedstoneTorchBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_TORCH)));
    public static final Block ACACIA_REDSTONE_WALL_TORCH = registerTorchBlock("acacia_redstone_wall_torch",new RedstoneWallTorchBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_WALL_TORCH).dropsLike(ACACIA_REDSTONE_TORCH)));
    public static final Item ACACIA_REDSTONE_TORCH_I = registerRedstoneTorchItem("acacia_redstone_torch", new StandingAndWallBlockItem(ACACIA_REDSTONE_TORCH, ACACIA_REDSTONE_WALL_TORCH, new Item.Properties(), Direction.DOWN ));

    public static final Block JUNGLE_REDSTONE_TORCH = registerTorchBlock("jungle_redstone_torch", new RedstoneTorchBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_TORCH)));
    public static final Block JUNGLE_REDSTONE_WALL_TORCH = registerTorchBlock("jungle_redstone_wall_torch",new RedstoneWallTorchBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_WALL_TORCH).dropsLike(JUNGLE_REDSTONE_TORCH)));
    public static final Item JUNGLE_REDSTONE_TORCH_I = registerRedstoneTorchItem("jungle_redstone_torch", new StandingAndWallBlockItem(JUNGLE_REDSTONE_TORCH, JUNGLE_REDSTONE_WALL_TORCH, new Item.Properties(), Direction.DOWN ));

    public static final Block BIRCH_REDSTONE_TORCH = registerTorchBlock("birch_redstone_torch", new RedstoneTorchBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_TORCH)));
    public static final Block BIRCH_REDSTONE_WALL_TORCH = registerTorchBlock("birch_redstone_wall_torch",new RedstoneWallTorchBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_WALL_TORCH).dropsLike(BIRCH_REDSTONE_TORCH)));
    public static final Item BIRCH_REDSTONE_TORCH_I = registerRedstoneTorchItem("birch_redstone_torch", new StandingAndWallBlockItem(BIRCH_REDSTONE_TORCH, BIRCH_REDSTONE_WALL_TORCH, new Item.Properties(), Direction.DOWN ));

    public static final Block SPRUCE_REDSTONE_TORCH = registerTorchBlock("spruce_redstone_torch", new RedstoneTorchBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_TORCH)));
    public static final Block SPRUCE_REDSTONE_WALL_TORCH = registerTorchBlock("spruce_redstone_wall_torch",new RedstoneWallTorchBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_WALL_TORCH).dropsLike(SPRUCE_REDSTONE_TORCH)));
    public static final Item SPRUCE_REDSTONE_TORCH_I = registerRedstoneTorchItem("spruce_redstone_torch", new StandingAndWallBlockItem(SPRUCE_REDSTONE_TORCH, SPRUCE_REDSTONE_WALL_TORCH, new Item.Properties(), Direction.DOWN ));
}