package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Enables retrieval and analysis of detailed network timing data regarding the loading of an application's resources. An application can use the timing metrics to determine, for example, the length of time it takes to fetch a specific resource, such as an XMLHttpRequest, <SVG>, image, or script.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceResourceTiming)
  */
trait PerformanceResourceTiming
  extends StObject
     with PerformanceEntry {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceResourceTiming/connectEnd) */
  /* standard dom */
  val connectEnd: DOMHighResTimeStamp
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceResourceTiming/connectStart) */
  /* standard dom */
  val connectStart: DOMHighResTimeStamp
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceResourceTiming/decodedBodySize) */
  /* standard dom */
  val decodedBodySize: Double
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceResourceTiming/domainLookupEnd) */
  /* standard dom */
  val domainLookupEnd: DOMHighResTimeStamp
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceResourceTiming/domainLookupStart) */
  /* standard dom */
  val domainLookupStart: DOMHighResTimeStamp
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceResourceTiming/encodedBodySize) */
  /* standard dom */
  val encodedBodySize: Double
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceResourceTiming/fetchStart) */
  /* standard dom */
  val fetchStart: DOMHighResTimeStamp
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceResourceTiming/initiatorType) */
  /* standard dom */
  val initiatorType: java.lang.String
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceResourceTiming/nextHopProtocol) */
  /* standard dom */
  val nextHopProtocol: java.lang.String
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceResourceTiming/redirectEnd) */
  /* standard dom */
  val redirectEnd: DOMHighResTimeStamp
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceResourceTiming/redirectStart) */
  /* standard dom */
  val redirectStart: DOMHighResTimeStamp
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceResourceTiming/requestStart) */
  /* standard dom */
  val requestStart: DOMHighResTimeStamp
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceResourceTiming/responseEnd) */
  /* standard dom */
  val responseEnd: DOMHighResTimeStamp
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceResourceTiming/responseStart) */
  /* standard dom */
  val responseStart: DOMHighResTimeStamp
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceResourceTiming/responseStatus) */
  /* standard dom */
  val responseStatus: Double
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceResourceTiming/secureConnectionStart) */
  /* standard dom */
  val secureConnectionStart: DOMHighResTimeStamp
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceResourceTiming/serverTiming) */
  /* standard dom */
  val serverTiming: js.Array[PerformanceServerTiming]
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceResourceTiming/transferSize) */
  /* standard dom */
  val transferSize: Double
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PerformanceResourceTiming/workerStart) */
  /* standard dom */
  val workerStart: DOMHighResTimeStamp
}
object PerformanceResourceTiming {
  
