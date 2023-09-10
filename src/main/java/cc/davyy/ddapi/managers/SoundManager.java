package cc.davyy.ddapi.managers;

import net.kyori.adventure.key.Key;
import net.kyori.adventure.sound.Sound;
import org.bukkit.entity.Player;

public class SoundManager {

    public static void playSound(Player player, Key key, Sound.Source source, float volume, float pitch) {
        Sound sound = Sound.sound()
                .type(key)
                .source(source)
                .volume(volume)
                .pitch(pitch)
                .build();
        player.playSound(sound);
    }

    public static void stopSound(Player player, Sound sound) { player.stopSound(sound); }

}
