package escola;

import escola.core.Telefone;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TelefoneTest {
    @Test
    void naoDeveriaPassarTelefonesInvalidos() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Telefone(null, null);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            new Telefone("12", null);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            new Telefone(null, "12345678");
        });
        assertThrows(IllegalArgumentException.class, () -> {
            new Telefone(null, "123456789");
        });
        assertThrows(IllegalArgumentException.class, () -> {
            new Telefone("", "");
        });
        assertThrows(IllegalArgumentException.class, () -> {
            new Telefone("", "12345678");
        });
        assertThrows(IllegalArgumentException.class, () -> {
            new Telefone("", "123456789");
        });
        assertThrows(IllegalArgumentException.class, () -> {
            new Telefone("12", "");
        });
    }

}