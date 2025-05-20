package typings.electron.Electron

import typings.electron.electronStrings.readable
import typings.electron.electronStrings.writable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilesystemPermissionRequest
  extends StObject
     with PermissionRequest {
  
  // Docs: https://electronjs.org/docs/api/structures/filesystem-permission-request
  /**
    * The access type of the `fileSystem` request. Can be `writable` or `readable`.
    */
  var fileAccessType: js.UndefOr[writable | readable] = js.undefined
  
  /**
    * The path of the `fileSystem` request.
    */
  var filePath: js.UndefOr[String] = js.undefined
  
  /**
    * Whether the `fileSystem` request is a directory.
    */
  var isDirectory: js.UndefOr[Boolean] = js.undefined
}
object FilesystemPermissionRequest {
  
  inline def apply(isMainFrame: Boolean, requestingUrl: String): FilesystemPermissionRequest = {
    val __obj = js.Dynamic.literal(isMainFrame = isMainFrame.asInstanceOf[js.Any], requestingUrl = requestingUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilesystemPermissionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FilesystemPermissionRequest] (val x: Self) extends AnyVal {
    
    inline def setFileAccessType(value: writable | readable): Self = StObject.set(x, "fileAccessType", value.asInstanceOf[js.Any])
    
    inline def setFileAccessTypeUndefined: Self = StObject.set(x, "fileAccessType", js.undefined)
    
    inline def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
    
    inline def setFilePathUndefined: Self = StObject.set(x, "filePath", js.undefined)
    
    inline def setIsDirectory(value: Boolean): Self = StObject.set(x, "isDirectory", value.asInstanceOf[js.Any])
    
    inline def setIsDirectoryUndefined: Self = StObject.set(x, "isDirectory", js.undefined)
  }
}
