package cc.davyy.ddapi.players;

import lombok.Getter;
import org.bukkit.entity.Player;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class PlayerManager {

    @Getter
    private static PlayerManager instance;

    private final Map<UUID, PlayerData> playerDataMap = new HashMap<>();

    private PlayerManager() {
        instance = this;
    }

    public void createPlayerData(Player player) {
        UUID playerId = player.getUniqueId();
        if (!playerDataMap.containsKey(playerId)) {
            PlayerData playerData = new PlayerData(playerId);
            playerDataMap.put(playerId, playerData);
        }
    }

    public PlayerData getPlayerData(Player player) {
        return playerDataMap.get(player.getUniqueId());
    }

    public void removePlayerData(Player player) {
        playerDataMap.remove(player.getUniqueId());
    }

}
