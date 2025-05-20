package typings.std

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The SVGTransformList defines a list of SVGTransform objects.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGTransformList)
  */
@js.native
trait SVGTransformList
  extends StObject
     with /* standard dom */
/* index */ NumberDictionary[org.scalajs.dom.SVGTransform] {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGTransformList/appendItem) */
  /* standard dom */
  def appendItem(newItem: org.scalajs.dom.SVGTransform): org.scalajs.dom.SVGTransform = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGTransformList/clear) */
  /* standard dom */
  def clear(): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGTransformList/consolidate) */
  /* standard dom */
  def consolidate(): org.scalajs.dom.SVGTransform | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGTransformList/createSVGTransformFromMatrix) */
  /* standard dom */
  def createSVGTransformFromMatrix(): org.scalajs.dom.SVGTransform = js.native
  def createSVGTransformFromMatrix(matrix: DOMMatrix2DInit): org.scalajs.dom.SVGTransform = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGTransformList/getItem) */
  /* standard dom */
  def getItem(index: Double): org.scalajs.dom.SVGTransform = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGTransformList/initialize) */
  /* standard dom */
  def initialize(newItem: org.scalajs.dom.SVGTransform): org.scalajs.dom.SVGTransform = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGTransformList/insertItemBefore) */
  /* standard dom */
  def insertItemBefore(newItem: org.scalajs.dom.SVGTransform, index: Double): org.scalajs.dom.SVGTransform = js.native
  
  /* standard dom.iterable */
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[ArrayIterator[org.scalajs.dom.SVGTransform]] = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGTransformList/length) */
  /* standard dom */
  val length: Double = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGTransformList/numberOfItems) */
  /* standard dom */
  val numberOfItems: Double = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGTransformList/removeItem) */
  /* standard dom */
  def removeItem(index: Double): org.scalajs.dom.SVGTransform = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGTransformList/replaceItem) */
  /* standard dom */
  def replaceItem(newItem: org.scalajs.dom.SVGTransform, index: Double): org.scalajs.dom.SVGTransform = js.native
}
