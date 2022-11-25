package projects.learning;

public class Main{

    public static void main(String[] args){
	    PerfectNumberChecker perfectNumberChecker = new PerfectNumberChecker();
        System.out.println(perfectNumberChecker.isPerfectNumber(0));
        System.out.println(perfectNumberChecker.isPerfectNumber(6));
        System.out.println(perfectNumberChecker.isPerfectNumber(13));
        System.out.println(perfectNumberChecker.isPerfectNumber(28));
        System.out.println(perfectNumberChecker.isPerfectNumber(9837));
    }
}
