package UserPreferences;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UserPreferencesBuilderTest_2 {

	@Test
	void testSetHeight() {
		UserPreferencesBuilder upb = new UserPreferencesBuilder();
		double testingInput = 160.42;
		upb.setHeight(testingInput);
		assertEquals(testingInput, upb.getMHeight());
	}

}
