package UserPreferences;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UserPreferencesBuilderTest_4 {

	@Test
	void testSetFavorFit() {
		UserPreferencesBuilder upb = new UserPreferencesBuilder();
		String testingInput = "오버핏";
		upb.setFavorFit(testingInput);
		assertEquals(testingInput, upb.getMFavorFit());
	}

}
