package cc.davyy.ddapi.utils;

import com.google.common.base.Charsets;
import com.google.common.collect.ImmutableList;
import com.google.common.io.Files;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class FileUtils {

    private FileUtils() {}

    /**
     * Create a directory if it does not exist.
     *
     * @param directoryPath The path of the directory to create.
     * @return True if the directory was created or already exists, false if an error occurred.
     */
    public static boolean createDirectory(String directoryPath) {
        File directory = new File(directoryPath);
        return directory.exists() || directory.mkdirs();
    }

    /**
     * Create a file if it does not exist.
     *
     * @param filePath The path of the file to create.
     * @return True if the file was created or already exists, false if an error occurred.
     */
    public static boolean createFile(String filePath) {
        File file = new File(filePath);
        try {
            return file.exists() || file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * Read lines from a file.
     *
     * @param filePath The path of the file to read.
     * @return A list of lines from the file, or an empty list if an error occurred.
     */
    public static List<String> readLines(String filePath) {
        File file = new File(filePath);
        try {
            return Files.readLines(file, Charsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
            return ImmutableList.of();
        }
    }

    /**
     * Delete a file.
     *
     * @param filePath The path of the file to delete.
     * @return True if the file was successfully deleted, false if it does not exist or an error occurred.
     */
    public static boolean deleteFile(String filePath) {
        File file = new File(filePath);
        return file.exists() && file.delete();
    }

    /**
     * Delete a directory and its contents.
     *
     * @param directoryPath The path of the directory to delete.
     * @return True if the directory and its contents were successfully deleted, false if it does not exist or an error occurred.
     */
    public static boolean deleteDirectory(String directoryPath) {
        File directory = new File(directoryPath);
        return directory.exists() && directory.delete();
    }

}
