package com.valwen.binarysearchtree;

public class BinarySearchTree implements IBST {

	private Node root;//节点
	private class Node{
		private Key key;//键
		private Value val;//值
		private int N;//当前根下的子节点的个数
		private Node left,right;//左右节点的地址
	 public Node(Key key,Value val,int N) {//节点的构造方法
		 this.key=key;
		 this.val=val;
		 this.N=N;
		 
	 }	
	}
	
	/**
	 * 将新的节点加入到树中
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
	 * 二叉查找树的查找实现
	 */
	@Override
	public Value get(Key key) {
		// TODO Auto-generated method stub
		return get(root,key);
	}
	
	/*
	 * 以x为根节点在子树中查找并且返回key对应的值。
	 * 如果找不到则返回null
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
	 * 判断树是否为空
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
	 * 树的键值
个数
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
	
	//找到树中的最小键
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
	 * 获得树中的最大值
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
