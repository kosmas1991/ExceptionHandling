import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x = getInt1();
        System.out.println("x is " + x);
        int y = getInt2();
        System.out.println("y is " + y);
    }
    public static int getInt1() {
        char[] charLine;
        System.out.println("Enter an Integer..");
        Scanner input = new Scanner(System.in);
        String line = input.next();
        charLine = line.toCharArray();
//        for (int i=0; i<charLine.length; i++)
//            System.out.print(charLine[i]);
//        System.out.println();
        for (int i=0; i<line.length(); i++ ) {
            if (!Character.isDigit(charLine[i]))
                return 0;
        }
        return Integer.parseInt(line);
    }

    public static int getInt2(){
        System.out.println("Enter an Integer..");
        Scanner input = new Scanner(System.in);
        try {
            return input.nextInt();
        } catch (Exception e) {
            return 0;
        }

    }
}
