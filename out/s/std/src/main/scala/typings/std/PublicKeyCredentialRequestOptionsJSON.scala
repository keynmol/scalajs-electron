package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PublicKeyCredentialRequestOptionsJSON extends StObject {
  
  /* standard dom */
  var allowCredentials: js.UndefOr[js.Array[PublicKeyCredentialDescriptorJSON]] = js.undefined
  
  /* standard dom */
  var challenge: Base64URLString
  
  /* standard dom */
  var extensions: js.UndefOr[AuthenticationExtensionsClientInputsJSON] = js.undefined
  
  /* standard dom */
  var hints: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  
  /* standard dom */
  var rpId: js.UndefOr[java.lang.String] = js.undefined
  
  /* standard dom */
  var timeout: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var userVerification: js.UndefOr[java.lang.String] = js.undefined
}
object PublicKeyCredentialRequestOptionsJSON {
  
  inline def apply(challenge: Base64URLString): PublicKeyCredentialRequestOptionsJSON = {
    val __obj = js.Dynamic.literal(challenge = challenge.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublicKeyCredentialRequestOptionsJSON]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PublicKeyCredentialRequestOptionsJSON] (val x: Self) extends AnyVal {
    
    inline def setAllowCredentials(value: js.Array[PublicKeyCredentialDescriptorJSON]): Self = StObject.set(x, "allowCredentials", value.asInstanceOf[js.Any])
    
    inline def setAllowCredentialsUndefined: Self = StObject.set(x, "allowCredentials", js.undefined)
    
    inline def setAllowCredentialsVarargs(value: PublicKeyCredentialDescriptorJSON*): Self = StObject.set(x, "allowCredentials", js.Array(value*))
    
    inline def setChallenge(value: Base64URLString): Self = StObject.set(x, "challenge", value.asInstanceOf[js.Any])
    
    inline def setExtensions(value: AuthenticationExtensionsClientInputsJSON): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
    
    inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
    
    inline def setHints(value: js.Array[java.lang.String]): Self = StObject.set(x, "hints", value.asInstanceOf[js.Any])
    
    inline def setHintsUndefined: Self = StObject.set(x, "hints", js.undefined)
    
    inline def setHintsVarargs(value: java.lang.String*): Self = StObject.set(x, "hints", js.Array(value*))
    
    inline def setRpId(value: java.lang.String): Self = StObject.set(x, "rpId", value.asInstanceOf[js.Any])
    
    inline def setRpIdUndefined: Self = StObject.set(x, "rpId", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setUserVerification(value: java.lang.String): Self = StObject.set(x, "userVerification", value.asInstanceOf[js.Any])
    
    inline def setUserVerificationUndefined: Self = StObject.set(x, "userVerification", js.undefined)
  }
}
