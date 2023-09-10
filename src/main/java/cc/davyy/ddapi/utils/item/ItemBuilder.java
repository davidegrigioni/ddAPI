package cc.davyy.ddapi.utils.item;

import net.kyori.adventure.text.Component;
import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.Damageable;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.PotionMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Arrays;
import java.util.List;

/**
 * A utility class for building ItemStacks with various attributes.
 */
public class ItemBuilder {

    private final ItemStack item;
    private final ItemMeta itemMeta;

    /**
     * Creates a new ItemBuilder for the specified material.
     *
     * @param material The material for the ItemStack.
     */
    public ItemBuilder(@NotNull Material material) {
        this.item = new ItemStack(material);
        this.itemMeta = item.getItemMeta();
    }

    /**
     * Sets the display name of the ItemStack.
     *
     * @param name The display name to set.
     * @return The ItemBuilder for method chaining.
     */
    public ItemBuilder displayName(@NotNull Component name) {
        itemMeta.displayName(name);
        return this;
    }

    /**
     * Sets the lore of the ItemStack.
     *
     * @param lore The lore to set.
     * @return The ItemBuilder for method chaining.
     */
    public ItemBuilder lore(@Nullable List<Component> lore) {
        if (lore != null) {
            itemMeta.lore(lore);
        }
        return this;
    }

    /**
     * Sets the lore of the ItemStack.
     *
     * @param lore The lore to set.
     * @return The ItemBuilder for method chaining.
     */
    public ItemBuilder lore(@NotNull Component... lore) {
        return lore(Arrays.asList(lore));
    }

    /**
     * Enchants the ItemStack with the specified enchantment and level.
     *
     * @param enchantment The enchantment to apply.
     * @param level       The level of the enchantment.
     * @return The ItemBuilder for method chaining.
     */
    public ItemBuilder enchant(Enchantment enchantment, int level) {
        itemMeta.addEnchant(enchantment, level, true);
        return this;
    }

    /**
     * Sets whether the ItemStack is unbreakable.
     *
     * @param unbreakable Whether the ItemStack should be unbreakable.
     * @return The ItemBuilder for method chaining.
     */
    public ItemBuilder unbreakable(boolean unbreakable) {
        itemMeta.setUnbreakable(unbreakable);
        return this;
    }

    /**
     * Sets the amount of the ItemStack in the stack.
     *
     * @param amount The amount to set.
     * @return The ItemBuilder for method chaining.
     */
    public ItemBuilder amount(int amount) {
        item.setAmount(amount);
        return this;
    }

    /**
     * Sets the custom model data for the ItemStack.
     *
     * @param customModelData The custom model data to set.
     * @return The ItemBuilder for method chaining.
     */
    public ItemBuilder customModelData(int customModelData) {
        itemMeta.setCustomModelData(customModelData);
        return this;
    }

    /**
     * Adds item flags to the ItemStack.
     *
     * @param flags The flags to add.
     * @return The ItemBuilder for method chaining.
     */
    public ItemBuilder flags(ItemFlag... flags) {
        itemMeta.addItemFlags(flags);
        return this;
    }

    /**
     * Clears all enchantments from the ItemStack.
     *
     * @return The ItemBuilder for method chaining.
     */
    public ItemBuilder clearEnchantments() {
        itemMeta.getEnchants().keySet().forEach(itemMeta::removeEnchant);
        return this;
    }

    /**
     * Clears the lore of the ItemStack.
     *
     * @return The ItemBuilder for method chaining.
     */
    public ItemBuilder clearLore() {
        itemMeta.lore(null);
        return this;
    }

    /**
     * Clears a specific attribute from the ItemStack.
     *
     * @param attribute The attribute to remove.
     * @return The ItemBuilder for method chaining.
     */
    public ItemBuilder clearAttributes(Attribute attribute) {
        itemMeta.removeAttributeModifier(attribute);
        return this;
    }

    /**
     * Sets the durability (damage) of the item using a Damageable object.
     *
     * @param damageable The Damageable object representing the item's durability.
     * @param durability The new durability value to set.
     * @return The ItemBuilder instance with the updated durability.
     */
    public ItemBuilder durability(Damageable damageable, int durability) {
        damageable.setDamage(durability);
        item.setItemMeta(itemMeta);
        return this;
    }

    /**
     * Builds and returns the final ItemStack with all specified attributes.
     *
     * @return The built ItemStack.
     */
    public ItemStack build() {
        item.setItemMeta(itemMeta);
        return item;
    }

}
