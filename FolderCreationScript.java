/**
 * @author ADAMU MUHAMMAD MUHAMMAD(Adamsgeeky)
 * @since 22-04-2024
 * This is a java program to create folder in java
 * 
 */
import java.io.File;

public class FolderCreationScript {
    // ANSI color codes
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RED = "\u001B[31m";

    public static void main(String[] args) {
        // Check if folder names are provided as command-line arguments
        if (args.length == 0) {
            System.out.println(ANSI_RED + "Please provide folder names as command-line arguments." + ANSI_RESET);
            return;
        }

        // Create folders
        for (String folderName : args) {
            File folder = new File(folderName);
            if (!folder.exists()) {
                boolean created = folder.mkdirs();
                if (created) {
                    System.out.println(ANSI_GREEN + "Folder '" + folderName + "' created successfully." + ANSI_RESET);
                } else {
                    System.out.println(ANSI_RED + "Failed to create folder '" + folderName + "'." + ANSI_RESET);
                }
            } else {
                System.out.println(ANSI_RED + "Folder '" + folderName + "' already exists." + ANSI_RESET);
            }
        }
    }
}
