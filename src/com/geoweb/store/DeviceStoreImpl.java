/**
 * 
 */
package com.geoweb.store;

import java.util.List;

import com.geoweb.entities.DeviceBatteryInfo;
import com.geoweb.entities.DeviceInfo;
import com.geoweb.store.interfaces.DeviceStore;

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
