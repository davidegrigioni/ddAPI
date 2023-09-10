package cc.davyy.ddapi.utils;

public class TimeUtils {

    private TimeUtils() {}

    private static final int TICKS_PER_SECOND = 20;
    private static final int SECONDS_PER_MINUTE = 60;
    private static final int MINUTES_PER_HOUR = 60;
    private static final int HOURS_PER_DAY = 24;

    /**
     * Converts ticks to seconds.
     *
     * @param ticks The number of ticks to convert.
     * @return The equivalent number of seconds.
     */
    public static int ticksToSeconds(long ticks) { return (int) (ticks / TICKS_PER_SECOND); }

    /**
     * Converts ticks to minutes.
     *
     * @param ticks The number of ticks to convert.
     * @return The equivalent number of minutes.
     */
    public static int ticksToMinutes(long ticks) { return (int) (ticks / (TICKS_PER_SECOND * SECONDS_PER_MINUTE)); }

    /**
     * Converts ticks to hours.
     *
     * @param ticks The number of ticks to convert.
     * @return The equivalent number of hours.
     */
    public static int ticksToHours(long ticks) { return (int) (ticks / (TICKS_PER_SECOND * SECONDS_PER_MINUTE * MINUTES_PER_HOUR)); }

    /**
     * Converts ticks to days.
     *
     * @param ticks The number of ticks to convert.
     * @return The equivalent number of days.
     */
    public static int ticksToDays(long ticks) { return (int) (ticks / (TICKS_PER_SECOND * SECONDS_PER_MINUTE * MINUTES_PER_HOUR * HOURS_PER_DAY)); }

}
