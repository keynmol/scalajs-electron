package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileSystemAccessRestrictedDetails extends StObject {
  
  /**
    * Whether or not the path is a directory.
    */
  var isDirectory: Boolean
  
  /**
    * The origin that initiated access to the blocked path.
    */
  var origin: String
  
  /**
    * The blocked path attempting to be accessed.
    */
  var path: String
}
object FileSystemAccessRestrictedDetails {
  
  inline def apply(isDirectory: Boolean, origin: String, path: String): FileSystemAccessRestrictedDetails = {
    val __obj = js.Dynamic.literal(isDirectory = isDirectory.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileSystemAccessRestrictedDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FileSystemAccessRestrictedDetails] (val x: Self) extends AnyVal {
    
    inline def setIsDirectory(value: Boolean): Self = StObject.set(x, "isDirectory", value.asInstanceOf[js.Any])
    
    inline def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
