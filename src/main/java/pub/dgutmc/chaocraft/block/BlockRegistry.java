package pub.dgutmc.chaocraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;

import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import pub.dgutmc.chaocraft.block.foods.Beef;
import pub.dgutmc.chaocraft.block.foods.FishFlesh;
import pub.dgutmc.chaocraft.block.furniture.SoupFurnace;
import pub.dgutmc.chaocraft.block.materials.SoilBrick;
import pub.dgutmc.chaocraft.block.materials.SoilBrickSlab;
import pub.dgutmc.chaocraft.block.materials.SoilBrickWall;

public class BlockRegistry {
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, "chaocraft");
    public static final RegistryObject<Block> soilBrick = BLOCKS.register("soil_brick", SoilBrick::new);
    public static final RegistryObject<Block> beef = BLOCKS.register("beef", Beef::new);
    public static final RegistryObject<Block> fishFlesh = BLOCKS.register("fish_flesh", FishFlesh::new);
    public static final RegistryObject<Block> soilBrickSlab = BLOCKS.register("soil_brick_slab", SoilBrickSlab::new);
    public static final RegistryObject<Block> soilBrickWall = BLOCKS.register("soil_brick_wall", SoilBrickWall::new);
    public static final RegistryObject<Block> soupFurnace = BLOCKS.register("soup_furnace", SoupFurnace::new);

}
