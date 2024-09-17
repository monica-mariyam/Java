import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = -1, b = 1, c = 0;
        for(int i=0;i<n;i++)
        {
            c = a + b;
            a = b;
            b = c;
        }
        System.out.println(n+"th fibonacci number is "+c);
    }
}
