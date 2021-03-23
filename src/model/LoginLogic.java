package model;

import dao.AccountDAO;

public class LoginLogic {
	public boolean execute (User user) {
		AccountDAO accountDAO = new AccountDAO();
		Account account = accountDAO.findByLogin(user);
		if(account != null) {
			if(user.getPass().equals(account.getPass())) {
				return true;
			}
		}
		return false;
	}
}
