package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PublicKeyCredentialUserEntityJSON extends StObject {
  
  /* standard dom */
  var displayName: java.lang.String
  
  /* standard dom */
  var id: Base64URLString
  
  /* standard dom */
  var name: java.lang.String
}
object PublicKeyCredentialUserEntityJSON {
  
  inline def apply(displayName: java.lang.String, id: Base64URLString, name: java.lang.String): PublicKeyCredentialUserEntityJSON = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublicKeyCredentialUserEntityJSON]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PublicKeyCredentialUserEntityJSON] (val x: Self) extends AnyVal {
    
    inline def setDisplayName(value: java.lang.String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setId(value: Base64URLString): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: java.lang.String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
