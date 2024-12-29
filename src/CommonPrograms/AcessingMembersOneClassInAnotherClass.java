package CommonPrograms;

class AcessingMembersOneClassInAnotherClass {

    static int i=1;
    String s ="Dileep";
}
class second{
    public static void main(String[] args){
        System.out.println(AcessingMembersOneClassInAnotherClass.i);
        AcessingMembersOneClassInAnotherClass acessingMembersOneClassInAnotherClass=new AcessingMembersOneClassInAnotherClass();
        System.out.println(acessingMembersOneClassInAnotherClass.s);
    }
}

