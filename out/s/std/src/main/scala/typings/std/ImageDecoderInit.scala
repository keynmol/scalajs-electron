package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageDecoderInit extends StObject {
  
  /* standard dom */
  var colorSpaceConversion: js.UndefOr[ColorSpaceConversion] = js.undefined
  
  /* standard dom */
  var data: ImageBufferSource
  
  /* standard dom */
  var desiredHeight: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var desiredWidth: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var preferAnimation: js.UndefOr[scala.Boolean] = js.undefined
  
  /* standard dom */
  var transfer: js.UndefOr[js.Array[js.typedarray.ArrayBuffer]] = js.undefined
  
  /* standard dom */
  var `type`: java.lang.String
}
object ImageDecoderInit {
  
  inline def apply(data: ImageBufferSource, `type`: java.lang.String): ImageDecoderInit = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageDecoderInit]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImageDecoderInit] (val x: Self) extends AnyVal {
    
    inline def setColorSpaceConversion(value: ColorSpaceConversion): Self = StObject.set(x, "colorSpaceConversion", value.asInstanceOf[js.Any])
    
    inline def setColorSpaceConversionUndefined: Self = StObject.set(x, "colorSpaceConversion", js.undefined)
    
    inline def setData(value: ImageBufferSource): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDesiredHeight(value: Double): Self = StObject.set(x, "desiredHeight", value.asInstanceOf[js.Any])
    
    inline def setDesiredHeightUndefined: Self = StObject.set(x, "desiredHeight", js.undefined)
    
    inline def setDesiredWidth(value: Double): Self = StObject.set(x, "desiredWidth", value.asInstanceOf[js.Any])
    
    inline def setDesiredWidthUndefined: Self = StObject.set(x, "desiredWidth", js.undefined)
    
    inline def setPreferAnimation(value: scala.Boolean): Self = StObject.set(x, "preferAnimation", value.asInstanceOf[js.Any])
    
    inline def setPreferAnimationUndefined: Self = StObject.set(x, "preferAnimation", js.undefined)
    
    inline def setTransfer(value: js.Array[js.typedarray.ArrayBuffer]): Self = StObject.set(x, "transfer", value.asInstanceOf[js.Any])
    
    inline def setTransferUndefined: Self = StObject.set(x, "transfer", js.undefined)
    
    inline def setTransferVarargs(value: js.typedarray.ArrayBuffer*): Self = StObject.set(x, "transfer", js.Array(value*))
    
    inline def setType(value: java.lang.String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
