package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PowerMonitorSpeedLimitChangeEventParams extends StObject {
  
  /**
    * The operating system's advertised speed limit for CPUs, in percent.
    */
  var limit: Double
}
object PowerMonitorSpeedLimitChangeEventParams {
  
  inline def apply(limit: Double): PowerMonitorSpeedLimitChangeEventParams = {
    val __obj = js.Dynamic.literal(limit = limit.asInstanceOf[js.Any])
    __obj.asInstanceOf[PowerMonitorSpeedLimitChangeEventParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PowerMonitorSpeedLimitChangeEventParams] (val x: Self) extends AnyVal {
    
    inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
  }
}
