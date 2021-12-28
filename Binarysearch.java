package algorithm_programs;
import java.util.*;
import java.util.Arrays;

public class Binarysearch{

public static void main(String[] args) 
{
   Scanner sc = new Scanner(System.in);
   int i;  

   System.out.println("Enter number of words you wish to input: ");
   int n=sc.nextInt();
   
   Binarysearch[] words= new Binarysearch[n];

   System.out.println("Enter the words");
   for ( i = 0; i < words.length; i++)
   {
       System.out.print("WORD " + (i + 1) + ": ");
       words[i] = sc.next();
   }

   System.out.println("enter the word you want to search for");
   Binarysearch word=sc.next();

   Arrays.sort(words);
   
   int index= Arrays.binarySearch(words,word);
   System.out.println(word+ "="+ index);


}
}
   
   
