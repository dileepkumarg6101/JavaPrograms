package InfosysInternalProjectPrep.InterviewPraPro;

public class AdvancePalindrome {
    public static void main(String[] args) {
        String s = "madam";
        String result = new StringBuilder(s).reverse().toString();
        System.out.println(s.equals(result));
        System.out.println("result: " + result);
    }
}
