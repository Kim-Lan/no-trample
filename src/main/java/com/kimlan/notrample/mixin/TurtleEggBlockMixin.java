package com.kimlan.notrample.mixin;

import net.minecraft.block.BlockState;
import net.minecraft.block.TurtleEggBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(TurtleEggBlock.class)
public class TurtleEggBlockMixin {
    @Redirect(
        method = "tryBreakEgg",
        at = @At(
            value = "INVOKE",
            target = "Lnet/minecraft/block/TurtleEggBlock;breakEgg(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/BlockState;)V"
        )
    )
    public void redirectBreakEgg(TurtleEggBlock instance, World world, BlockPos pos, BlockState state) {
        return;
    }
}
