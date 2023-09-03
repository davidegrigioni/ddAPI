package cc.davyy.ddapi.utils;

import cc.davyy.ddapi.model.Cuboid;
import lombok.Getter;
import org.bukkit.Location;
import org.bukkit.World;

@Getter
public class CuboidUtils {

    public static Cuboid fromLocations(Location location1, Location location2) {
        Location minPoint = new Location(
                location1.getWorld(),
                Math.min(location1.getX(), location2.getX()),
                Math.min(location1.getY(), location2.getY()),
                Math.min(location1.getZ(), location2.getZ())
        );

        Location maxPoint = new Location(
                location1.getWorld(),
                Math.max(location1.getX(), location2.getX()),
                Math.max(location1.getY(), location2.getY()),
                Math.max(location1.getZ(), location2.getZ())
        );

        return new Cuboid(minPoint, maxPoint);
    }

    public static World getWorld(Cuboid cuboid) {
        return cuboid.getMinPoint().getWorld();
    }

    public static boolean isInCuboid(Cuboid cuboid, Location location) {
        World world = location.getWorld();
        double x = location.getX();
        double y = location.getY();
        double z = location.getZ();

        return x >= cuboid.getMinPoint().getX() && x <= cuboid.getMaxPoint().getX()
                && y >= cuboid.getMinPoint().getY() && y <= cuboid.getMaxPoint().getY()
                && z >= cuboid.getMinPoint().getZ() && z <= cuboid.getMaxPoint().getZ()
                && world.equals(getWorld(cuboid));
    }

    public static boolean isInsideCuboid(Cuboid cuboid, Location location) {
        return location.getWorld().equals(getWorld(cuboid)) &&
                location.getX() > cuboid.getMinPoint().getX() && location.getX() < cuboid.getMaxPoint().getX() &&
                location.getY() > cuboid.getMinPoint().getY() && location.getY() < cuboid.getMaxPoint().getY() &&
                location.getZ() > cuboid.getMinPoint().getZ() && location.getZ() < cuboid.getMaxPoint().getZ();
    }

}
