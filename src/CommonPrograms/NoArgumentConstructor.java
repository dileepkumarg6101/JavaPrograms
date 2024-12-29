package CommonPrograms;

public class NoArgumentConstructor {
    String name;

    public NoArgumentConstructor() {
        name = "Dileep";
    }

    public static void main(String[] args) {
        NoArgumentConstructor noArgumentConstructor = new NoArgumentConstructor();
        System.out.println(noArgumentConstructor.name);
        NoArgumentConstructor a2 = new NoArgumentConstructor();
        System.out.println(a2.name);

    }

}
