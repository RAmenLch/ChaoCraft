package pub.dgutmc.chaocraft.item.foods;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Foods;
import pub.dgutmc.chaocraft.block.BlockRegistry;
import pub.dgutmc.chaocraft.itemgroup.ChaoItemGroup;

public class FishFleshBlockItem extends BlockItem {
    private static Block FishFlesh = BlockRegistry.fishFlesh.get();

    public FishFleshBlockItem() {
        super(FishFlesh, new Properties().food(Foods.TROPICAL_FISH).group(ChaoItemGroup.itemGroup));
    }
}
