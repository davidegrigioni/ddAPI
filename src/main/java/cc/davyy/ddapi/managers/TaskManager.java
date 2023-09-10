package cc.davyy.ddapi.managers;

import cc.davyy.ddapi.DdAPI;
import org.bukkit.Bukkit;
import org.bukkit.scheduler.BukkitTask;

public class TaskManager {

    public BukkitTask runTask(Runnable task) {
        // Run a synchronous task
        return Bukkit.getScheduler().runTask(DdAPI.getInstance(), task);
    }

    public BukkitTask runTaskAsync(Runnable task) {
        // Run an asynchronous task
        return Bukkit.getScheduler().runTaskAsynchronously(DdAPI.getInstance(), task);
    }

    public BukkitTask runTaskLater(Runnable task, long delay) {
        // Run a task with a delay (in ticks)
        return Bukkit.getScheduler().runTaskLater(DdAPI.getInstance(), task, delay);
    }

    public BukkitTask runTaskTimer(Runnable task, long delay, long period) {
        // Run a task repeatedly with a delay and period (in ticks)
        return Bukkit.getScheduler().runTaskTimer(DdAPI.getInstance(), task, delay, period);
    }

}
