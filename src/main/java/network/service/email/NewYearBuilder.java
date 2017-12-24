package network.service.email;

import network.model.User;
import network.service.EmailBuilder;
import network.service.impl.EmailBuilderImpl;

public class NewYearBuilder extends EmailBuilderImpl {

    private final String SUBJECT = "Happy New Year";

    @Override
    public String subject() {
        return SUBJECT;
    }

    @Override
    public String text(User user) {
        return "Dear"
                + user.getName()
                + "Happy New Year";
    }

    @Override
    public String recipient(User user) {
        return user.getEmail();
    }
}
