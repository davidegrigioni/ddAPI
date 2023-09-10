package cc.davyy.ddapi.managers;

import cc.davyy.ddapi.DdAPI;
import org.bukkit.Bukkit;
import org.bukkit.scheduler.BukkitTask;

public class TaskManager {

    /**
     * Runs a synchronous task on the Bukkit scheduler.
     *
     * @param task The task to execute.
     * @return A BukkitTask representing the scheduled task.
     */
    public BukkitTask runTask(Runnable task) {
        // Schedule a synchronous task
        return Bukkit.getScheduler().runTask(DdAPI.getInstance(), task);
    }

    /**
     * Runs an asynchronous task on the Bukkit scheduler.
     *
     * @param task The task to execute.
     * @return A BukkitTask representing the scheduled task.
     */
    public BukkitTask runTaskAsync(Runnable task) {
        // Schedule an asynchronous task
        return Bukkit.getScheduler().runTaskAsynchronously(DdAPI.getInstance(), task);
    }

    /**
     * Runs a task with a delay (in ticks) on the Bukkit scheduler.
     *
     * @param task  The task to execute.
     * @param delay The delay (in ticks) before executing the task.
     * @return A BukkitTask representing the scheduled task.
     */
    public BukkitTask runTaskLater(Runnable task, long delay) {
        // Schedule a task with a delay
        return Bukkit.getScheduler().runTaskLater(DdAPI.getInstance(), task, delay);
    }

    /**
     * Runs a task repeatedly with a delay and period (in ticks) on the Bukkit scheduler.
     *
     * @param task   The task to execute.
     * @param delay  The initial delay (in ticks) before executing the task.
     * @param period The period (in ticks) between consecutive executions of the task.
     * @return A BukkitTask representing the scheduled task.
     */
    public BukkitTask runTaskTimer(Runnable task, long delay, long period) {
        // Schedule a task to run repeatedly with a delay and period
        return Bukkit.getScheduler().runTaskTimer(DdAPI.getInstance(), task, delay, period);
    }

}
