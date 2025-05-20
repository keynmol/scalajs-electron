package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FrameCreatedDetails extends StObject {
  
  /**
    * The created frame. May be `null` if accessed after the frame has either
    * navigated or been destroyed.
    */
  var frame: WebFrameMain_ | Null
}
object FrameCreatedDetails {
  
  inline def apply(): FrameCreatedDetails = {
    val __obj = js.Dynamic.literal(frame = null)
    __obj.asInstanceOf[FrameCreatedDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FrameCreatedDetails] (val x: Self) extends AnyVal {
    
    inline def setFrame(value: WebFrameMain_): Self = StObject.set(x, "frame", value.asInstanceOf[js.Any])
    
    inline def setFrameNull: Self = StObject.set(x, "frame", null)
  }
}
