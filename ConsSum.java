/*
Write a function to find the sum of all possible consecutive numbers that add up to a given positive 
integer N. The function should return a list of lists, where each sublist represents a consecutive sequence 
of numbers that add up to N.
If N is 15, the function should return [[1, 2, 3, 4, 5], [4, 5, 6], [7, 8], [15]] because 1 + 2 + 3 + 4 + 5 = 15, 4 + 5 + 6 = 15, 7 + 8 = 15, and 15 = 15. 
*/

import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<List<Integer>> ll = new ArrayList<>();
        for(int i=1;i<=n;i++)
        {
            int total = 0;
            List<Integer> l = new ArrayList<>();
            for(int j=i;j<=n;j++)
            {
                total += j;
                l.add(j);
                if(total==n)
                {
                    ll.add(l);
                    break;
                }
               if(total>n)
                    break;
            }
        }
        System.out.println(ll);
    }
}
