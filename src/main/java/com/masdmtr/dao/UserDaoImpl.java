package com.masdmtr.dao;
/**
 * Created by dmaslov on 11/07/17.
 */
import com.masdmtr.model.UserDetails;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class UserDaoImpl implements UserDao {

    @Autowired
    private SessionFactory sessionFactory;

    public List<UserDetails> getUserDetails() {
        Criteria criteria = sessionFactory.openSession().createCriteria(UserDetails.class);
        return criteria.list();
    }

}