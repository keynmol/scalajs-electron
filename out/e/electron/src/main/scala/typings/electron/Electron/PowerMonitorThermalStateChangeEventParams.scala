package typings.electron.Electron

import typings.electron.electronStrings.critical
import typings.electron.electronStrings.fair
import typings.electron.electronStrings.nominal
import typings.electron.electronStrings.serious
import typings.electron.electronStrings.unknown_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PowerMonitorThermalStateChangeEventParams extends StObject {
  
  /**
    * The system's new thermal state. Can be `unknown`, `nominal`, `fair`, `serious`,
    * `critical`.
    */
  var state: unknown_ | nominal | fair | serious | critical
}
object PowerMonitorThermalStateChangeEventParams {
  
  inline def apply(state: unknown_ | nominal | fair | serious | critical): PowerMonitorThermalStateChangeEventParams = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[PowerMonitorThermalStateChangeEventParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PowerMonitorThermalStateChangeEventParams] (val x: Self) extends AnyVal {
    
    inline def setState(value: unknown_ | nominal | fair | serious | critical): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
