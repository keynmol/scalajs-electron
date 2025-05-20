package typings.electron.Electron

import typings.electron.electronStrings.file
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UploadFile extends StObject {
  
  // Docs: https://electronjs.org/docs/api/structures/upload-file
  /**
    * Path of file to be uploaded.
    */
  var filePath: String
  
  /**
    * Number of bytes to read from `offset`. Defaults to `0`.
    */
  var length: js.UndefOr[Double] = js.undefined
  
  /**
    * Last Modification time in number of seconds since the UNIX epoch. Defaults to
    * `0`.
    */
  var modificationTime: js.UndefOr[Double] = js.undefined
  
  /**
    * Defaults to `0`.
    */
  var offset: js.UndefOr[Double] = js.undefined
  
  /**
    * `file`.
    */
  var `type`: file
}
object UploadFile {
  
  inline def apply(filePath: String): UploadFile = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("file")
    __obj.asInstanceOf[UploadFile]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UploadFile] (val x: Self) extends AnyVal {
    
    inline def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    inline def setModificationTime(value: Double): Self = StObject.set(x, "modificationTime", value.asInstanceOf[js.Any])
    
    inline def setModificationTimeUndefined: Self = StObject.set(x, "modificationTime", js.undefined)
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setType(value: file): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
