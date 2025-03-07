package net.veroxuniverse.epicsamurai.enchantment;

import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.veroxuniverse.epicsamurai.EpicSamuraiMod;

public class ModEnchantments {

    public static final DeferredRegister<Enchantment> ENCHANTMENTS =
            DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, EpicSamuraiMod.MOD_ID);

    /* Disabled because of bugs with Kitsune AI
    public static RegistryObject<Enchantment> DEMON_SLAYER =
            ENCHANTMENTS.register("demon_slayer",
                    () -> new DemonSlayerEnchantment(Enchantment.Rarity.UNCOMMON,
                            EnchantmentCategory.WEAPON, EquipmentSlot.MAINHAND));


     */

    public static void register(IEventBus eventBus) {
        ENCHANTMENTS.register(eventBus);
    }

}