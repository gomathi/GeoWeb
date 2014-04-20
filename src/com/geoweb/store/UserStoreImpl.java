package com.geoweb.store;

import java.util.List;
import java.util.Map;


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

	@Override
	public Map<String, Boolean> sendAlertMessagesTo(List<String> phoneNos) {
		// TODO Auto-generated method stub
		return null;
	}
}
