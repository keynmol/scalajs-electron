package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ImageTrack) */
trait ImageTrack extends StObject {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ImageTrack/animated) */
  /* standard dom */
  val animated: scala.Boolean
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ImageTrack/frameCount) */
  /* standard dom */
  val frameCount: Double
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ImageTrack/repetitionCount) */
  /* standard dom */
  val repetitionCount: Double
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ImageTrack/selected) */
  /* standard dom */
  var selected: scala.Boolean
}
object ImageTrack {
  
  inline def apply(animated: scala.Boolean, frameCount: Double, repetitionCount: Double, selected: scala.Boolean): ImageTrack = {
    val __obj = js.Dynamic.literal(animated = animated.asInstanceOf[js.Any], frameCount = frameCount.asInstanceOf[js.Any], repetitionCount = repetitionCount.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageTrack]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImageTrack] (val x: Self) extends AnyVal {
    
    inline def setAnimated(value: scala.Boolean): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
    
    inline def setFrameCount(value: Double): Self = StObject.set(x, "frameCount", value.asInstanceOf[js.Any])
    
    inline def setRepetitionCount(value: Double): Self = StObject.set(x, "repetitionCount", value.asInstanceOf[js.Any])
    
    inline def setSelected(value: scala.Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
  }
}
