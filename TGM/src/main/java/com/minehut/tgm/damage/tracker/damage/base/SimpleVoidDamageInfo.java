package com.minehut.tgm.damage.tracker.damage.base;

import com.minehut.tgm.damage.tracker.base.AbstractDamageInfo;
import com.minehut.tgm.damage.tracker.damage.VoidDamageInfo;
import org.bukkit.entity.LivingEntity;

import javax.annotation.Nullable;

public class SimpleVoidDamageInfo extends AbstractDamageInfo implements VoidDamageInfo {
    public SimpleVoidDamageInfo(@Nullable LivingEntity resolvedDamager) {
        super(resolvedDamager);
    }
}
