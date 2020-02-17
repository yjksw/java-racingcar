package racingGame.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class NameTest {
    @Test
    void checkValidLength_자동차_이름의_길이가_5를_초과() {
        final String name = "abcdef";

        assertThatThrownBy(() -> new Name(name))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("이름은 5자이하만 가능합니다.");
    }

    @Test
    void checkNameEmpty_자동차_이름이_공백() {
        final String name = "";

        assertThatThrownBy(() -> new Name(name))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("공백인 이름이 있습니다.");
    }
}