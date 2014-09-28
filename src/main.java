import java.io.File;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.WatchService;
import static java.nio.file.StandardWatchEventKinds.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.TimeUnit;

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
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }

            HashSet<File> listOfFiles = new HashSet<>();
            listOfFiles.addAll(Arrays.asList(folder.listFiles()));

            folderMap.setFound(listOfFiles);
            folderMap.compareFound();
        }
    }
}
