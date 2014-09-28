import java.io.File;
import java.util.HashSet;
import java.util.Map;

/*
 * Aks copyright from the author Marko <markoma@iki.fi>.
 * Creation date: 28.9.2014 
 */
/**
 *
 * @author Marko <markoma@iki.fi>
 */
public class FolderMap {

    private HashSet<File> added;

    public FolderMap() {
        this.added = new HashSet<>();
    }

    public void fileAdded(File file) {
        added.add(file);   
    }
    public boolean contains(File f){
        return added.contains(f);
    }
}
