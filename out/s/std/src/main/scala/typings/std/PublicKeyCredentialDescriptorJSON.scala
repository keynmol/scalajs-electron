package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PublicKeyCredentialDescriptorJSON extends StObject {
  
  /* standard dom */
  var id: Base64URLString
  
  /* standard dom */
  var transports: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  
  /* standard dom */
  var `type`: java.lang.String
}
object PublicKeyCredentialDescriptorJSON {
  
  inline def apply(id: Base64URLString, `type`: java.lang.String): PublicKeyCredentialDescriptorJSON = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublicKeyCredentialDescriptorJSON]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PublicKeyCredentialDescriptorJSON] (val x: Self) extends AnyVal {
    
    inline def setId(value: Base64URLString): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setTransports(value: js.Array[java.lang.String]): Self = StObject.set(x, "transports", value.asInstanceOf[js.Any])
    
    inline def setTransportsUndefined: Self = StObject.set(x, "transports", js.undefined)
    
    inline def setTransportsVarargs(value: java.lang.String*): Self = StObject.set(x, "transports", js.Array(value*))
    
    inline def setType(value: java.lang.String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
