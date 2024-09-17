//example - If the given number is 292, the function should return 9 because the unique digit '9' in this number has a sum of 9. 

import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        int arr[] = new int[10];
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int num = n;
        for(int i=0;i<10;i++)
            arr[i] = 0;
        while(num>0)
        {
            int rem = num%10;
            arr[rem] += 1;
            num = num/10;
        }
        int cnt=0;
        for(int i=0;i<10;i++)
        {
            if(arr[i]==1)
                cnt+=i;
        }
        System.out.println(cnt);
    }
}
