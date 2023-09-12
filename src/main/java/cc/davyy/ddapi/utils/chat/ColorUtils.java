package cc.davyy.ddapi.utils.chat;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.minimessage.MiniMessage;

import java.util.ArrayList;
import java.util.List;

public class ColorUtils {

    private ColorUtils() {}

    public static Component colorize(String message) { return MiniMessage.miniMessage().deserialize(message); }

    public static List<Component> colorizeLore(String loreString) {
        List<Component> coloredLore = new ArrayList<>();
        String[] loreLines = loreString.split("\n");
        for (String line : loreLines) {
            coloredLore.add(ColorUtils.colorize(line));
        }
        return coloredLore;
    }

}
