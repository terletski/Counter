import java.util.Scanner;

public class Counter {

    public static void main(String[] args) {
        String text;

        System.out.println("Enter text here:");
        Scanner scn = new Scanner(System.in);
        text = scn.nextLine();
        String textOne = "";
        int count = 0;

        for (int i = 0; i < text.length(); i++) {
            if (textOne.indexOf(text.charAt(i)) == -1) textOne += text.charAt(i);
        }

        for (int i = 0; i < textOne.length(); i++) {
            count = 0;
            for (int j = 0; j < text.length(); j++) {
                if (textOne.charAt(i) == text.charAt(j)) count++;
            }
            System.out.println("'" + textOne.charAt(i) + "'" + " " + count);
        }
    }
}




