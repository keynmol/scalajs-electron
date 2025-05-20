package typings.electron.global.Electron

import typings.electron.Electron.TouchBarPopoverConstructorOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Electron.TouchBarPopover")
@js.native
open class TouchBarPopover protected ()
  extends StObject
     with typings.electron.Electron.TouchBarPopover {
  // Docs: https://electronjs.org/docs/api/touch-bar-popover
  /**
    * TouchBarPopover
    */
  def this(options: TouchBarPopoverConstructorOptions) = this()
  
  /**
    * A `NativeImage` representing the popover's current button icon. Changing this
    * value immediately updates the popover in the touch bar.
    */
  /* CompleteClass */
  var icon: typings.electron.Electron.NativeImage_ = js.native
  
  /**
    * A `string` representing the popover's current button text. Changing this value
    * immediately updates the popover in the touch bar.
    */
  /* CompleteClass */
  var label: String = js.native
}
