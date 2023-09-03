package cc.davyy.ddapi.utils;

import org.bukkit.entity.Player;

public class ChatUtils {

    public static void sendMessage(Player player, String message) {
        player.sendMessage(ColorUtils.colorize(message));
    }

}
