package InterviewIfosys;
/*
Q2
"Good Morning Dileep"
Print all the chars and its occurrence
Ans: g-1
0-3
d-2
m-1
 */
public class CharacterFrequency {
    public static void main(String[] args) {
        String s="Good Morning Dileep";
        char ch[]=s.toCharArray();
        for (int i=0; i< ch.length;i++){
            if (ch[i]==' '){
                continue;
            }
            int count=1;
            for (int j=i+1;j< ch.length;j++){
                if (ch[i]==ch[j]){
                    count++;
                    ch[j]=' ';// the character is counted...
                }
            }
            if (ch[i]!=' ') {
                System.out.println(ch[i] + "_" + count);
            }
        }
    }
}
