package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSImportRule) */
@js.native
trait CSSImportRule
  extends StObject
     with CSSRule {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSImportRule/href) */
  /* standard dom */
  val href: java.lang.String = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSImportRule/layerName) */
  /* standard dom */
  val layerName: java.lang.String | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSImportRule/media) */
  /* standard dom */
  def media: org.scalajs.dom.MediaList = js.native
  /* standard dom */
  def media_=(mediaText: java.lang.String): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSImportRule/styleSheet) */
  /* standard dom */
  val styleSheet: org.scalajs.dom.CSSStyleSheet | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CSSImportRule/supportsText) */
  /* standard dom */
  val supportsText: java.lang.String | Null = js.native
}
