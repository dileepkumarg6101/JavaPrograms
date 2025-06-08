package JavaFullNotesPra.CognizantPrep;

/*
WAP to calculate frequency of characters present in a string "javadev"
 */
public class freq {
    public static void main(String[] args) {
        String s = "javadev";
        String s1 = s.toUpperCase();
        char[] c = s1.toCharArray();
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            int count = 0;
            for (int i = 0; i < c.length; i++) {
                if (ch == c[i]) {
                    count++;
                }
            }
            if (count > 0) {
                System.out.println(ch + " : " + count);
            }
        }


    }
}
