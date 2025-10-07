package InfosysInternalProjectPrep.InterviewPraPro;

public class ConvertDecimalToBinary {
    public static void main(String[] args) {

        int num = 10;
//        String binary = Integer.toBinaryString(num);
        int binNum = Integer.parseInt(Integer.toBinaryString(num));
        System.out.println(binNum);
    }

}
