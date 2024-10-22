package de.pnku.mstv_mtv.init;

import de.pnku.mstv_mtv.MoreTorchVariants;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.core.Direction;
import net.minecraft.core.Registry;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.StandingAndWallBlockItem;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;

import java.util.ArrayList;
import java.util.List;

import static de.pnku.mstv_mtv.MoreTorchVariants.LOGGER;
import static de.pnku.mstv_mtv.MoreTorchVariants.asId;
import static de.pnku.mstv_mtv.init.MtvBlockInit.*;

public class MtvItemInit {

    //Fire Torch Items (Reverse Order)
    public static final Item WARPED_TORCH_I = createTorchItem(WARPED_TORCH, WARPED_WALL_TORCH);

    public static final Item CRIMSON_TORCH_I = createTorchItem(CRIMSON_TORCH, CRIMSON_WALL_TORCH);

    public static final Item BAMBOO_TORCH_I = createTorchItem(BAMBOO_TORCH, BAMBOO_WALL_TORCH);

    public static final Item CHERRY_TORCH_I = createTorchItem(CHERRY_TORCH, CHERRY_WALL_TORCH);

    public static final Item MANGROVE_TORCH_I = createTorchItem(MANGROVE_TORCH, MANGROVE_WALL_TORCH);

    public static final Item DARK_OAK_TORCH_I = createTorchItem(DARK_OAK_TORCH, DARK_OAK_WALL_TORCH);

    public static final Item ACACIA_TORCH_I = createTorchItem(ACACIA_TORCH, ACACIA_WALL_TORCH);

    public static final Item JUNGLE_TORCH_I = createTorchItem(JUNGLE_TORCH, JUNGLE_WALL_TORCH);

    public static final Item BIRCH_TORCH_I = createTorchItem(BIRCH_TORCH, BIRCH_WALL_TORCH);

    public static final Item SPRUCE_TORCH_I = createTorchItem(SPRUCE_TORCH, SPRUCE_WALL_TORCH);


    //Soul Torch Items (Reverse Order)
    public static final Item WARPED_SOUL_TORCH_I = createTorchItem(WARPED_SOUL_TORCH, WARPED_SOUL_WALL_TORCH);

    public static final Item CRIMSON_SOUL_TORCH_I = createTorchItem(CRIMSON_SOUL_TORCH, CRIMSON_SOUL_WALL_TORCH);

    public static final Item BAMBOO_SOUL_TORCH_I = createTorchItem(BAMBOO_SOUL_TORCH, BAMBOO_SOUL_WALL_TORCH);

    public static final Item CHERRY_SOUL_TORCH_I = createTorchItem(CHERRY_SOUL_TORCH, CHERRY_SOUL_WALL_TORCH);

    public static final Item MANGROVE_SOUL_TORCH_I = createTorchItem(MANGROVE_SOUL_TORCH, MANGROVE_SOUL_WALL_TORCH);

    public static final Item DARK_OAK_SOUL_TORCH_I = createTorchItem(DARK_OAK_SOUL_TORCH, DARK_OAK_SOUL_WALL_TORCH);

    public static final Item ACACIA_SOUL_TORCH_I = createTorchItem(ACACIA_SOUL_TORCH, ACACIA_SOUL_WALL_TORCH);

    public static final Item JUNGLE_SOUL_TORCH_I = createTorchItem(JUNGLE_SOUL_TORCH, JUNGLE_SOUL_WALL_TORCH);

    public static final Item BIRCH_SOUL_TORCH_I = createTorchItem(BIRCH_SOUL_TORCH, BIRCH_SOUL_WALL_TORCH);

    public static final Item SPRUCE_SOUL_TORCH_I = createTorchItem(SPRUCE_SOUL_TORCH, SPRUCE_SOUL_WALL_TORCH);

    //Redstone Torch Items (Reverse Order)
    public static final Item WARPED_REDSTONE_TORCH_I = createTorchItem(WARPED_REDSTONE_TORCH, WARPED_REDSTONE_WALL_TORCH);

    public static final Item CRIMSON_REDSTONE_TORCH_I = createTorchItem(CRIMSON_REDSTONE_TORCH, CRIMSON_REDSTONE_WALL_TORCH);

    public static final Item BAMBOO_REDSTONE_TORCH_I = createTorchItem(BAMBOO_REDSTONE_TORCH, BAMBOO_REDSTONE_WALL_TORCH);

    public static final Item CHERRY_REDSTONE_TORCH_I = createTorchItem(CHERRY_REDSTONE_TORCH, CHERRY_REDSTONE_WALL_TORCH);

    public static final Item MANGROVE_REDSTONE_TORCH_I = createTorchItem(MANGROVE_REDSTONE_TORCH, MANGROVE_REDSTONE_WALL_TORCH);

    public static final Item DARK_OAK_REDSTONE_TORCH_I = createTorchItem(DARK_OAK_REDSTONE_TORCH, DARK_OAK_REDSTONE_WALL_TORCH);

    public static final Item ACACIA_REDSTONE_TORCH_I = createTorchItem(ACACIA_REDSTONE_TORCH, ACACIA_REDSTONE_WALL_TORCH);

