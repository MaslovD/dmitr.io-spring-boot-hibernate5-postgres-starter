package com.masdmtr.controller;
/**
 * Created by dmaslov on 11/07/17.
 */

import com.masdmtr.model.UserDetails;
import com.masdmtr.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;


@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ResponseEntity<List<UserDetails>> userDetails() {

        List<UserDetails> userDetails = userService.getUserDetails();
        return new ResponseEntity<List<UserDetails>>(userDetails, HttpStatus.OK);
    }

}
