package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientCertRequestParams extends StObject {
  
  /**
    * the hostname of the site requiring a client certificate
    */
  var hostname: String
  
  /**
    * whether there have been previous failed attempts at prompting the password
    */
  var isRetry: Boolean
  
  /**
    * the token (or slot) name of the cryptographic device
    */
  var tokenName: String
}
object ClientCertRequestParams {
  
  inline def apply(hostname: String, isRetry: Boolean, tokenName: String): ClientCertRequestParams = {
    val __obj = js.Dynamic.literal(hostname = hostname.asInstanceOf[js.Any], isRetry = isRetry.asInstanceOf[js.Any], tokenName = tokenName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientCertRequestParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClientCertRequestParams] (val x: Self) extends AnyVal {
    
    inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
    
    inline def setIsRetry(value: Boolean): Self = StObject.set(x, "isRetry", value.asInstanceOf[js.Any])
    
    inline def setTokenName(value: String): Self = StObject.set(x, "tokenName", value.asInstanceOf[js.Any])
  }
}
