package InfosysInternalProjectPrep.streamApis.onlinePra;

public class SumOfDigits {
    public static void main(String[] args) {
        int num = 12345;

        int sum = String.valueOf(num).chars()
                .map(Character::getNumericValue)
                        .sum();
//                .reduce(0, (a, b) -> a + b);
        System.out.println(sum);
    }
}
