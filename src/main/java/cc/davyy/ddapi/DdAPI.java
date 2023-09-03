package cc.davyy.ddapi;

import lombok.Setter;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;

public abstract class DdAPI extends JavaPlugin {

    @Setter
    private static DdAPI instance;

    @Override
    public void onEnable() {}

    @Override
    public void onDisable() {}

    public static @NotNull DdAPI getInstance() {
        if (instance == null) throw new IllegalStateException("DdAPI instance has not been initialized.");

        return instance;
    }

}
