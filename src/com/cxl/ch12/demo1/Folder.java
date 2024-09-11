package com.cxl.ch12.demo1;

import java.util.ArrayList;

public class Folder extends Component {
    private String name;
    private ArrayList<Component> list = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    public void add(Component component){
        list.add(component);
    }

    public void remove(Component component){
        list.remove(component);
    }
    @Override
    void scan() {
        System.out.println("扫描"+name+"进行杀毒");
        for (Component ff :list) {
            ff.scan();
        }
    }
}
