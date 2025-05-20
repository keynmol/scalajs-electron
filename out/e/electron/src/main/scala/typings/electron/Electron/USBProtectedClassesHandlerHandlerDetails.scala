package typings.electron.Electron

import typings.electron.electronStrings.`audio-video`
import typings.electron.electronStrings.`mass-storage`
import typings.electron.electronStrings.`smart-card`
import typings.electron.electronStrings.audio
import typings.electron.electronStrings.hid
import typings.electron.electronStrings.video
import typings.electron.electronStrings.wireless
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait USBProtectedClassesHandlerHandlerDetails extends StObject {
  
  /**
    * The current list of protected USB classes. Possible class values include:
    */
  var protectedClasses: js.Array[audio | `audio-video` | hid | `mass-storage` | `smart-card` | video | wireless]
}
object USBProtectedClassesHandlerHandlerDetails {
  
  inline def apply(
    protectedClasses: js.Array[audio | `audio-video` | hid | `mass-storage` | `smart-card` | video | wireless]
  ): USBProtectedClassesHandlerHandlerDetails = {
    val __obj = js.Dynamic.literal(protectedClasses = protectedClasses.asInstanceOf[js.Any])
    __obj.asInstanceOf[USBProtectedClassesHandlerHandlerDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: USBProtectedClassesHandlerHandlerDetails] (val x: Self) extends AnyVal {
    
    inline def setProtectedClasses(value: js.Array[audio | `audio-video` | hid | `mass-storage` | `smart-card` | video | wireless]): Self = StObject.set(x, "protectedClasses", value.asInstanceOf[js.Any])
    
    inline def setProtectedClassesVarargs(value: (audio | `audio-video` | hid | `mass-storage` | `smart-card` | video | wireless)*): Self = StObject.set(x, "protectedClasses", js.Array(value*))
  }
}
