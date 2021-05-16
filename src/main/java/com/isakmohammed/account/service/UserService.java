package com.isakmohammed.account.service;

import com.isakmohammed.account.model.User;


public interface UserService {
	/** {@inheritDoc}} !*/
    void save(User user);
    /** {@inheritDoc}} !*/
    User findByUsername(String username);
}
