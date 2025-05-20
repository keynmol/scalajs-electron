package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TouchBarLabel extends StObject {
  
  /**
    * A `string` representing the description of the label to be read by a screen
    * reader.
    */
  var accessibilityLabel: String
  
  /**
    * A `string` representing the label's current text. Changing this value
    * immediately updates the label in the touch bar.
    */
  var label: String
  
  /**
    * A `string` hex code representing the label's current text color. Changing this
    * value immediately updates the label in the touch bar.
    */
  var textColor: String
}
object TouchBarLabel {
  
  inline def apply(accessibilityLabel: String, label: String, textColor: String): TouchBarLabel = {
    val __obj = js.Dynamic.literal(accessibilityLabel = accessibilityLabel.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], textColor = textColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[TouchBarLabel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TouchBarLabel] (val x: Self) extends AnyVal {
    
    inline def setAccessibilityLabel(value: String): Self = StObject.set(x, "accessibilityLabel", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setTextColor(value: String): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
  }
}
