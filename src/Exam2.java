public class Exam2 {
    public  static void makeStar(int high){
        int num = 1;
        for(int i = 1; i <= high; i++){
            for(int b = 1; b <= high -i ; b++){
                System.out.print(" ");
            }
            for(int j= 1; j <= num; j++){
                System.out.print("*");
            }
            num += 2;
            System.out.println();
        }
    }
    public static void main(String[] args) {



        // 높이 : 3
        makeStar(3);

        /*

         *
         ***
         *****

         */

        // 높이 : 5

        // 출력
        makeStar(5);

        /*

         *
         ***
         *****
         *******
         *********

         */

        // 높이 : 7

        // 출력
        makeStar(7);
        /*

         *
         ***
         *****
         *******
         *********
         ***********
         *************

         */

    }
}