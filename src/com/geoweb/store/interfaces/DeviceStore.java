package com.geoweb.store.interfaces;

import java.util.List;

import com.geoweb.entities.DeviceBatteryInfo;
import com.geoweb.entities.DeviceInfo;

/**
 * 
 * @author goms
 * 
 */
public interface DeviceStore {

	boolean addDevice(final String deviceId, final String name,
			final String userId);

	DeviceInfo getDeviceInfo(final String deviceId);

	boolean updateDeviceOwner(final String userId);

	boolean updateDeviceInfo(final String name);

	List<DeviceInfo> getAllDevicesFor(String userId);

	DeviceBatteryInfo getDeviceBatteryInfo(final String deviceId);

	boolean updateDeviceBatteryInfo(final String deviceId);
}
