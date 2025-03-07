package net.veroxuniverse.epicsamurai.client.custom_armors.samurai_armor.ruby;

import net.minecraft.resources.ResourceLocation;
import net.veroxuniverse.epicsamurai.EpicSamuraiMod;
import net.veroxuniverse.epicsamurai.item.armor.RedSamuraiArmorItem;
import software.bernie.geckolib.model.GeoModel;

public class RedSamuraiArmorModel extends GeoModel<RedSamuraiArmorItem> {
    @Override
    public ResourceLocation  getModelResource(RedSamuraiArmorItem object) {
        return new ResourceLocation(EpicSamuraiMod.MOD_ID, "geo/samurai_armor_new.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(RedSamuraiArmorItem object) {
        return new ResourceLocation(EpicSamuraiMod.MOD_ID, "textures/armor/red_samurai_armor_textures.png");
    }

    @Override
    public ResourceLocation getAnimationResource(RedSamuraiArmorItem animatable) {
        return null;
        //return new ResourceLocation(EpicSamuraiMod.MOD_ID, "animations/samurai_armor_animation.json");
    }

}
