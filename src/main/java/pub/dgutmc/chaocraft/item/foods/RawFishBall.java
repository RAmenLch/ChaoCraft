package pub.dgutmc.chaocraft.item.foods;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import pub.dgutmc.chaocraft.itemgroup.ChaoItemGroup;

public class RawFishBall  extends FishBall {
    private static EffectInstance effectInstance = new EffectInstance(Effects.HUNGER, 600);
    private static Food food = (new Food.Builder())
            .saturation(0)
            .hunger(1).effect(effectInstance,0.5F)
            .fastToEat()
            .build();

    public RawFishBall(){
        super(new Item.Properties().food(food).group(ChaoItemGroup.itemGroup));
    }
}
