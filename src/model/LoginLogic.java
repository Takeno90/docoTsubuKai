package model;

public class LoginLogic {
	public boolean execute (User user) {
		if(user.getPass().equals("1234")) {//ここをDBから取得したpassと比較に変更
			return true;
		}
		return false;
	}
}
