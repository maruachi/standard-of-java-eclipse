package MyVector;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyVector implements List{
	Object[] data = null;
	int capacity = 0;
	int size = 0;
	
	public MyVector(int capacity) {
		if(capacity < 0) {
			throw new IllegalArgumentException("Not valid value :" + capacity);
		}
		this.capacity = capacity;
		data = new Object[capacity];
	}
	
	public MyVector() {
		this(10);
	}
	
	public void ensureCapacity(int minCapacity) {
		if(minCapacity - data.length > 0) {
			setCapacity(minCapacity);
		}
	}
	
	private void setCapacity(int capacity) {
		if(this.capacity == capacity) {
			return;
		}
		
		Object[] tmp = new Object[capacity];
		System.arraycopy(data, 0, tmp, 0, size);
		data = tmp;
		this.capacity = capacity;
	}
	
	public void trimToSize() {
		setCapacity(size);
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		Object[] result = new Object[size];
		System.arraycopy(data, 0, result, 0, size); // 명명법을 따르지 않는 이유?
		
		return result;
	}

	@Override
	public Object[] toArray(Object[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean add(Object e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(int index, Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		for(int i = 0; i < size; i++) {
			data[i] = null;
		}
		size = 0;
	}

	@Override
	public Object get(int index) {
		// TODO Auto-generated method stub
		if(index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("Out of range");
		}
		return data[index];
	}

	@Override
	public Object set(int index, Object element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(int index, Object element) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object remove(int index) {
		// TODO Auto-generated method stub
		Object oldObj = null;
		
		if(index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("Out of range");
		}
		
		if(index != size-1) {
			System.arraycopy(data, index+1, data, index, size-index-1);
		}
		data[size-1] = null;
		size--;
		return oldObj;
	}
	
	@Override
	public boolean remove(Object obj) {
		for(int i = 0; i < size; i++) {
			if(obj.equals(data[i])) {
				remove(i);
				return true;
			}
		}
		return false;
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
	public ListIterator listIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ListIterator listIterator(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List subList(int fromIndex, int toIndex) {
		// TODO Auto-generated method stub
		return null;
	}
}
