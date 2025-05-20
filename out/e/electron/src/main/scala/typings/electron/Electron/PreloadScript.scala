package typings.electron.Electron

import typings.electron.electronStrings.`service-worker`
import typings.electron.electronStrings.frame
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PreloadScript extends StObject {
  
  // Docs: https://electronjs.org/docs/api/structures/preload-script
  /**
    * Path of the script file. Must be an absolute path.
    */
  var filePath: String
  
  /**
    * Unique ID of preload script.
    */
  var id: String
  
  /**
    * Context type where the preload script will be executed. Possible values include
    * `frame` or `service-worker`.
    */
  var `type`: frame | `service-worker`
}
object PreloadScript {
  
  inline def apply(filePath: String, id: String, `type`: frame | `service-worker`): PreloadScript = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreloadScript]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PreloadScript] (val x: Self) extends AnyVal {
    
    inline def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setType(value: frame | `service-worker`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
