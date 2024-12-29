package CommonPrograms;

class StaticMembersCanAccessedIn3Ways {
    static int i=20;


    public static void main(String[] args){
        System.out.println(i); // first way to acces static members
        System.out.println(StaticMembersCanAccessedIn3Ways.i); // 2nd wat to access the static members
        StaticMembersCanAccessedIn3Ways staticMembersCanAccessedIn3Ways=new StaticMembersCanAccessedIn3Ways();
        System.out.println(staticMembersCanAccessedIn3Ways.i);

    }
}
