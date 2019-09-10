
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 0788763
 */
public class LargestAndSmallest 
{
    public static void main(String[] args) 
    {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter a bunch of numbers");
        System.out.println("When you're done, put in -99");
        
        int largestNumber = 0;
        int smallestNumber = 0;
        
        int currentHighLow = 0;
        int currentEntry = 0;
        
        while(currentEntry != -99) 
        {
            
            currentEntry = keyboard.nextInt();
            
            if (currentEntry == -99)
            {
                break;
            }
            
            currentHighLow = currentEntry;
            
            if (currentHighLow > largestNumber)
            {
                largestNumber = currentHighLow;
            }
            
            if (currentHighLow < smallestNumber)
            {
                smallestNumber = currentHighLow;
            }
        }
        
        System.out.println("Largest is: " + largestNumber);
        System.out.println("Smallest is: " + smallestNumber);
        
    }
}
