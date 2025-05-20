package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/LargestContentfulPaint) */
trait LargestContentfulPaint
  extends StObject
     with PerformanceEntry {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/LargestContentfulPaint/element) */
  /* standard dom */
  val element: org.scalajs.dom.Element | Null
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/LargestContentfulPaint/id) */
  /* standard dom */
  val id: java.lang.String
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/LargestContentfulPaint/loadTime) */
  /* standard dom */
  val loadTime: DOMHighResTimeStamp
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/LargestContentfulPaint/renderTime) */
  /* standard dom */
  val renderTime: DOMHighResTimeStamp
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/LargestContentfulPaint/size) */
  /* standard dom */
  val size: Double
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/LargestContentfulPaint/url) */
  /* standard dom */
  val url: java.lang.String
}
object LargestContentfulPaint {
  
  inline def apply(
    duration: DOMHighResTimeStamp,
    entryType: java.lang.String,
    id: java.lang.String,
    loadTime: DOMHighResTimeStamp,
    name: java.lang.String,
    renderTime: DOMHighResTimeStamp,
    size: Double,
    startTime: DOMHighResTimeStamp,
    toJSON: () => Any,
    url: java.lang.String
  ): LargestContentfulPaint = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], entryType = entryType.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], loadTime = loadTime.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], renderTime = renderTime.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), url = url.asInstanceOf[js.Any], element = null)
    __obj.asInstanceOf[LargestContentfulPaint]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LargestContentfulPaint] (val x: Self) extends AnyVal {
    
    inline def setElement(value: org.scalajs.dom.Element): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setElementNull: Self = StObject.set(x, "element", null)
    
    inline def setId(value: java.lang.String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLoadTime(value: DOMHighResTimeStamp): Self = StObject.set(x, "loadTime", value.asInstanceOf[js.Any])
    
    inline def setRenderTime(value: DOMHighResTimeStamp): Self = StObject.set(x, "renderTime", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: java.lang.String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
