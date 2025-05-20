package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VideoEncoderEncodeOptionsForAvc extends StObject {
  
  /* standard dom */
  var quantizer: js.UndefOr[Double | Null] = js.undefined
}
object VideoEncoderEncodeOptionsForAvc {
  
  inline def apply(): VideoEncoderEncodeOptionsForAvc = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoEncoderEncodeOptionsForAvc]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VideoEncoderEncodeOptionsForAvc] (val x: Self) extends AnyVal {
    
    inline def setQuantizer(value: Double): Self = StObject.set(x, "quantizer", value.asInstanceOf[js.Any])
    
    inline def setQuantizerNull: Self = StObject.set(x, "quantizer", null)
    
    inline def setQuantizerUndefined: Self = StObject.set(x, "quantizer", js.undefined)
  }
}
