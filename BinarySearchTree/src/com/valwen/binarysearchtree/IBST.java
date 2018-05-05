package com.valwen.binarysearchtree;

public interface IBST {
	void put(Key key,Value val);//创建一张符号表
	Value get(Key key);//获取键key对应的值
	void delete(Key key);//从表中删去key
	boolean contains(Key key);//键key在表中是否存在
	boolean isEmpty();//表是否为空
	int size();//表中键值对的数量
	Iterable<Key> keys();//获取所有键的集合
	public Key min();
	public Key max();
    public Key floor(Key key);
    public Key ceil(Key key);
    
    
    

}
