package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthenticationExtensionsPRFOutputs extends StObject {
  
  /* standard dom */
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  
  /* standard dom */
  var results: js.UndefOr[AuthenticationExtensionsPRFValues] = js.undefined
}
object AuthenticationExtensionsPRFOutputs {
  
  inline def apply(): AuthenticationExtensionsPRFOutputs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthenticationExtensionsPRFOutputs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AuthenticationExtensionsPRFOutputs] (val x: Self) extends AnyVal {
    
    inline def setEnabled(value: scala.Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setResults(value: AuthenticationExtensionsPRFValues): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    inline def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
  }
}
