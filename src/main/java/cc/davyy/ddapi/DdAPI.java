package cc.davyy.ddapi;

import lombok.Getter;
import org.bukkit.plugin.java.JavaPlugin;

public final class DdAPI extends JavaPlugin {

    @Getter
    private static DdAPI instance;

    @Override
    public void onEnable() {
        instance = this;
    }

    @Override
    public void onDisable() {}

}
