package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SharedDictionaryUsageInfo extends StObject {
  
  // Docs: https://electronjs.org/docs/api/structures/shared-dictionary-usage-info
  /**
    * The origin of the frame where the request originates. It’s specific to the
    * individual frame making the request and is defined by its scheme, host, and
    * port. In practice, will look like a URL.
    */
  var frameOrigin: String
  
  /**
    * The site of the top-level browsing context (the main frame or tab that contains
    * the request). It’s less granular than `frameOrigin` and focuses on the broader
    * "site" scope. In practice, will look like a URL.
    */
  var topFrameSite: String
  
  /**
    * The amount of bytes stored for this shared dictionary information object in
    * Chromium's internal storage (usually Sqlite).
    */
  var totalSizeBytes: Double
}
object SharedDictionaryUsageInfo {
  
  inline def apply(frameOrigin: String, topFrameSite: String, totalSizeBytes: Double): SharedDictionaryUsageInfo = {
    val __obj = js.Dynamic.literal(frameOrigin = frameOrigin.asInstanceOf[js.Any], topFrameSite = topFrameSite.asInstanceOf[js.Any], totalSizeBytes = totalSizeBytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[SharedDictionaryUsageInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SharedDictionaryUsageInfo] (val x: Self) extends AnyVal {
    
    inline def setFrameOrigin(value: String): Self = StObject.set(x, "frameOrigin", value.asInstanceOf[js.Any])
    
    inline def setTopFrameSite(value: String): Self = StObject.set(x, "topFrameSite", value.asInstanceOf[js.Any])
    
    inline def setTotalSizeBytes(value: Double): Self = StObject.set(x, "totalSizeBytes", value.asInstanceOf[js.Any])
  }
}
