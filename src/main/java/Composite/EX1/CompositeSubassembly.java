package Composite.EX1;

import java.util.ArrayList;

public class CompositeSubassembly extends Subassembly {
    private ArrayList<Subassembly> subassemblies = new ArrayList<Subassembly>();

    public CompositeSubassembly(String name) {
        super(name);
    }

    @Override
    protected String getProductName() {
        return name;
    }

    @Override
    public void showMe() {
        super.showMe();
        for (Subassembly subassembly : subassemblies) {
            subassembly.showMe();
        }
    }

    @Override
    public void addChild(Subassembly p) {
        subassemblies.add(p);
    }

    @Override
    public void removeChild(Subassembly p) {
        subassemblies.remove(p);
    }
}