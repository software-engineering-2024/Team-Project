package UserPreferences;

public class UserPreferencesBuilder {
	// 멤버 변수
	private String mSkinType;
	private double mHeight;
	private double mWeight;
	private String mFavorFit;
	private String mFavorColor;
	
	// 메서드
	public void setSkinType(String skintype) {
		mSkinType = skintype;
	}
	public void setHeight(double height) {
		mHeight = height;
	}
	public void setWeight(double weight) {
		mWeight = weight;
	}
	public void setFavorFit(String favorfit) {
		mFavorFit = favorfit;
	}
	public void setFavorColor(String favorcolor) {
		mFavorColor = favorcolor;
	}
	
	// if문을 이용해 채워져 있는 변수에 맞는 생성자를 호출한다.
	public UserPreferences build( ) {
		UserPreferences upf;
		if(mFavorColor.isEmpty()) {
			if(mFavorFit.isEmpty()) {
				upf = new UserPreferences(mSkinType, mHeight, mWeight);
			} else {
				upf = new UserPreferences(mSkinType, mHeight, mWeight, mFavorFit);
			}
		} else {
			upf = new UserPreferences(mSkinType, mHeight, mWeight, mFavorFit, mFavorColor);
		}
		
		return upf;
	}
}
