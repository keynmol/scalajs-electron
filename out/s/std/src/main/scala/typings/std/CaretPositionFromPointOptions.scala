package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CaretPositionFromPointOptions extends StObject {
  
  /* standard dom */
  var shadowRoots: js.UndefOr[js.Array[ShadowRoot]] = js.undefined
}
object CaretPositionFromPointOptions {
  
  inline def apply(): CaretPositionFromPointOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CaretPositionFromPointOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CaretPositionFromPointOptions] (val x: Self) extends AnyVal {
    
    inline def setShadowRoots(value: js.Array[ShadowRoot]): Self = StObject.set(x, "shadowRoots", value.asInstanceOf[js.Any])
    
    inline def setShadowRootsUndefined: Self = StObject.set(x, "shadowRoots", js.undefined)
    
    inline def setShadowRootsVarargs(value: ShadowRoot*): Self = StObject.set(x, "shadowRoots", js.Array(value*))
  }
}
