package cc.davyy.ddapi.utils.pdc;

import cc.davyy.ddapi.DdAPI;
import org.bukkit.NamespacedKey;
import org.bukkit.entity.Entity;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;

public class PDCUtils {

    public static void setCustomData(Entity entity, String key, Object value) {
        PersistentDataContainer pdc = entity.getPersistentDataContainer();
        pdc.set(new NamespacedKey(DdAPI.getInstance(), key), PersistentDataType.STRING, value.toString());
    }

    public static Object getCustomData(Entity entity, String key, PersistentDataType<?, ?> dataType) {
        PersistentDataContainer pdc = entity.getPersistentDataContainer();
        NamespacedKey namespacedKey = new NamespacedKey(DdAPI.getInstance(), key);
        return pdc.has(namespacedKey, dataType) ? pdc.get(namespacedKey, dataType) : null;
    }

    public static void removeCustomData(Entity entity, String key) {
        PersistentDataContainer pdc = entity.getPersistentDataContainer();
        NamespacedKey namespacedKey = new NamespacedKey(DdAPI.getInstance(), key);
        pdc.remove(namespacedKey);
    }

}
