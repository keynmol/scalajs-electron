package typings.electron.Electron

import typings.electron.electronStrings.bottom
import typings.electron.electronStrings.detach
import typings.electron.electronStrings.left
import typings.electron.electronStrings.right
import typings.electron.electronStrings.undocked
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpenDevToolsOptions extends StObject {
  
  /**
    * Whether to bring the opened devtools window to the foreground. The default is
    * `true`.
    */
  var activate: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Opens the devtools with specified dock state, can be `left`, `right`, `bottom`,
    * `undocked`, `detach`. Defaults to last used dock state. In `undocked` mode it's
    * possible to dock back. In `detach` mode it's not.
    */
  var mode: left | right | bottom | undocked | detach
  
  /**
    * A title for the DevTools window (only in `undocked` or `detach` mode).
    */
  var title: js.UndefOr[String] = js.undefined
}
object OpenDevToolsOptions {
  
  inline def apply(mode: left | right | bottom | undocked | detach): OpenDevToolsOptions = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenDevToolsOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OpenDevToolsOptions] (val x: Self) extends AnyVal {
    
    inline def setActivate(value: Boolean): Self = StObject.set(x, "activate", value.asInstanceOf[js.Any])
    
    inline def setActivateUndefined: Self = StObject.set(x, "activate", js.undefined)
    
    inline def setMode(value: left | right | bottom | undocked | detach): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
