package typings.electron.Electron

import typings.electron.electronStrings.buttons
import typings.electron.electronStrings.multiple
import typings.electron.electronStrings.single
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TouchBarSegmentedControl extends StObject {
  
  /**
    * A `string` representing the current selection mode of the control.  Can be
    * `single`, `multiple` or `buttons`.
    */
  var mode: single | multiple | buttons
  
  /**
    * A `string` representing the controls current segment style. Updating this value
    * immediately updates the control in the touch bar.
    */
  var segmentStyle: String
  
  /**
    * A `SegmentedControlSegment[]` array representing the segments in this control.
    * Updating this value immediately updates the control in the touch bar. Updating
    * deep properties inside this array **does not update the touch bar**.
    */
  var segments: js.Array[SegmentedControlSegment]
  
  /**
    * An `Integer` representing the currently selected segment. Changing this value
    * immediately updates the control in the touch bar. User interaction with the
    * touch bar will update this value automatically.
    */
  var selectedIndex: Double
}
object TouchBarSegmentedControl {
  
  inline def apply(
    mode: single | multiple | buttons,
    segmentStyle: String,
    segments: js.Array[SegmentedControlSegment],
    selectedIndex: Double
  ): TouchBarSegmentedControl = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any], segmentStyle = segmentStyle.asInstanceOf[js.Any], segments = segments.asInstanceOf[js.Any], selectedIndex = selectedIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[TouchBarSegmentedControl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TouchBarSegmentedControl] (val x: Self) extends AnyVal {
    
    inline def setMode(value: single | multiple | buttons): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setSegmentStyle(value: String): Self = StObject.set(x, "segmentStyle", value.asInstanceOf[js.Any])
    
    inline def setSegments(value: js.Array[SegmentedControlSegment]): Self = StObject.set(x, "segments", value.asInstanceOf[js.Any])
    
    inline def setSegmentsVarargs(value: SegmentedControlSegment*): Self = StObject.set(x, "segments", js.Array(value*))
    
    inline def setSelectedIndex(value: Double): Self = StObject.set(x, "selectedIndex", value.asInstanceOf[js.Any])
  }
}
