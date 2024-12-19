package com.kimlan.notrample.mixin;

import net.minecraft.entity.ai.goal.StepAndDestroyBlockGoal;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(StepAndDestroyBlockGoal.class)
public class StepAndDestroyBlockGoalMixin {
    @Redirect(method = "tick", at = @At(
            value = "INVOKE",
            target = "Lnet/minecraft/entity/ai/goal/StepAndDestroyBlockGoal;hasReached()Z"
    ))
    public boolean redirectHasReached(StepAndDestroyBlockGoal instance) {
        return false;
    }
}
