package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Available only in secure contexts.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUError)
  */
trait GPUError extends StObject {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/GPUError/message) */
  /* standard dom */
  val message: java.lang.String
}
object GPUError {
  
  inline def apply(message: java.lang.String): GPUError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[GPUError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GPUError] (val x: Self) extends AnyVal {
    
    inline def setMessage(value: java.lang.String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
