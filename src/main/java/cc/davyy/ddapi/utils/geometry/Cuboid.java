package cc.davyy.ddapi.utils.geometry;

import lombok.Getter;
import org.bukkit.Location;

@Getter
public class Cuboid {

    private final Location minPoint;
    private final Location maxPoint;

    public Cuboid(Location minPoint, Location maxPoint) {
        this.minPoint = minPoint;
        this.maxPoint = maxPoint;
    }

}
