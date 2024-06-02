package UserPreferences;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UserPreferencesBuilderTest_7 {

	@Test
	void testBuild() {
		UserPreferencesBuilder upb = new UserPreferencesBuilder();
		String testingV1 = "라이트"; 
		double testingV2 = 160.37;
		double testingV3 = 40.54;
		String testingV4 = "오버핏";
		String empty = "";
		
		upb.setSkinType(testingV1);
		upb.setHeight(testingV2);
		upb.setWeight(testingV3);
		upb.setFavorFit(testingV4);
		UserPreferences t = upb.build();
		
		assertEquals(testingV1, t.getSkinType());
		assertEquals(testingV2, t.getHeight());
		assertEquals(testingV3, t.getWeight());
		assertEquals(testingV4, t.getFavorFit());
		assertEquals(empty, t.getFavorColor());
	}

}
