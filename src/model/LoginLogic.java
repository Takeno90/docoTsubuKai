package model;

import dao.AccountDAO;

public class LoginLogic {
	public boolean execute (User user) {
		//暗号化
		PasswordUtil passUtil = new PasswordUtil();
		String safetyPassword = passUtil.getSafetyPassword(user.getPass(),user.getUserId());
		user.setPass(safetyPassword);

		AccountDAO accountDAO = new AccountDAO();
		Account account = accountDAO.findByLogin(user);
		if(account != null) {
			if(user.getPass().equals(account.getPass())) {
				return true;
			}
		}
		return false;
	}
	public boolean create(Account account) {
		//暗号化
		PasswordUtil passUtil = new PasswordUtil();
		String safetyPassword = passUtil.getSafetyPassword(account.getPass(),account.getUserId());
		account.setPass(safetyPassword);

		AccountDAO accountDAO = new AccountDAO();
		boolean isCreate = accountDAO.create(account);
		if (isCreate == true) {
			return true;
		}else {
			return false;
		}
	}
}
