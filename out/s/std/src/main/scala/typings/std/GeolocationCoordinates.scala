package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Available only in secure contexts.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/GeolocationCoordinates)
  */
trait GeolocationCoordinates extends StObject {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/GeolocationCoordinates/accuracy) */
  /* standard dom */
  val accuracy: Double
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/GeolocationCoordinates/altitude) */
  /* standard dom */
  val altitude: Double | Null
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/GeolocationCoordinates/altitudeAccuracy) */
  /* standard dom */
  val altitudeAccuracy: Double | Null
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/GeolocationCoordinates/heading) */
  /* standard dom */
  val heading: Double | Null
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/GeolocationCoordinates/latitude) */
  /* standard dom */
  val latitude: Double
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/GeolocationCoordinates/longitude) */
  /* standard dom */
  val longitude: Double
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/GeolocationCoordinates/speed) */
  /* standard dom */
  val speed: Double | Null
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/GeolocationCoordinates/toJSON) */
  /* standard dom */
  def toJSON(): Any
}
object GeolocationCoordinates {
  
  inline def apply(accuracy: Double, latitude: Double, longitude: Double, toJSON: () => Any): GeolocationCoordinates = {
    val __obj = js.Dynamic.literal(accuracy = accuracy.asInstanceOf[js.Any], latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), altitude = null, altitudeAccuracy = null, heading = null, speed = null)
    __obj.asInstanceOf[GeolocationCoordinates]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GeolocationCoordinates] (val x: Self) extends AnyVal {
    
    inline def setAccuracy(value: Double): Self = StObject.set(x, "accuracy", value.asInstanceOf[js.Any])
    
    inline def setAltitude(value: Double): Self = StObject.set(x, "altitude", value.asInstanceOf[js.Any])
    
    inline def setAltitudeAccuracy(value: Double): Self = StObject.set(x, "altitudeAccuracy", value.asInstanceOf[js.Any])
    
    inline def setAltitudeAccuracyNull: Self = StObject.set(x, "altitudeAccuracy", null)
    
    inline def setAltitudeNull: Self = StObject.set(x, "altitude", null)
    
    inline def setHeading(value: Double): Self = StObject.set(x, "heading", value.asInstanceOf[js.Any])
    
    inline def setHeadingNull: Self = StObject.set(x, "heading", null)
    
    inline def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
    
    inline def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
    
    inline def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
    
    inline def setSpeedNull: Self = StObject.set(x, "speed", null)
    
    inline def setToJSON(value: () => Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
  }
}
