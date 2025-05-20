package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceWorkerInfo extends StObject {
  
  // Docs: https://electronjs.org/docs/api/structures/service-worker-info
  /**
    * The virtual ID of the process that this service worker is running in.  This is
    * not an OS level PID.  This aligns with the ID set used for
    * `webContents.getProcessId()`.
    */
  var renderProcessId: Double
  
  /**
    * The base URL that this service worker is active for.
    */
  var scope: String
  
  /**
    * The full URL to the script that this service worker runs
    */
  var scriptUrl: String
  
  /**
    * ID of the service worker version
    */
  var versionId: Double
}
object ServiceWorkerInfo {
  
  inline def apply(renderProcessId: Double, scope: String, scriptUrl: String, versionId: Double): ServiceWorkerInfo = {
    val __obj = js.Dynamic.literal(renderProcessId = renderProcessId.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any], scriptUrl = scriptUrl.asInstanceOf[js.Any], versionId = versionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceWorkerInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ServiceWorkerInfo] (val x: Self) extends AnyVal {
    
    inline def setRenderProcessId(value: Double): Self = StObject.set(x, "renderProcessId", value.asInstanceOf[js.Any])
    
    inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScriptUrl(value: String): Self = StObject.set(x, "scriptUrl", value.asInstanceOf[js.Any])
    
    inline def setVersionId(value: Double): Self = StObject.set(x, "versionId", value.asInstanceOf[js.Any])
  }
}
