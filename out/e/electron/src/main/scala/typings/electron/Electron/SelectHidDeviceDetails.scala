package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelectHidDeviceDetails extends StObject {
  
  var deviceList: js.Array[HIDDevice]
  
  /**
    * The frame initiating this event. May be `null` if accessed after the frame has
    * either navigated or been destroyed.
    */
  var frame: WebFrameMain_ | Null
}
object SelectHidDeviceDetails {
  
  inline def apply(deviceList: js.Array[HIDDevice]): SelectHidDeviceDetails = {
    val __obj = js.Dynamic.literal(deviceList = deviceList.asInstanceOf[js.Any], frame = null)
    __obj.asInstanceOf[SelectHidDeviceDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SelectHidDeviceDetails] (val x: Self) extends AnyVal {
    
    inline def setDeviceList(value: js.Array[HIDDevice]): Self = StObject.set(x, "deviceList", value.asInstanceOf[js.Any])
    
    inline def setDeviceListVarargs(value: HIDDevice*): Self = StObject.set(x, "deviceList", js.Array(value*))
    
    inline def setFrame(value: WebFrameMain_): Self = StObject.set(x, "frame", value.asInstanceOf[js.Any])
    
    inline def setFrameNull: Self = StObject.set(x, "frame", null)
  }
}
