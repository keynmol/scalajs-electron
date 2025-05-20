package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/EncodedAudioChunk) */
trait EncodedAudioChunk extends StObject {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/EncodedAudioChunk/byteLength) */
  /* standard dom */
  val byteLength: Double
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/EncodedAudioChunk/copyTo) */
  /* standard dom */
  def copyTo(destination: AllowSharedBufferSource): Unit
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/EncodedAudioChunk/duration) */
  /* standard dom */
  val duration: Double | Null
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/EncodedAudioChunk/timestamp) */
  /* standard dom */
  val timestamp: Double
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/EncodedAudioChunk/type) */
  /* standard dom */
  val `type`: EncodedAudioChunkType
}
object EncodedAudioChunk {
  
  inline def apply(
    byteLength: Double,
    copyTo: AllowSharedBufferSource => Unit,
    timestamp: Double,
    `type`: EncodedAudioChunkType
  ): EncodedAudioChunk = {
    val __obj = js.Dynamic.literal(byteLength = byteLength.asInstanceOf[js.Any], copyTo = js.Any.fromFunction1(copyTo), timestamp = timestamp.asInstanceOf[js.Any], duration = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncodedAudioChunk]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EncodedAudioChunk] (val x: Self) extends AnyVal {
    
    inline def setByteLength(value: Double): Self = StObject.set(x, "byteLength", value.asInstanceOf[js.Any])
    
    inline def setCopyTo(value: AllowSharedBufferSource => Unit): Self = StObject.set(x, "copyTo", js.Any.fromFunction1(value))
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationNull: Self = StObject.set(x, "duration", null)
    
    inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setType(value: EncodedAudioChunkType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
