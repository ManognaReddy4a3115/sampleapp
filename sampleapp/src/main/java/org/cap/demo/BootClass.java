package org.cap.demo;

public class BootClass {
public static void main(String[] args) {
	System.out.println("Hello from sts");
show();

}
public static void show() {
	int[] arr= {1,2,3,4};
	for(int i=0;i<100;i++)
	{
		System.out.println(arr[i]);
	}
	System.out.println("show method here");
}
}
