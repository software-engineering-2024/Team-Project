package UserPreferences;

public class UserPreferences {
	
	// 개별 과제 7 테스트 용 클래스
	// 누락된 getter 추가
	
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
	
	// get 메소드
	public String getSkinType() {
		return skinType;
	}
	
	public double getHeight() {
		return height;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public String getFavorFit() {
		return favorFit;
	}
	
	public String getFavorColor() {
		return favorColor;
	}
}