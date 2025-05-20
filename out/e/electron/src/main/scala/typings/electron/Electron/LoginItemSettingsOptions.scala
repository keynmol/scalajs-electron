package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoginItemSettingsOptions extends StObject {
  
  /**
    * The command-line arguments to compare against. Defaults to an empty array.
    *
    * @platform win32
    */
  var args: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The executable path to compare against. Defaults to `process.execPath`.
    *
    * @platform win32
    */
  var path: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the service. Required if `type` is non-default. Only available on
    * macOS 13 and up.
    *
    * @platform darwin
    */
  var serviceName: js.UndefOr[String] = js.undefined
  
  /**
    * Can be one of `mainAppService`, `agentService`, `daemonService`, or
    * `loginItemService`. Defaults to `mainAppService`. Only available on macOS 13 and
    * up. See app.setLoginItemSettings for more information about each type.
    *
    * @platform darwin
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object LoginItemSettingsOptions {
  
  inline def apply(): LoginItemSettingsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoginItemSettingsOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LoginItemSettingsOptions] (val x: Self) extends AnyVal {
    
    inline def setArgs(value: js.Array[String]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
    
    inline def setArgsVarargs(value: String*): Self = StObject.set(x, "args", js.Array(value*))
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setServiceName(value: String): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
    
    inline def setServiceNameUndefined: Self = StObject.set(x, "serviceName", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
