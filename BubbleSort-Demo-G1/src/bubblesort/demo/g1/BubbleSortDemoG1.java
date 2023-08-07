package bubblesort.demo.g1;
//Simple app to show how a Bubble Sort works

//import statement to make use of the JOptionPane build
import javax.swing.JOptionPane;

public class BubbleSortDemoG1 {

    public static void main(String[] args) {
//Get the number of elements in the array from the user
//Prompt the user for this input
int arraySize = Integer.parseInt(JOptionPane.showInputDialog(null," Please enter the number of elements in the array : "));

//Create an array to store the elements
int [] arr = new int [arraySize]; 

//Populate the array with user input
for( int i = 0; i < arraySize; i++)
{
     arr[i] = Integer.parseInt(JOptionPane.showInputDialog(null," Enter element # " + (i + 1) + " : " ));
}

//Display the original values in the array back to the user
//Make use of StringBuilder >>>>create an object from the StringBuilder Class
// ClassName objectName = new ClassName();
StringBuilder display = new StringBuilder("Original Array Values"); // add new line esc seq
for( int i = 0; i < arraySize; i++)
{
    display.append(arr[i]).append(" \n"); 
}
JOptionPane.showMessageDialog(null, display.toString());

//Method call to the Bubble Sort Method
bubbleSort(arr);

//Display the sorted values in the array back to the user
//String Builder
StringBuilder sortedArray = new StringBuilder("Sorted Array:  \n ");
for(int i = 0 ; i < arraySize;  i++)
{
    sortedArray.append(arr[i]).append(" \n");
}
JOptionPane.showMessageDialog(null, sortedArray.toString());

    }
    
    
    
    
//Create the Bubble Sort Method
    //access; static/non-static; data-type-of-Return/void; MethodName(parameter list) 
    //{Method Body>>> return dataType}
    public static void bubbleSort(int [] arr)
    {//Method Body
        //Determine the array size
        int n = arr.length; //helps the For Loop to keep in bounds based on the array lenght
        boolean swapped;
        //Nested Loop to be used in the Bubble Sort
        //Outer Loop: Will be used to pass the number of iterations completed based on the array size
        for(int i = 0; i <n-1; i++);
        { swapped = false;
                    //Inner Loop: The actual swop of elements occur here
            //This loop has to complete all its iterations before the outer loop can complete an iteration.
                for(int j = 0; j< n-1; j++)
                {//Elements are now being swapped
                    if(arr[j] > arr[j +1] )
                    {
                            //Swap arround the elements; introduce a temp variable to hold the value being moved
                        int temp = arr [j];
                        arr [j] = arr [j +1];
                        arr[j+1] = temp;
                        swapped = true;
                    }
                        //if no elements were swapped in the inner loop, the array is already sorted
                        if(!swapped)
                        {break;}
                }
        
        
        }
    
            
            
    
    }
    
    
    
}
