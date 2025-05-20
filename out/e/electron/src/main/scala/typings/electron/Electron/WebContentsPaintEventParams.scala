package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebContentsPaintEventParams extends StObject {
  
  /**
    * The GPU shared texture of the frame, when
    * `webPreferences.offscreen.useSharedTexture` is `true`.
    *
    * @experimental
    */
  var texture: js.UndefOr[OffscreenSharedTexture] = js.undefined
}
object WebContentsPaintEventParams {
  
  inline def apply(): WebContentsPaintEventParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebContentsPaintEventParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WebContentsPaintEventParams] (val x: Self) extends AnyVal {
    
    inline def setTexture(value: OffscreenSharedTexture): Self = StObject.set(x, "texture", value.asInstanceOf[js.Any])
    
    inline def setTextureUndefined: Self = StObject.set(x, "texture", js.undefined)
  }
}
