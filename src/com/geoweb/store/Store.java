/**
 * 
 */
package com.geoweb.store;

import java.util.List;

import com.geoweb.entities.DeviceBatteryInfo;
import com.geoweb.entities.DeviceInfo;
import com.geoweb.store.interfaces.DeviceStore;
import com.geoweb.store.interfaces.UserStore;

/**
 * @author goms
 * 
 */
public class Store implements DeviceStore, UserStore {

	private final DeviceStore deviceStore;
	private final UserStore userStore;

	public Store(DeviceStore deviceStore, UserStore userStore) {
		this.deviceStore = deviceStore;
		this.userStore = userStore;
	}

	@Override
	public boolean addUser(String userId, String password) {
		// TODO Auto-generated method stub
		return userStore.addUser(userId, password);
	}

	@Override
	public boolean removeUser(String userId) {
		// TODO Auto-generated method stub
		return userStore.removeUser(userId);
	}

	@Override
	public boolean validateUser(String userId, String password) {
		// TODO Auto-generated method stub
		return userStore.validateUser(userId, password);
	}

	@Override
	public DeviceInfo getDeviceInfo(String deviceId) {
		// TODO Auto-generated method stub
		return deviceStore.getDeviceInfo(deviceId);
	}

	@Override
	public List<DeviceInfo> getAllDevicesFor(String userId) {
		// TODO Auto-generated method stub
		return deviceStore.getAllDevicesFor(userId);
	}

	@Override
	public boolean addDevice(String deviceId, String name, String userId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateDeviceOwner(String userId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateDeviceInfo(String name) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public DeviceBatteryInfo getDeviceBatteryInfo(String deviceId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateDeviceBatteryInfo(String deviceId) {
		// TODO Auto-generated method stub
		return false;
	}

}
