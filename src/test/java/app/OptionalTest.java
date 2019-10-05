package app;

import org.junit.Test;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

public class OptionalTest {

    @Test
    public void empty() {
        Optional<String> optional = null;

        assertThat(optional).isNotPresent(); // TODO corrige l'erreur

    }
    @Test
    public void nonEmpty() {
        Optional<String> optional = Optional.of("text");

        assertThat(optional).isPresent();

    }
    @Test
    public void nullable() {

        Optional<String> optional = Optional.ofNullable(null);
        assertThat(optional).isNotPresent();

        optional = Optional.ofNullable("text");
        assertThat(optional).isPresent();

    }
}
