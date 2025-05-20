package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HidDeviceRevokedDetails extends StObject {
  
  var device: HIDDevice
  
  /**
    * The origin that the device has been revoked from.
    */
  var origin: js.UndefOr[String] = js.undefined
}
object HidDeviceRevokedDetails {
  
  inline def apply(device: HIDDevice): HidDeviceRevokedDetails = {
    val __obj = js.Dynamic.literal(device = device.asInstanceOf[js.Any])
    __obj.asInstanceOf[HidDeviceRevokedDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HidDeviceRevokedDetails] (val x: Self) extends AnyVal {
    
    inline def setDevice(value: HIDDevice): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    inline def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
  }
}
