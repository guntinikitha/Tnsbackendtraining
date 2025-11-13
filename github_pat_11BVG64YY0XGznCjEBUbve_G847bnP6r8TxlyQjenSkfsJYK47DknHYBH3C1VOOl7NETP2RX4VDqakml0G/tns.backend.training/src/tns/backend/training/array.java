package tns.backend.training;

public class array {
	public class Array {
	public static void main(String[] args) {
	// create an array
	// datatype array name = new data type [Size]
	int arr[] = new int[5]; 
	arr[0] = 12;
	arr[1] = 123;
	arr[2]= 14;
	arr[3]= 78;
	arr[4] = 56;
	for (int i=0; i<arr.length; i++) {
	System.out.println("The element in the array" + arr[i]);
	}
	// System.out.println("enhanced for loop");
	// enhanced for loop
	for (int num: arr) {
	System.out.println("The elements in the array" + num);
	}
	}
	}
}
