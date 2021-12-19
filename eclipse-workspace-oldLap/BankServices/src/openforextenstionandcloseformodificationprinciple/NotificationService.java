package openforextenstionandcloseformodificationprinciple;
/*
	As principle says,
	we should not modify the existing code for every notification service.
	but instead we can create an interface like this and can implement new class everytime for every new notification feature
	We can add a new class without modifying the existing classes. 
	so that is "open for extension and close for modification principle". 

*/

public interface NotificationService {
	
	public void sentOTP();
	public void sendTransactionNotification();
	
}
