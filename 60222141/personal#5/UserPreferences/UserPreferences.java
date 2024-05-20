package UserPreferences;

public class UserPreferences {
	// 멤버 변수
	private String skinType;
	private double height;
	private double weight;
	private String favorFit;
	private String favorColor;
	
	
	// 생성자 메소드
	public UserPreferences() {};
	
	public UserPreferences(String mSkinType, double mHeight, double mWeight, String mFavorFit) {
		skinType = mSkinType;
		height = mHeight;
		weight = mWeight;
		favorFit = mFavorFit;
		favorColor = "";
	}
	
	public UserPreferences(String mSkinType, double mHeight, double mWeight) {
		skinType = mSkinType;
		height = mHeight;
		weight = mWeight;
		favorFit = "";
		favorColor = "";
	}
	
	public UserPreferences(String mSkinType, double mHeight, double mWeight, String mFavorFit, String mFavorColor) {
		skinType = mSkinType;
		height = mHeight;
		weight = mWeight;
		favorFit = mFavorFit;
		favorColor = mFavorColor;
	}
}