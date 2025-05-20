package typings.electron.global.Electron

import typings.electron.Electron.SegmentedControlSegment
import typings.electron.Electron.TouchBarSegmentedControlConstructorOptions
import typings.electron.electronStrings.buttons
import typings.electron.electronStrings.multiple
import typings.electron.electronStrings.single
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Electron.TouchBarSegmentedControl")
@js.native
open class TouchBarSegmentedControl protected ()
  extends StObject
     with typings.electron.Electron.TouchBarSegmentedControl {
  // Docs: https://electronjs.org/docs/api/touch-bar-segmented-control
  /**
    * TouchBarSegmentedControl
    */
  def this(options: TouchBarSegmentedControlConstructorOptions) = this()
  
  /**
    * A `string` representing the current selection mode of the control.  Can be
    * `single`, `multiple` or `buttons`.
    */
  /* CompleteClass */
  var mode: single | multiple | buttons = js.native
  
  /**
    * A `string` representing the controls current segment style. Updating this value
    * immediately updates the control in the touch bar.
    */
  /* CompleteClass */
  var segmentStyle: String = js.native
  
  /**
    * A `SegmentedControlSegment[]` array representing the segments in this control.
    * Updating this value immediately updates the control in the touch bar. Updating
    * deep properties inside this array **does not update the touch bar**.
    */
  /* CompleteClass */
  var segments: js.Array[SegmentedControlSegment] = js.native
  
  /**
    * An `Integer` representing the currently selected segment. Changing this value
    * immediately updates the control in the touch bar. User interaction with the
    * touch bar will update this value automatically.
    */
  /* CompleteClass */
  var selectedIndex: Double = js.native
}
