package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A single style sheet. CSS style sheets will further implement the more specialized CSSStyleSheet interface.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/StyleSheet)
  */
@js.native
trait StyleSheet extends StObject {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/StyleSheet/disabled) */
  /* standard dom */
  var disabled: scala.Boolean = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/StyleSheet/href) */
  /* standard dom */
  val href: java.lang.String | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/StyleSheet/media) */
  /* standard dom */
  def media: org.scalajs.dom.MediaList = js.native
  /* standard dom */
  def media_=(mediaText: java.lang.String): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/StyleSheet/ownerNode) */
  /* standard dom */
  val ownerNode: org.scalajs.dom.Element | org.scalajs.dom.ProcessingInstruction | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/StyleSheet/parentStyleSheet) */
  /* standard dom */
  val parentStyleSheet: org.scalajs.dom.CSSStyleSheet | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/StyleSheet/title) */
  /* standard dom */
  val title: java.lang.String | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/StyleSheet/type) */
  /* standard dom */
  val `type`: java.lang.String = js.native
}
