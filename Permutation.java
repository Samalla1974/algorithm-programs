package algorithm_programs;
import java.util.*;
import java.util.Arrays;
class Permutation
{
    
    private static void swap(char[] chars, int i, int j)
    {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }
 
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
 
    
    public static void permutationrecursively(String[] args)
    {
        String str = "sky is high";
        findPermutationsrecursively(str);
    }


public static void findPermutationsiterative(String itr)
{
    
    if (itr == null || itr.length() == 0) {
        return;
    }

    List<String> partial = new ArrayList<>();

    partial.add(String.valueOf(itr.charAt(0)));

    for (int i = 1; i < itr.length(); i++)
    {
        for (int j = partial.size() - 1; j >= 0 ; j--)
        {
            String s = partial.remove(j);

            for (int k = 0; k <= s.length(); k++)
            {
                partial.add(s.substring(0, k) + itr.charAt(i) + s.substring(k));
            }
        }
    }

    System.out.println(partial);
}
public static void permutationiterative(String[] args)
{
    String itr = "sky is high";
    findPermutationsiterative(itr);
}

public static void main(String args[]) {
if ("str" == "itr")
{
	System.out.println("both strings are equal");
}
else {
	System.out.println("both strings are not equal");
}
}
}
