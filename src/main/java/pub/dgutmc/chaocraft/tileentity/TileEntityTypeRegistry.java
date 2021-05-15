package pub.dgutmc.chaocraft.tileentity;

import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import pub.dgutmc.chaocraft.block.BlockRegistry;

public class TileEntityTypeRegistry {
    public static final DeferredRegister<TileEntityType<?>> TILE_ENTITY
            = new DeferredRegister<>(ForgeRegistries.TILE_ENTITIES, "chaocraft");
    public static RegistryObject<TileEntityType<SoupFurnaceTileEntity>> soupFurnaceTileEntity
            = TILE_ENTITY.register("soup_furnace_title_entity", () -> {
        return TileEntityType.Builder.create(() -> {
            return new SoupFurnaceTileEntity();
        }, BlockRegistry.soupFurnace.get()).build(null);
    });



}
