package org.localchat.serverrmi.services;

import org.localchat.serverrmi.dao.User;
import org.localchat.serverrmi.metier.UserMetier;

import java.sql.SQLException;

public class ChatServices {

    public User inscription(User user) throws Exception {
        return new  UserMetier().addUser(user);
    }

    public User seConnecter(User user) throws Exception {
        return new UserMetier().authenticate(user.getLogin(), user.getPassword());
    }

}
