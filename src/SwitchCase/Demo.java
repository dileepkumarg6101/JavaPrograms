package SwitchCase;

public class Demo {
    public static void main(String[] args){
        int day=7;
        switch (day){
            case 1:System.out.println("day: Monday");
                break;
            case 2:System.out.println("Tuesday");
                break;
            case 3:System.out.println("Wednesday");
                break;
            case 4:System.out.println("Thu");
                break;
            case 5:System.out.println("Fri");
                break;
            case 6:System.out.println("Sat");
                break;
            case 7:System.out.println("Sun");
                break;
            default:System.out.println("day given is invalid as per calender");

        }
    }
}
