package pub.dgutmc.chaocraft.block.foods;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.block.material.PushReaction;

//打肉泥的原材料
// --> Beef
// --> FishFlesh
public class Flesh extends Block {
    public static final Material FleshMaterial =  new Material(
            MaterialColor.AIR,
            false, true,
            true, false,
            true,false, false, PushReaction.DESTROY);

    public Flesh() {
        super(Block.Properties.create(FleshMaterial).notSolid().hardnessAndResistance(0.7F));
    }

}
