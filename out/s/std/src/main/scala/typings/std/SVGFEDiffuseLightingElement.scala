package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Corresponds to the <feDiffuseLighting> element.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFEDiffuseLightingElement)
  */
@js.native
trait SVGFEDiffuseLightingElement
  extends StObject
     with SVGElement
     with SVGFilterPrimitiveStandardAttributes {
  
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
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFEDiffuseLightingElement/diffuseConstant) */
  /* standard dom */
  val diffuseConstant: org.scalajs.dom.SVGAnimatedNumber = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFEDiffuseLightingElement/in1) */
  /* standard dom */
  val in1: org.scalajs.dom.SVGAnimatedString = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFEDiffuseLightingElement/kernelUnitLengthX) */
  /* standard dom */
  val kernelUnitLengthX: org.scalajs.dom.SVGAnimatedNumber = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFEDiffuseLightingElement/kernelUnitLengthY) */
  /* standard dom */
  val kernelUnitLengthY: org.scalajs.dom.SVGAnimatedNumber = js.native
  
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
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGFEDiffuseLightingElement/surfaceScale) */
  /* standard dom */
  val surfaceScale: org.scalajs.dom.SVGAnimatedNumber = js.native
}
