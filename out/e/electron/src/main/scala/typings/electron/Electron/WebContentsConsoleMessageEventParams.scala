package typings.electron.Electron

import typings.electron.electronStrings.debug
import typings.electron.electronStrings.error
import typings.electron.electronStrings.info
import typings.electron.electronStrings.warning
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebContentsConsoleMessageEventParams extends StObject {
  
  /**
    * Frame that logged the message
    */
  var frame: WebFrameMain_
  
  /**
    * Message severity Possible values include `info`, `warning`, `error`, and
    * `debug`.
    */
  var level: info | warning | error | debug
  
  /**
    * Line number in the log source
    */
  var lineNumber: Double
  
  /**
    * Message text
    */
  var message: String
  
  /**
    * URL of the log source
    */
  var sourceId: String
}
object WebContentsConsoleMessageEventParams {
  
  inline def apply(
    frame: WebFrameMain_,
    level: info | warning | error | debug,
    lineNumber: Double,
    message: String,
    sourceId: String
  ): WebContentsConsoleMessageEventParams = {
    val __obj = js.Dynamic.literal(frame = frame.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], lineNumber = lineNumber.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], sourceId = sourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebContentsConsoleMessageEventParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WebContentsConsoleMessageEventParams] (val x: Self) extends AnyVal {
    
    inline def setFrame(value: WebFrameMain_): Self = StObject.set(x, "frame", value.asInstanceOf[js.Any])
    
    inline def setLevel(value: info | warning | error | debug): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setLineNumber(value: Double): Self = StObject.set(x, "lineNumber", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setSourceId(value: String): Self = StObject.set(x, "sourceId", value.asInstanceOf[js.Any])
  }
}
