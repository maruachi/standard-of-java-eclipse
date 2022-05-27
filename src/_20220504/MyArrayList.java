package _20220504;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyArrayList implements List<Integer> {
	private int size = 0;
	private int top = -1;
	private int MAX_SIZE = 10;
	private int[] arrPool = new int[MAX_SIZE];
	
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return this.size;
	}
	
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return this.size == 0;
	}
	
	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public Iterator<Integer> iterator() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public boolean add(Integer e) {
		// TODO Auto-generated method stub
		if(this.size == this.MAX_SIZE) {
			this.MAX_SIZE *= 2;
			int[] newArr = new int[this.MAX_SIZE];
			for(int i = 0; i < this.size; i++) {
				newArr[i] = arrPool[i];
			}
			arrPool = newArr;
		}
		this.arrPool[++top] = e;
		this.size++;
		return true;
	}
	
	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		int tmp = (Integer) o;
		for(int i = 0; i < this.size; i++) {
			if(this.arrPool[i] == tmp) {
				for(int j = i+1; j < this.size; j++) {
					this.arrPool[j-1] = this.arrPool[j];
				}
				this.size--;
				this.top--;
				return true;
			}
		}
		return false;
	}
	@Override
	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean addAll(Collection<? extends Integer> c) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean addAll(int index, Collection<? extends Integer> c) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public void clear() {
		// TODO Auto-generated method stub
		this.size = 0;
		this.top = -1;
	}
	@Override
	public Integer get(int index) {
		// TODO Auto-generated method stub
		if(this.isEmpty()) {
			return -1;
		}
		if(index > this.size && index < 0) {
			return -1;
		}
		
		return this.arrPool[index];
	}
	@Override
	public Integer set(int index, Integer element) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void add(int index, Integer element) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public Integer remove(int index) {
		// TODO Auto-generated method stub
		if(this.isEmpty()) {
			return -1;
		}
		if(index > this.size && index < 0) {
			return -1;
		}
		int val = this.arrPool[index];
		
		for(int j = index+1; j < this.size; j++) {
			this.arrPool[j-1] = this.arrPool[j];
		}
		
		this.top--;
		this.size--;
		
		return val;
	}
	@Override
	public int indexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int lastIndexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public ListIterator<Integer> listIterator() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public ListIterator<Integer> listIterator(int index) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Integer> subList(int fromIndex, int toIndex) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
