package InterviewPrograms;

public class RemoveSpacesFromString {
    public static void main(String[] args) {

        //  // Using replaceAll() method with regex
        /*
        String input = " hello Buddy Namaskara";
        String res = input.replaceAll("\\s", "");
        System.out.println(res);

         */
        /*

        // Using replace() method
        String input = " hello Buddy Namaskara";
        String res =  input.replace(" ", "");
        System.out.println(res);

         */
        /*
        //  Normal approach using for loop
        String input = " hello Buddy Namaskara";
        String res = "";

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != ' ') {
                res += input.charAt(i);
            }
        }
        System.out.println(res);
         */
        // Using StringBuilder and character check
        String input = " hello Buddy Namaskara";
        StringBuilder sb = new StringBuilder();

        for (char ch : input.toCharArray()){
            if (ch!= ' '){
                sb.append(ch);
            }

        }
        System.out.println(sb.toString());

    }
}
