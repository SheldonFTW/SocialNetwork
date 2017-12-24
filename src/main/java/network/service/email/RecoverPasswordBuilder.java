package network.service.email;

import network.model.User;
import network.service.impl.EmailBuilderImpl;

public class RecoverPasswordBuilder extends EmailBuilderImpl{

    private final String SUBJECT = "Recovery password";

    @Override
    public String subject() {
        return SUBJECT;
    }

    @Override
    public String text(User user) {
        return "Dear"
                +user.getName()
                + " your recover password";
    }

    @Override
    public String recipient(User user) {
        return user.getEmail();
    }
}
