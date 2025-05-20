package typings.electron.Electron

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DownloadURLOptions extends StObject {
  
  /**
    * HTTP request headers.
    */
  var headers: js.UndefOr[Record[String, String]] = js.undefined
}
object DownloadURLOptions {
  
  inline def apply(): DownloadURLOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DownloadURLOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DownloadURLOptions] (val x: Self) extends AnyVal {
    
    inline def setHeaders(value: Record[String, String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
  }
}
