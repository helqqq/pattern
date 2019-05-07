package com.helq3.iterator;
/**
 * 自定义iterator迭代器
 */
public interface MyIterator {
	void first();
	void last();
	boolean hasNext();
	boolean isFirst();
	boolean isLast();
	Object getCurrentObj();
	void next();
	
}	
