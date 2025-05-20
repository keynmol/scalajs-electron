package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HidDeviceAddedDetails extends StObject {
  
  var device: HIDDevice
  
  /**
    * The frame initiating this event. May be `null` if accessed after the frame has
    * either navigated or been destroyed.
    */
  var frame: WebFrameMain_ | Null
}
object HidDeviceAddedDetails {
  
  inline def apply(device: HIDDevice): HidDeviceAddedDetails = {
    val __obj = js.Dynamic.literal(device = device.asInstanceOf[js.Any], frame = null)
    __obj.asInstanceOf[HidDeviceAddedDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HidDeviceAddedDetails] (val x: Self) extends AnyVal {
    
    inline def setDevice(value: HIDDevice): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    inline def setFrame(value: WebFrameMain_): Self = StObject.set(x, "frame", value.asInstanceOf[js.Any])
    
    inline def setFrameNull: Self = StObject.set(x, "frame", null)
  }
}
