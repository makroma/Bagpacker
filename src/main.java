import java.io.File;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.WatchService;
import static java.nio.file.StandardWatchEventKinds.*;

/*
 * Aks copyright from the author Marko <markoma@iki.fi>.
 * Creation date: 28.9.2014 
 */
/**
 *
 * @author Marko <markoma@iki.fi>
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        File folder = new File("/Users/marko/Dev/scriptit/");

        FolderMap folderMap = new FolderMap();

        for (;;) {
            File[] listOfFiles = folder.listFiles();
            for (File file : listOfFiles) {
                if (!folderMap.contains(file)) {
                    folderMap.fileAdded(file);
                    System.out.println(file.toString());
                }
            }
        }
    }
}
