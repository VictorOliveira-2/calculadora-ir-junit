import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void testarCaminho1() {
        App app = new App();
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            app.calcularDesconto(-50.00);
        });
    }

    @Test
    public void testarCaminho2_Isento() {
        App app = new App();
        double resultado = app.calcularDesconto(4500.00);
        Assertions.assertEquals(0.0, resultado, 0.001);
    }

    @Test
    public void testarCaminho3_Aliquota7_5() {
        App app = new App();
        double resultado = app.calcularDesconto(5465.00);
        Assertions.assertEquals(409.875, resultado, 0.001);
    }

    @Test
    public void testarCaminho4_Aliquota15() {
        App app = new App();
        double resultado = app.calcularDesconto(5650.00);
        Assertions.assertEquals(847.50, resultado, 0.001);
    }

    @Test
    public void testarCaminho5_Aliquota22_5() {
        App app = new App();
        double resultado = app.calcularDesconto(6200.00);
        Assertions.assertEquals(1395.00, resultado, 0.001);
    }

    @Test
    public void testarCaminho6_Aliquota27_5() {
        App app = new App();
        double resultado = app.calcularDesconto(7000.00);
        Assertions.assertEquals(1925.00, resultado, 0.001);
    }

    @Test
    public void testarCaminho7_AliquotaMaxima() {
        App app = new App();
        double resultado = app.calcularDesconto(10000.00);
        Assertions.assertEquals(3000.00, resultado, 0.001);
    }
}