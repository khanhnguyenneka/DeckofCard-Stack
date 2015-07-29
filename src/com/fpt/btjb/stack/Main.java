package com.fpt.btjb.stack;

public class Main {
	public static void main(String[] args){
		MyStack<String> myStack = new MyStack<String>();
		myStack.push(new Node<String>("A"));
		myStack.push(new Node<String>("B"));
		myStack.push(new Node<String>("C"));
		//myStack.pop();
		myStack.printData();
	}
}
