package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Used for attributes of type SVGPreserveAspectRatio which can be animated.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGAnimatedPreserveAspectRatio)
  */
trait SVGAnimatedPreserveAspectRatio extends StObject {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGAnimatedPreserveAspectRatio/animVal) */
  /* standard dom */
  val animVal: org.scalajs.dom.SVGPreserveAspectRatio
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/SVGAnimatedPreserveAspectRatio/baseVal) */
  /* standard dom */
  val baseVal: org.scalajs.dom.SVGPreserveAspectRatio
}
object SVGAnimatedPreserveAspectRatio {
  
  inline def apply(animVal: org.scalajs.dom.SVGPreserveAspectRatio, baseVal: org.scalajs.dom.SVGPreserveAspectRatio): SVGAnimatedPreserveAspectRatio = {
    val __obj = js.Dynamic.literal(animVal = animVal.asInstanceOf[js.Any], baseVal = baseVal.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGAnimatedPreserveAspectRatio]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SVGAnimatedPreserveAspectRatio] (val x: Self) extends AnyVal {
    
    inline def setAnimVal(value: org.scalajs.dom.SVGPreserveAspectRatio): Self = StObject.set(x, "animVal", value.asInstanceOf[js.Any])
    
    inline def setBaseVal(value: org.scalajs.dom.SVGPreserveAspectRatio): Self = StObject.set(x, "baseVal", value.asInstanceOf[js.Any])
  }
}
