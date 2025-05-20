package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SaveDialogReturnValue extends StObject {
  
  /**
    * Base64 encoded string which contains the security scoped bookmark data for the
    * saved file. `securityScopedBookmarks` must be enabled for this to be present.
    * (For return values, see table here.)
    *
    * @platform darwin,mas
    */
  var bookmark: js.UndefOr[String] = js.undefined
  
  /**
    * whether or not the dialog was canceled.
    */
  var canceled: Boolean
  
  /**
    * If the dialog is canceled, this will be an empty string.
    */
  var filePath: String
}
object SaveDialogReturnValue {
  
  inline def apply(canceled: Boolean, filePath: String): SaveDialogReturnValue = {
    val __obj = js.Dynamic.literal(canceled = canceled.asInstanceOf[js.Any], filePath = filePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[SaveDialogReturnValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SaveDialogReturnValue] (val x: Self) extends AnyVal {
    
    inline def setBookmark(value: String): Self = StObject.set(x, "bookmark", value.asInstanceOf[js.Any])
    
    inline def setBookmarkUndefined: Self = StObject.set(x, "bookmark", js.undefined)
    
    inline def setCanceled(value: Boolean): Self = StObject.set(x, "canceled", value.asInstanceOf[js.Any])
    
    inline def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
  }
}
