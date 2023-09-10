package cc.davyy.ddapi.managers;

import net.kyori.adventure.key.Key;
import net.kyori.adventure.sound.Sound;
import org.bukkit.entity.Player;

public class SoundManager {

    /**
     * Plays a custom sound to a player with specified parameters.
     *
     * @param player  The player who should hear the sound.
     * @param key     The Key representing the sound type.
     * @param source  The Sound.Source representing the source of the sound.
     * @param volume  The volume of the sound (1.0 is normal volume).
     * @param pitch   The pitch of the sound (1.0 is normal pitch).
     */
    public static void playSound(Player player, Key key, Sound.Source source, float volume, float pitch) {
        Sound sound = Sound.sound()
                .type(key)
                .source(source)
                .volume(volume)
                .pitch(pitch)
                .build();
        player.playSound(sound);
    }

    /**
     * Stops a custom sound for a player.
     *
     * @param player The player for whom to stop the sound.
     * @param sound  The custom Sound object to stop.
     */
    public static void stopSound(Player player, Sound sound) { player.stopSound(sound); }

}
