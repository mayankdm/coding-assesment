package java.training.assesments.question7;

public class UI {
	public static void main(String[] args) {
		User user1 = new User(101,"John","john@gmail.com",5000);
        Wallet.processPaymentByUser(user1, 100);



        User user2 = new User(102,"Tom","tom@gmail.com",2000);
        user2.setRewardPoints(100);
        user2.setKYCDone(true);
        Wallet.processPaymentByUser(user2, 200);
	}
}
