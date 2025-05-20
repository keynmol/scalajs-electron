package typings.std

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMRectList) */
@js.native
trait DOMRectList
  extends StObject
     with /* standard dom */
/* index */ NumberDictionary[org.scalajs.dom.DOMRect] {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMRectList/item) */
  /* standard dom */
  def item(index: Double): org.scalajs.dom.DOMRect | Null = js.native
  
  /* standard dom.iterable */
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[ArrayIterator[org.scalajs.dom.DOMRect]] = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMRectList/length) */
  /* standard dom */
  val length: Double = js.native
}
