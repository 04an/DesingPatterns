package Composite.EX2;

import java.util.ArrayList;
import java.util.List;

public class Folder extends SystemFIle {

    private List<SystemFIle> systemFIles = new ArrayList<>();

    public Folder(String systemFileName) {
        super(systemFileName);
    }

    @Override
    public void browse() {
        super.browse();
        for (SystemFIle systemFIle : systemFIles) {
            systemFIle.browse();
        }
    }

    @Override
    public void addSystemFile(SystemFIle systemFIle) {
        systemFIles.add(systemFIle);
    }


    @Override
    public void removeSystemFile(SystemFIle systemFIle) {
        systemFIles.remove(systemFIle);
    }
}
