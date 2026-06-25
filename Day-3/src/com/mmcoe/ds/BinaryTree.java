package com.mmcoe.ds;

public class BinaryTree {
	private class Node {
		private int data;
		public Node left , right;
		
		public Node(int data) {
			this.data = data;
		}		
	}
	
	private Node root;
	
	public void add(int data) {
		Node n = new Node(data);
		
		if(root == null) {
			root = n;
		}
		Node t = root;
		while(true) {
			if(data < t.data) {
				if(t.left == null) {
					t.left = n;
					return;
				}
				t = t.left;
			}
			else if(data > t.data) {
				if(t.right == null) {
					t.right = n;
					return;
				}
				t = t.right;
			}
			else {
				return;
			}
		}
	}
	public void traverse() {
		PreOrder(root);
	}
	
	private void PreOrder(Node root) {
		if(root == null)
			return;
		
		PreOrder(root.left);
		System.out.println(root.data);		
		PreOrder(root.right);
	}
	
}
