package com;
public class Main{
	static void main() {
		Box<Integer> box = new Box<>();
		box.setValue(10);
		box.setValue(20);
		
	}
	
}
class Box<K>{
	K value;
	public K getValue() {
		return value;
	}
	public void setValue(K value) {
		this.value=value;
	}
}
