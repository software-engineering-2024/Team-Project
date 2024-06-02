package UserPreferences;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UserPreferencesBuilderTest_3 {

	@Test
	void testSetWeight() {
		UserPreferencesBuilder upb = new UserPreferencesBuilder();
		double testingInput = 40.79;
		upb.setWeight(testingInput);
		assertEquals(testingInput, upb.getMWeight());
	}

}
