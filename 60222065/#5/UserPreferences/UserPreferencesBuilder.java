package UserPreferences;
public class UserPreferencesBuilder {
	// 멤버 변수
	private String mSkinType;
	private double mHeight;
	private double mWeight;
	private String mFavorFit;
	private String mFavorColor;
	
	// 메서드
	public void setSkinType(String skintype) {}
	public void setHeight(double height) {}
	public void setWeight(double weight) {}
	public void setFavorFit(String favorFit) {}
	public void setFavorColor(String favorColor) {}
	public UserPreferences build( ) { UserPreferences u = new UserPreferences(); return u;}	
	// if문을 이용해 채워져 있는 변수에 맞는 생성자를 호출한다.
}
