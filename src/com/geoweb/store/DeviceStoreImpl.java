/**
 * 
 */
package com.geoweb.store;

import java.util.List;

import com.geoweb.entities.DeviceBatteryInfo;
import com.geoweb.entities.DeviceInfo;
import com.geoweb.entities.DeviceTemperatureInfo;

/**
 * @author goms
 * 
 */
public class DeviceStoreImpl implements DeviceStore {

	@Override
	public DeviceInfo getDeviceInfo(final String deviceId) {
		return null;
	}

	@Override
	public List<DeviceInfo> getAllDevicesFor(String userId) {
		return null;
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
}
