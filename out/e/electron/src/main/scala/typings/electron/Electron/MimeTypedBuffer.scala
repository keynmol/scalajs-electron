package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MimeTypedBuffer extends StObject {
  
  // Docs: https://electronjs.org/docs/api/structures/mime-typed-buffer
  /**
    * Charset of the buffer.
    */
  var charset: js.UndefOr[String] = js.undefined
  
  /**
    * The actual Buffer content.
    */
  var data: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Buffer */ Any
  
  /**
    * MIME type of the buffer.
    */
  var mimeType: js.UndefOr[String] = js.undefined
}
object MimeTypedBuffer {
  
  inline def apply(
    data: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Buffer */ Any
  ): MimeTypedBuffer = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[MimeTypedBuffer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MimeTypedBuffer] (val x: Self) extends AnyVal {
    
    inline def setCharset(value: String): Self = StObject.set(x, "charset", value.asInstanceOf[js.Any])
    
    inline def setCharsetUndefined: Self = StObject.set(x, "charset", js.undefined)
    
    inline def setData(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Buffer */ Any
    ): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    
    inline def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
  }
}
