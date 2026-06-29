// Day-3 Assignment

package com.mmcoe.ds;

public class TestDataStrucutres {
	
	public static void main(String[] args) {

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
