package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AudioDecoderInit extends StObject {
  
  /* standard dom */
  def error(error: org.scalajs.dom.DOMException): Unit
  /* standard dom */
  @JSName("error")
  var error_Original: WebCodecsErrorCallback
  
  /* standard dom */
  def output(output: AudioData): Unit
  /* standard dom */
  @JSName("output")
  var output_Original: AudioDataOutputCallback
}
object AudioDecoderInit {
  
  inline def apply(error: /* error */ org.scalajs.dom.DOMException => Unit, output: /* output */ AudioData => Unit): AudioDecoderInit = {
    val __obj = js.Dynamic.literal(error = js.Any.fromFunction1(error), output = js.Any.fromFunction1(output))
    __obj.asInstanceOf[AudioDecoderInit]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AudioDecoderInit] (val x: Self) extends AnyVal {
    
    inline def setError(value: /* error */ org.scalajs.dom.DOMException => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
    
    inline def setOutput(value: /* output */ AudioData => Unit): Self = StObject.set(x, "output", js.Any.fromFunction1(value))
  }
}
