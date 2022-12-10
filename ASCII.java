import java.util.Scanner;
public class ASCII {

    public static void main(String[] args) {
        char ch;
        System.out.println("Write something to convert into ASCII code ...");
        Scanner input = new Scanner(System.in);
        ch = input.next().charAt(0);
        int ascii = ch;
        int castAscii = (int) ch;

        System.out.println("The ASCII value of " + ch + " is: " + ascii);
        System.out.println("The ASCII value of " + ch + " is: " + castAscii);
    }
}