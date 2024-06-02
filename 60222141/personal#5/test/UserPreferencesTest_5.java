package UserPreferences;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UserPreferencesTest_5 {

	@Test
	void testUserPreferencesStringDoubleDoubleString() {
		UserPreferences up = new UserPreferences("라이트", 160.76575749, 40.99574579, "노멀핏");
		assertNotNull(up, () -> "should not null." );
	}

	@Test
	void testUserPreferencesStringDoubleDouble() {
		UserPreferences up = new UserPreferences("라이트", 160.77547669, 40.998686589);
		assertNotNull(up, () -> "should not null." );
	}

	@Test
	void testUserPreferencesStringDoubleDoubleStringString() {
		UserPreferences up = new UserPreferences("라이트", 160.76857669, 40.99567549, "노멀핏", "파란색");
		assertNotNull(up, () -> "should not null." );
	}

}
