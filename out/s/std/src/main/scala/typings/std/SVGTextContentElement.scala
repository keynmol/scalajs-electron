package typings.std

import typings.std.stdInts.`0`
import typings.std.stdInts.`1`
import typings.std.stdInts.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Implemented by elements that support rendering child text content. It is inherited by various text-related interfaces, such as SVGTextElement, SVGTSpanElement, SVGTRefElement, SVGAltGlyphElement and SVGTextPathElement.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGTextContentElement)
  */
@js.native
trait SVGTextContentElement
  extends StObject
     with SVGGraphicsElement {
  
  /* standard dom */
  val LENGTHADJUST_SPACING: `1` = js.native
  
  /* standard dom */
  val LENGTHADJUST_SPACINGANDGLYPHS: `2` = js.native
  
  /* standard dom */
  val LENGTHADJUST_UNKNOWN: `0` = js.native
  
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, callback: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, callback: EventListenerOrEventListenerObject, options: scala.Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(
    `type`: java.lang.String,
    callback: EventListenerOrEventListenerObject,
    options: AddEventListenerOptions
  ): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGTextContentElement/getCharNumAtPosition) */
  /* standard dom */
  def getCharNumAtPosition(): Double = js.native
  def getCharNumAtPosition(point: DOMPointInit): Double = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGTextContentElement/getComputedTextLength) */
  /* standard dom */
  def getComputedTextLength(): Double = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGTextContentElement/getEndPositionOfChar) */
  /* standard dom */
  def getEndPositionOfChar(charnum: Double): DOMPoint = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGTextContentElement/getExtentOfChar) */
  /* standard dom */
  def getExtentOfChar(charnum: Double): org.scalajs.dom.DOMRect = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGTextContentElement/getNumberOfChars) */
  /* standard dom */
  def getNumberOfChars(): Double = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGTextContentElement/getRotationOfChar) */
  /* standard dom */
  def getRotationOfChar(charnum: Double): Double = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGTextContentElement/getStartPositionOfChar) */
  /* standard dom */
  def getStartPositionOfChar(charnum: Double): DOMPoint = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGTextContentElement/getSubStringLength) */
  /* standard dom */
  def getSubStringLength(charnum: Double, nchars: Double): Double = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGTextContentElement/lengthAdjust) */
  /* standard dom */
  val lengthAdjust: org.scalajs.dom.SVGAnimatedEnumeration = js.native
  
  /* InferMemberOverrides */
  override def removeEventListener(`type`: java.lang.String, callback: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(
    `type`: java.lang.String,
    callback: EventListenerOrEventListenerObject,
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: java.lang.String, callback: EventListenerOrEventListenerObject, options: scala.Boolean): Unit = js.native
  
  /** @deprecated */
  /* standard dom */
  def selectSubString(charnum: Double, nchars: Double): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGTextContentElement/textLength) */
  /* standard dom */
  val textLength: org.scalajs.dom.SVGAnimatedLength = js.native
}
