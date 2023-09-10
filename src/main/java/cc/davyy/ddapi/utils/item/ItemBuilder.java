package cc.davyy.ddapi.utils.item;

import net.kyori.adventure.text.Component;
import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Arrays;
import java.util.List;

public class ItemBuilder {

    private final ItemStack item;
    private final ItemMeta itemMeta;

    public ItemBuilder(@NotNull Material material) {
        this.item = new ItemStack(material);
        this.itemMeta = item.getItemMeta();
    }

    public ItemBuilder displayName(@NotNull Component name) {
        itemMeta.displayName(name);
        return this;
    }

    public ItemBuilder lore(@Nullable List<Component> lore) {
        if (lore != null) {
            itemMeta.lore(lore);
        }
        return this;
    }

    public ItemBuilder lore(@NotNull Component... lore) {
        return lore(Arrays.asList(lore));
    }

    public ItemBuilder enchant(Enchantment enchantment, int level) {
        itemMeta.addEnchant(enchantment, level, true);
        return this;
    }

    public ItemBuilder unbreakable(boolean unbreakable) {
        itemMeta.setUnbreakable(unbreakable);
        return this;
    }

    public ItemBuilder amount(int amount) {
        item.setAmount(amount);
        return this;
    }

    public ItemBuilder customModelData(int customModelData) {
        itemMeta.setCustomModelData(customModelData);
        return this;
    }

    public ItemBuilder flags(ItemFlag... flags) {
        itemMeta.addItemFlags(flags);
        return this;
    }

    public ItemBuilder clearEnchantments() {
        itemMeta.getEnchants().keySet().forEach(itemMeta::removeEnchant);
        return this;
    }

    public ItemBuilder clearLore() {
        itemMeta.lore(null);
        return this;
    }

    public ItemBuilder clearAttributes(Attribute attribute) {
        itemMeta.removeAttributeModifier(attribute);
        return this;
    }

    public ItemStack build() {
        item.setItemMeta(itemMeta);
        return item;
    }

}
