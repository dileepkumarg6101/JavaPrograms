package CommonPrograms;

public class StaticMembers {

   static int staticVariable=10;

   static void staticVariable(){
       System.out.println("staticVariable");
   }

   public static void main(String[] args){
       System.out.println(StaticMembers.staticVariable);
       StaticMembers.staticVariable();
   }
}
