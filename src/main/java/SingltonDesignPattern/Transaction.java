package SingltonDesignPattern;

public class Transaction {
	private static Transaction transaction;

	private Transaction() {

	}

	public static Transaction creteTransaction() {
		if (null == transaction) {
			transaction = new Transaction();
			return transaction;
		} else {
			return transaction;
		}
	}

}
