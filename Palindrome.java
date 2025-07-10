public class Palindrome {
    public static void main(String[] args) {
        int num = 121, rev = 0, original = num;
        while(num != 0) {
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        if(rev == original)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}
