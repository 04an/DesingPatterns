package Composite.EX2;


public class App {
    public static void main(String[] args) {
        SystemFIle root = new Folder("root");

        SystemFIle doc = new Folder("doc");
        SystemFIle sda = new Folder("sda");
        SystemFIle todoFile = new ExecuteableFile("todo.txtx");
        sda.addSystemFile(todoFile);
        doc.addSystemFile(sda);
        root.addSystemFile(doc);

        SystemFIle video = new Folder("video");
        SystemFIle media = new ExecuteableFile("media.mp3");
        SystemFIle sample = new ExecuteableFile("sample.jarc");
        video.addSystemFile(sample);
        video.addSystemFile(media);
        root.addSystemFile(video);

        SystemFIle text = new ExecuteableFile("text.txt");
        root.addSystemFile(text);

        //doc.browse();
        //video.browse();
        root.browse();


    }
}
