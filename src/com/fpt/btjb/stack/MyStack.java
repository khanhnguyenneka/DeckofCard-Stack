package com.fpt.btjb.stack;


public class MyStack<T>{
	private Node<T> head;
	/** Initializing stack 
	 */
	public MyStack(){
		this.head = null;
	}
	
	/**Check whether stack is empty
	 * 
	 * @return true or false
	 */
	public boolean isEmpty(){
		return this.head == null;
	}
	
	/**Pop an element from Stack and return that element
	 * 
	 * @return element before remove
	 */
	public Node<T> pop(){
		Node<T> temp = null;
		if(!this.isEmpty()){
			temp = this.head;
			this.head = this.head.nextNode;
		}
		return temp;
	}
	
	/**Access the top of Stack
	 * 
	 * @return The first elements of MyStack
	 */
	public Node<T> get(){
		return this.head;
	}
	
	/**Push an element in top of stack
	 * 
	 * @param Node<T>
	 */
	public void push(Node<T> t){
		t.nextNode = this.head;
		this.head = t;
	}
	
	/**Print out all element of MyStack
	 */
	public void printData(){
		Node<T> t = this.head;
		while(t!=null){
			System.out.print(t + "\t");
			t = t.nextNode;
		}
	}
}

class Node<T>{
	private T t;
	Node<T> nextNode;
	public Node(T temp){
		this.t = temp;
	}
	
	
	public T getData(){
		return this.t;
	}
	
	
	public void setData(T temp){
		this.t = temp;
	}
	
	
	public String toString(){
		return this.t.toString();
	}
}