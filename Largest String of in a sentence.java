import java.util.Scanner;

class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter a sentence to find out the largest string : ");
        String str = sc.nextLine(), current_string = "";
        String array[] = str.split(" ");
        int i = 0, j = 0;

        current_string = array[0];
        for (i = 0; i < array.length; i = j) {
            for (j = i + 1; j < array.length; j++) {
                if (current_string.length() < array[j].length()) {
                    current_string = array[j];
                    break;
                }
            }
        }
        System.out.println("\nThe string with the largest length is : " + current_string + " and it's length is : "
                + current_string.length());

        sc.close();
    }
}
