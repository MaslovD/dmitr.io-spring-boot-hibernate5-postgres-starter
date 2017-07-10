package com.masdmtr.dao;
/**
 * Created by dmaslov on 11/07/17.
 */
import com.masdmtr.model.UserDetails;

import java.util.List;

public interface UserDao {

    List<UserDetails> getUserDetails();

}