package cc.davyy.ddapi.utils;

import net.kyori.adventure.bossbar.BossBar;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import net.kyori.adventure.title.Title;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import java.time.Duration;

public class ChatUtils {

    public static void sendMessage(Player player, String message) {
        player.sendMessage(ColorUtils.colorize(message));
    }

    // Create and send a title message to a player
    public static void sendTitle(Player player, String titleText, String subtitleText, long fadeIn, long stay, long fadeOut) {
        Title.Times times = Title.Times.times(Duration.ofMillis(fadeIn), Duration.ofMillis(stay), Duration.ofMillis(fadeOut));
        Title title = Title.title(Component.text(titleText), Component.text(subtitleText), times);

        player.showTitle(title);
    }


    // Create and send a boss bar to a player
    public static BossBar sendBossBar(Player player, String message, NamedTextColor color, float progress) {
        Component bossBarTitle = Component.text(message).color(color);
        BossBar bossBar = BossBar.bossBar(
                bossBarTitle,
                progress,
                BossBar.Color.GREEN,
                BossBar.Overlay.PROGRESS
        );

        bossBar.addViewer(player);

        return bossBar;
    }

    // Broadcast a message to all online players
    public static void broadcastMessage(String message) {
        for (Player player : Bukkit.getOnlinePlayers()) {
            sendMessage(player, message);
        }
    }


}
