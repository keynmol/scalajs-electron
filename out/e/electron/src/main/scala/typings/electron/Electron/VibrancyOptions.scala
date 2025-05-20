package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VibrancyOptions extends StObject {
  
  /**
    * if greater than zero, the change to vibrancy will be animated over the given
    * duration (in milliseconds).
    */
  var animationDuration: js.UndefOr[Double] = js.undefined
}
object VibrancyOptions {
  
  inline def apply(): VibrancyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VibrancyOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VibrancyOptions] (val x: Self) extends AnyVal {
    
    inline def setAnimationDuration(value: Double): Self = StObject.set(x, "animationDuration", value.asInstanceOf[js.Any])
    
    inline def setAnimationDurationUndefined: Self = StObject.set(x, "animationDuration", js.undefined)
  }
}
