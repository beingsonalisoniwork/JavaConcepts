package examples.questions;

public class ReverseString {
    public static void main(String[] args) {
        String name = "Sonali";

        StringBuilder sb = new StringBuilder(name);
        String reversed = sb.reverse().toString();

        System.out.println(reversed);
    }
}
