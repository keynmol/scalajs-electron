package typings.std

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ImageTrackList) */
@js.native
trait ImageTrackList
  extends StObject
     with /* standard dom */
/* index */ NumberDictionary[ImageTrack] {
  
  /* standard dom.iterable */
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[ArrayIterator[ImageTrack]] = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ImageTrackList/length) */
  /* standard dom */
  val length: Double = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ImageTrackList/ready) */
  /* standard dom */
  val ready: js.Promise[Unit] = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ImageTrackList/selectedIndex) */
  /* standard dom */
  val selectedIndex: Double = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ImageTrackList/selectedTrack) */
  /* standard dom */
  val selectedTrack: ImageTrack | Null = js.native
}
