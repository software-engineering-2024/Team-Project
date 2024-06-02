package UserPreferences;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UserPreferencesBuilderTest_5 {

	@Test
	void testSetFavorColor() {
		UserPreferencesBuilder upb = new UserPreferencesBuilder();
		String testingInput = "파란색";
		upb.setFavorColor(testingInput);
		assertEquals(testingInput, upb.getMFavorColor());
	}

}
