package CommonPrograms;

public class NonStaticMembers {
    int nonStaticMembers=10;

    void nonStaticMembers(){
        System.out.println("nonStaticMembers");
    }
    public static void main(String[] args){
        NonStaticMembers nonStaticMembers1=new NonStaticMembers();
        System.out.println(nonStaticMembers1.nonStaticMembers);
        nonStaticMembers1.nonStaticMembers();

    }
}
