import java.util.Scanner;

class FindOddOrEven {
    public static void main(String[] args) {
        Scanner num = new  Scanner(System.in);

        System.out.println("Enter number");

        int myNum = num.nextInt();
        //Modulus operator to return division remainder
        if (myNum % 2 == 0)
            System.out.println(myNum + " is even!");
        else
            System.out.println(myNum + " is odd!");
    }
}