package UserPreferences;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UserPreferencesTest_2 {

	@Test
	void testUserPreferencesStringDoubleDoubleString() {
		UserPreferences up = new UserPreferences("라이트", 160, 40, "노멀핏");
		assertNotNull(up, () -> "should not null." );
	}

}
