/**
 * 
 */
package com.geoweb.store;

import java.util.List;

import com.geoweb.entities.DeviceBatteryInfo;
import com.geoweb.entities.DeviceInfo;
import com.geoweb.entities.DeviceTemperatureInfo;
import com.geowebcommon.store.DeviceStore;

/**
 * @author goms
 * 
 */
public class DeviceStoreImpl implements DeviceStore {

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

}
