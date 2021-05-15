package pub.dgutmc.chaocraft.item.foods;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import pub.dgutmc.chaocraft.itemgroup.ChaoItemGroup;

import java.util.function.Supplier;

public class RawBeefBall extends BeefBall{
    private static EffectInstance effectInstance = new EffectInstance(Effects.HUNGER, 200);
    private static Food food = (new Food.Builder())
            .saturation(0)
            .hunger(1).effect(effectInstance,0.1F)
            .fastToEat()
            .build();

    public RawBeefBall(){
        super(new Properties().food(food).group(ChaoItemGroup.itemGroup));
    }
}
