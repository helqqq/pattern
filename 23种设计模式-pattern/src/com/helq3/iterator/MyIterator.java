package com.helq3.iterator;
/**
 * �Զ���iterator������
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
