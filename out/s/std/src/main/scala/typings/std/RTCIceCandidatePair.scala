package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RTCIceCandidatePair extends StObject {
  
  /* standard dom */
  var local: org.scalajs.dom.RTCIceCandidate
  
  /* standard dom */
  var remote: org.scalajs.dom.RTCIceCandidate
}
object RTCIceCandidatePair {
  
  inline def apply(local: org.scalajs.dom.RTCIceCandidate, remote: org.scalajs.dom.RTCIceCandidate): RTCIceCandidatePair = {
    val __obj = js.Dynamic.literal(local = local.asInstanceOf[js.Any], remote = remote.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCIceCandidatePair]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RTCIceCandidatePair] (val x: Self) extends AnyVal {
    
    inline def setLocal(value: org.scalajs.dom.RTCIceCandidate): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
    
    inline def setRemote(value: org.scalajs.dom.RTCIceCandidate): Self = StObject.set(x, "remote", value.asInstanceOf[js.Any])
  }
}