  inline def apply(
    connectEnd: DOMHighResTimeStamp,
    connectStart: DOMHighResTimeStamp,
    decodedBodySize: Double,
    domainLookupEnd: DOMHighResTimeStamp,
    domainLookupStart: DOMHighResTimeStamp,
    duration: DOMHighResTimeStamp,
    encodedBodySize: Double,
    entryType: java.lang.String,
    fetchStart: DOMHighResTimeStamp,
    initiatorType: java.lang.String,
    name: java.lang.String,
    nextHopProtocol: java.lang.String,
    redirectEnd: DOMHighResTimeStamp,
    redirectStart: DOMHighResTimeStamp,
    requestStart: DOMHighResTimeStamp,
    responseEnd: DOMHighResTimeStamp,
    responseStart: DOMHighResTimeStamp,
    responseStatus: Double,
    secureConnectionStart: DOMHighResTimeStamp,
    serverTiming: js.Array[PerformanceServerTiming],
    startTime: DOMHighResTimeStamp,
    toJSON: () => Any,
    transferSize: Double,
    workerStart: DOMHighResTimeStamp
  ): PerformanceResourceTiming = {
    val __obj = js.Dynamic.literal(connectEnd = connectEnd.asInstanceOf[js.Any], connectStart = connectStart.asInstanceOf[js.Any], decodedBodySize = decodedBodySize.asInstanceOf[js.Any], domainLookupEnd = domainLookupEnd.asInstanceOf[js.Any], domainLookupStart = domainLookupStart.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], encodedBodySize = encodedBodySize.asInstanceOf[js.Any], entryType = entryType.asInstanceOf[js.Any], fetchStart = fetchStart.asInstanceOf[js.Any], initiatorType = initiatorType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nextHopProtocol = nextHopProtocol.asInstanceOf[js.Any], redirectEnd = redirectEnd.asInstanceOf[js.Any], redirectStart = redirectStart.asInstanceOf[js.Any], requestStart = requestStart.asInstanceOf[js.Any], responseEnd = responseEnd.asInstanceOf[js.Any], responseStart = responseStart.asInstanceOf[js.Any], responseStatus = responseStatus.asInstanceOf[js.Any], secureConnectionStart = secureConnectionStart.asInstanceOf[js.Any], serverTiming = serverTiming.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), transferSize = transferSize.asInstanceOf[js.Any], workerStart = workerStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[PerformanceResourceTiming]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PerformanceResourceTiming] (val x: Self) extends AnyVal {
    
    inline def setConnectEnd(value: DOMHighResTimeStamp): Self = StObject.set(x, "connectEnd", value.asInstanceOf[js.Any])
    
    inline def setConnectStart(value: DOMHighResTimeStamp): Self = StObject.set(x, "connectStart", value.asInstanceOf[js.Any])
    
    inline def setDecodedBodySize(value: Double): Self = StObject.set(x, "decodedBodySize", value.asInstanceOf[js.Any])
    
    inline def setDomainLookupEnd(value: DOMHighResTimeStamp): Self = StObject.set(x, "domainLookupEnd", value.asInstanceOf[js.Any])
    
    inline def setDomainLookupStart(value: DOMHighResTimeStamp): Self = StObject.set(x, "domainLookupStart", value.asInstanceOf[js.Any])
    
    inline def setEncodedBodySize(value: Double): Self = StObject.set(x, "encodedBodySize", value.asInstanceOf[js.Any])
    
    inline def setFetchStart(value: DOMHighResTimeStamp): Self = StObject.set(x, "fetchStart", value.asInstanceOf[js.Any])
    
    inline def setInitiatorType(value: java.lang.String): Self = StObject.set(x, "initiatorType", value.asInstanceOf[js.Any])
    
    inline def setNextHopProtocol(value: java.lang.String): Self = StObject.set(x, "nextHopProtocol", value.asInstanceOf[js.Any])
    
    inline def setRedirectEnd(value: DOMHighResTimeStamp): Self = StObject.set(x, "redirectEnd", value.asInstanceOf[js.Any])
    
    inline def setRedirectStart(value: DOMHighResTimeStamp): Self = StObject.set(x, "redirectStart", value.asInstanceOf[js.Any])
    
    inline def setRequestStart(value: DOMHighResTimeStamp): Self = StObject.set(x, "requestStart", value.asInstanceOf[js.Any])
    
    inline def setResponseEnd(value: DOMHighResTimeStamp): Self = StObject.set(x, "responseEnd", value.asInstanceOf[js.Any])
    
    inline def setResponseStart(value: DOMHighResTimeStamp): Self = StObject.set(x, "responseStart", value.asInstanceOf[js.Any])
    
    inline def setResponseStatus(value: Double): Self = StObject.set(x, "responseStatus", value.asInstanceOf[js.Any])
    
    inline def setSecureConnectionStart(value: DOMHighResTimeStamp): Self = StObject.set(x, "secureConnectionStart", value.asInstanceOf[js.Any])
    
    inline def setServerTiming(value: js.Array[PerformanceServerTiming]): Self = StObject.set(x, "serverTiming", value.asInstanceOf[js.Any])
    
    inline def setServerTimingVarargs(value: PerformanceServerTiming*): Self = StObject.set(x, "serverTiming", js.Array(value*))
    
    inline def setTransferSize(value: Double): Self = StObject.set(x, "transferSize", value.asInstanceOf[js.Any])
    
    inline def setWorkerStart(value: DOMHighResTimeStamp): Self = StObject.set(x, "workerStart", value.asInstanceOf[js.Any])
  }
}
