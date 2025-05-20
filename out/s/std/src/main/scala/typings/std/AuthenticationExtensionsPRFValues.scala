package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthenticationExtensionsPRFValues extends StObject {
  
  /* standard dom */
  var first: BufferSource
  
  /* standard dom */
  var second: js.UndefOr[BufferSource] = js.undefined
}
object AuthenticationExtensionsPRFValues {
  
  inline def apply(first: BufferSource): AuthenticationExtensionsPRFValues = {
    val __obj = js.Dynamic.literal(first = first.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthenticationExtensionsPRFValues]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AuthenticationExtensionsPRFValues] (val x: Self) extends AnyVal {
    
    inline def setFirst(value: BufferSource): Self = StObject.set(x, "first", value.asInstanceOf[js.Any])
    
    inline def setSecond(value: BufferSource): Self = StObject.set(x, "second", value.asInstanceOf[js.Any])
    
    inline def setSecondUndefined: Self = StObject.set(x, "second", js.undefined)
  }
}
