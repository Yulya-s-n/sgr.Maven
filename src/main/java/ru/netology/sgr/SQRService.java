package ru.netology.sgr;
public class SQRService {
    public int calcSQR(int min, int max) {

        int counter = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= 10) ;
            {
                counter++;
            }
            if (i * i <= 99) ;
            {
                counter++;
            }
            return counter;
        }
        return -1;
    }
}

