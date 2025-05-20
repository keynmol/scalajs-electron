package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An object representing a set of style for a given keyframe. It corresponds to the contains of a single keyframe of a @keyframes at-rule. It implements the CSSRule interface with a type value of 8 (CSSRule.KEYFRAME_RULE).
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSKeyframeRule)
  */
@js.native
trait CSSKeyframeRule
  extends StObject
     with CSSRule {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSKeyframeRule/keyText) */
  /* standard dom */
  var keyText: java.lang.String = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSKeyframeRule/style) */
  /* standard dom */
  def style: org.scalajs.dom.CSSStyleDeclaration = js.native
  /* standard dom */
  def style_=(cssText: java.lang.String): Unit = js.native
}
