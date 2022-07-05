
public class Averaging {



    public static double average(int number1, int number2, int number3, int number4) {
        //write some code here
        return (number1+number2+number3+number4)/4.0;
    }

    public static void main(String[] args) {
        double result = average(5, 3, 6, 1);
        System.out.println("Average: " + result);
    }
}
