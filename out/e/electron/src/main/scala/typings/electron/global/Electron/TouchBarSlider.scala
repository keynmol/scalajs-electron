package typings.electron.global.Electron

import typings.electron.Electron.TouchBarSliderConstructorOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Electron.TouchBarSlider")
@js.native
open class TouchBarSlider protected ()
  extends StObject
     with typings.electron.Electron.TouchBarSlider {
  // Docs: https://electronjs.org/docs/api/touch-bar-slider
  /**
    * TouchBarSlider
    */
  def this(options: TouchBarSliderConstructorOptions) = this()
  
  /**
    * A `string` representing the slider's current text. Changing this value
    * immediately updates the slider in the touch bar.
    */
  /* CompleteClass */
  var label: String = js.native
  
  /**
    * A `number` representing the slider's current maximum value. Changing this value
    * immediately updates the slider in the touch bar.
    */
  /* CompleteClass */
  var maxValue: Double = js.native
  
  /**
    * A `number` representing the slider's current minimum value. Changing this value
    * immediately updates the slider in the touch bar.
    */
  /* CompleteClass */
  var minValue: Double = js.native
  
  /**
    * A `number` representing the slider's current value. Changing this value
    * immediately updates the slider in the touch bar.
    */
  /* CompleteClass */
  var value: Double = js.native
}
