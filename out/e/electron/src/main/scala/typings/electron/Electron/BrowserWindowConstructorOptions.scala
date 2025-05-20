package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BrowserWindowConstructorOptions
  extends StObject
     with BaseWindowConstructorOptions {
  
  // Docs: https://electronjs.org/docs/api/structures/browser-window-options
  /**
    * Whether the renderer should be active when `show` is `false` and it has just
    * been created.  In order for `document.visibilityState` to work correctly on
    * first load with `show: false` you should set this to `false`.  Setting this to
    * `false` will cause the `ready-to-show` event to not fire.  Default is `true`.
    */
  var paintWhenInitiallyHidden: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Settings of web page's features.
    */
  var webPreferences: js.UndefOr[WebPreferences] = js.undefined
}
object BrowserWindowConstructorOptions {
  
  inline def apply(): BrowserWindowConstructorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BrowserWindowConstructorOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BrowserWindowConstructorOptions] (val x: Self) extends AnyVal {
    
    inline def setPaintWhenInitiallyHidden(value: Boolean): Self = StObject.set(x, "paintWhenInitiallyHidden", value.asInstanceOf[js.Any])
    
    inline def setPaintWhenInitiallyHiddenUndefined: Self = StObject.set(x, "paintWhenInitiallyHidden", js.undefined)
    
    inline def setWebPreferences(value: WebPreferences): Self = StObject.set(x, "webPreferences", value.asInstanceOf[js.Any])
    
    inline def setWebPreferencesUndefined: Self = StObject.set(x, "webPreferences", js.undefined)
  }
}
