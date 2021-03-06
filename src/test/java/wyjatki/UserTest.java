package wyjatki;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserTest {

    @Test
    public void shouldThrownIllegalArgumentExceptionOnWrongParameters() {
        Assertions.assertThrows(MissingParameterException.class, () -> {
            User.create(null,null,null,null);
        });
    }
}
