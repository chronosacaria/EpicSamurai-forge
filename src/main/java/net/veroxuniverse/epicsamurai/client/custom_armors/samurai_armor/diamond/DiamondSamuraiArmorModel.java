package net.veroxuniverse.epicsamurai.client.custom_armors.samurai_armor.diamond;

import net.minecraft.resources.ResourceLocation;
import net.veroxuniverse.epicsamurai.EpicSamuraiMod;
import net.veroxuniverse.epicsamurai.item.armor.DiamondSamuraiArmorItem;
import software.bernie.geckolib.model.GeoModel;

public class DiamondSamuraiArmorModel extends GeoModel<DiamondSamuraiArmorItem> {
    @Override
    public ResourceLocation  getModelResource(DiamondSamuraiArmorItem object) {
        return new ResourceLocation(EpicSamuraiMod.MOD_ID, "geo/samurai_armor_new.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(DiamondSamuraiArmorItem object) {
        return new ResourceLocation(EpicSamuraiMod.MOD_ID, "textures/armor/diamond_samurai_armor_textures.png");
    }

    @Override
    public ResourceLocation getAnimationResource(DiamondSamuraiArmorItem animatable) {
        return null;
        //return new ResourceLocation(EpicSamuraiMod.MOD_ID, "animations/samurai_armor_animation.json");
    }

}
