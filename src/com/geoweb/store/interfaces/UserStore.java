/**
 * 
 */
package com.geoweb.store.interfaces;


/**
 * @author goms
 * 
 */
public interface UserStore {

	boolean addUser(final String userId, final String password);

	boolean removeUser(final String userId);

	boolean validateUser(final String userId, final String password);

}
