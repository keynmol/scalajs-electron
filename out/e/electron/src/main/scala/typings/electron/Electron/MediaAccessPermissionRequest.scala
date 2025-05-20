package typings.electron.Electron

import typings.electron.electronStrings.audio
import typings.electron.electronStrings.video
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaAccessPermissionRequest
  extends StObject
     with PermissionRequest {
  
  // Docs: https://electronjs.org/docs/api/structures/media-access-permission-request
  /**
    * The types of media access being requested - elements can be `video` or `audio`.
    */
  var mediaTypes: js.UndefOr[js.Array[video | audio]] = js.undefined
  
  /**
    * The security origin of the request.
    */
  var securityOrigin: js.UndefOr[String] = js.undefined
}
object MediaAccessPermissionRequest {
  
  inline def apply(isMainFrame: Boolean, requestingUrl: String): MediaAccessPermissionRequest = {
    val __obj = js.Dynamic.literal(isMainFrame = isMainFrame.asInstanceOf[js.Any], requestingUrl = requestingUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaAccessPermissionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MediaAccessPermissionRequest] (val x: Self) extends AnyVal {
    
    inline def setMediaTypes(value: js.Array[video | audio]): Self = StObject.set(x, "mediaTypes", value.asInstanceOf[js.Any])
    
    inline def setMediaTypesUndefined: Self = StObject.set(x, "mediaTypes", js.undefined)
    
    inline def setMediaTypesVarargs(value: (video | audio)*): Self = StObject.set(x, "mediaTypes", js.Array(value*))
    
    inline def setSecurityOrigin(value: String): Self = StObject.set(x, "securityOrigin", value.asInstanceOf[js.Any])
    
    inline def setSecurityOriginUndefined: Self = StObject.set(x, "securityOrigin", js.undefined)
  }
}
