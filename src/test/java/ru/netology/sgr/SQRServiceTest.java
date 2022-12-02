package ru.netology.sgr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class SQRServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/calc.csv")

    public void calcSQR(int min, int max, int expected) {
        SQRService service = new SQRService();
        int actual = service.calcSQR(min, max);

        Assertions.assertEquals(expected, actual);

    }
}
