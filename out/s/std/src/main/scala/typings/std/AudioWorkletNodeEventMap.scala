package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AudioWorkletNodeEventMap extends StObject {
  
  /* standard dom */
  var processorerror: org.scalajs.dom.ErrorEvent
}
object AudioWorkletNodeEventMap {
  
  inline def apply(processorerror: org.scalajs.dom.ErrorEvent): AudioWorkletNodeEventMap = {
    val __obj = js.Dynamic.literal(processorerror = processorerror.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioWorkletNodeEventMap]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AudioWorkletNodeEventMap] (val x: Self) extends AnyVal {
    
    inline def setProcessorerror(value: org.scalajs.dom.ErrorEvent): Self = StObject.set(x, "processorerror", value.asInstanceOf[js.Any])
  }
}
