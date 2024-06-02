package UserPreferences;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UserPreferencesTest_3 {

	@Test
	void testUserPreferencesStringDoubleDouble() {
		UserPreferences up = new UserPreferences("라이트", 160, 40);
		assertNotNull(up, () -> "should not null." );
	}

}
