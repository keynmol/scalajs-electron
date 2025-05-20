package typings.electron.Electron

import typings.electron.electronStrings.frame
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent electron.Electron.Event<{}> */
trait IpcMainEvent extends StObject {
  
  val defaultPrevented: Boolean
  
  // Docs: https://electronjs.org/docs/api/structures/ipc-main-event
  /**
    * The ID of the renderer frame that sent this message
    */
  var frameId: Double
  
  /**
    * A list of MessagePorts that were transferred with this message
    */
  var ports: js.Array[MessagePortMain]
  
  def preventDefault(): Unit
  
  /**
    * The internal ID of the renderer process that sent this message
    */
  var processId: Double
  
  /**
    * A function that will send an IPC message to the renderer frame that sent the
    * original message that you are currently handling.  You should use this method to
    * "reply" to the sent message in order to guarantee the reply will go to the
    * correct process and frame.
    */
  def reply(channel: String, args: Any*): Unit
  
  /**
    * Set this to the value to be returned in a synchronous message
    */
  var returnValue: Any
  
  /**
    * Returns the `webContents` that sent the message
    */
  var sender: WebContents_
  
  /**
    * The frame that sent this message. May be `null` if accessed after the frame has
    * either navigated or been destroyed.
    *
    */
  val senderFrame: WebFrameMain_ | Null
  
  /**
    * Possible values include `frame`
    */
  var `type`: frame
}
object IpcMainEvent {
  
  inline def apply(
    defaultPrevented: Boolean,
    frameId: Double,
    ports: js.Array[MessagePortMain],
    preventDefault: () => Unit,
    processId: Double,
    reply: (String, /* repeated */ Any) => Unit,
    returnValue: Any,
    sender: WebContents_
  ): IpcMainEvent = {
    val __obj = js.Dynamic.literal(defaultPrevented = defaultPrevented.asInstanceOf[js.Any], frameId = frameId.asInstanceOf[js.Any], ports = ports.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), processId = processId.asInstanceOf[js.Any], reply = js.Any.fromFunction2(reply), returnValue = returnValue.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], senderFrame = null)
    __obj.updateDynamic("type")("frame")
    __obj.asInstanceOf[IpcMainEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IpcMainEvent] (val x: Self) extends AnyVal {
    
    inline def setDefaultPrevented(value: Boolean): Self = StObject.set(x, "defaultPrevented", value.asInstanceOf[js.Any])
    
    inline def setFrameId(value: Double): Self = StObject.set(x, "frameId", value.asInstanceOf[js.Any])
    
    inline def setPorts(value: js.Array[MessagePortMain]): Self = StObject.set(x, "ports", value.asInstanceOf[js.Any])
    
    inline def setPortsVarargs(value: MessagePortMain*): Self = StObject.set(x, "ports", js.Array(value*))
    
    inline def setPreventDefault(value: () => Unit): Self = StObject.set(x, "preventDefault", js.Any.fromFunction0(value))
    
    inline def setProcessId(value: Double): Self = StObject.set(x, "processId", value.asInstanceOf[js.Any])
    
    inline def setReply(value: (String, /* repeated */ Any) => Unit): Self = StObject.set(x, "reply", js.Any.fromFunction2(value))
    
    inline def setReturnValue(value: Any): Self = StObject.set(x, "returnValue", value.asInstanceOf[js.Any])
    
    inline def setSender(value: WebContents_): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
    
    inline def setSenderFrame(value: WebFrameMain_): Self = StObject.set(x, "senderFrame", value.asInstanceOf[js.Any])
    
    inline def setSenderFrameNull: Self = StObject.set(x, "senderFrame", null)
    
    inline def setType(value: frame): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
