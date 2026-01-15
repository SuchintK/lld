package cricinfo.observer.notification;

import cricinfo.entities.User;

public class EmailSubscriber implements Subscriber {
    public void send(User user, String message) {
        System.out.println("Sending notification to user with email: " + user.getEmail());
    }
}
