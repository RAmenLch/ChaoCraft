package pub.dgutmc.chaocraft.item.tools;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.material.Material;
import net.minecraft.item.*;

import net.minecraft.item.crafting.Ingredient;
import pub.dgutmc.chaocraft.block.foods.Flesh;
import pub.dgutmc.chaocraft.itemgroup.ChaoItemGroup;

import java.util.HashSet;
import java.util.Set;

public class IronBar extends ToolItem {
    private static Set<Block> effectiveBlocksIn = new HashSet<>();

    public IronBar() {
        super(2,0,
                ItemTier.IRON,effectiveBlocksIn,new Properties().group(ChaoItemGroup.itemGroup));
    }

    @Override
    public float getDestroySpeed(ItemStack stack, BlockState state) {
        Material material = state.getMaterial();
        System.out.println(material);
        return material != Flesh.FleshMaterial ? super.getDestroySpeed(stack, state) :0.1F;
    }

}
