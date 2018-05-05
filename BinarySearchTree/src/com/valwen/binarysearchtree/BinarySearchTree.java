package com.valwen.binarysearchtree;

public class BinarySearchTree implements IBST {

	private Node root;//�ڵ�
	private class Node{
		private Key key;//��
		private Value val;//ֵ
		private int N;//��ǰ���µ��ӽڵ�ĸ���
		private Node left,right;//���ҽڵ�ĵ�ַ
	 public Node(Key key,Value val,int N) {//�ڵ�Ĺ��췽��
		 this.key=key;
		 this.val=val;
		 this.N=N;
		 
	 }	
	}
	
	/**
	 * ���µĽڵ���뵽����
	 */
	@Override
	public void put(Key key, Value val) {
		root=put(root,key,val);
	}
	private Node put(Node x,Key key,Value val) {
		if(x==null) 
		{
			return new Node(key, val, 1);
		}
		int cmp =key.compareTo(x.key);
		if(cmp<0)
		{
			x.left=put(x.left,key,val);
		}else if(cmp>0) 
		{
			x.right=put(x.right, key, val);
			
		}else 
		{
			x.val=val;
		}
		x.N=size(x.left)+size(x.right)+1;
		return x;	
	}

	/*
	 * (non-Javadoc)
	 * @see com.valwen.binarysearchtree.IBST#get(com.valwen.binarysearchtree.Key)
	 * ����������Ĳ���ʵ��
	 */
	@Override
	public Value get(Key key) {
		// TODO Auto-generated method stub
		return get(root,key);
	}
	
	/*
	 * ��xΪ���ڵ��������в��Ҳ��ҷ���key��Ӧ��ֵ��
	 * ����Ҳ����򷵻�null
	 */
	private Value get(Node x,Key key) {
		if(x==null) {
			return null;
		}
		int cmp=key.compareTo(x.key);
		if(cmp>0) {
			return get(x.right,key);
		}else if(cmp<0) {
			return get(x.left,key);
		}else 
		{
			return x.val;
		}
	}
	

	@Override
	public void delete(Key key) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean contains(Key key) {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * �ж����Ƿ�Ϊ��
	 */
	@Override
	public boolean isEmpty() {
		return isEmpty(root);
	}
	private  boolean    isEmpty(Node x) {
		 if(x==null)
		 {
			 return true;
		 }
		 else
		 {
			 return false;
		 }
	}

	/**
	 * ���ļ�ֵ
����
	 */
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size(root);
	}
	private int size(Node x) {
		if(x==null) 
		{
			return 0;
			
		}else 
		{
		return x.N;
		}
		}

	@Override
	public Iterable<Key> keys() {
		// TODO Auto-generated method stub
		return null;
	}
	
	//�ҵ����е���С��
	@Override
	public Key min() {
		return min(root).key;
	}
	private Node min(Node x)
	{
		if(x.left==null) {
			return x;
		}
		return min(x.left);
		
	}
	
	/**
	 * ������е����ֵ
	 */
	@Override
	public Key max() {
		// TODO Auto-generated method stub
		return max(root).key;
	}
	private Node max(Node x) {
		if(x.right==null) {
			return x;
		}
		return max(x.right);
		
	}
	@Override
	public Key floor(Key key) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Key ceil(Key key) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	

}
