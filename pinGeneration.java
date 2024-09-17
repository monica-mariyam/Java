/*
Below are the rules for generating the PIN - - The PIN should be made up of 4 digits 
- The unit (ones) position of the PIN should be the least of the units position of the three input numbers 
- The tens position of the PIN should be the least of the tens position of the three input numbers 
- The hundreds position of the PIN should be the least of the hundreds position of the three input numbers 
- The thousands position of the PIN should be the maximum of all the digits in the three input numbers 
  
Example  - 
input1 = 123 
input2 = 582 
input3 = 175 
then, PIN = 8122
*/

import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i1=in.nextInt(),i2=in.nextInt(),i3=in.nextInt();
        int pin = 0;
        int maxi = 0;
        for(int i=0;i<3;i++)
        {
            int r1=i1%10;
            int r2=i2%10;
            int r3=i3%10;
            int mini = Math.min(r1,Math.min(r2,r3));
            maxi = Math.max(r1,Math.max(r2,Math.max(r3,maxi)));
            i1/=10;i2/=10;i3/=10;
            pin += Math.pow(10,i)*mini;
        }
        pin += Math.pow(10,3)*maxi;
        System.out.println(pin);
    }
}
