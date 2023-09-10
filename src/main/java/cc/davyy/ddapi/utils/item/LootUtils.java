package cc.davyy.ddapi.utils.item;

import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.entity.HumanEntity;
import org.bukkit.loot.LootContext;

public class LootUtils {

    private LootUtils() {}

    /**
     * Creates a new LootContext using the specified parameters.
     *
     * @param location      The location where the loot is being generated.
     * @param killer        The HumanEntity that killed the entity.
     * @param lootedEntity  The entity that was killed.
     * @param modifier      The Enchantment.LOOT_BONUS_MOBS level equivalent to use when generating loot.
     * @param luck          The amount of luck to apply when generating loot.
     */
    public static void createLoot(Location location, HumanEntity killer, Entity lootedEntity, int modifier, float luck) {
        LootContext.Builder lootContext = new LootContext.Builder(location)
                .killer(killer)
                .lootedEntity(lootedEntity)
                .lootingModifier(modifier)
                .luck(luck);
    }

}
