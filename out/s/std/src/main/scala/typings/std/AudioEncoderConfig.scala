package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AudioEncoderConfig extends StObject {
  
  /* standard dom */
  var bitrate: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var bitrateMode: js.UndefOr[BitrateMode] = js.undefined
  
  /* standard dom */
  var codec: java.lang.String
  
  /* standard dom */
  var numberOfChannels: Double
  
  /* standard dom */
  var opus: js.UndefOr[OpusEncoderConfig] = js.undefined
  
  /* standard dom */
  var sampleRate: Double
}
object AudioEncoderConfig {
  
  inline def apply(codec: java.lang.String, numberOfChannels: Double, sampleRate: Double): AudioEncoderConfig = {
    val __obj = js.Dynamic.literal(codec = codec.asInstanceOf[js.Any], numberOfChannels = numberOfChannels.asInstanceOf[js.Any], sampleRate = sampleRate.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioEncoderConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AudioEncoderConfig] (val x: Self) extends AnyVal {
    
    inline def setBitrate(value: Double): Self = StObject.set(x, "bitrate", value.asInstanceOf[js.Any])
    
    inline def setBitrateMode(value: BitrateMode): Self = StObject.set(x, "bitrateMode", value.asInstanceOf[js.Any])
    
    inline def setBitrateModeUndefined: Self = StObject.set(x, "bitrateMode", js.undefined)
    
    inline def setBitrateUndefined: Self = StObject.set(x, "bitrate", js.undefined)
    
    inline def setCodec(value: java.lang.String): Self = StObject.set(x, "codec", value.asInstanceOf[js.Any])
    
    inline def setNumberOfChannels(value: Double): Self = StObject.set(x, "numberOfChannels", value.asInstanceOf[js.Any])
    
    inline def setOpus(value: OpusEncoderConfig): Self = StObject.set(x, "opus", value.asInstanceOf[js.Any])
    
    inline def setOpusUndefined: Self = StObject.set(x, "opus", js.undefined)
    
    inline def setSampleRate(value: Double): Self = StObject.set(x, "sampleRate", value.asInstanceOf[js.Any])
  }
}
