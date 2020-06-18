package NewQuestions;

import java.util.Arrays;

public class Q1_1 {
    public static void main(String[] args) {
        int [] sinav = new int[5];
        sinav[1] =1;
        sinav[2] =2;
        sinav[3] =3;
        sinav[4] =4;
        sinav[5] =5; // index 5 demek totalde 6 tane elamanı olması demek ama 5 tane yer var

        System.out.println(Arrays.toString(sinav));
        //      index 0 dan baslamamıs dikkat et
      // hata verir ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
    }
}
