package typings.electron.global.Electron

import typings.electron.Electron.TouchBarLabelConstructorOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Electron.TouchBarLabel")
@js.native
open class TouchBarLabel protected ()
  extends StObject
     with typings.electron.Electron.TouchBarLabel {
  // Docs: https://electronjs.org/docs/api/touch-bar-label
  /**
    * TouchBarLabel
    */
  def this(options: TouchBarLabelConstructorOptions) = this()
  
  /**
    * A `string` representing the description of the label to be read by a screen
    * reader.
    */
  /* CompleteClass */
  var accessibilityLabel: String = js.native
  
  /**
    * A `string` representing the label's current text. Changing this value
    * immediately updates the label in the touch bar.
    */
  /* CompleteClass */
  var label: String = js.native
  
  /**
    * A `string` hex code representing the label's current text color. Changing this
    * value immediately updates the label in the touch bar.
    */
  /* CompleteClass */
  var textColor: String = js.native
}
