package Task5;

import java.util.Scanner;

public class TwiceEven {
    int number;

    public TwiceEven() {
        number = inputNumber();
    }

    private int inputNumber(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a three-digit positive number: \n");
        while (true){
            int arg = in.nextInt();
            if(arg > 0 && arg < 1000){
                return arg;
            }else System.out.println("Enter a three-digit positive number: \n");
        }
    }

    private boolean checkEven (int arg){
        int sum = 0;
        while (arg > 0){
            sum += arg % 10;
            arg /= 10;
        }
        return sum % 2 == 0;
    }

    public void isEvenTwice() {
        if(checkEven(number) && number % 2 == 0){
            System.out.println("The number is twice even");
        }
        else System.out.println("The number is not twice even");
    }

}