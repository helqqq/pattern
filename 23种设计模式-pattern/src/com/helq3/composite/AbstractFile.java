package com.helq3.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 抽象组件
 */
public interface AbstractFile {
	void killVirus();
}
class ImageFile implements AbstractFile{
	private String name;
	public ImageFile(String name) {
		this.name = name;
	}
	public void killVirus() {
		System.out.println("图像文件:"+this.name+",查毒...");
	}
}
class TxtFile implements AbstractFile{
	private String name;
	public TxtFile(String name) {
		this.name = name;
	}
	public void killVirus() {
		System.out.println("文本文件:"+this.name+",查毒...");
	}
}
class Folder implements AbstractFile{
	private String name;
	private List<AbstractFile> children = new ArrayList<AbstractFile>();
	public Folder(String name) {
		this.name = name;
	}
	public void killVirus() {
		System.out.println("文件夹:"+this.name+",查毒...");
		for(AbstractFile file : children){
			file.killVirus();//递归
		}
	}
	public void add(AbstractFile file){
		this.children.add(file);
	}
	public void remove(AbstractFile file){
		this.children.remove(file);
	}
	public AbstractFile getChild(int index){
		return this.children.get(index);
	}
}
