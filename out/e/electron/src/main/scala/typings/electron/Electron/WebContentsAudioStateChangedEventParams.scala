package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebContentsAudioStateChangedEventParams extends StObject {
  
  /**
    * True if one or more frames or child `webContents` are emitting audio.
    */
  var audible: Boolean
}
object WebContentsAudioStateChangedEventParams {
  
  inline def apply(audible: Boolean): WebContentsAudioStateChangedEventParams = {
    val __obj = js.Dynamic.literal(audible = audible.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebContentsAudioStateChangedEventParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WebContentsAudioStateChangedEventParams] (val x: Self) extends AnyVal {
    
    inline def setAudible(value: Boolean): Self = StObject.set(x, "audible", value.asInstanceOf[js.Any])
  }
}
