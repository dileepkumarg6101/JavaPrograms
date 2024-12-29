package Collections;

public class Array2d {
    public static void main(String[] args) {
        int math[][]={{1,2,3},{4,5,6},{7,8,9}};

        int r= math.length;
        int c=math[0].length;

//        for (int i=0;i<r;i++){
//            for (int j=0;j<r1;j++){
//                System.out.println(math[i][j]);
//            }
//        }

        for (int i=0;i<c;i++){
            int j=c-i-1;
//            System.out.println(math[i][1]);
//            System.out.println(i+" "+j);
            System.out.println(math[i][j]);


        }




    }
}
