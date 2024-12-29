package Pra;
/*
here we are calculating the prime number
using the count if count==2 it's prime number logic is nested for...
 */
public class Prime {

    public static void main(String[] args){
        for (int i=1;i<=13;i++){
            int count=0;
            for (int j=1;j<=i;j++){
                if (i%j==0){
                    count++;
                }
            }
            if (count==2){
                System.out.print(i+",");
            }
        }
    }
}
