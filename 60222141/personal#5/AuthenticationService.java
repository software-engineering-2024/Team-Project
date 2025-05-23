
public class AuthenticationService {
	private static AuthenticationService instance;
	private String authToken;

	private AuthenticationService() {
	} // 비공개 생성자

	public static AuthenticationService getInstance() {
		if (instance == null) {
			instance = new AuthenticationService();
		}
		return instance;
	}

	public boolean login(String username, String password) {
		// 로그인 로직 (기본 구현)
		return true;
	}

	public void logout(String userID) {
		// 로그아웃 로직 (기본 구현)
	}
}
