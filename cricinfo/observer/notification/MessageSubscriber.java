package cricinfo.observer.notification;

import cricinfo.entities.User;

public class MessageSubscriber implements Subscriber {
    public void send(User user, String message) {
        System.out.println("Sending text message to user with number: " + user.getPhoneNumber());
    }
}
