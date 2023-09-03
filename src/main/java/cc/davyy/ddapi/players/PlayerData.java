package cc.davyy.ddapi.players;

import lombok.Data;

import java.util.UUID;

@Data
public class PlayerData {

    private final UUID uuid;

    public PlayerData(UUID uuid) {
        this.uuid = uuid;
    }
}
