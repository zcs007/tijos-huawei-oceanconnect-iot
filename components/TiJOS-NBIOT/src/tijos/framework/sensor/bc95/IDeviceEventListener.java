package tijos.framework.sensor.bc95;

public interface IDeviceEventListener {

	/**
	 * Data arrived from the CDP server
	 */
	void onCoapDataArrived(byte []message);
	
	void onUDPDataArrived(byte [] packet);
	
	
}
