package pub.dgutmc.chaocraft.block.foods;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.block.material.PushReaction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;

import net.minecraft.entity.passive.SheepEntity;
import net.minecraft.world.storage.loot.conditions.SurvivesExplosion;

//牛肉
public class Beef extends Flesh{
    private static VoxelShape shape;
    static {
        VoxelShape base = Block.makeCuboidShape(2, 0, 3, 13, 1,15);
        shape = VoxelShapes.or(base);
    }


    public Beef(){
        super();
    }
    @Override
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        return shape;
    }



}
