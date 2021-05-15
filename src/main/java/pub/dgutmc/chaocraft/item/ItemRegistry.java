package pub.dgutmc.chaocraft.item;

import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Items;

import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import pub.dgutmc.chaocraft.block.BlockRegistry;
import pub.dgutmc.chaocraft.block.foods.FishFlesh;
import pub.dgutmc.chaocraft.item.foods.*;
import pub.dgutmc.chaocraft.item.tools.IronBar;
import pub.dgutmc.chaocraft.itemgroup.ChaoItemGroup;

public class ItemRegistry {
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, "chaocraft");
    public static final Item.Properties DEFAULT_PROP = new Item.Properties().group(ChaoItemGroup.itemGroup);
    public static RegistryObject<Item> ironBar = ITEMS.register("iron_bar", IronBar::new);
    public static RegistryObject<Item> beefBall = ITEMS.register("beef_ball", BeefBall::new);
    public static RegistryObject<Item> fishBall = ITEMS.register("fish_ball", FishBall::new);
    public static RegistryObject<Item> rawBeefBall = ITEMS.register("raw_beef_ball", RawBeefBall::new);
    public static RegistryObject<Item> rawFishBall = ITEMS.register("raw_fish_ball", RawFishBall::new);
    public static RegistryObject<Item> soilBrick = ITEMS.register("soil_brick", () -> {
        return new BlockItem(BlockRegistry.soilBrick.get(), DEFAULT_PROP);
    });
    public static RegistryObject<Item> soilBrickSlab = ITEMS.register("soil_brick_slab", () -> {
        return new BlockItem(BlockRegistry.soilBrickSlab.get(), DEFAULT_PROP);
    });
    public static RegistryObject<Item> soilBrickWall = ITEMS.register("soil_brick_wall", () -> {
        return new BlockItem(BlockRegistry.soilBrickWall.get(), DEFAULT_PROP);
    });
    public static RegistryObject<Item> soupFurnace = ITEMS.register("soup_furnace", () -> {
        return new BlockItem(BlockRegistry.soupFurnace.get(), DEFAULT_PROP);
    });

    public static RegistryObject<Item> beef = ITEMS.register("beef", BeefBlockItem::new);
    public static RegistryObject<Item> FishFlesh = ITEMS.register("fish_flesh", FishFleshBlockItem::new);
    public static RegistryObject<Item> beefMinced = ITEMS.register("beef_minced", ()->{
        return new Item(DEFAULT_PROP);
    });
    public static RegistryObject<Item> fishMinced = ITEMS.register("fish_flesh_minced", ()->{
        return new Item(DEFAULT_PROP);
    });

}