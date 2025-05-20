package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RTCTransportStats
  extends StObject
     with RTCStats {
  
  /* standard dom */
  var bytesReceived: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var bytesSent: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var dtlsCipher: js.UndefOr[java.lang.String] = js.undefined
  
  /* standard dom */
  var dtlsRole: js.UndefOr[RTCDtlsRole] = js.undefined
  
  /* standard dom */
  var dtlsState: RTCDtlsTransportState
  
  /* standard dom */
  var iceLocalUsernameFragment: js.UndefOr[java.lang.String] = js.undefined
  
  /* standard dom */
  var iceRole: js.UndefOr[RTCIceRole] = js.undefined
  
  /* standard dom */
  var iceState: js.UndefOr[RTCIceTransportState] = js.undefined
  
  /* standard dom */
  var localCertificateId: js.UndefOr[java.lang.String] = js.undefined
  
  /* standard dom */
  var packetsReceived: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var packetsSent: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var remoteCertificateId: js.UndefOr[java.lang.String] = js.undefined
  
  /* standard dom */
  var selectedCandidatePairChanges: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var selectedCandidatePairId: js.UndefOr[java.lang.String] = js.undefined
  
  /* standard dom */
  var srtpCipher: js.UndefOr[java.lang.String] = js.undefined
  
  /* standard dom */
  var tlsVersion: js.UndefOr[java.lang.String] = js.undefined
}
object RTCTransportStats {
  
  inline def apply(
    dtlsState: RTCDtlsTransportState,
    id: java.lang.String,
    timestamp: DOMHighResTimeStamp,
    `type`: org.scalajs.dom.RTCStatsType
  ): RTCTransportStats = {
    val __obj = js.Dynamic.literal(dtlsState = dtlsState.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCTransportStats]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RTCTransportStats] (val x: Self) extends AnyVal {
    
    inline def setBytesReceived(value: Double): Self = StObject.set(x, "bytesReceived", value.asInstanceOf[js.Any])
    
    inline def setBytesReceivedUndefined: Self = StObject.set(x, "bytesReceived", js.undefined)
    
    inline def setBytesSent(value: Double): Self = StObject.set(x, "bytesSent", value.asInstanceOf[js.Any])
    
    inline def setBytesSentUndefined: Self = StObject.set(x, "bytesSent", js.undefined)
    
    inline def setDtlsCipher(value: java.lang.String): Self = StObject.set(x, "dtlsCipher", value.asInstanceOf[js.Any])
    
    inline def setDtlsCipherUndefined: Self = StObject.set(x, "dtlsCipher", js.undefined)
    
    inline def setDtlsRole(value: RTCDtlsRole): Self = StObject.set(x, "dtlsRole", value.asInstanceOf[js.Any])
    
    inline def setDtlsRoleUndefined: Self = StObject.set(x, "dtlsRole", js.undefined)
    
    inline def setDtlsState(value: RTCDtlsTransportState): Self = StObject.set(x, "dtlsState", value.asInstanceOf[js.Any])
    
    inline def setIceLocalUsernameFragment(value: java.lang.String): Self = StObject.set(x, "iceLocalUsernameFragment", value.asInstanceOf[js.Any])
    
    inline def setIceLocalUsernameFragmentUndefined: Self = StObject.set(x, "iceLocalUsernameFragment", js.undefined)
    
    inline def setIceRole(value: RTCIceRole): Self = StObject.set(x, "iceRole", value.asInstanceOf[js.Any])
    
    inline def setIceRoleUndefined: Self = StObject.set(x, "iceRole", js.undefined)
    
    inline def setIceState(value: RTCIceTransportState): Self = StObject.set(x, "iceState", value.asInstanceOf[js.Any])
    
    inline def setIceStateUndefined: Self = StObject.set(x, "iceState", js.undefined)
    
    inline def setLocalCertificateId(value: java.lang.String): Self = StObject.set(x, "localCertificateId", value.asInstanceOf[js.Any])
    
    inline def setLocalCertificateIdUndefined: Self = StObject.set(x, "localCertificateId", js.undefined)
    
    inline def setPacketsReceived(value: Double): Self = StObject.set(x, "packetsReceived", value.asInstanceOf[js.Any])
    
    inline def setPacketsReceivedUndefined: Self = StObject.set(x, "packetsReceived", js.undefined)
    
    inline def setPacketsSent(value: Double): Self = StObject.set(x, "packetsSent", value.asInstanceOf[js.Any])
    
    inline def setPacketsSentUndefined: Self = StObject.set(x, "packetsSent", js.undefined)
    
    inline def setRemoteCertificateId(value: java.lang.String): Self = StObject.set(x, "remoteCertificateId", value.asInstanceOf[js.Any])
    
    inline def setRemoteCertificateIdUndefined: Self = StObject.set(x, "remoteCertificateId", js.undefined)
    
    inline def setSelectedCandidatePairChanges(value: Double): Self = StObject.set(x, "selectedCandidatePairChanges", value.asInstanceOf[js.Any])
    
    inline def setSelectedCandidatePairChangesUndefined: Self = StObject.set(x, "selectedCandidatePairChanges", js.undefined)
    
    inline def setSelectedCandidatePairId(value: java.lang.String): Self = StObject.set(x, "selectedCandidatePairId", value.asInstanceOf[js.Any])
    
    inline def setSelectedCandidatePairIdUndefined: Self = StObject.set(x, "selectedCandidatePairId", js.undefined)
    
    inline def setSrtpCipher(value: java.lang.String): Self = StObject.set(x, "srtpCipher", value.asInstanceOf[js.Any])
    
    inline def setSrtpCipherUndefined: Self = StObject.set(x, "srtpCipher", js.undefined)
    
    inline def setTlsVersion(value: java.lang.String): Self = StObject.set(x, "tlsVersion", value.asInstanceOf[js.Any])
    
    inline def setTlsVersionUndefined: Self = StObject.set(x, "tlsVersion", js.undefined)
  }
}
