package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageDecodeOptions extends StObject {
  
  /* standard dom */
  var completeFramesOnly: js.UndefOr[scala.Boolean] = js.undefined
  
  /* standard dom */
  var frameIndex: js.UndefOr[Double] = js.undefined
}
object ImageDecodeOptions {
  
  inline def apply(): ImageDecodeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageDecodeOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImageDecodeOptions] (val x: Self) extends AnyVal {
    
    inline def setCompleteFramesOnly(value: scala.Boolean): Self = StObject.set(x, "completeFramesOnly", value.asInstanceOf[js.Any])
    
    inline def setCompleteFramesOnlyUndefined: Self = StObject.set(x, "completeFramesOnly", js.undefined)
    
    inline def setFrameIndex(value: Double): Self = StObject.set(x, "frameIndex", value.asInstanceOf[js.Any])
    
    inline def setFrameIndexUndefined: Self = StObject.set(x, "frameIndex", js.undefined)
  }
}
