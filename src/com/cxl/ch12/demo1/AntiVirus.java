package com.cxl.ch12.demo1;

public class AntiVirus {
    public static void main(String[] args) {
        File file1 = new TextFile("text.txt");
        File file2 = new ImageFile("image.jpg");
        File file3 = new VideoFile("video.mp4");

        Folder folder1 = new Folder("Folder1");
        Folder folder2 = new Folder("Folder2");

        folder1.add(file1);
        folder1.add(file2);
        folder2.add(folder1);
        folder2.add(file3);
        folder2.scan();

    }
}
