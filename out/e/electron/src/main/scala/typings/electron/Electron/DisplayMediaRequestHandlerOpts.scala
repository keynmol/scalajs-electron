package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisplayMediaRequestHandlerOpts extends StObject {
  
  /**
    * true if the available native system picker should be used. Default is `false`.
    * _macOS_ _Experimental_
    */
  var useSystemPicker: Boolean
}
object DisplayMediaRequestHandlerOpts {
  
  inline def apply(useSystemPicker: Boolean): DisplayMediaRequestHandlerOpts = {
    val __obj = js.Dynamic.literal(useSystemPicker = useSystemPicker.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisplayMediaRequestHandlerOpts]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DisplayMediaRequestHandlerOpts] (val x: Self) extends AnyVal {
    
    inline def setUseSystemPicker(value: Boolean): Self = StObject.set(x, "useSystemPicker", value.asInstanceOf[js.Any])
  }
}
