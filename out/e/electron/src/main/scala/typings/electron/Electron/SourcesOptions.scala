package typings.electron.Electron

import typings.electron.electronStrings.screen
import typings.electron.electronStrings.window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourcesOptions extends StObject {
  
  /**
    * Set to true to enable fetching window icons. The default value is false. When
    * false the appIcon property of the sources return null. Same if a source has the
    * type screen.
    */
  var fetchWindowIcons: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The size that the media source thumbnail should be scaled to. Default is `150` x
    * `150`. Set width or height to 0 when you do not need the thumbnails. This will
    * save the processing time required for capturing the content of each window and
    * screen.
    */
  var thumbnailSize: js.UndefOr[Size] = js.undefined
  
  /**
    * An array of strings that lists the types of desktop sources to be captured,
    * available types can be `screen` and `window`.
    */
  var types: js.Array[screen | window]
}
object SourcesOptions {
  
  inline def apply(types: js.Array[screen | window]): SourcesOptions = {
    val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourcesOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SourcesOptions] (val x: Self) extends AnyVal {
    
    inline def setFetchWindowIcons(value: Boolean): Self = StObject.set(x, "fetchWindowIcons", value.asInstanceOf[js.Any])
    
    inline def setFetchWindowIconsUndefined: Self = StObject.set(x, "fetchWindowIcons", js.undefined)
    
    inline def setThumbnailSize(value: Size): Self = StObject.set(x, "thumbnailSize", value.asInstanceOf[js.Any])
    
    inline def setThumbnailSizeUndefined: Self = StObject.set(x, "thumbnailSize", js.undefined)
    
    inline def setTypes(value: js.Array[screen | window]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    inline def setTypesVarargs(value: (screen | window)*): Self = StObject.set(x, "types", js.Array(value*))
  }
}
