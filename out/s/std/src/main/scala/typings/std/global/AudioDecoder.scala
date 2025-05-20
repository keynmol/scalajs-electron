package typings.std.global

import typings.std.AudioDecoderConfig
import typings.std.AudioDecoderInit
import typings.std.AudioDecoderSupport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("AudioDecoder")
@js.native
open class AudioDecoder protected ()
  extends StObject
     with typings.std.AudioDecoder {
  /* standard dom */
  def this(init: AudioDecoderInit) = this()
}
object AudioDecoder {
  
  @JSGlobal("AudioDecoder")
  @js.native
  val ^ : js.Any = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioDecoder/isConfigSupported_static) */
  /* standard dom */
  inline def isConfigSupported(config: AudioDecoderConfig): js.Promise[AudioDecoderSupport] = ^.asInstanceOf[js.Dynamic].applyDynamic("isConfigSupported")(config.asInstanceOf[js.Any]).asInstanceOf[js.Promise[AudioDecoderSupport]]
}
