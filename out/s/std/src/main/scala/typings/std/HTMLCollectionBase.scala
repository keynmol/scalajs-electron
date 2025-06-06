package typings.std

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A generic collection (array-like object similar to arguments) of elements (in document order) and offers methods and properties for selecting from the list.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLCollection)
  */
@js.native
trait HTMLCollectionBase
  extends StObject
     with /* standard dom */
/* index */ NumberDictionary[org.scalajs.dom.Element] {
  
  /**
    * Retrieves an object from various collections.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLCollection/item)
    */
  /* standard dom */
  def item(index: Double): org.scalajs.dom.Element | Null = js.native
  
  /* standard dom.iterable */
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[ArrayIterator[org.scalajs.dom.Element]] = js.native
  
  /**
    * Sets or retrieves the number of objects in a collection.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLCollection/length)
    */
  /* standard dom */
  val length: Double = js.native
}
