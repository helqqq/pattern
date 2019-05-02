/**
 * 适配器模式：将一个类的接口转换成客户希望的另外一个接口。Adapter模式使得原本由于接口不兼容而不能一起工作的那些类可以在一起工作。
 * 
 * 例子：电脑只有USB接口，键盘只有PS2接口，电脑只能调用适配器父类，新增适配器子类（并附加连接键盘的ps2接口），可以让电脑调用
 * 分类：类适配器模式，对象适配器模式
 * 场景：
 * 	java.io.InputStreamReader(InputStream)
 *  java.io.OutputStreamWriter(OuputStream)
 * @author Helena https://github.com/helqqq/pattern.git
 *	
 */
package com.helq3.adapter;