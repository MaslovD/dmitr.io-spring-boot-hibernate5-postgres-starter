package com.masdmtr.service;
/**
 * Created by dmaslov on 11/07/17.
 */

import com.masdmtr.dao.UserDao;
import com.masdmtr.model.UserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    public List<UserDetails> getUserDetails() {
        return userDao.getUserDetails();
    }
}
