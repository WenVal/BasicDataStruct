package com.valwen.binarysearchtree;

public class Key implements Comparable<Key> {
 private int key;
 public Key(int key) {
	 this.key=key;
 }
	@Override
	public int compareTo(Key o) {
		if(o.key>this.key) 
		{
			return -1;
		}
		else if(o.key<this.key)
		{
			return 1;
		}
		else
		{
		return 0;
		}
		}

}
