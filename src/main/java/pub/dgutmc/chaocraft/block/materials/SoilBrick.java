package pub.dgutmc.chaocraft.block.materials;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.World;

/**
 * 建筑材料， 土墙， sudo 可抹骨粉
 */

public class SoilBrick extends Block {
    protected static IntegerProperty ISCOVER = IntegerProperty.create("is_cover", 0, 1);

    public SoilBrick(){
        super(Properties.create(Material.ROCK).hardnessAndResistance(1.5F,10F));
        this.setDefaultState(this.stateContainer.getBaseState().with(ISCOVER, 0));
    }

    @Override
    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(ISCOVER);
        super.fillStateContainer(builder);
    }

    public ActionResultType onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand handIn, BlockRayTraceResult hit) {
        if(state.get(ISCOVER) == 1||player.getHeldItem(handIn).isEmpty()){
            return ActionResultType.PASS;
        }
        if(player.getHeldItem(handIn).isItemEqual(new ItemStack(Items.WHITE_DYE))){
            int c = player.getHeldItem(handIn).getCount();
            worldIn.setBlockState(pos,state.with(ISCOVER,1));
            player.getHeldItem(handIn).setCount(c-1);
            return ActionResultType.SUCCESS;
        }
        return ActionResultType.PASS;
    }


    public void coverWhite(){
        this.setDefaultState(this.stateContainer.getBaseState().with(ISCOVER, 1));
    }

}
