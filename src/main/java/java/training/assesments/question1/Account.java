package java.training.assesments.question1;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Account {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String name;
	private Long accountNumber;
	private Double balance;
	
	public Account() {
		super();
	}
	public Account(String name, Long accountNumber, Double balance) {
		super();
		this.name = name;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(Long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public Double getBalance() {
		return balance;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	public Long getId() {
		return id;
	}
	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", accountNumber=" + accountNumber + ", balance=" + balance
				+ "]";
	}
}
