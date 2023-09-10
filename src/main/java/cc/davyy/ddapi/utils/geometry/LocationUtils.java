package cc.davyy.ddapi.utils.geometry;

import org.bukkit.Location;
import org.bukkit.World;

public class LocationUtils {

    private LocationUtils() {}

    /**
     * Calculate the distance between two locations in the same world.
     *
     * @param loc1 The first location.
     * @param loc2 The second location.
     * @return The distance between the two locations.
     */
    public static double calculateDistance(Location loc1, Location loc2) {
        if (!loc1.getWorld().equals(loc2.getWorld())) {
            throw new IllegalArgumentException("Locations must be in the same world.");
        }
        return loc1.distance(loc2);
    }

    /**
     * Check if a location is within a specified radius of another location.
     *
     * @param targetLocation The target location to check against.
     * @param location       The location to check if it is within the radius.
     * @param radius         The radius to check within.
     * @return True if the location is within the specified radius, false otherwise.
     */
    public static boolean isLocationWithinRadius(Location targetLocation, Location location, double radius) {
        if (!targetLocation.getWorld().equals(location.getWorld())) {
            throw new IllegalArgumentException("Locations must be in the same world.");
        }
        return targetLocation.distanceSquared(location) <= radius * radius;
    }

    /**
     * Find a safe location to teleport a player to, given a target location.
     *
     * @param targetLocation The target location.
     * @return A safe location to teleport to.
     */
    public static Location findSafeTeleportLocation(Location targetLocation) {
        World world = targetLocation.getWorld();
        int x = targetLocation.getBlockX();
        int z = targetLocation.getBlockZ();
        int y = world.getHighestBlockYAt(x, z);
        return new Location(world, x, y, z);
    }

}
