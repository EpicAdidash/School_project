import java.util.Scanner;
public class ch5_18
{
    public void calculate(int m, char ch) {
        if (ch == 's') {
            if (m % 7 == 0)
                System.out.println("It is divisible by 7");
            else
                System.out.println("It is not divisible by 7");
        }
        else {
            if (m % 10 == 7)
                System.out.println("Last digit is 7");
            else
                System.out.println("Last digit is not 7");
        }

    }
    public void calculate(int a, int b, char ch) {
        if (ch == 'g')
            System.out.println(Math.max(a, b)+"is greater of the two");
        else
            System.out.println(Math.min(a, b)+"is lesser of the two");
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        ch5_18 obj = new ch5_18();

        System.out.print("Enter a number: ");
        int n1 = in.nextInt();
        obj.calculate(n1, 's');
        obj.calculate(n1, 't');

        System.out.print("Enter first number: ");
        int n3 = in.nextInt();
        System.out.print("Enter second number: ");
        int n2 = in.nextInt();
        obj.calculate(n3, n2, 'g');
        obj.calculate(n3, n2, 'k');
    }

}
