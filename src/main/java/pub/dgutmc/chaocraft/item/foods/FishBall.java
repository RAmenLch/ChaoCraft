package pub.dgutmc.chaocraft.item.foods;

import net.minecraft.item.Food;
import net.minecraft.item.ItemGroup;
import pub.dgutmc.chaocraft.itemgroup.ChaoItemGroup;


public class FishBall extends MeatBall{
    private static Food food = (new Food.Builder())
            .saturation(3)
            .hunger(2)
            .fastToEat()
            .build();

    public FishBall(){
        super(new Properties().food(food).group(ChaoItemGroup.itemGroup));
    }

    //子类调用
    protected FishBall(Properties p){
        super(p);
    }
}
