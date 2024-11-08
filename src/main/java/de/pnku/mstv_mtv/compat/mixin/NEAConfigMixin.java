package de.pnku.mstv_mtv.compat.mixin;

import dev.tr7zw.notenoughanimations.versionless.NEABaseMod;
import dev.tr7zw.notenoughanimations.versionless.config.Config;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import static de.pnku.mstv_mtv.init.MtvBlockInit.torch_ids;

@Mixin(NEABaseMod.class)
public abstract class NEAConfigMixin {
    @Shadow public static Config config;

    @Inject(method = "Ldev/tr7zw/notenoughanimations/versionless/NEABaseMod;setupConfig()V", at = @At("HEAD"), remap = false)
    private void injectedSetupConfig(CallbackInfo ci) {
        config.holdingItems.addAll(torch_ids);
    }
}
