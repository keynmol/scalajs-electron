package typings.electron.Electron

import typings.electron.electronStrings.`service-worker`
import typings.electron.electronStrings.frame
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PreloadScriptRegistration extends StObject {
  
  // Docs: https://electronjs.org/docs/api/structures/preload-script-registration
  /**
    * Path of the script file. Must be an absolute path.
    */
  var filePath: String
  
  /**
    * Unique ID of preload script. Defaults to a random UUID.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Context type where the preload script will be executed. Possible values include
    * `frame` or `service-worker`.
    */
  var `type`: frame | `service-worker`
}
object PreloadScriptRegistration {
  
  inline def apply(filePath: String, `type`: frame | `service-worker`): PreloadScriptRegistration = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreloadScriptRegistration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PreloadScriptRegistration] (val x: Self) extends AnyVal {
    
    inline def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setType(value: frame | `service-worker`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
