package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageChannelMain extends StObject {
  
  // Docs: https://electronjs.org/docs/api/message-channel-main
  /**
    * A `MessagePortMain` property.
    */
  var port1: MessagePortMain
  
  /**
    * A `MessagePortMain` property.
    */
  var port2: MessagePortMain
}
object MessageChannelMain {
  
  inline def apply(port1: MessagePortMain, port2: MessagePortMain): MessageChannelMain = {
    val __obj = js.Dynamic.literal(port1 = port1.asInstanceOf[js.Any], port2 = port2.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageChannelMain]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MessageChannelMain] (val x: Self) extends AnyVal {
    
    inline def setPort1(value: MessagePortMain): Self = StObject.set(x, "port1", value.asInstanceOf[js.Any])
    
    inline def setPort2(value: MessagePortMain): Self = StObject.set(x, "port2", value.asInstanceOf[js.Any])
  }
}
