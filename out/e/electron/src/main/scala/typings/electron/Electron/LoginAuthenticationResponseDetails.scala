package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoginAuthenticationResponseDetails extends StObject {
  
  var url: String
}
object LoginAuthenticationResponseDetails {
  
  inline def apply(url: String): LoginAuthenticationResponseDetails = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoginAuthenticationResponseDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LoginAuthenticationResponseDetails] (val x: Self) extends AnyVal {
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
