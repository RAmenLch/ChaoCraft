package pub.dgutmc.chaocraft.itemgroup;

import mcp.MethodsReturnNonnullByDefault;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import pub.dgutmc.chaocraft.item.ItemRegistry;

public class ChaoItemGroup extends ItemGroup{

    public static ChaoItemGroup itemGroup = new ChaoItemGroup();

    private ChaoItemGroup(){
        super("chaocraft_group");
    }

    @Override
    public ItemStack createIcon() {
        return new ItemStack(ItemRegistry.beefBall.get());
    }
}
