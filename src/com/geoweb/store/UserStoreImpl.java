package com.geoweb.store;

import com.geoweb.store.interfaces.UserStore;

public class UserStoreImpl implements UserStore {

	@Override
	public boolean addUser(final String userId, final String password) {
		return false;
	}

	@Override
	public boolean removeUser(final String userId) {
		return false;
	}

	@Override
	public boolean validateUser(final String userId, final String password) {
		return false;
	}
}
