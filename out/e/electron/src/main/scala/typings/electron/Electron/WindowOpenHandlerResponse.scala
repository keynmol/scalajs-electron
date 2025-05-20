package typings.electron.Electron

import typings.electron.electronStrings.allow
import typings.electron.electronStrings.deny
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WindowOpenHandlerResponse extends StObject {
  
  // Docs: https://electronjs.org/docs/api/structures/window-open-handler-response
  /**
    * Can be `allow` or `deny`. Controls whether new window should be created.
    */
  var action: allow | deny
  
  /**
    * If specified, will be called instead of `new BrowserWindow` to create the new
    * child window and event `did-create-window` will not be emitted. Constructed
    * child window should use passed `options` object. This can be used for example to
    * have the new window open as a BrowserView instead of in a separate window.
    */
  var createWindow: js.UndefOr[js.Function1[/* options */ BrowserWindowConstructorOptions, WebContents_]] = js.undefined
  
  /**
    * By default, child windows are closed when their opener is closed. This can be
    * changed by specifying `outlivesOpener: true`, in which case the opened window
    * will not be closed when its opener is closed.
    */
  var outlivesOpener: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Allows customization of the created window.
    */
  var overrideBrowserWindowOptions: js.UndefOr[BrowserWindowConstructorOptions] = js.undefined
}
object WindowOpenHandlerResponse {
  
  inline def apply(action: allow | deny): WindowOpenHandlerResponse = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowOpenHandlerResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WindowOpenHandlerResponse] (val x: Self) extends AnyVal {
    
    inline def setAction(value: allow | deny): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setCreateWindow(value: /* options */ BrowserWindowConstructorOptions => WebContents_): Self = StObject.set(x, "createWindow", js.Any.fromFunction1(value))
    
    inline def setCreateWindowUndefined: Self = StObject.set(x, "createWindow", js.undefined)
    
    inline def setOutlivesOpener(value: Boolean): Self = StObject.set(x, "outlivesOpener", value.asInstanceOf[js.Any])
    
    inline def setOutlivesOpenerUndefined: Self = StObject.set(x, "outlivesOpener", js.undefined)
    
    inline def setOverrideBrowserWindowOptions(value: BrowserWindowConstructorOptions): Self = StObject.set(x, "overrideBrowserWindowOptions", value.asInstanceOf[js.Any])
    
    inline def setOverrideBrowserWindowOptionsUndefined: Self = StObject.set(x, "overrideBrowserWindowOptions", js.undefined)
  }
}
