package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PermissionRequest extends StObject {
  
  // Docs: https://electronjs.org/docs/api/structures/permission-request
  /**
    * Whether the frame making the request is the main frame.
    */
  var isMainFrame: Boolean
  
  /**
    * The last URL the requesting frame loaded.
    */
  var requestingUrl: String
}
object PermissionRequest {
  
  inline def apply(isMainFrame: Boolean, requestingUrl: String): PermissionRequest = {
    val __obj = js.Dynamic.literal(isMainFrame = isMainFrame.asInstanceOf[js.Any], requestingUrl = requestingUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[PermissionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PermissionRequest] (val x: Self) extends AnyVal {
    
    inline def setIsMainFrame(value: Boolean): Self = StObject.set(x, "isMainFrame", value.asInstanceOf[js.Any])
    
    inline def setRequestingUrl(value: String): Self = StObject.set(x, "requestingUrl", value.asInstanceOf[js.Any])
  }
}
