package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthenticationResponseDetails extends StObject {
  
  var pid: Double
  
  var url: String
}
object AuthenticationResponseDetails {
  
  inline def apply(pid: Double, url: String): AuthenticationResponseDetails = {
    val __obj = js.Dynamic.literal(pid = pid.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthenticationResponseDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AuthenticationResponseDetails] (val x: Self) extends AnyVal {
    
    inline def setPid(value: Double): Self = StObject.set(x, "pid", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
