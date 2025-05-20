package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SerialPortRevokedDetails extends StObject {
  
  /**
    * The frame initiating this event. May be `null` if accessed after the frame has
    * either navigated or been destroyed.
    */
  var frame: WebFrameMain_ | Null
  
  /**
    * The origin that the device has been revoked from.
    */
  var origin: String
  
  var port: SerialPort
}
object SerialPortRevokedDetails {
  
  inline def apply(origin: String, port: SerialPort): SerialPortRevokedDetails = {
    val __obj = js.Dynamic.literal(origin = origin.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], frame = null)
    __obj.asInstanceOf[SerialPortRevokedDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SerialPortRevokedDetails] (val x: Self) extends AnyVal {
    
    inline def setFrame(value: WebFrameMain_): Self = StObject.set(x, "frame", value.asInstanceOf[js.Any])
    
    inline def setFrameNull: Self = StObject.set(x, "frame", null)
    
    inline def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    inline def setPort(value: SerialPort): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
  }
}
