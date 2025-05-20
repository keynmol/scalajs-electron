package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpenExternalPermissionRequest
  extends StObject
     with PermissionRequest {
  
  // Docs: https://electronjs.org/docs/api/structures/open-external-permission-request
  /**
    * The url of the `openExternal` request.
    */
  var externalURL: js.UndefOr[String] = js.undefined
}
object OpenExternalPermissionRequest {
  
  inline def apply(isMainFrame: Boolean, requestingUrl: String): OpenExternalPermissionRequest = {
    val __obj = js.Dynamic.literal(isMainFrame = isMainFrame.asInstanceOf[js.Any], requestingUrl = requestingUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenExternalPermissionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OpenExternalPermissionRequest] (val x: Self) extends AnyVal {
    
    inline def setExternalURL(value: String): Self = StObject.set(x, "externalURL", value.asInstanceOf[js.Any])
    
    inline def setExternalURLUndefined: Self = StObject.set(x, "externalURL", js.undefined)
  }
}
