package typings.std.global

import typings.std.AudioEncoderConfig
import typings.std.AudioEncoderInit
import typings.std.AudioEncoderSupport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("AudioEncoder")
@js.native
open class AudioEncoder protected ()
  extends StObject
     with typings.std.AudioEncoder {
  /* standard dom */
  def this(init: AudioEncoderInit) = this()
}
object AudioEncoder {
  
  @JSGlobal("AudioEncoder")
  @js.native
  val ^ : js.Any = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioEncoder/isConfigSupported_static) */
  /* standard dom */
  inline def isConfigSupported(config: AudioEncoderConfig): js.Promise[AudioEncoderSupport] = ^.asInstanceOf[js.Dynamic].applyDynamic("isConfigSupported")(config.asInstanceOf[js.Any]).asInstanceOf[js.Promise[AudioEncoderSupport]]
}
