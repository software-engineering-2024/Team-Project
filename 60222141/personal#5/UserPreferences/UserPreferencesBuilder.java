package UserPreferences;

public class UserPreferencesBuilder {
	
	// 개별 과제 7 테스트 용 클래스
	// 테스트를 위해 필요한 getter 및 변수 초기화 추가
	
	// 멤버 변수
	private String mSkinType = "";
	private double mHeight = 0;
	private double mWeight = 0;
	private String mFavorFit = "";
	private String mFavorColor = "";
		
	
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
	
	
	// 테스트용 get 메소드
	// get 메소드
	public String getMSkinType() {
		return mSkinType;
	}
	
	public double getMHeight() {
		return mHeight;
	}
	
	public double getMWeight() {
		return mWeight;
	}
	
	public String getMFavorFit() {
		return mFavorFit;
	}
	
	public String getMFavorColor() {
		return mFavorColor;
	}
}
