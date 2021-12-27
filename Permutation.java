package algorithm_programs;
import java.util.*;
import java.util.Arrays;
class Permutation
{
    // Utility function to swap two characters in a character array
    private static void swap(char[] chars, int i, int j)
    {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }
 
    // Recursive function to generate all permutations of a string
    private static void permutations(char[] chars, int currentIndex)
    {
        if (currentIndex == chars.length - 1) {
            System.out.println(String.valueOf(chars));
        }
        for (int i = currentIndex; i < chars.length; i++)
        {
            swap(chars, currentIndex, i);
            permutations(chars, currentIndex + 1);
            swap(chars, currentIndex, i);
        }
    }
 
    public static void findPermutationsrecursively(String str) {
 
        // base case
        if (str == null || str.length() == 0) {
            return;
        }
 
        permutations(str.toCharArray(), 0);
    }
 
    // generate all permutations of a string in Java
    public static void permutationrecursively(String[] args)
    {
        String str = "sky is high";
        findPermutationsrecursively(str);
    }


public static void findPermutationsiterative(String itr)
{
    // base case
    if (itr == null || itr.length() == 0) {
        return;
    }

    // create an empty ArrayList to store (partial) permutations
    List<String> partial = new ArrayList<>();

    // initialize the list with the first character of the string
    partial.add(String.valueOf(itr.charAt(0)));

    // do for every character of the specified string
    for (int i = 1; i < itr.length(); i++)
    {
        // consider previously constructed partial permutation one by one

        // (iterate backward to avoid ConcurrentModificationException)
        for (int j = partial.size() - 1; j >= 0 ; j--)
        {
            // remove current partial permutation from the ArrayList
            String s = partial.remove(j);

            for (int k = 0; k <= s.length(); k++)
            {
                // Advice: use StringBuilder for concatenation
                partial.add(s.substring(0, k) + itr.charAt(i) + s.substring(k));
            }
        }
    }

    System.out.println(partial);
}

// Iterative program to generate all permutations of a string in Java
public static void permutationiterative(String[] args)
{
    String itr = "sky is high";
    findPermutationsiterative(itr);
}

public static void main(String args[]) {
if (str == itr)
{
	System.out.println("both strings are equal");
}
else {
	System.out.println("both strings are not equal");
}
}
}
