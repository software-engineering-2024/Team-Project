package UserPreferences;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UserPreferencesTest_1 {

	@Test
	void testUserPreferences() {
		UserPreferences up = new UserPreferences();
		assertNotNull(up, () -> "should not null." );
	}

}
