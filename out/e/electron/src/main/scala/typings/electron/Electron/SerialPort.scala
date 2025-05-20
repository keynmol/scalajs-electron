package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SerialPort extends StObject {
  
  // Docs: https://electronjs.org/docs/api/structures/serial-port
  /**
    * A stable identifier on Windows that can be used for device permissions.
    *
    * @platform win32
    */
  var deviceInstanceId: js.UndefOr[String] = js.undefined
  
  /**
    * A string suitable for display to the user for describing this device.
    */
  var displayName: js.UndefOr[String] = js.undefined
  
  /**
    * Unique identifier for the port.
    */
  var portId: String
  
  /**
    * Name of the port.
    */
  var portName: String
  
  /**
    * The USB product ID.
    */
  var productId: js.UndefOr[String] = js.undefined
  
  /**
    * The USB device serial number.
    */
  var serialNumber: js.UndefOr[String] = js.undefined
  
  /**
    * Represents a single serial port on macOS can be enumerated by multiple drivers.
    *
    * @platform darwin
    */
  var usbDriverName: js.UndefOr[String] = js.undefined
  
  /**
    * The USB vendor ID.
    */
  var vendorId: js.UndefOr[String] = js.undefined
}
object SerialPort {
  
  inline def apply(portId: String, portName: String): SerialPort = {
    val __obj = js.Dynamic.literal(portId = portId.asInstanceOf[js.Any], portName = portName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SerialPort]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SerialPort] (val x: Self) extends AnyVal {
    
    inline def setDeviceInstanceId(value: String): Self = StObject.set(x, "deviceInstanceId", value.asInstanceOf[js.Any])
    
    inline def setDeviceInstanceIdUndefined: Self = StObject.set(x, "deviceInstanceId", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setPortId(value: String): Self = StObject.set(x, "portId", value.asInstanceOf[js.Any])
    
    inline def setPortName(value: String): Self = StObject.set(x, "portName", value.asInstanceOf[js.Any])
    
    inline def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
    
    inline def setProductIdUndefined: Self = StObject.set(x, "productId", js.undefined)
    
    inline def setSerialNumber(value: String): Self = StObject.set(x, "serialNumber", value.asInstanceOf[js.Any])
    
    inline def setSerialNumberUndefined: Self = StObject.set(x, "serialNumber", js.undefined)
    
    inline def setUsbDriverName(value: String): Self = StObject.set(x, "usbDriverName", value.asInstanceOf[js.Any])
    
    inline def setUsbDriverNameUndefined: Self = StObject.set(x, "usbDriverName", js.undefined)
    
    inline def setVendorId(value: String): Self = StObject.set(x, "vendorId", value.asInstanceOf[js.Any])
    
    inline def setVendorIdUndefined: Self = StObject.set(x, "vendorId", js.undefined)
  }
}
