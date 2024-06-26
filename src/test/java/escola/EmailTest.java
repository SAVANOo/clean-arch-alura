package escola;

import escola.core.Email;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmailTest {
    @Test
    void naoDeveriaCriarEmailsComEnderecoInvalido() {
        assertThrows(IllegalArgumentException.class,
                () -> new Email(null)
        );
        assertThrows(IllegalArgumentException.class,
                () -> new Email("")
        );
        assertThrows(IllegalArgumentException.class,
                () -> new Email("emailinvalido")
        );
    }
}