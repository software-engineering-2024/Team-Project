package RequestionForm;
import UserPreferences.UserPreferences;

public class RequestionForm {
	// 멤버변수
	private RequestionFormState state;
	
	public void displayForm() {}
	public void displayNorificationWindow() {} //state.displayNorificationWindow()
	public UserPreferences getPreferences() {UserPreferences m = new UserPreferences(); return m;}
	public void updatePreferences() {}
}
