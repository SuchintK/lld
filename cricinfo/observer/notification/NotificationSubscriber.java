package cricinfo.observer.notification;

import cricinfo.entities.User;

public class NotificationSubscriber implements Subscriber {
    public void send(User user, String message) {
        System.out.println("Sending notification to user with device code: " + user.getDeviceCode());
    }
}
