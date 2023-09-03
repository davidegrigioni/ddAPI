package cc.davyy.ddapi.utils.item;

import net.kyori.adventure.text.Component;
import org.bukkit.Material;
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

    public ItemStack build() {
        item.setItemMeta(itemMeta);
        return item;
    }

}
