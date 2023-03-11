package composition;

import java.util.ArrayList;
import java.util.List;

public class Folder {
    
    private String folderName;
    private List<File> files;
    private List<Folder> subfolders;

    public Folder() {
        this.files = new ArrayList<>();
        this.subfolders = new ArrayList<>();
    }

    public void setFolderName(String folderName) {
        this.folderName = folderName;
    }

    public String getFolderName() {
        return folderName;
    }

    public List<File> getFile() {
        return files;
    }

    public List<Folder> getSubfolders() {
        return subfolders;
    }

    public void addSubfolder(Folder subfolder) {
        subfolders.add(subfolder);

    }

    public void addFile(File file) {
        files.add(file);

    }

    public void print() {
        System.out.println(folderName);

        for (int i=0; i<subfolders.size(); i++) {
            subfolders.get(i).print();
        }

        for (int j=0; j<files.size(); j++) {
            files.get(j).print();
        }

    }

    public void delete() {
        for (int i=0; i<subfolders.size(); i++) {
            subfolders.get(i).delete();
        }

        for (int j=0; j<files.size(); j++) {
            files.get(j).delete();
        }
    }


}
