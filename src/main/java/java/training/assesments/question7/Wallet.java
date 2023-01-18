package java.training.assesments.question7;

public class Wallet {
	public static void processPaymentByUser(User user, double billAmount) {
        boolean paymentSuccessful = user.makePayment(billAmount);
        if (paymentSuccessful) {
            System.out.println("Current wallet balance: Rs" + user.getWalletBalance());
            if (user.isKYCDone()) {
                User kycUser = user;
                System.out.println("Reward points: " + kycUser.getRewardPoints());
            }
            else 
                 System.out.println("No rewards available!");

            }
        }
}
