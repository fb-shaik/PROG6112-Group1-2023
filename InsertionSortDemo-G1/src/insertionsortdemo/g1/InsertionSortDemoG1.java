
package insertionsortdemo.g1;
//Simple app to show how the insertion sort works

import java.util.*; //Console app import
public class InsertionSortDemoG1 {

    public static void main(String[] args) {
        //declare an array & print the original values to the user
        int [] numArray = {13,4,55,1,56,78}; // array size is 6; subscript [0]>[5]
        System.out.println(" Original Values in the Array: " + Arrays.toString(numArray));   //shorthand "sout" tab 
       
        //apply the insertion sort algorith to the above array
        for( int k = 1; k <numArray.length ; k++)
        {
                //to apply the insert sort, create a temp variable to hold the value in question
            int temp = numArray[k]; //this is holding the value at [1]
            int j = k-1;//this is holding the value at [0]
            while(j>=0 && temp <=numArray[j]) //both conditions need to be true
            {
                    numArray[j + 1] = numArray[j];
                    j = j - 1;
            }
            numArray[j+1] = temp;
        }
        /*
        The for loop iterates through the array elements starting from the second element (index 1) up to the second-to-last element (index numArray.length - 2).
        
        Inside the loop:
        temp holds the current element (starting from the second element) that we want to insert in its correct position 
        in the sorted subarray.
         j is initialized to the index before the current element (index k - 1), representing the last index of the sorted subarray.

        The while loop compares the temp value with the elements in the sorted subarray 
         (from numArray[j] to the beginning of the array) and shifts larger elements to the right to 
          make space for the temp value. The loop continues until either it reaches the beginning of the array 
         or temp is greater than the element being compared.
        After finding the correct position, the temp value is inserted into the sorted subarray.
        */
        
   
        //print of the sorted array values
         System.out.println(" Sorted Values in the Array: " + Arrays.toString(numArray)); 
    }
    
}
