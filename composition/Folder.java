package composition;

public class Folder {
    
    private String folderName;
    private File file;

    public void setFolderName(String folderName) {
        this.folderName = folderName;
    }

    public String getFolderName() {
        return folderName;
    }

    public void setFile(File file) {
        this.file = file;
    }
}
