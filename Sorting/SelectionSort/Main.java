import java.util.*;

public class Main {
    
	public static void main(String[] args) {
	    
	    Scanner input = new Scanner(System.in);
	    
	    System.out.println("Enter the size of the array : ");
	    int n = input.nextInt();
	    
	    int arr [] = new int [n];
	    System.out.println("Enter the elements to the array : ");
	    
	    for (int i = 0 ; i < n ; i ++ ) {
	        arr [i] = input.nextInt();
	    }
	    
	    for (int i = 0 ; i < n - 1 ; i ++ ) {
	        int minIndex = i;
	        for (int j = i + 1 ; j < n ; j ++ ) {
	            if (arr[j] < arr[minIndex]) {
	                minIndex = j;
	            }
	        }
	        int temp = arr [i];
	        arr [i] = arr [minIndex];
	        arr [minIndex] = temp;
	    }
	    
	    System.out.println("The array after sorting : ");
	    System.out.println(Arrays.toString(arr));
	}
}

/*
input : 
5
1 3 5 4 2

output :
[1,2,3,4,5]
*/
