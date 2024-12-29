package Dsa;

public class ReverseTheString {
    public static void main(String[] args){
        String s="Dileep";
        String res=" ";
        for (int i=5;i>=0;i--){
            res=res+s.charAt(i);
        }
        System.out.print(res);

    }
}
