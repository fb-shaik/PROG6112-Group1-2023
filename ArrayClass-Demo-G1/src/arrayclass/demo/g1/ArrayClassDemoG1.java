//Simple demo of how the Array Class can be used
package arrayclass.demo.g1;

//import statement needed to make use of the Array Class. This comes from the java.util library
import java.util.Arrays; 
public class ArrayClassDemoG1 {

 
    public static void main(String[] args) {
        
        //Create a simple array
        int [] numbers = {5,2,4,3,1,8};
        
        //Print to view array values
        System.out.println("Original Array Values: " + Arrays.toString(numbers));
        
        //Sort method from the Arrays Class
        Arrays.sort(numbers);
        System.out.println("Sorted Array Values: " + Arrays.toString(numbers));
        
        //Search for an element using the Arrays Class
        int searchElement = 3; //represents the the key used in the binary search 
        int index = Arrays.binarySearch(numbers, searchElement);
        if(index >=0)
            {System.out.println(searchElement + " found at index " + index);}
        else
            {System.out.println(searchElement + " not found ");}
        
        //fill additional values to the array
        int filledArray[] = new int[5];
        Arrays.fill(filledArray, 2); //the Fill method will populate the entire array with a value of 10
        System.out.println("Filled Array: " + Arrays.toString(filledArray));
        
        /*Copying Arrays
                TO duplicate / copy an array you will need:
                        1. Original Array which will be the source (we will use the numbers array declared above)
                        2. A secondary array which will be used as the memory allocation for the duplication/copied array
                        3. Lenght of the original array 
        */
        
        int [] duplicatedArray = new int[6];
        System.arraycopy(numbers, 0, duplicatedArray, 0, numbers.length);
        System.out.println("Copied Array: " + Arrays.toString(duplicatedArray));
        
        
       
    }
    
}
