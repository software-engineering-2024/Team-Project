package UserPreferences;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UserPreferencesTest_4 {

	@Test
	void testUserPreferencesStringDoubleDoubleStringString() {
		UserPreferences up = new UserPreferences("라이트", 160, 40, "노멀핏", "파란색");
		assertNotNull(up, () -> "should not null." );
	}

}
