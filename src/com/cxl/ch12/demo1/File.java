package com.cxl.ch12.demo1;

public class File extends Component {
    private String name;

    public File(String name) {
        this.name = name;
    }

    @Override
    void scan() {
        System.out.println("扫描"+name +"文件进行杀毒");
    }
}
