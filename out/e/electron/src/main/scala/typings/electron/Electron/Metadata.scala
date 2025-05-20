package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Metadata extends StObject {
  
  /**
    * Updated area of frame, can be considered as the `dirty` area.
    */
  var captureUpdateRect: js.UndefOr[Rectangle] = js.undefined
  
  /**
    * The increasing count of captured frame. May contain gaps if frames are dropped
    * between two consecutively received frames.
    */
  var frameCount: js.UndefOr[Double] = js.undefined
  
  /**
    * May reflect the frame's contents origin if region capture is used internally.
    */
  var regionCaptureRect: js.UndefOr[Rectangle] = js.undefined
  
  /**
    * Full size of the source frame.
    */
  var sourceSize: js.UndefOr[Rectangle] = js.undefined
}
object Metadata {
  
  inline def apply(): Metadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Metadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Metadata] (val x: Self) extends AnyVal {
    
    inline def setCaptureUpdateRect(value: Rectangle): Self = StObject.set(x, "captureUpdateRect", value.asInstanceOf[js.Any])
    
    inline def setCaptureUpdateRectUndefined: Self = StObject.set(x, "captureUpdateRect", js.undefined)
    
    inline def setFrameCount(value: Double): Self = StObject.set(x, "frameCount", value.asInstanceOf[js.Any])
    
    inline def setFrameCountUndefined: Self = StObject.set(x, "frameCount", js.undefined)
    
    inline def setRegionCaptureRect(value: Rectangle): Self = StObject.set(x, "regionCaptureRect", value.asInstanceOf[js.Any])
    
    inline def setRegionCaptureRectUndefined: Self = StObject.set(x, "regionCaptureRect", js.undefined)
    
    inline def setSourceSize(value: Rectangle): Self = StObject.set(x, "sourceSize", value.asInstanceOf[js.Any])
    
    inline def setSourceSizeUndefined: Self = StObject.set(x, "sourceSize", js.undefined)
  }
}
