package de.pnku.mstv_mtv.init;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.core.Direction;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.StandingAndWallBlockItem;
import net.minecraft.world.level.block.*;

import static de.pnku.mstv_mtv.MoreTorchVariants.asId;
import static de.pnku.mstv_mtv.init.MtvBlockCopperInit.*;
import static de.pnku.mstv_mtv.init.MtvItemInit.torch_ids;

public class MtvItemCopperInit {

    //Copper Torch Items (Reverse Order)
    public static final Item WARPED_COPPER_TORCH_I = createTorchItem(WARPED_COPPER_TORCH, WARPED_COPPER_WALL_TORCH);

    public static final Item CRIMSON_COPPER_TORCH_I = createTorchItem(CRIMSON_COPPER_TORCH, CRIMSON_COPPER_WALL_TORCH);

    public static final Item BAMBOO_COPPER_TORCH_I = createTorchItem(BAMBOO_COPPER_TORCH, BAMBOO_COPPER_WALL_TORCH);

    public static final Item CHERRY_COPPER_TORCH_I = createTorchItem(CHERRY_COPPER_TORCH, CHERRY_COPPER_WALL_TORCH);

    public static final Item MANGROVE_COPPER_TORCH_I = createTorchItem(MANGROVE_COPPER_TORCH, MANGROVE_COPPER_WALL_TORCH);

    public static final Item DARK_OAK_COPPER_TORCH_I = createTorchItem(DARK_OAK_COPPER_TORCH, DARK_OAK_COPPER_WALL_TORCH);

    public static final Item PALE_OAK_COPPER_TORCH_I = createTorchItem(PALE_OAK_COPPER_TORCH, PALE_OAK_COPPER_WALL_TORCH);

    public static final Item ACACIA_COPPER_TORCH_I = createTorchItem(ACACIA_COPPER_TORCH, ACACIA_COPPER_WALL_TORCH);

    public static final Item JUNGLE_COPPER_TORCH_I = createTorchItem(JUNGLE_COPPER_TORCH, JUNGLE_COPPER_WALL_TORCH);

    public static final Item BIRCH_COPPER_TORCH_I = createTorchItem(BIRCH_COPPER_TORCH, BIRCH_COPPER_WALL_TORCH);

    public static final Item SPRUCE_COPPER_TORCH_I = createTorchItem(SPRUCE_COPPER_TORCH, SPRUCE_COPPER_WALL_TORCH);


    private static Item createTorchItem(Block standingTorchBlock, Block wallTorchBlock) {
        String torchBlockDescId = standingTorchBlock.getDescriptionId();
        Item.Properties torchItemPropertiesI = new Item.Properties().setId(ResourceKey.create(Registries.ITEM, BuiltInRegistries.BLOCK.getKey(standingTorchBlock))).useBlockDescriptionPrefix();
        Item.Properties torchItemProperties = (torchBlockDescId.contains("warped") || torchBlockDescId.contains("crimson")) ? torchItemPropertiesI.fireResistant() : torchItemPropertiesI; 
        return new StandingAndWallBlockItem(standingTorchBlock, wallTorchBlock, Direction.DOWN, torchItemProperties);
    }

    private static void registerCopperTorchItem(Item copperTorchItem, String torchName) {
        Registry.register(BuiltInRegistries.ITEM, asId(torchName), copperTorchItem);
        torch_ids.add(asId(torchName).toString());
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.FUNCTIONAL_BLOCKS).register(entries -> entries.addAfter(Items.TORCH, copperTorchItem));
    }


    public static void registerCopperTorchItems(){
        registerCopperTorchItem(WARPED_COPPER_TORCH_I, "warped_copper_torch");
        registerCopperTorchItem(CRIMSON_COPPER_TORCH_I, "crimson_copper_torch");
        registerCopperTorchItem(BAMBOO_COPPER_TORCH_I, "bamboo_copper_torch");
        registerCopperTorchItem(CHERRY_COPPER_TORCH_I, "cherry_copper_torch");
        registerCopperTorchItem(MANGROVE_COPPER_TORCH_I, "mangrove_copper_torch");
        registerCopperTorchItem(DARK_OAK_COPPER_TORCH_I, "dark_oak_copper_torch");
        registerCopperTorchItem(PALE_OAK_COPPER_TORCH_I, "pale_oak_copper_torch");
        registerCopperTorchItem(ACACIA_COPPER_TORCH_I, "acacia_copper_torch");
        registerCopperTorchItem(JUNGLE_COPPER_TORCH_I, "jungle_copper_torch");
        registerCopperTorchItem(BIRCH_COPPER_TORCH_I, "birch_copper_torch");
        registerCopperTorchItem(SPRUCE_COPPER_TORCH_I, "spruce_copper_torch");
    }
}