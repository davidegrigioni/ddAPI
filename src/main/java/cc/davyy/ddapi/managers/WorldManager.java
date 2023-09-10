package cc.davyy.ddapi.managers;

import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.WorldCreator;

import java.util.HashMap;
import java.util.Map;

public class WorldManager {

    private final Map<String, World> asyncWorlds = new HashMap<>();

    /**
     * Create a new asynchronous world.
     *
     * @param worldName The name of the world to create.
     * @return The created world.
     */
    public World createAsyncWorld(String worldName) {
        if (asyncWorlds.containsKey(worldName)) {
            return asyncWorlds.get(worldName);
        }

        WorldCreator creator = new WorldCreator(worldName);
        creator.generateStructures(false); // Adjust world generation settings as needed
        World asyncWorld = Bukkit.createWorld(creator);
        asyncWorlds.put(worldName, asyncWorld);

        return asyncWorld;
    }

    /**
     * Get an existing asynchronous world by its name.
     *
     * @param worldName The name of the world to retrieve.
     * @return The world with the specified name, or null if not found.
     */
    public World getAsyncWorld(String worldName) {
        return asyncWorlds.get(worldName);
    }

}
