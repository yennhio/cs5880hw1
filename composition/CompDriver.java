package composition;

public class CompDriver {

    public static void main (String[] args) {

        Folder phpdemo1 = new Folder();
        Folder sourceFiles = new Folder();
        Folder phalcon = new Folder();
        Folder app = new Folder();
        Folder config = new Folder();
        Folder controllers = new Folder();
        Folder library = new Folder();
        Folder migrations = new Folder();
        Folder models = new Folder();
        Folder views = new Folder();
        Folder cache = new Folder();
        Folder publicFolder = new Folder();
        Folder includePath = new Folder();
        Folder remoteFiles = new Folder();

        
        phpdemo1.setFolderName("php_demo1");
        sourceFiles.setFolderName("Source Files");
        phalcon.setFolderName(".phalcon");
        app.setFolderName("app");
        config.setFolderName("config");
        controllers.setFolderName("controllers");
        library.setFolderName("library");
        migrations.setFolderName("migrations");
        models.setFolderName("models");
        views.setFolderName("views");
        cache.setFolderName("cache");
        publicFolder.setFolderName("public");
        includePath.setFolderName("Include Path");
        remoteFiles.setFolderName("Remote Files");

        phpdemo1.addSubfolder(sourceFiles);
        phpdemo1.addSubfolder(includePath);
        phpdemo1.addSubfolder(remoteFiles);


        sourceFiles.addSubfolder(phalcon);
        sourceFiles.addSubfolder(app);
        sourceFiles.addSubfolder(cache);
        sourceFiles.addSubfolder(publicFolder);

        app.addSubfolder(config);
        app.addSubfolder(controllers);
        app.addSubfolder(library);
        app.addSubfolder(migrations);
        app.addSubfolder(models);
        app.addSubfolder(views);

        System.out.println("1) Original structure");
        phpdemo1.print();


        System.out.println("2) after deleting folder app");
        app.delete();
        phpdemo1.print();


        System.out.println("3) after deleting folder public");
        publicFolder.delete();
        phpdemo1.print();



    }
    
}
