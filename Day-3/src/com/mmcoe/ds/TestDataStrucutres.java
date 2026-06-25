package com.mmcoe.ds;

public class TestDataStrucutres {
	
	public static void main(String[] args) {
//		LinkedList<Integer> list = new LinkedList<Integer>();
//		
//		list.add(10);
//		list.add(20);
//		list.add(30);
//		list.print();
//		System.out.println("-------------------");
//		
//		list.insert(0,25);
//		list.print();
//		System.out.println("-----------------");
//		
//		list.remove(3);
//		list.add(40);
//		list.print();
		
//___________________________________________________________________
		
//		BinaryTree tree = new BinaryTree();
//		
//		tree.add(20);
//		tree.add(10);
//		tree.add(30);
//		tree.add(50);
//		tree.add(40);
//		
//		tree.traverse();
		
//____________________________________________________________________		

        Stack<Integer> st = new Stack<>();

        st.push(10);
        st.push(20);
        st.push(30);

        st.print();
        
        System.out.println("-------------");
        System.out.println("Popped : "+ st.pop());
        System.out.println("-------------");

        st.print();
	}
}
