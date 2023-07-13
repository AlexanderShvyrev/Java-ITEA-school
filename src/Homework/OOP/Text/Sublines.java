package Homework.OOP.Text;

public class Sublines {
    public static void main(String[] args) {
        String text = "Hello, this is a random text from the internet!";

        String[] res = splitTheText(text);
        System.out.println("Your text is: " + text);
        System.out.println("First half: " + res[0]);
        System.out.println("Second half: " + res[1]);
    }

    public static String[] splitTheText(String text){
        int length = text.length();
        int middle = length/2;

        if(length % 2 != 0){
            text += "\uD83D\uDCA9";
        }

        String front = text.substring(0, middle);
        String back = text.substring(middle);

        return new String[] {front, back};
    }
}
