package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SVGTests extends StObject {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGAnimationElement/requiredExtensions) */
  /* standard dom */
  val requiredExtensions: org.scalajs.dom.SVGStringList
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGAnimationElement/systemLanguage) */
  /* standard dom */
  val systemLanguage: org.scalajs.dom.SVGStringList
}
object SVGTests {
  
  inline def apply(requiredExtensions: org.scalajs.dom.SVGStringList, systemLanguage: org.scalajs.dom.SVGStringList): SVGTests = {
    val __obj = js.Dynamic.literal(requiredExtensions = requiredExtensions.asInstanceOf[js.Any], systemLanguage = systemLanguage.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGTests]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SVGTests] (val x: Self) extends AnyVal {
    
    inline def setRequiredExtensions(value: org.scalajs.dom.SVGStringList): Self = StObject.set(x, "requiredExtensions", value.asInstanceOf[js.Any])
    
    inline def setSystemLanguage(value: org.scalajs.dom.SVGStringList): Self = StObject.set(x, "systemLanguage", value.asInstanceOf[js.Any])
  }
}
