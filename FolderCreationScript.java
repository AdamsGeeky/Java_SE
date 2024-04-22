/**
 * @author ADAMU MUHAMMAD MUHAMMAD(Adamsgeeky)
 * @since 22-04-2024
 * This is a java program to create folder in java
 * 
 */
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

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
                    createReadmeFile(folderName);
                } else {
                    System.out.println(ANSI_RED + "Failed to create folder '" + folderName + "'." + ANSI_RESET);
                }
            } else {
                System.out.println(ANSI_RED + "Folder '" + folderName + "' already exists." + ANSI_RESET);
            }
        }
    }
    // Method to create a README.md file in the specified folder
    private static void createReadmeFile(String folderName) {
        File readmeFile = new File(folderName, "README.md");
        try {
            if (readmeFile.createNewFile()) {
                FileWriter writer = new FileWriter(readmeFile);
                writer.write("# " + folderName + "\n\n");
                writer.write("This folder contains " + folderName + ".\n");
                writer.close();
                System.out.println(ANSI_GREEN + "README.md file created successfully in folder '" + folderName + "'." + ANSI_RESET);
            } else {
                System.out.println("Failed to create README.md file in folder '" + folderName + "'.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred while creating README.md file in folder '" + folderName + "'.");
            e.printStackTrace();
        }
    }
}