    public static final Item JUNGLE_REDSTONE_TORCH_I = createTorchItem(JUNGLE_REDSTONE_TORCH, JUNGLE_REDSTONE_WALL_TORCH);

    public static final Item BIRCH_REDSTONE_TORCH_I = createTorchItem(BIRCH_REDSTONE_TORCH, BIRCH_REDSTONE_WALL_TORCH);

    public static final Item SPRUCE_REDSTONE_TORCH_I = createTorchItem(SPRUCE_REDSTONE_TORCH, SPRUCE_REDSTONE_WALL_TORCH);


    private static Item createTorchItem(Block standingTorchBlock, Block wallTorchBlock) {
        Item.Properties torchItemProperties = new Item.Properties().setId(ResourceKey.create(Registries.ITEM, BuiltInRegistries.BLOCK.getKey(standingTorchBlock))).useBlockDescriptionPrefix();
        return new StandingAndWallBlockItem(standingTorchBlock, wallTorchBlock, Direction.DOWN, torchItemProperties);
    }

    private static void registerFireTorchItem(Item fireTorchItem, String torchName) {
        Registry.register(BuiltInRegistries.ITEM, asId(torchName), fireTorchItem);
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.FUNCTIONAL_BLOCKS).register(entries -> entries.addAfter(Items.TORCH, fireTorchItem));
    }
    private static void registerSoulTorchItem(Item soulTorchItem, String torchName){
        Registry.register(BuiltInRegistries.ITEM, asId(torchName), soulTorchItem);
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.FUNCTIONAL_BLOCKS).register(entries -> entries.addAfter(Items.SOUL_TORCH, soulTorchItem));
    }
    private static void registerRedstoneTorchItem(Item redstoneTorchItem, String torchName){
        Registry.register(BuiltInRegistries.ITEM, asId(torchName), redstoneTorchItem);
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.FUNCTIONAL_BLOCKS).register(entries -> entries.addAfter(Items.REDSTONE_TORCH, redstoneTorchItem));
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.REDSTONE_BLOCKS).register(entries -> entries.addAfter(Items.REDSTONE_TORCH, redstoneTorchItem));
    }

    public static void registerTorchItems(){
        registerFireTorchItem(WARPED_TORCH_I, "warped_torch");
        registerFireTorchItem(CRIMSON_TORCH_I, "crimson_torch");
        registerFireTorchItem(BAMBOO_TORCH_I, "bamboo_torch");
        registerFireTorchItem(CHERRY_TORCH_I, "cherry_torch");
        registerFireTorchItem(MANGROVE_TORCH_I, "mangrove_torch");
        registerFireTorchItem(DARK_OAK_TORCH_I, "dark_oak_torch");
        registerFireTorchItem(ACACIA_TORCH_I, "acacia_torch");
        registerFireTorchItem(JUNGLE_TORCH_I, "jungle_torch");
        registerFireTorchItem(BIRCH_TORCH_I, "birch_torch");
        registerFireTorchItem(SPRUCE_TORCH_I, "spruce_torch");
        registerSoulTorchItem(WARPED_SOUL_TORCH_I, "warped_soul_torch");
        registerSoulTorchItem(CRIMSON_SOUL_TORCH_I, "crimson_soul_torch");
        registerSoulTorchItem(BAMBOO_SOUL_TORCH_I, "bamboo_soul_torch");
        registerSoulTorchItem(CHERRY_SOUL_TORCH_I, "cherry_soul_torch");
        registerSoulTorchItem(MANGROVE_SOUL_TORCH_I, "mangrove_soul_torch");
        registerSoulTorchItem(DARK_OAK_SOUL_TORCH_I, "dark_oak_soul_torch");
        registerSoulTorchItem(ACACIA_SOUL_TORCH_I, "acacia_soul_torch");
        registerSoulTorchItem(JUNGLE_SOUL_TORCH_I, "jungle_soul_torch");
        registerSoulTorchItem(BIRCH_SOUL_TORCH_I, "birch_soul_torch");
        registerSoulTorchItem(SPRUCE_SOUL_TORCH_I, "spruce_soul_torch");
        registerRedstoneTorchItem(WARPED_REDSTONE_TORCH_I, "warped_redstone_torch");
        registerRedstoneTorchItem(CRIMSON_REDSTONE_TORCH_I, "crimson_redstone_torch");
        registerRedstoneTorchItem(BAMBOO_REDSTONE_TORCH_I, "bamboo_redstone_torch");
        registerRedstoneTorchItem(CHERRY_REDSTONE_TORCH_I, "cherry_redstone_torch");
        registerRedstoneTorchItem(MANGROVE_REDSTONE_TORCH_I, "mangrove_redstone_torch");
        registerRedstoneTorchItem(DARK_OAK_REDSTONE_TORCH_I, "dark_oak_redstone_torch");
        registerRedstoneTorchItem(ACACIA_REDSTONE_TORCH_I, "acacia_redstone_torch");
        registerRedstoneTorchItem(JUNGLE_REDSTONE_TORCH_I, "jungle_redstone_torch");
        registerRedstoneTorchItem(BIRCH_REDSTONE_TORCH_I, "birch_redstone_torch");
        registerRedstoneTorchItem(SPRUCE_REDSTONE_TORCH_I, "spruce_redstone_torch");
    }
}