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
    private HashSet<File> found;
    private HashSet<File> removed;

    public FolderMap() {
        this.added = new HashSet<>();
        this.found = new HashSet<>();
        this.removed = new HashSet<>();
    }

    public HashSet<File> getAdded() {
        return added;
    }

    public void removeFile(File file) {
        added.remove(file);
    }

    public void setFound(HashSet<File> found) {
        this.found = found;
    }

    public void compareFound() {
        for (File f : found) {
            if (!added.contains(f)) {
                added.add(f);
                System.out.println("added " + f.toString());
            }
        }
        for (File f : added) {
            if (!found.contains(f)) {
                System.out.println("removed " + f.toString());
                removed.add(f);
            }
        }
        if (!removed.isEmpty()) {
            added.removeAll(removed);
            removed.clear();
        }

        //NOTWORKING
        for (File f : found) {
            if (added.contains(f)) {
                for (File a : added) {
                    if (f.toString().equals(a.toString()) && f.lastModified() < a.lastModified()) {
                        System.out.println("updated " + f.toString());
                    }
                }
            }
        }
    }
}
