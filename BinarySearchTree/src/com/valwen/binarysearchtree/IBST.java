package com.valwen.binarysearchtree;

public interface IBST {
	void put(Key key,Value val);//����һ�ŷ��ű�
	Value get(Key key);//��ȡ��key��Ӧ��ֵ
	void delete(Key key);//�ӱ���ɾȥkey
	boolean contains(Key key);//��key�ڱ����Ƿ����
	boolean isEmpty();//���Ƿ�Ϊ��
	int size();//���м�ֵ�Ե�����
	Iterable<Key> keys();//��ȡ���м��ļ���
	public Key min();
	public Key max();
    public Key floor(Key key);
    public Key ceil(Key key);
    
    
    

}
