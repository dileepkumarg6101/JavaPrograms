package WhileLoop;
//Pallindrome Number : if we reverse number we should get original number. For ex: 121,111,1221
//        6.WAP to check whether your number is pallindrome or not
public class NumberIsPallindromeOrNot {
    public static void main(String[] args){
        int num=121,rev=0,rem,temp=num;
        while (num>0){
            rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        System.out.println("Reverse of num is : "+rev);

        if (rev==temp){
            System.out.println("palindrome number: "+rev);
        }
        else{

            System.out.println("not a palindrome number:"+rev);

        }
    }
}
