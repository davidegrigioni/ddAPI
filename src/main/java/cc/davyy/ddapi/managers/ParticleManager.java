package cc.davyy.ddapi.managers;

import com.destroystokyo.paper.ParticleBuilder;
import org.bukkit.Location;

public class ParticleManager {

    /**
     * Creates and spawns a particle at the specified location with custom settings.
     *
     * @param location        The location where the particle should be spawned.
     * @param particleBuilder The ParticleBuilder instance containing particle settings.
     */
    public static void createParticle(Location location, ParticleBuilder particleBuilder) {
        particleBuilder.spawn();
    }

}
