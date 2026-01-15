package cricinfo.observer.notification;

import cricinfo.entities.User;

public interface Subscriber {
    public void send(User user, String message);
}
