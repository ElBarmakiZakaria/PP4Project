package pl.elbarmaki.creditcardcata;

import org.junit.jupiter.api.Test;

public class HelloTest {

    @Test
    void helloMyFirstUnitTest(){
        //A / Arrange
        int a = 2;
        int b = 4;
        //A / Act
        var result = a + b;
        //A / Assert
        assert result == 6;
    }

    @Test
    void helloWorldViaTest(){
        var a = 2;
        var b = 8;
        var result = a+b;
        assert  result == 2;

    }
}
