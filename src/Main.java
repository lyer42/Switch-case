import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // условные кострукции switch-case
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        switch (num) {
            case 1:
                System.out.println("Number is 1");
                break;
            case 2:
                System.out.println("number is 2");
                break;
            case 3:
                System.out.println("Number is 3");
                break;
            default:
                System.out.println("defoult");
        }


    }
}