package typings.electron.Electron

import typings.electron.electronStrings.bgra
import typings.electron.electronStrings.frame
import typings.electron.electronStrings.popup
import typings.electron.electronStrings.rgba
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextureInfo extends StObject {
  
  /**
    * The full dimensions of the video frame.
    */
  var codedSize: Size
  
  /**
    * The region of the video frame that capturer would like to populate. In OSR case,
    * it is the same with `dirtyRect` that needs to be painted.
    */
  var contentRect: Rectangle
  
  /**
    * Extra metadata. See comments in src\media\base\video_frame_metadata.h for
    * accurate details.
    */
  var metadata: Metadata
  
  /**
    * The modifier is retrieved from GBM library and passed to EGL driver.
    *
    * @platform linux
    */
  var modifier: String
  
  /**
    * The pixel format of the texture. Can be `rgba` or `bgra`.
    */
  var pixelFormat: rgba | bgra
  
  /**
    * Each plane's info of the shared texture.
    *
    * @platform linux
    */
  var planes: js.Array[Planes]
  
  /**
    * The handle to the shared texture.
    *
    * @platform win32,darwin
    */
  var sharedTextureHandle: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Buffer */ Any
  
  /**
    * The time in microseconds since the capture start.
    */
  var timestamp: Double
  
  /**
    * A subsection of [0, 0, codedSize.width(), codedSize.height()]. In OSR case, it
    * is expected to have the full section area.
    */
  var visibleRect: Rectangle
  
  /**
    * The widget type of the texture. Can be `popup` or `frame`.
    */
  var widgetType: popup | frame
}
object TextureInfo {
  
  inline def apply(
    codedSize: Size,
    contentRect: Rectangle,
    metadata: Metadata,
    modifier: String,
    pixelFormat: rgba | bgra,
    planes: js.Array[Planes],
    sharedTextureHandle: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Buffer */ Any,
    timestamp: Double,
    visibleRect: Rectangle,
    widgetType: popup | frame
  ): TextureInfo = {
    val __obj = js.Dynamic.literal(codedSize = codedSize.asInstanceOf[js.Any], contentRect = contentRect.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], modifier = modifier.asInstanceOf[js.Any], pixelFormat = pixelFormat.asInstanceOf[js.Any], planes = planes.asInstanceOf[js.Any], sharedTextureHandle = sharedTextureHandle.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], visibleRect = visibleRect.asInstanceOf[js.Any], widgetType = widgetType.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextureInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TextureInfo] (val x: Self) extends AnyVal {
    
    inline def setCodedSize(value: Size): Self = StObject.set(x, "codedSize", value.asInstanceOf[js.Any])
    
    inline def setContentRect(value: Rectangle): Self = StObject.set(x, "contentRect", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: Metadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setModifier(value: String): Self = StObject.set(x, "modifier", value.asInstanceOf[js.Any])
    
    inline def setPixelFormat(value: rgba | bgra): Self = StObject.set(x, "pixelFormat", value.asInstanceOf[js.Any])
    
    inline def setPlanes(value: js.Array[Planes]): Self = StObject.set(x, "planes", value.asInstanceOf[js.Any])
    
    inline def setPlanesVarargs(value: Planes*): Self = StObject.set(x, "planes", js.Array(value*))
    
    inline def setSharedTextureHandle(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Buffer */ Any
    ): Self = StObject.set(x, "sharedTextureHandle", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setVisibleRect(value: Rectangle): Self = StObject.set(x, "visibleRect", value.asInstanceOf[js.Any])
    
    inline def setWidgetType(value: popup | frame): Self = StObject.set(x, "widgetType", value.asInstanceOf[js.Any])
  }
}
