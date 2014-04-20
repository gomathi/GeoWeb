/**
 * 
 */
package com.geoweb.store;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.geoweb.entities.DeviceBatteryInfo;
import com.geoweb.entities.DeviceInfo;
import com.geoweb.entities.DeviceLocationInfo;
import com.geoweb.entities.DeviceTemperatureInfo;

/**
 * @author goms
 * 
 */
public class StoreImpl implements Store {

	private final DeviceStore deviceStore;
	private final UserStore userStore;
	private final DeviceLocationHistoryStore devHistoryStore;

	public StoreImpl(DeviceStore deviceStore, UserStore userStore,
			DeviceLocationHistoryStore devHistoryStore) {
		this.deviceStore = deviceStore;
		this.userStore = userStore;
		this.devHistoryStore = devHistoryStore;
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
		return deviceStore.addDevice(deviceId, name, userId);
	}

	@Override
	public DeviceBatteryInfo getDeviceBatteryInfo(String deviceId) {
		// TODO Auto-generated method stub
		return deviceStore.getDeviceBatteryInfo(deviceId);
	}

	@Override
	public boolean updateDeviceOwner(String userId, String deviceId) {
		// TODO Auto-generated method stub
		return deviceStore.updateDeviceOwner(userId, deviceId);
	}

	@Override
	public boolean updateDeviceInfo(String name, String deviceId) {
		// TODO Auto-generated method stub
		return deviceStore.updateDeviceInfo(name, deviceId);
	}

	@Override
	public DeviceTemperatureInfo getDeviceTemperatureInfo(String deviceId) {
		// TODO Auto-generated method stub
		return deviceStore.getDeviceTemperatureInfo(deviceId);
	}

	@Override
	public boolean updateDeviceBatteryInfo(String deviceId, float batteryLevel) {
		// TODO Auto-generated method stub
		return deviceStore.updateDeviceBatteryInfo(deviceId, batteryLevel);
	}

	@Override
	public boolean updateDeviceTemperatureInfo(String deviceId,
			float deviceTempLevel) {
		// TODO Auto-generated method stub
		return deviceStore.updateDeviceTemperatureInfo(deviceId,
				deviceTempLevel);
	}

	@Override
	public List<DeviceInfo> getDeviceBatteryInfo(String deviceId,
			String searchPat) {
		// TODO Auto-generated method stub
		return deviceStore.getDeviceBatteryInfo(deviceId, searchPat);
	}

	@Override
	public Map<String, Boolean> sendAlertMessagesTo(List<String> phoneNos) {
		// TODO Auto-generated method stub
		return userStore.sendAlertMessagesTo(phoneNos);
	}

	@Override
	public Iterator<DeviceLocationInfo> getDeviceLocationHistory(String deviceId) {
		// TODO Auto-generated method stub
		return devHistoryStore.getDeviceLocationHistory(deviceId);
	}

}
