package typings.std

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The SVGLengthList defines a list of SVGLength objects.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGLengthList)
  */
@js.native
trait SVGLengthList
  extends StObject
     with /* standard dom */
/* index */ NumberDictionary[org.scalajs.dom.SVGLength] {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGLengthList/appendItem) */
  /* standard dom */
  def appendItem(newItem: org.scalajs.dom.SVGLength): org.scalajs.dom.SVGLength = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGLengthList/clear) */
  /* standard dom */
  def clear(): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGLengthList/getItem) */
  /* standard dom */
  def getItem(index: Double): org.scalajs.dom.SVGLength = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGLengthList/initialize) */
  /* standard dom */
  def initialize(newItem: org.scalajs.dom.SVGLength): org.scalajs.dom.SVGLength = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGLengthList/insertItemBefore) */
  /* standard dom */
  def insertItemBefore(newItem: org.scalajs.dom.SVGLength, index: Double): org.scalajs.dom.SVGLength = js.native
  
  /* standard dom.iterable */
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[ArrayIterator[org.scalajs.dom.SVGLength]] = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGLengthList/length) */
  /* standard dom */
  val length: Double = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGLengthList/numberOfItems) */
  /* standard dom */
  val numberOfItems: Double = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGLengthList/removeItem) */
  /* standard dom */
  def removeItem(index: Double): org.scalajs.dom.SVGLength = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGLengthList/replaceItem) */
  /* standard dom */
  def replaceItem(newItem: org.scalajs.dom.SVGLength, index: Double): org.scalajs.dom.SVGLength = js.native
}
