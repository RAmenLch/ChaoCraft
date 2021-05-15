package pub.dgutmc.chaocraft.item.foods;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Food;
import net.minecraft.item.Foods;
import net.minecraft.item.Item;
import pub.dgutmc.chaocraft.block.BlockRegistry;
import pub.dgutmc.chaocraft.itemgroup.ChaoItemGroup;

public class BeefBlockItem extends BlockItem {
    private static Block beef = BlockRegistry.beef.get();

    public BeefBlockItem() {
        super(beef, new Item.Properties().food(Foods.BEEF).group(ChaoItemGroup.itemGroup));
    }
}
