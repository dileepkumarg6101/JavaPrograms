package InfosysInternalProjectPrep.InterviewPraPro;
// remove the spaces in sthe string print all the characters
public class RemoveSpacesFromString {
    public static void main(String[] args) {
        /*
        // Using char array and loop

        String input = " hello Buddy Namaskara";
        char ch[] = input.toCharArray();
        String res  = "";

        for (int i = 0; i < input.length(); i++) {
            if (ch[i] != ' ') {
                res+=ch[i];

            }
        }
        System.out.println(res);

         */

        /*
        // Using charAt() in loop
        String input = " hello Buddy Namaskara";
        String res  = "";

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != ' ') {
                res+=input.charAt(i);

            }
        }
        System.out.println(res);

         */
        // Using replaceAll() method with regex
        /*
        String input = " hello Buddy Namaskara";

        String  res = input.replaceAll("\\s", "");
        System.out.println(res);

         */

        // Using replace method
        /*
        String input = " hello Buddy Namaskara";
        String res  =  input.replace(" ", "");
        System.out.println(res);

         */

        // Using StringBuilder and character check

        String input = " hello Buddy Namaskara";

        StringBuilder stringBuilder = new StringBuilder();

        for (char ch: input.toCharArray()){
            if (ch!=' '){
                stringBuilder.append(ch);
            }

        }
        System.out.println(stringBuilder.toString());
    }
}
