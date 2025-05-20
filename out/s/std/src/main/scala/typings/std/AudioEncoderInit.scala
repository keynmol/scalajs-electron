package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AudioEncoderInit extends StObject {
  
  /* standard dom */
  def error(error: org.scalajs.dom.DOMException): Unit
  /* standard dom */
  @JSName("error")
  var error_Original: WebCodecsErrorCallback
  
  /* standard dom */
  def output(output: EncodedAudioChunk): Unit
  def output(output: EncodedAudioChunk, metadata: EncodedAudioChunkMetadata): Unit
  /* standard dom */
  @JSName("output")
  var output_Original: EncodedAudioChunkOutputCallback
}
object AudioEncoderInit {
  
  inline def apply(
    error: /* error */ org.scalajs.dom.DOMException => Unit,
    output: (/* output */ EncodedAudioChunk, /* metadata */ js.UndefOr[EncodedAudioChunkMetadata]) => Unit
  ): AudioEncoderInit = {
    val __obj = js.Dynamic.literal(error = js.Any.fromFunction1(error), output = js.Any.fromFunction2(output))
    __obj.asInstanceOf[AudioEncoderInit]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AudioEncoderInit] (val x: Self) extends AnyVal {
    
    inline def setError(value: /* error */ org.scalajs.dom.DOMException => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
    
    inline def setOutput(
      value: (/* output */ EncodedAudioChunk, /* metadata */ js.UndefOr[EncodedAudioChunkMetadata]) => Unit
    ): Self = StObject.set(x, "output", js.Any.fromFunction2(value))
  }
}
