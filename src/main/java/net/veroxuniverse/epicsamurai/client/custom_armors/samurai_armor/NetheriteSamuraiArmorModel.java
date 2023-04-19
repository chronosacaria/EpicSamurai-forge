package net.veroxuniverse.epicsamurai.client.custom_armors.samurai_armor;

import net.minecraft.resources.ResourceLocation;
import net.veroxuniverse.epicsamurai.EpicSamuraiMod;
import net.veroxuniverse.epicsamurai.item.NetheriteSamuraiArmorItem;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class NetheriteSamuraiArmorModel extends AnimatedGeoModel<NetheriteSamuraiArmorItem> {
    @Override
    public ResourceLocation  getModelResource(NetheriteSamuraiArmorItem object) {
        return new ResourceLocation(EpicSamuraiMod.MOD_ID, "geo/samurai_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(NetheriteSamuraiArmorItem object) {
        return new ResourceLocation(EpicSamuraiMod.MOD_ID, "textures/models/armor/netherite_samurai_armor_textures.png");
    }

    @Override
    public ResourceLocation getAnimationResource(NetheriteSamuraiArmorItem animatable) {
        return null;
        //return new ResourceLocation(EpicSamuraiMod.MOD_ID, "animations/samurai_armor_animation.json");
    }

}
