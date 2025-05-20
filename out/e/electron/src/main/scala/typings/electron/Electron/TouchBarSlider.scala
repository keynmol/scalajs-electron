package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TouchBarSlider extends StObject {
  
  /**
    * A `string` representing the slider's current text. Changing this value
    * immediately updates the slider in the touch bar.
    */
  var label: String
  
  /**
    * A `number` representing the slider's current maximum value. Changing this value
    * immediately updates the slider in the touch bar.
    */
  var maxValue: Double
  
  /**
    * A `number` representing the slider's current minimum value. Changing this value
    * immediately updates the slider in the touch bar.
    */
  var minValue: Double
  
  /**
    * A `number` representing the slider's current value. Changing this value
    * immediately updates the slider in the touch bar.
    */
  var value: Double
}
object TouchBarSlider {
  
  inline def apply(label: String, maxValue: Double, minValue: Double, value: Double): TouchBarSlider = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], maxValue = maxValue.asInstanceOf[js.Any], minValue = minValue.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TouchBarSlider]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TouchBarSlider] (val x: Self) extends AnyVal {
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setMaxValue(value: Double): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
    
    inline def setMinValue(value: Double): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
