package UserPreferences;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UserPreferencesBuilderTest_1 {

	@Test
	void testSetSkinType() {
		UserPreferencesBuilder upb = new UserPreferencesBuilder();
		String testingInput = "라이트";
		upb.setSkinType(testingInput);
		assertEquals(testingInput, upb.getMSkinType());
	}

}
