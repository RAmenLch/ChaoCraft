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

//鱼肉
public class FishFlesh extends Flesh {
    private static VoxelShape shape;
    static {
        VoxelShape base = Block.makeCuboidShape(2, 0, 2, 14, 1,14);
        shape = VoxelShapes.or(base);
    }

    public FishFlesh() {
        super();
    }

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        return shape;
    }

}
