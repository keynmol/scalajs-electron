package typings.electron.global.Electron

import typings.electron.Electron.TouchBarColorPickerConstructorOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Electron.TouchBarColorPicker")
@js.native
open class TouchBarColorPicker protected ()
  extends StObject
     with typings.electron.Electron.TouchBarColorPicker {
  // Docs: https://electronjs.org/docs/api/touch-bar-color-picker
  /**
    * TouchBarColorPicker
    */
  def this(options: TouchBarColorPickerConstructorOptions) = this()
  
  /**
    * A `string[]` array representing the color picker's available colors to select.
    * Changing this value immediately updates the color picker in the touch bar.
    */
  /* CompleteClass */
  var availableColors: js.Array[String] = js.native
  
  /**
    * A `string` hex code representing the color picker's currently selected color.
    * Changing this value immediately updates the color picker in the touch bar.
    */
  /* CompleteClass */
  var selectedColor: String = js.native
}
