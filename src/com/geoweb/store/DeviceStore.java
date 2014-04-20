package com.geoweb.store;

import java.util.List;

import com.geoweb.entities.DeviceBatteryInfo;
import com.geoweb.entities.DeviceInfo;
import com.geoweb.entities.DeviceTemperatureInfo;

/**
 * 
 * @author goms
 * 
 */
public interface DeviceStore {

	/**
	 * Registers a new device for the user.
	 * 
	 * @param deviceId
	 *            , DeviceId is unique and pre-generated.
	 * @param name
	 *            , A custom name that is given by the user.
	 * @param userId
	 *            , The ownerId of the device
	 * @return
	 */
	boolean addDevice(final String deviceId, final String name,
			final String userId);

	/**
	 * Given the deviceId returns the deviceInfo.
	 * 
	 * @param deviceId
	 * @return
	 */

	DeviceInfo getDeviceInfo(final String deviceId);

	/**
	 * 
	 * @param userId
	 * @param deviceId
	 * @return
	 */
	boolean updateDeviceOwner(final String userId, final String deviceId);

	/**
	 * 
	 * @param name
	 * @param deviceId
	 * @return
	 */
	boolean updateDeviceInfo(final String name, final String deviceId);

	/**
	 * 
	 * @param userId
	 * @return
	 */
	List<DeviceInfo> getAllDevicesFor(String userId);

	/**
	 * 
	 * @param deviceId
	 * @return
	 */
	DeviceBatteryInfo getDeviceBatteryInfo(final String deviceId);

	/**
	 * 
	 * @param deviceId
	 * @param searchPat
	 * @return
	 */
	List<DeviceInfo> getDeviceBatteryInfo(final String deviceId,
			final String searchPat);

	/**
	 * 
	 * @param deviceId
	 * @return
	 */
	boolean updateDeviceBatteryInfo(final String deviceId,
			final float batteryLevel);

	/**
	 * 
	 * @param deviceId
	 * @return
	 */
	DeviceTemperatureInfo getDeviceTemperatureInfo(final String deviceId);

	/**
	 * 
	 * @param deviceId
	 * @return
	 */
	boolean updateDeviceTemperatureInfo(final String deviceId,
			final float deviceTempLevel);

}
