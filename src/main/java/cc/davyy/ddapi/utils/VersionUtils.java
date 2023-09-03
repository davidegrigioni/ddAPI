package cc.davyy.ddapi.utils;

import org.bukkit.Bukkit;

public class VersionUtils {

    private VersionUtils() {}

    public static String getMinecraftVersion() {
        String[] versionParts = Bukkit.getVersion().split(" ")[1].split("\\.");
        if (versionParts.length >= 2) {
            return versionParts[0] + "." + versionParts[1];
        } else {
            return "Unknown";
        }
    }

    public static boolean isAtLeast(String targetVersion) {
        String serverVersion = getMinecraftVersion();
        if (serverVersion.equals("Unknown")) {
            return false;
        }
        return compareVersions(serverVersion, targetVersion) >= 0;
    }

    public static int compareVersions(String version1, String version2) {
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");

        int minLength = Math.min(v1.length, v2.length);
        for (int i = 0; i < minLength; i++) {
            int cmp = Integer.compare(Integer.parseInt(v1[i]), Integer.parseInt(v2[i]));
            if (cmp != 0) {
                return cmp;
            }
        }

        return Integer.compare(v1.length, v2.length);
    }

}
