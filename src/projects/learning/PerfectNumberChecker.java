package projects.learning;

public class PerfectNumberChecker {
    public static boolean isPerfectNumber(int number){
        boolean isPerfect = false;
        int divisor = 1;
        int sum = 0;
        if(number > 0){
            while(divisor < number){
                if(number % divisor == 0){
                    sum += divisor;
                }
                divisor++;
            }
        }
        if(sum == number && number != 0){
            isPerfect = true;
        }
        return isPerfect;
    }
}
