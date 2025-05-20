package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AudioDecoderEventMap extends StObject {
  
  /* standard dom */
  var dequeue: org.scalajs.dom.Event
}
object AudioDecoderEventMap {
  
  inline def apply(dequeue: org.scalajs.dom.Event): AudioDecoderEventMap = {
    val __obj = js.Dynamic.literal(dequeue = dequeue.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioDecoderEventMap]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AudioDecoderEventMap] (val x: Self) extends AnyVal {
    
    inline def setDequeue(value: org.scalajs.dom.Event): Self = StObject.set(x, "dequeue", value.asInstanceOf[js.Any])
  }
}
