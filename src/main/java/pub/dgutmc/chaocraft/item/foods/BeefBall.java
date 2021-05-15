package pub.dgutmc.chaocraft.item.foods;

import net.minecraft.item.Food;
import net.minecraft.item.ItemGroup;
import pub.dgutmc.chaocraft.itemgroup.ChaoItemGroup;

public class BeefBall extends MeatBall {
    private static Food food = (new Food.Builder())
            .saturation(4)
            .hunger(2)
            .fastToEat()
            .build();

    public BeefBall(){
        super(new Properties().food(food).group(ChaoItemGroup.itemGroup));
    }

    //子类调用
    protected BeefBall(Properties properties){
        super(properties);
    }

}
