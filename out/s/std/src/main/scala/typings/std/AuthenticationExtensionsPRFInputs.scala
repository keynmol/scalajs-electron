package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthenticationExtensionsPRFInputs extends StObject {
  
  /* standard dom */
  var eval: js.UndefOr[AuthenticationExtensionsPRFValues] = js.undefined
  
  /* standard dom */
  var evalByCredential: js.UndefOr[Record[java.lang.String, AuthenticationExtensionsPRFValues]] = js.undefined
}
object AuthenticationExtensionsPRFInputs {
  
  inline def apply(): AuthenticationExtensionsPRFInputs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthenticationExtensionsPRFInputs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AuthenticationExtensionsPRFInputs] (val x: Self) extends AnyVal {
    
    inline def setEval(value: AuthenticationExtensionsPRFValues): Self = StObject.set(x, "eval", value.asInstanceOf[js.Any])
    
    inline def setEvalByCredential(value: Record[java.lang.String, AuthenticationExtensionsPRFValues]): Self = StObject.set(x, "evalByCredential", value.asInstanceOf[js.Any])
    
    inline def setEvalByCredentialUndefined: Self = StObject.set(x, "evalByCredential", js.undefined)
    
    inline def setEvalUndefined: Self = StObject.set(x, "eval", js.undefined)
  }
}
