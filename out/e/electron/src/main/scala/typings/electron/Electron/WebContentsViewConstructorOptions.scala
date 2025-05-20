package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebContentsViewConstructorOptions extends StObject {
  
  /**
    * If present, the given WebContents will be adopted by the WebContentsView. A
    * WebContents may only be presented in one WebContentsView at a time.
    */
  var webContents: js.UndefOr[WebContents_] = js.undefined
  
  /**
    * Settings of web page's features.
    */
  var webPreferences: js.UndefOr[WebPreferences] = js.undefined
}
object WebContentsViewConstructorOptions {
  
  inline def apply(): WebContentsViewConstructorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebContentsViewConstructorOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WebContentsViewConstructorOptions] (val x: Self) extends AnyVal {
    
    inline def setWebContents(value: WebContents_): Self = StObject.set(x, "webContents", value.asInstanceOf[js.Any])
    
    inline def setWebContentsUndefined: Self = StObject.set(x, "webContents", js.undefined)
    
    inline def setWebPreferences(value: WebPreferences): Self = StObject.set(x, "webPreferences", value.asInstanceOf[js.Any])
    
    inline def setWebPreferencesUndefined: Self = StObject.set(x, "webPreferences", js.undefined)
  }
}
