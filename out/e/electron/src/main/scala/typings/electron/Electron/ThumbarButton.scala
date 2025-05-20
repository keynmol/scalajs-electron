package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThumbarButton extends StObject {
  
  // Docs: https://electronjs.org/docs/api/structures/thumbar-button
  def click(): Unit
  
  /**
    * Control specific states and behaviors of the button. By default, it is
    * `['enabled']`.
    */
  var flags: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The icon showing in thumbnail toolbar.
    */
  var icon: NativeImage_
  
  /**
    * The text of the button's tooltip.
    */
  var tooltip: js.UndefOr[String] = js.undefined
}
object ThumbarButton {
  
  inline def apply(click: () => Unit, icon: NativeImage_): ThumbarButton = {
    val __obj = js.Dynamic.literal(click = js.Any.fromFunction0(click), icon = icon.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThumbarButton]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ThumbarButton] (val x: Self) extends AnyVal {
    
    inline def setClick(value: () => Unit): Self = StObject.set(x, "click", js.Any.fromFunction0(value))
    
    inline def setFlags(value: js.Array[String]): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    inline def setFlagsUndefined: Self = StObject.set(x, "flags", js.undefined)
    
    inline def setFlagsVarargs(value: String*): Self = StObject.set(x, "flags", js.Array(value*))
    
    inline def setIcon(value: NativeImage_): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setTooltip(value: String): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
  }
}
