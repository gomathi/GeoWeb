/**
 * 
 */
package com.geoweb.store;

import java.util.List;
import java.util.Map;

import com.geoweb.entities.DeviceBatteryInfo;
import com.geoweb.entities.DeviceInfo;
import com.geoweb.entities.DeviceTemperatureInfo;

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
	public DeviceBatteryInfo getDeviceBatteryInfo(String deviceId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateDeviceOwner(String userId, String deviceId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateDeviceInfo(String name, String deviceId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public DeviceTemperatureInfo getDeviceTemperatureInfo(String deviceId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateDeviceBatteryInfo(String deviceId, float batteryLevel) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateDeviceTemperatureInfo(String deviceId,
			float deviceTempLevel) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<DeviceInfo> getDeviceBatteryInfo(String deviceId,
			String searchPat) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Boolean> sendAlertMessagesTo(List<String> phoneNos) {
		// TODO Auto-generated method stub
		return null;
	}

}
