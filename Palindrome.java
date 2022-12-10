import java.util.Scanner;

class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Input of the String
        System.out.println("Enter a String : ");
        String rev = "", str = sc.nextLine();
        str = str.trim();
        // end
        int i;

        // reversing the string
        for (i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        // end
        if (rev.equals(str)) {
            System.out.println("Yes!, the string is Palindrome...");
        } else {
            System.out.println("No!, The string is not Palindrome...");
        }
    }
}
