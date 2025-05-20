package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UdpPortRange extends StObject {
  
  /**
    * The maximum UDP port number that WebRTC should use.
    */
  var max: Double
  
  /**
    * The minimum UDP port number that WebRTC should use.
    */
  var min: Double
}
object UdpPortRange {
  
  inline def apply(max: Double, min: Double): UdpPortRange = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
    __obj.asInstanceOf[UdpPortRange]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UdpPortRange] (val x: Self) extends AnyVal {
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
  }
}
