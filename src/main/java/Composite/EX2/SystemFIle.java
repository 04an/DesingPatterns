package Composite.EX2;

public abstract class SystemFIle {

    protected String systemFileName;

    public SystemFIle(String systemFileName) {
        this.systemFileName = systemFileName;
    }

    public void browse(){
        System.out.println("Wykonuj: " + systemFileName);
    }

    public abstract void addSystemFile (SystemFIle systemFIle);

    public abstract void removeSystemFile(SystemFIle systemFIle);
}
