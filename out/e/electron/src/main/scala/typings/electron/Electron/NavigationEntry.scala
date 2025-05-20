package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigationEntry extends StObject {
  
  // Docs: https://electronjs.org/docs/api/structures/navigation-entry
  /**
    * A base64 encoded data string containing Chromium page state including
    * information like the current scroll position or form values. It is committed by
    * Chromium before a navigation event and on a regular interval.
    */
  var pageState: js.UndefOr[String] = js.undefined
  
  var title: String
  
  var url: String
}
object NavigationEntry {
  
  inline def apply(title: String, url: String): NavigationEntry = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationEntry]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NavigationEntry] (val x: Self) extends AnyVal {
    
    inline def setPageState(value: String): Self = StObject.set(x, "pageState", value.asInstanceOf[js.Any])
    
    inline def setPageStateUndefined: Self = StObject.set(x, "pageState", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
