package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TouchBarColorPicker extends StObject {
  
  /**
    * A `string[]` array representing the color picker's available colors to select.
    * Changing this value immediately updates the color picker in the touch bar.
    */
  var availableColors: js.Array[String]
  
  /**
    * A `string` hex code representing the color picker's currently selected color.
    * Changing this value immediately updates the color picker in the touch bar.
    */
  var selectedColor: String
}
object TouchBarColorPicker {
  
  inline def apply(availableColors: js.Array[String], selectedColor: String): TouchBarColorPicker = {
    val __obj = js.Dynamic.literal(availableColors = availableColors.asInstanceOf[js.Any], selectedColor = selectedColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[TouchBarColorPicker]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TouchBarColorPicker] (val x: Self) extends AnyVal {
    
    inline def setAvailableColors(value: js.Array[String]): Self = StObject.set(x, "availableColors", value.asInstanceOf[js.Any])
    
    inline def setAvailableColorsVarargs(value: String*): Self = StObject.set(x, "availableColors", js.Array(value*))
    
    inline def setSelectedColor(value: String): Self = StObject.set(x, "selectedColor", value.asInstanceOf[js.Any])
  }
}
