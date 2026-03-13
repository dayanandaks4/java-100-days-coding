// Competitive Programming Practice

// Solved a basic array problem: "Search an element in an array".

// Concept used:

// * Linear search
// * Arrays
// * Java loops

// Idea: iterate through the array and check if the target element exists.

// Platform: CodeChef
// Language: Java


import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
	    
	    int n = sc.nextInt();
	    
	    int x = sc.nextInt();
	    
	    int[] arr = new int[n];
	    
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
	    
	    for(int i = 0; i < n; i++){
	        
	        if( arr[i] == x){
	            
	            System.out.println("Yes");
	            
	            return;
	        }
      }
	    System.out.println("No");
	}
}
