import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PersonTest {

    Person Max;

    @BeforeEach
    void setUp() {
        Max = new Person("Max", "Mustermann", 185, (byte) 1);
    }

    @Test
    void rechneBMI() {
        Assertions.assertEquals("Untergewicht", Max.rechneBMI(63));
        Assertions.assertEquals("Normalgewicht", Max.rechneBMI(80));
        Assertions.assertEquals("Übergewicht", Max.rechneBMI(100));
        Assertions.assertEquals("Adipositas", Max.rechneBMI(105));
    }
}
