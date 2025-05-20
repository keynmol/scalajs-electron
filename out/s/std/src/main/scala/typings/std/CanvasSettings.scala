package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CanvasSettings extends StObject {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasRenderingContext2D/getContextAttributes) */
  /* standard dom */
  def getContextAttributes(): CanvasRenderingContext2DSettings
}
object CanvasSettings {
  
  inline def apply(getContextAttributes: () => CanvasRenderingContext2DSettings): CanvasSettings = {
    val __obj = js.Dynamic.literal(getContextAttributes = js.Any.fromFunction0(getContextAttributes))
    __obj.asInstanceOf[CanvasSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CanvasSettings] (val x: Self) extends AnyVal {
    
    inline def setGetContextAttributes(value: () => CanvasRenderingContext2DSettings): Self = StObject.set(x, "getContextAttributes", js.Any.fromFunction0(value))
  }
}
