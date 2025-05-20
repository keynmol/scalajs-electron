package typings.electron.Electron

import typings.electron.electronStrings.running
import typings.electron.electronStrings.starting
import typings.electron.electronStrings.stopped
import typings.electron.electronStrings.stopping
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceWorkersRunningStatusChangedEventParams extends StObject {
  
  /**
    * Running status. Possible values include `starting`, `running`, `stopping`, or
    * `stopped`.
    */
  var runningStatus: starting | running | stopping | stopped
  
  /**
    * ID of the updated service worker version
    */
  var versionId: Double
}
object ServiceWorkersRunningStatusChangedEventParams {
  
  inline def apply(runningStatus: starting | running | stopping | stopped, versionId: Double): ServiceWorkersRunningStatusChangedEventParams = {
    val __obj = js.Dynamic.literal(runningStatus = runningStatus.asInstanceOf[js.Any], versionId = versionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceWorkersRunningStatusChangedEventParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ServiceWorkersRunningStatusChangedEventParams] (val x: Self) extends AnyVal {
    
    inline def setRunningStatus(value: starting | running | stopping | stopped): Self = StObject.set(x, "runningStatus", value.asInstanceOf[js.Any])
    
    inline def setVersionId(value: Double): Self = StObject.set(x, "versionId", value.asInstanceOf[js.Any])
  }
}
