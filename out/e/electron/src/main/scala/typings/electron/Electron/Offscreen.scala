package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Offscreen extends StObject {
  
  /**
    * Whether to use GPU shared texture for accelerated paint event. Defaults to
    * `false`. See the offscreen rendering tutorial for more details.
    *
    * @experimental
    */
  var useSharedTexture: js.UndefOr[Boolean] = js.undefined
}
object Offscreen {
  
  inline def apply(): Offscreen = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Offscreen]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Offscreen] (val x: Self) extends AnyVal {
    
    inline def setUseSharedTexture(value: Boolean): Self = StObject.set(x, "useSharedTexture", value.asInstanceOf[js.Any])
    
    inline def setUseSharedTextureUndefined: Self = StObject.set(x, "useSharedTexture", js.undefined)
  }
}
