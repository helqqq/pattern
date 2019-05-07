package com.helq3.composite;
public class Client {
	public static void main(String[] args) {
		AbstractFile f4,f5,f3,f6;
		Folder f1 = new Folder("work");
		Folder f2 = new Folder("cpbgt20190423");
		f3 = new TxtFile("2.txt");
		f4 = new ImageFile("冒冒的大头贴.jpg");
		f5 = new TxtFile("笔记.txt");
		f6 = new ImageFile("image.jpg");
		f1.add(f3);
		f1.add(f4);
		f1.add(f2);
		f2.add(f5);
		f2.add(f6);
		f1.killVirus();
	}
}
