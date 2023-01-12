package java.training.assesments.question1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {
	@Autowired
	AccountRepository repo;
	public String addBalance(Account acc, Long id) {
		try {
			Account account = repo.findById(id).get();
			account.setBalance(account.getBalance() + acc.getBalance());
			repo.save(account);
		} catch (Exception e) {
			return "Account does not exist";
			// TODO: handle exception
		}
		return "Balance added successfully!";
	}

	public String withdrawBalance(Account acc, Long id) {
		try {
			Account account = repo.findById(id).get();
			if(acc.getBalance() > account.getBalance()) {
				return "Insufficient Fund!";
			}
			account.setBalance(account.getBalance() - acc.getBalance());
			repo.save(account);
		} catch (Exception e) {
			return "Account does not exist";
			// TODO: handle exception
		}
		return "Balance withdrawn successfully!";
	}

	public String saveAccount(Account acc) {
		repo.save(acc);
		return "account created!";
	}

	public String getBalance(Long id) {
		Account account = repo.findById(id).get();
		if(account != null) {
			return "Your balance is :" + account.getBalance();
		}
		return "Account not found!";
	}
}
