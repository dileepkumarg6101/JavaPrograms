package InterviewPrograms;

public class AdvancePalindrome {
    public static void main(String[] args) {
        String s="madam";
        String reverse=new StringBuilder(s).reverse().toString();
        System.out.println(s.equals(reverse));
        System.out.println("reversed: "+reverse);
    }
}
