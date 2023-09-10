package cc.davyy.ddapi.utils.pdc;

import cc.davyy.ddapi.DdAPI;
import org.bukkit.NamespacedKey;
import org.bukkit.entity.Entity;
import org.bukkit.inventory.ItemStack;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;

public class PDCUtils {

    private PDCUtils() {}

    public static void setCustomItemData(ItemStack itemStack, String key, Object value) {
        PersistentDataContainer pdc = itemStack.getItemMeta().getPersistentDataContainer();
        NamespacedKey namespacedKey = new NamespacedKey(DdAPI.getInstance(), key);

        if (value instanceof String) {
            pdc.set(namespacedKey, PersistentDataType.STRING, (String) value);
        } else if (value instanceof Integer) {
            pdc.set(namespacedKey, PersistentDataType.INTEGER, (Integer) value);
        } else if (value instanceof Double) {
            pdc.set(namespacedKey, PersistentDataType.DOUBLE, (Double) value);
        } else if (value instanceof Float) {
            pdc.set(namespacedKey, PersistentDataType.FLOAT, (Float) value);
        } else if (value instanceof Boolean) {
            pdc.set(namespacedKey, PersistentDataType.BYTE, (byte) (((Boolean) value) ? 1 : 0));
        }
    }

    public static Object getCustomItemData(ItemStack itemStack, String key, PersistentDataType<?, ?> dataType) {
        PersistentDataContainer pdc = itemStack.getItemMeta().getPersistentDataContainer();
        NamespacedKey namespacedKey = new NamespacedKey(DdAPI.getInstance(), key);
        return pdc.has(namespacedKey, dataType) ? pdc.get(namespacedKey, dataType) : null;
    }

    public static void removeCustomItemData(ItemStack itemStack, String key) {
        PersistentDataContainer pdc = itemStack.getItemMeta().getPersistentDataContainer();
        NamespacedKey namespacedKey = new NamespacedKey(DdAPI.getInstance(), key);
        pdc.remove(namespacedKey);
    }

    public static void setCustomEntityData(Entity entity, String key, Object value) {
        PersistentDataContainer pdc = entity.getPersistentDataContainer();
        NamespacedKey namespacedKey = new NamespacedKey(DdAPI.getInstance(), key);

        if (value instanceof String) {
            pdc.set(namespacedKey, PersistentDataType.STRING, (String) value);
        } else if (value instanceof Integer) {
            pdc.set(namespacedKey, PersistentDataType.INTEGER, (Integer) value);
        } else if (value instanceof Double) {
            pdc.set(namespacedKey, PersistentDataType.DOUBLE, (Double) value);
        } else if (value instanceof Float) {
            pdc.set(namespacedKey, PersistentDataType.FLOAT, (Float) value);
        } else if (value instanceof Boolean) {
            pdc.set(namespacedKey, PersistentDataType.BYTE, (byte) (((Boolean) value) ? 1 : 0));
        }
    }

    public static Object getCustomEntityData(Entity entity, String key, PersistentDataType<?, ?> dataType) {
        PersistentDataContainer pdc = entity.getPersistentDataContainer();
        NamespacedKey namespacedKey = new NamespacedKey(DdAPI.getInstance(), key);
        return pdc.has(namespacedKey, dataType) ? pdc.get(namespacedKey, dataType) : null;
    }

    public static void removeCustomEntityData(Entity entity, String key) {
        PersistentDataContainer pdc = entity.getPersistentDataContainer();
        NamespacedKey namespacedKey = new NamespacedKey(DdAPI.getInstance(), key);
        pdc.remove(namespacedKey);
    }

}
