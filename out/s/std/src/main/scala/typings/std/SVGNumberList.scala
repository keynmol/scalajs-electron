package typings.std

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The SVGNumberList defines a list of SVGNumber objects.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGNumberList)
  */
@js.native
trait SVGNumberList
  extends StObject
     with /* standard dom */
/* index */ NumberDictionary[org.scalajs.dom.SVGNumber] {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGNumberList/appendItem) */
  /* standard dom */
  def appendItem(newItem: org.scalajs.dom.SVGNumber): org.scalajs.dom.SVGNumber = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGNumberList/clear) */
  /* standard dom */
  def clear(): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGNumberList/getItem) */
  /* standard dom */
  def getItem(index: Double): org.scalajs.dom.SVGNumber = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGNumberList/initialize) */
  /* standard dom */
  def initialize(newItem: org.scalajs.dom.SVGNumber): org.scalajs.dom.SVGNumber = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGNumberList/insertItemBefore) */
  /* standard dom */
  def insertItemBefore(newItem: org.scalajs.dom.SVGNumber, index: Double): org.scalajs.dom.SVGNumber = js.native
  
  /* standard dom.iterable */
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[ArrayIterator[org.scalajs.dom.SVGNumber]] = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGNumberList/length) */
  /* standard dom */
  val length: Double = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGNumberList/numberOfItems) */
  /* standard dom */
  val numberOfItems: Double = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGNumberList/removeItem) */
  /* standard dom */
  def removeItem(index: Double): org.scalajs.dom.SVGNumber = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGNumberList/replaceItem) */
  /* standard dom */
  def replaceItem(newItem: org.scalajs.dom.SVGNumber, index: Double): org.scalajs.dom.SVGNumber = js.native
}
