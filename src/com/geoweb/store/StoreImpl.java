/**
 * 
 */
package com.geoweb.store;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.geoweb.entities.DeviceBatteryInfo;
import com.geoweb.entities.DeviceInfo;
import com.geoweb.entities.DeviceLocationInfo;
import com.geoweb.entities.DeviceTemperatureInfo;
import com.geowebcommon.store.DeviceLocationHistoryStore;
import com.geowebcommon.store.DeviceStore;
import com.geowebcommon.store.Store;
import com.geowebcommon.store.UserStore;

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
	public Map<String, Integer> getDevicesSummary(String userId) {
		// TODO Auto-generated method stub
		List<DeviceInfo> devicesList = deviceStore.getAllDevicesFor(userId);

		Map<String, Integer> devicesSummary = new HashMap<String, Integer>();

		for (DeviceInfo device : devicesList) {

		}
		return devicesSummary;
	}

	@Override
	public boolean addUser(String userId, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeUser(String userId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean validateUser(String userId, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Map<String, Boolean> sendAlertMessagesTo(String userId,
			List<String> phoneNos) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addDevice(String userId, String deviceId, String name) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public DeviceInfo getDeviceInfo(String userId, String deviceId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateDeviceOwner(String currUserId, String newUserId,
			String deviceId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateDeviceInfo(String userId, String name, String deviceId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<DeviceInfo> getAllDevicesFor(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DeviceBatteryInfo getDeviceBatteryInfo(String userId, String deviceId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<DeviceInfo> getDeviceBatteryInfo(String userId,
			String deviceId, String searchPat) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateDeviceBatteryInfo(String userId, String deviceId,
			float batteryLevel) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public DeviceTemperatureInfo getDeviceTemperatureInfo(String userId,
			String deviceId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateDeviceTemperatureInfo(String userId, String deviceId,
			float deviceTempLevel) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterator<DeviceLocationInfo> getDeviceLocationHistory(String deviceId) {
		// TODO Auto-generated method stub
		return null;
	}

}
