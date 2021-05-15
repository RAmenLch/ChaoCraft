package pub.dgutmc.chaocraft.tileentity;

import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.BlastFurnaceContainer;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.SmokerContainer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipeType;
import net.minecraft.tileentity.AbstractFurnaceTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class SoupFurnaceTileEntity extends AbstractFurnaceTileEntity {

    public SoupFurnaceTileEntity() {
        super(TileEntityTypeRegistry.soupFurnaceTileEntity.get(), IRecipeType.SMOKING);
    }

    protected ITextComponent getDefaultName() {
        return new TranslationTextComponent("container.chaocraft.soup_furnace");
    }

    protected int getBurnTime(ItemStack fuel) {
        return super.getBurnTime(fuel) / 2;
    }

    protected Container createMenu(int id, PlayerInventory player) {
        return new SmokerContainer(id, player, this, this.furnaceData);
    }

    public void tick(){
        super.tick();
    }
}
