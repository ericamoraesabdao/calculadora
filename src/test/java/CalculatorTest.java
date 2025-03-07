import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class CalculatorTest {
    @Test
    public void somasucesso(){
        int number = Calculator.Calculator(1, 4, 2);
        assertEquals(6, number );
    }

    @Test
    public void subtracaosucesso(){
        int number = Calculator.Calculator(2, 4, 2);
        assertEquals(2, number );
    }

    @Test
    public void multiplicacaosucesso(){
        int number = Calculator.Calculator(3, 4, 2);
        assertEquals(8, number );
    }

    @Test
    public void divisaosucesso(){
        int number = Calculator.Calculator(4, 4, 2);
        assertEquals(2, number );
    }

    @Test
    public void restosucesso(){
        int number = Calculator.Calculator(5, 4, 2);
        assertEquals(0, number );
    }
}