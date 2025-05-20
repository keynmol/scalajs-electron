package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProtocolResponseUploadData extends StObject {
  
  // Docs: https://electronjs.org/docs/api/structures/protocol-response-upload-data
  /**
    * MIME type of the content.
    */
  var contentType: String
  
  /**
    * Content to be sent.
    */
  var data: String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Buffer */ Any)
}
object ProtocolResponseUploadData {
  
  inline def apply(
    contentType: String,
    data: String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Buffer */ Any)
  ): ProtocolResponseUploadData = {
    val __obj = js.Dynamic.literal(contentType = contentType.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProtocolResponseUploadData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProtocolResponseUploadData] (val x: Self) extends AnyVal {
    
    inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setData(
      value: String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Buffer */ Any)
    ): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
