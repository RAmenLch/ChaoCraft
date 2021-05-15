package pub.dgutmc.chaocraft;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import pub.dgutmc.chaocraft.block.BlockRegistry;
import pub.dgutmc.chaocraft.item.ItemRegistry;
import pub.dgutmc.chaocraft.tileentity.TileEntityTypeRegistry;

@Mod("chaocraft")
public class ChaoCraft {
    public ChaoCraft(){
        ItemRegistry.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BlockRegistry.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        TileEntityTypeRegistry.TILE_ENTITY.register(FMLJavaModLoadingContext.get().getModEventBus());
    }


}
