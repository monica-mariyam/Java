/*
Weight of a hill pattern 
Given, 
the total levels in a hill pattern (input1), 
the weight of the head level (input2), and 
the weight increments of each subsequent level (input3), 
you are expected to find the total weight of the hill pattern.  
"Total levels" represents the number of rows in the pattern. 
"Head level" represents the first row.

Example - 
Given, 
the total levels in the hill pattern = 4 
the weight of the head level = 1 
the weight increments of each subsequent level = 5 
Then, Total weight of the hill pattern will be = 1 + (6+6) + (11+11+11) + (16+16+16+16) = 1 + 12 + 33 + 64 
= 110
*/

class HelloWorld {
    public static void main(String[] args) {
       int level = 4, wt = 1, wincr = 5;
       int sum = 0;
       for(int i=1;i<=level;i++)
       {
           sum += i*wt;
           wt += wincr;
       }
       System.out.println(sum);
    }
}
