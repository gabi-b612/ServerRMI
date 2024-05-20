package org.localchat.serverrmi.services;

import org.localchat.serverrmi.dao.User;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.sql.SQLException;

public interface IChatService extends Remote {
    public User inscription(User user) throws Exception;
}
