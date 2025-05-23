package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Available only in secure contexts.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GeolocationPosition)
  */
trait GeolocationPosition extends StObject {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/GeolocationPosition/coords) */
  /* standard dom */
  val coords: GeolocationCoordinates
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/GeolocationPosition/timestamp) */
  /* standard dom */
  val timestamp: EpochTimeStamp
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/GeolocationPosition/toJSON) */
  /* standard dom */
  def toJSON(): Any
}
object GeolocationPosition {
  
  inline def apply(coords: GeolocationCoordinates, timestamp: EpochTimeStamp, toJSON: () => Any): GeolocationPosition = {
    val __obj = js.Dynamic.literal(coords = coords.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[GeolocationPosition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GeolocationPosition] (val x: Self) extends AnyVal {
    
    inline def setCoords(value: GeolocationCoordinates): Self = StObject.set(x, "coords", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: EpochTimeStamp): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setToJSON(value: () => Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
  }
}
