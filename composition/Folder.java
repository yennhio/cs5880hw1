package composition;

import java.util.ArrayList;

public class Folder {
    
    private String folderName;
    private ArrayList<File> files;
    private ArrayList<Folder> subfolders;

    public Folder() {
        this.files = new ArrayList<File>();
        this.subfolders = new ArrayList<Folder>();
    }

    public void setFolderName(String folderName) {
        this.folderName = folderName;
    }

    public String getFolderName() {
        return folderName;
    }

    public void addSubfolder(Folder subfolder) {
        subfolders.add(subfolder);

    }

    public void addFile(File file) {
        files.add(file);

    }

    public void delete() {
        for (Folder folder : subfolders) {
            folder.delete();
        }

        this.subfolders.clear();
        this.files.clear();
        this.subfolders.remove(this);
    }

    public void print() {
        System.out.println(folderName);

        for (Folder folder : subfolders) {
            folder.print();
        }

        for (File file : files) {
            file.print();
        }

    }


}
