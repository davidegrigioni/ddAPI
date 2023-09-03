package cc.davyy.ddapi.managers;

import com.destroystokyo.paper.ParticleBuilder;
import org.bukkit.Location;

public class ParticleManager {

    public static void createParticle(Location location, ParticleBuilder particleBuilder) {
        particleBuilder.spawn();
    }

    /*
    Location particleLocation =
    ParticleBuilder particleBuilder = new ParticleBuilder(Particle.HEART)
            .count(1)
            .extra(0.5)
            .offset(0.1, 0.1, 0.1)
            .velocity(0.1, 0.1, 0.1);

    ParticleManager.createParticle(particleLocation, particleBuilder);
     */

}
