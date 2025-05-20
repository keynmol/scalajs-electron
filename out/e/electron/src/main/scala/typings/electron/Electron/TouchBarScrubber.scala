package typings.electron.Electron

import typings.electron.electronStrings.background
import typings.electron.electronStrings.fixed
import typings.electron.electronStrings.free
import typings.electron.electronStrings.none
import typings.electron.electronStrings.outline
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TouchBarScrubber extends StObject {
  
  /**
    * A `boolean` representing whether this scrubber is continuous or not. Updating
    * this value immediately updates the control in the touch bar.
    */
  var continuous: Boolean
  
  /**
    * A `ScrubberItem[]` array representing the items in this scrubber. Updating this
    * value immediately updates the control in the touch bar. Updating deep properties
    * inside this array **does not update the touch bar**.
    */
  var items: js.Array[ScrubberItem]
  
  /**
    * A `string` representing the mode of this scrubber. Updating this value
    * immediately updates the control in the touch bar. Possible values:
    *
    * * `fixed` - Maps to `NSScrubberModeFixed`.
    * * `free` - Maps to `NSScrubberModeFree`.
    */
  var mode: fixed | free
  
  /**
    * A `string` representing the style that selected items in the scrubber should
    * have. This style is overlaid on top of the scrubber item instead of being placed
    * behind it. Updating this value immediately updates the control in the touch bar.
    * Possible values:
    *
    * * `background` - Maps to `[NSScrubberSelectionStyle roundedBackgroundStyle]`.
    * * `outline` - Maps to `[NSScrubberSelectionStyle outlineOverlayStyle]`.
    * * `none` - Removes all styles.
    */
  var overlayStyle: background | outline | none
  
  /**
    * A `string` representing the style that selected items in the scrubber should
    * have. Updating this value immediately updates the control in the touch bar.
    * Possible values:
    *
    * * `background` - Maps to `[NSScrubberSelectionStyle roundedBackgroundStyle]`.
    * * `outline` - Maps to `[NSScrubberSelectionStyle outlineOverlayStyle]`.
    * * `none` - Removes all styles.
    */
  var selectedStyle: background | outline | none
  
  /**
    * A `boolean` representing whether to show the left / right selection arrows in
    * this scrubber. Updating this value immediately updates the control in the touch
    * bar.
    */
  var showArrowButtons: Boolean
}
object TouchBarScrubber {
  
  inline def apply(
    continuous: Boolean,
    items: js.Array[ScrubberItem],
    mode: fixed | free,
    overlayStyle: background | outline | none,
    selectedStyle: background | outline | none,
    showArrowButtons: Boolean
  ): TouchBarScrubber = {
    val __obj = js.Dynamic.literal(continuous = continuous.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], overlayStyle = overlayStyle.asInstanceOf[js.Any], selectedStyle = selectedStyle.asInstanceOf[js.Any], showArrowButtons = showArrowButtons.asInstanceOf[js.Any])
    __obj.asInstanceOf[TouchBarScrubber]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TouchBarScrubber] (val x: Self) extends AnyVal {
    
    inline def setContinuous(value: Boolean): Self = StObject.set(x, "continuous", value.asInstanceOf[js.Any])
    
    inline def setItems(value: js.Array[ScrubberItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: ScrubberItem*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setMode(value: fixed | free): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setOverlayStyle(value: background | outline | none): Self = StObject.set(x, "overlayStyle", value.asInstanceOf[js.Any])
    
    inline def setSelectedStyle(value: background | outline | none): Self = StObject.set(x, "selectedStyle", value.asInstanceOf[js.Any])
    
    inline def setShowArrowButtons(value: Boolean): Self = StObject.set(x, "showArrowButtons", value.asInstanceOf[js.Any])
  }
}
