package com;

import java.util.Stack;

public class P_01032018 {
	static Stack<Integer> stk1=new Stack<Integer>();
	static Stack<Integer> stk2=new Stack<Integer>();
	
	public static void main(String[] args) {
		//exchangeVar(10,15);
		//implQueueUsingStk();
		
		//int arr[]={3,4,20,6,15,2,1,7};
		//nextGreatestElement(arr);
		
		System.out.println(isPrime(23));
		System.out.println(isPrime(121));
		System.out.println(isPrime(39));
		
	}
	
	//1. exchange 2 var without using 3rd variable
	static void exchangeVar(int a,int b){
		exchangeVarWayOne(a,b);
		exchangeVarWayTwo(a,b);
	}
	static void exchangeVarWayOne(int a,int b){
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("a="+a+" b="+b);
	}
	static void exchangeVarWayTwo(int a,int b){
		a=a^b;
		b=a^b;
		a=a^b;
		
		System.out.println("a="+a+" b="+b);
	}
	
	//2. implement queue using stack
	static void implQueueUsingStk(){
		enqueue(1);
		enqueue(2);
		enqueue(3);
		System.out.println(dequeue());
		enqueue(4);
		System.out.println(queSize());
		System.out.println(dequeue());
		System.out.println(dequeue());
		System.out.println(dequeue());
		System.out.println(isEmpty());
		enqueue(5);
		enqueue(6);
		System.out.println(queSize());
	}
	static void enqueue(int elem){
		stk1.push(elem);
	}
	static int dequeue(){
		if(stk2.isEmpty()){
			while(!stk1.isEmpty()){
				stk2.push(stk1.pop());
			}
		}
		return stk2.pop();
		
	}
	static boolean isEmpty(){
		return stk1.isEmpty() && stk2.isEmpty();
	}
	static int queSize(){
		return stk1.size()+stk2.size();
	}
	
	//3. next greatest element
	static void nextGreatestElement(int arr[]){
		int largestTillNow=arr[arr.length-1];
		for(int i=arr.length-1;i>=0;i--){
			if(arr[i]>largestTillNow){
				largestTillNow=arr[i];
			}
			else{
				arr[i]=largestTillNow;
			}
		}
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
	
	//4. find if a no. is prime or not
	static boolean isPrime(int a){
		int i=0;
		for(i=2;i<=Math.sqrt(a);i++){
			if(a%i==0){
				break;
			}
		}
		return i==((int)Math.sqrt(a)+1);
			
		
		
	}
}
