public class Exam2 {
    public  static void makeStar(int high){
        int num = 1;
        for(int i = 1; i <= high; i++){
            for(int j= 1; j <= num; j++){
                System.out.print("*");
            }
            num += 2;
            System.out.println();
        }
    }
    public static void main(String[] args) {
        makeStar(3);
        makeStar(5);
        makeStar(7);

        // 높이 : 3

        /*

         *
         ***
         *****

         */

        // 높이 : 5

        // 출력

        /*

         *
         ***
         *****
         *******
         *********

         */

        // 높이 : 7

        // 출력

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