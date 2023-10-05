package junit_testing;

public class Calculator {

    public int addTwoNumbers(int firstNumber, int secondNumber){
        int result = firstNumber + secondNumber;
        System.out.println("The additional sum is:" + result);
        return result;
    }

    public int divideTwoNumbers(int firstNumber, int secondNumber){
        int result = firstNumber / secondNumber;
        System.out.println("The result is:" + result);
        return result;
    }

    public int multiplyTwoNumbers(int firstNumber, int secondNumber){
        int result = firstNumber * secondNumber;
        System.out.println("The result is:" + result);
        return result;
    }

    public int subtractTwoNumbers(int firstNumber, int secondNumber){
        int result = firstNumber - secondNumber;
        System.out.println("The result is:" + result);
        return result;
    }
}
