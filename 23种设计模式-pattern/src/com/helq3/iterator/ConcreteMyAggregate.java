package com.helq3.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * 自定义聚合类，容器，相当于list set
 */
public class ConcreteMyAggregate {
	private List<Object> list = new ArrayList<Object>();

	public void addObject(Object obj) {
		list.add(obj);
	}

	public void removeObject(Object obj) {
		list.remove(obj);
	}

	public List<Object> getList() {
		return list;
	}

	public void setList(List<Object> list) {
		this.list = list;
	}
	public MyIterator getConceretorIterator(){
		return new ConceretorIterator();
	}
	class ConceretorIterator implements MyIterator {
		private int cursor;

		public void first() {
			cursor = 0;
		}

		public void last() {
			cursor = list.size();
		}

		public boolean hasNext() {
			return (cursor < list.size()) ? true : false;
		}

		public boolean isFirst() {
			return (cursor == 0) ? true : false;
		}

		public boolean isLast() {
			return (cursor == list.size() - 1) ? true : false;
		}

		public Object getCurrentObj() {
			return list.get(cursor);
		}
		
		public void next(){
			if(cursor < list.size()){
				cursor++;
			}
		}

	}
}
