package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TouchBarPopover extends StObject {
  
  /**
    * A `NativeImage` representing the popover's current button icon. Changing this
    * value immediately updates the popover in the touch bar.
    */
  var icon: NativeImage_
  
  /**
    * A `string` representing the popover's current button text. Changing this value
    * immediately updates the popover in the touch bar.
    */
  var label: String
}
object TouchBarPopover {
  
  inline def apply(icon: NativeImage_, label: String): TouchBarPopover = {
    val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[TouchBarPopover]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TouchBarPopover] (val x: Self) extends AnyVal {
    
    inline def setIcon(value: NativeImage_): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
