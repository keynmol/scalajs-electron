package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PublicKeyCredentialCreationOptionsJSON extends StObject {
  
  /* standard dom */
  var attestation: js.UndefOr[java.lang.String] = js.undefined
  
  /* standard dom */
  var authenticatorSelection: js.UndefOr[AuthenticatorSelectionCriteria] = js.undefined
  
  /* standard dom */
  var challenge: Base64URLString
  
  /* standard dom */
  var excludeCredentials: js.UndefOr[js.Array[PublicKeyCredentialDescriptorJSON]] = js.undefined
  
  /* standard dom */
  var extensions: js.UndefOr[AuthenticationExtensionsClientInputsJSON] = js.undefined
  
  /* standard dom */
  var hints: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  
  /* standard dom */
  var pubKeyCredParams: js.Array[PublicKeyCredentialParameters]
  
  /* standard dom */
  var rp: PublicKeyCredentialRpEntity
  
  /* standard dom */
  var timeout: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var user: PublicKeyCredentialUserEntityJSON
}
object PublicKeyCredentialCreationOptionsJSON {
  
  inline def apply(
    challenge: Base64URLString,
    pubKeyCredParams: js.Array[PublicKeyCredentialParameters],
    rp: PublicKeyCredentialRpEntity,
    user: PublicKeyCredentialUserEntityJSON
  ): PublicKeyCredentialCreationOptionsJSON = {
    val __obj = js.Dynamic.literal(challenge = challenge.asInstanceOf[js.Any], pubKeyCredParams = pubKeyCredParams.asInstanceOf[js.Any], rp = rp.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublicKeyCredentialCreationOptionsJSON]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PublicKeyCredentialCreationOptionsJSON] (val x: Self) extends AnyVal {
    
    inline def setAttestation(value: java.lang.String): Self = StObject.set(x, "attestation", value.asInstanceOf[js.Any])
    
    inline def setAttestationUndefined: Self = StObject.set(x, "attestation", js.undefined)
    
    inline def setAuthenticatorSelection(value: AuthenticatorSelectionCriteria): Self = StObject.set(x, "authenticatorSelection", value.asInstanceOf[js.Any])
    
    inline def setAuthenticatorSelectionUndefined: Self = StObject.set(x, "authenticatorSelection", js.undefined)
    
    inline def setChallenge(value: Base64URLString): Self = StObject.set(x, "challenge", value.asInstanceOf[js.Any])
    
    inline def setExcludeCredentials(value: js.Array[PublicKeyCredentialDescriptorJSON]): Self = StObject.set(x, "excludeCredentials", value.asInstanceOf[js.Any])
    
    inline def setExcludeCredentialsUndefined: Self = StObject.set(x, "excludeCredentials", js.undefined)
    
    inline def setExcludeCredentialsVarargs(value: PublicKeyCredentialDescriptorJSON*): Self = StObject.set(x, "excludeCredentials", js.Array(value*))
    
    inline def setExtensions(value: AuthenticationExtensionsClientInputsJSON): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
    
    inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
    
    inline def setHints(value: js.Array[java.lang.String]): Self = StObject.set(x, "hints", value.asInstanceOf[js.Any])
    
    inline def setHintsUndefined: Self = StObject.set(x, "hints", js.undefined)
    
    inline def setHintsVarargs(value: java.lang.String*): Self = StObject.set(x, "hints", js.Array(value*))
    
    inline def setPubKeyCredParams(value: js.Array[PublicKeyCredentialParameters]): Self = StObject.set(x, "pubKeyCredParams", value.asInstanceOf[js.Any])
    
    inline def setPubKeyCredParamsVarargs(value: PublicKeyCredentialParameters*): Self = StObject.set(x, "pubKeyCredParams", js.Array(value*))
    
    inline def setRp(value: PublicKeyCredentialRpEntity): Self = StObject.set(x, "rp", value.asInstanceOf[js.Any])
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setUser(value: PublicKeyCredentialUserEntityJSON): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
