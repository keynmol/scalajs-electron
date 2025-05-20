package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EncodedAudioChunkInit extends StObject {
  
  /* standard dom */
  var data: AllowSharedBufferSource
  
  /* standard dom */
  var duration: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var timestamp: Double
  
  /* standard dom */
  var transfer: js.UndefOr[js.Array[js.typedarray.ArrayBuffer]] = js.undefined
  
  /* standard dom */
  var `type`: EncodedAudioChunkType
}
object EncodedAudioChunkInit {
  
  inline def apply(data: AllowSharedBufferSource, timestamp: Double, `type`: EncodedAudioChunkType): EncodedAudioChunkInit = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncodedAudioChunkInit]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EncodedAudioChunkInit] (val x: Self) extends AnyVal {
    
    inline def setData(value: AllowSharedBufferSource): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setTransfer(value: js.Array[js.typedarray.ArrayBuffer]): Self = StObject.set(x, "transfer", value.asInstanceOf[js.Any])
    
    inline def setTransferUndefined: Self = StObject.set(x, "transfer", js.undefined)
    
    inline def setTransferVarargs(value: js.typedarray.ArrayBuffer*): Self = StObject.set(x, "transfer", js.Array(value*))
    
    inline def setType(value: EncodedAudioChunkType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
