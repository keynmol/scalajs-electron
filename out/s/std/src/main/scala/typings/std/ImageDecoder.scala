package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Available only in secure contexts.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ImageDecoder)
  */
@js.native
trait ImageDecoder extends StObject {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ImageDecoder/close) */
  /* standard dom */
  def close(): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ImageDecoder/complete) */
  /* standard dom */
  val complete: scala.Boolean = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ImageDecoder/completed) */
  /* standard dom */
  val completed: js.Promise[Unit] = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ImageDecoder/decode) */
  /* standard dom */
  def decode(): js.Promise[ImageDecodeResult] = js.native
  def decode(options: ImageDecodeOptions): js.Promise[ImageDecodeResult] = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ImageDecoder/reset) */
  /* standard dom */
  def reset(): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ImageDecoder/tracks) */
  /* standard dom */
  val tracks: ImageTrackList = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ImageDecoder/type) */
  /* standard dom */
  val `type`: java.lang.String = js.native
}
