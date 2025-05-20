package typings.electron.Electron

import org.scalajs.dom.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebUtils extends StObject {
  
  // Docs: https://electronjs.org/docs/api/web-utils
  /**
    * The file system path that this `File` object points to. In the case where the
    * object passed in is not a `File` object an exception is thrown. In the case
    * where the File object passed in was constructed in JS and is not backed by a
    * file on disk an empty string is returned.
    *
    * This method superseded the previous augmentation to the `File` object with the
    * `path` property.  An example is included below.
    */
  def getPathForFile(file: File): String
}
object WebUtils {
  
  inline def apply(getPathForFile: File => String): WebUtils = {
    val __obj = js.Dynamic.literal(getPathForFile = js.Any.fromFunction1(getPathForFile))
    __obj.asInstanceOf[WebUtils]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WebUtils] (val x: Self) extends AnyVal {
    
    inline def setGetPathForFile(value: File => String): Self = StObject.set(x, "getPathForFile", js.Any.fromFunction1(value))
  }
}
