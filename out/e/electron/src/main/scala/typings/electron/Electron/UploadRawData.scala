package typings.electron.Electron

import typings.electron.electronStrings.rawData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UploadRawData extends StObject {
  
  // Docs: https://electronjs.org/docs/api/structures/upload-raw-data
  /**
    * Data to be uploaded.
    */
  var bytes: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Buffer */ Any
  
  /**
    * `rawData`.
    */
  var `type`: rawData
}
object UploadRawData {
  
  inline def apply(
    bytes: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Buffer */ Any
  ): UploadRawData = {
    val __obj = js.Dynamic.literal(bytes = bytes.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("rawData")
    __obj.asInstanceOf[UploadRawData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UploadRawData] (val x: Self) extends AnyVal {
    
    inline def setBytes(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Buffer */ Any
    ): Self = StObject.set(x, "bytes", value.asInstanceOf[js.Any])
    
    inline def setType(value: rawData): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
