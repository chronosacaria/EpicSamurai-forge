package net.veroxuniverse.epicsamurai.client.custom_armors.samurai_armor;

import net.minecraft.resources.ResourceLocation;
import net.veroxuniverse.epicsamurai.EpicSamuraiMod;
import net.veroxuniverse.epicsamurai.item.GoldSamuraiArmorItem;
import net.veroxuniverse.epicsamurai.item.IronSamuraiArmorItem;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class IronSamuraiArmorModel extends AnimatedGeoModel<IronSamuraiArmorItem> {
    @Override
    public ResourceLocation  getModelResource(IronSamuraiArmorItem object) {
        return new ResourceLocation(EpicSamuraiMod.MOD_ID, "geo/samurai_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(IronSamuraiArmorItem object) {
        return new ResourceLocation(EpicSamuraiMod.MOD_ID, "textures/models/armor/iron_samurai_armor_textures.png");
    }

    @Override
    public ResourceLocation getAnimationResource(IronSamuraiArmorItem animatable) {
        return null;
        //return new ResourceLocation(EpicSamuraiMod.MOD_ID, "animations/samurai_armor_animation.json");
    }

}
