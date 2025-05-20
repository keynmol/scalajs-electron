package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpusEncoderConfig extends StObject {
  
  /* standard dom */
  var complexity: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var format: js.UndefOr[OpusBitstreamFormat] = js.undefined
  
  /* standard dom */
  var frameDuration: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var packetlossperc: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var usedtx: js.UndefOr[scala.Boolean] = js.undefined
  
  /* standard dom */
  var useinbandfec: js.UndefOr[scala.Boolean] = js.undefined
}
object OpusEncoderConfig {
  
  inline def apply(): OpusEncoderConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpusEncoderConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OpusEncoderConfig] (val x: Self) extends AnyVal {
    
    inline def setComplexity(value: Double): Self = StObject.set(x, "complexity", value.asInstanceOf[js.Any])
    
    inline def setComplexityUndefined: Self = StObject.set(x, "complexity", js.undefined)
    
    inline def setFormat(value: OpusBitstreamFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setFrameDuration(value: Double): Self = StObject.set(x, "frameDuration", value.asInstanceOf[js.Any])
    
    inline def setFrameDurationUndefined: Self = StObject.set(x, "frameDuration", js.undefined)
    
    inline def setPacketlossperc(value: Double): Self = StObject.set(x, "packetlossperc", value.asInstanceOf[js.Any])
    
    inline def setPacketlosspercUndefined: Self = StObject.set(x, "packetlossperc", js.undefined)
    
    inline def setUsedtx(value: scala.Boolean): Self = StObject.set(x, "usedtx", value.asInstanceOf[js.Any])
    
    inline def setUsedtxUndefined: Self = StObject.set(x, "usedtx", js.undefined)
    
    inline def setUseinbandfec(value: scala.Boolean): Self = StObject.set(x, "useinbandfec", value.asInstanceOf[js.Any])
    
    inline def setUseinbandfecUndefined: Self = StObject.set(x, "useinbandfec", js.undefined)
  }
}
