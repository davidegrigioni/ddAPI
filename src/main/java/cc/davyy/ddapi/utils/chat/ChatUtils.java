package cc.davyy.ddapi.utils.chat;

import net.kyori.adventure.bossbar.BossBar;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.title.Title;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import java.time.Duration;

public class ChatUtils {

    private ChatUtils() {}

    /**
     * Sends a colored message to a player.
     *
     * @param player  The player to send the message to.
     * @param message The message to send.
     */
    public static void sendMessage(Player player, String message) {
        player.sendMessage(ColorUtils.colorize(message));
    }

    /**
     * Creates and sends a title message to a player.
     *
     * @param player       The player to send the title to.
     * @param titleText    The text for the title.
     * @param subtitleText The text for the subtitle.
     * @param fadeIn       The duration of the title fade-in (in milliseconds).
     * @param stay         The duration the title stays on screen (in milliseconds).
     * @param fadeOut      The duration of the title fade-out (in milliseconds).
     */
    public static void sendTitle(Player player, String titleText, String subtitleText, long fadeIn, long stay, long fadeOut) {
        Title.Times times = Title.Times.times(Duration.ofMillis(fadeIn), Duration.ofMillis(stay), Duration.ofMillis(fadeOut));
        Title title = Title.title(Component.text(titleText), Component.text(subtitleText), times);

        player.showTitle(title);
    }

    /**
     * Creates and sends a boss bar to a player.
     *
     * @param player      The player to send the boss bar to.
     * @param bossBarTitle The title of the boss bar.
     * @param progress    The progress of the boss bar (0.0 to 1.0).
     * @param color       The color of the boss bar.
     * @param overlay     The overlay style of the boss bar.
     */
    public static void sendBossBar(Player player, Component bossBarTitle, float progress, BossBar.Color color, BossBar.Overlay overlay) {
        BossBar bossBar = BossBar.bossBar(
                bossBarTitle,
                progress,
                color,
                overlay
        );

        player.showBossBar(bossBar);
    }

    /**
     * Removes a boss bar from a player.
     *
     * @param player  The player to remove the boss bar from.
     * @param bossBar The boss bar to remove.
     */
    public static void removeBossBar(Player player, BossBar bossBar) {
        player.hideBossBar(bossBar);
    }

    /**
     * Broadcasts a message to all online players.
     *
     * @param message The message to broadcast.
     */
    public static void broadcastMessage(String message) {
        for (Player player : Bukkit.getOnlinePlayers()) {
            sendMessage(player, message);
        }
    }

}
