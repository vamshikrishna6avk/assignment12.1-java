/*program for creating an integer array of 10 elements copying the values from first array into the second integer array of size 9
 * exception occurs while copying
 * exception occurs during run time
 */
package integerarray;//here  I'm creating a package integerarray

import java.util.Arrays;//import keyword is used to import built-in and user defined packages into our java source file so that our class can refer to class thath is in another package by directly using its name

public class ArrayExceptionHandling {   //here creating the class as ArrayExceptionHandling 
	                                   //classes are the basics of oops(object oriented programming)

	public static void main(String[] args) { 
		// TODO Auto-generated method stub
				//Here public is a access modifier which defines who can access this method
				//Here static a keyword which identifies class related thing
				//void is used to define return type of the method,void means method wont return any value
				//main is name of method,and to display
				//declares method String[]
				//String[]args means arguments will be passed into main method and says that main() as a parameter


	    int [] Array =   {8,12,6,5,19,30,20,54,8,1};   //here i created an array and initialized 10 e
	    int [] newArray =new  int [9];  
	    //here i have taken another array and declared an array size of 9
	    
	    for(int i=0;i<Array.length;i++)//taking 1 equal to zero,i less than array,i increment in for loop
	    {
	    	try{
	    		
	           newArray[i]=Array[i];//initializing new array
	    }
	    	
	    
	    	catch (Exception e){//catch exception e
	    	
	    		System.out.println("ArrayIndexOutOfBoundsException");
	    		
	    } }       
	    System.out.println(Arrays.toString(Array));
	          //Println is used to print text and gives output 
	  		 //exist array
	 
	    System.out.println(Arrays.toString(newArray));//copied array
	  //system is used to return code
	  		//out is a static member
	          //Println is used to print text and gives output 
	  		
}
}