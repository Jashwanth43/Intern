package test;


public class testArrays {

	public static void main(String[] args) {
		int a[]=new int[6];// Create an array of integers with a size 
		int b[]= {1,2,3,4,5,6}; //// Creating and initialize an array with values
		// Insert values into the array a[]
		a[0]=7;
		a[1]=8;
		a[2]=9;
		a[3]=10;
		a[4]=11;
		a[5]=12;
		System.out.println(a.length); //getting length of an Array
		System.out.println(b.length);
//		traversing an array
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		System.out.println("************************");
		//another way to traverse an array
		for(int c:b) {
			System.out.println(c);
		}
		//Deleting an element in an array
//		suppose to delete an element in an array at index 3 
		for(int i=3;i<a.length-1;i++) {
			a[i]=a[i+1]; //Assigning value of array of 4th index to 3rd index and this continues until end 
		}
		System.out.println("*******************");
		for(int c:a) {
			System.out.println(c);
		}
		
		
	}

}

