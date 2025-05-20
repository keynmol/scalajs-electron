package typings.electron.Electron

import typings.electron.electronStrings.adjustSelection
import typings.electron.electronStrings.adjustSelectionReset
import typings.electron.electronStrings.keyboard
import typings.electron.electronStrings.longPress
import typings.electron.electronStrings.longTap
import typings.electron.electronStrings.mouse
import typings.electron.electronStrings.none
import typings.electron.electronStrings.stylus
import typings.electron.electronStrings.touch
import typings.electron.electronStrings.touchHandle
import typings.electron.electronStrings.touchMenu
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PopupOptions extends StObject {
  
  /**
    * Called when menu is closed.
    */
  var callback: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * Provide the relevant frame if you want certain OS-level features such as Writing
    * Tools on macOS to function correctly. Typically, this should be `params.frame`
    * from the `context-menu` event on a WebContents, or the `focusedFrame` property
    * of a WebContents.
    */
  var frame: js.UndefOr[WebFrameMain_] = js.undefined
  
  /**
    * The index of the menu item to be positioned under the mouse cursor at the
    * specified coordinates. Default is -1.
    *
    * @platform darwin
    */
  var positioningItem: js.UndefOr[Double] = js.undefined
  
  /**
    * This should map to the `menuSourceType` provided by the `context-menu` event. It
    * is not recommended to set this value manually, only provide values you receive
    * from other APIs or leave it `undefined`. Can be `none`, `mouse`, `keyboard`,
    * `touch`, `touchMenu`, `longPress`, `longTap`, `touchHandle`, `stylus`,
    * `adjustSelection`, or `adjustSelectionReset`.
    *
    * @platform win32,linux
    */
  var sourceType: js.UndefOr[
    none | mouse | keyboard | touch | touchMenu | longPress | longTap | touchHandle | stylus | adjustSelection | adjustSelectionReset
  ] = js.undefined
  
  /**
    * Default is the focused window.
    */
  var window: js.UndefOr[BaseWindow] = js.undefined
  
  /**
    * Default is the current mouse cursor position. Must be declared if `y` is
    * declared.
    */
  var x: js.UndefOr[Double] = js.undefined
  
  /**
    * Default is the current mouse cursor position. Must be declared if `x` is
    * declared.
    */
  var y: js.UndefOr[Double] = js.undefined
}
object PopupOptions {
  
  inline def apply(): PopupOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PopupOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PopupOptions] (val x: Self) extends AnyVal {
    
    inline def setCallback(value: () => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction0(value))
    
    inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
    
    inline def setFrame(value: WebFrameMain_): Self = StObject.set(x, "frame", value.asInstanceOf[js.Any])
    
    inline def setFrameUndefined: Self = StObject.set(x, "frame", js.undefined)
    
    inline def setPositioningItem(value: Double): Self = StObject.set(x, "positioningItem", value.asInstanceOf[js.Any])
    
    inline def setPositioningItemUndefined: Self = StObject.set(x, "positioningItem", js.undefined)
    
    inline def setSourceType(
      value: none | mouse | keyboard | touch | touchMenu | longPress | longTap | touchHandle | stylus | adjustSelection | adjustSelectionReset
    ): Self = StObject.set(x, "sourceType", value.asInstanceOf[js.Any])
    
    inline def setSourceTypeUndefined: Self = StObject.set(x, "sourceType", js.undefined)
    
    inline def setWindow(value: BaseWindow): Self = StObject.set(x, "window", value.asInstanceOf[js.Any])
    
    inline def setWindowUndefined: Self = StObject.set(x, "window", js.undefined)
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
