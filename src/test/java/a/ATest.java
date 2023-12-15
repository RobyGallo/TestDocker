package a;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class ATest {

	@Test
	void shouldNotValidateWhenFirstNameEmpty() {
		String a = "roby";
		assertThat(a.equals("roby"));
	}

}
