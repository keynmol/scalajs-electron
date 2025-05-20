package typings.electron.Electron

import typings.electron.electronStrings.frame
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent electron.Electron.Event<{}> */
trait IpcMainInvokeEvent extends StObject {
  
  val defaultPrevented: Boolean
  
  // Docs: https://electronjs.org/docs/api/structures/ipc-main-invoke-event
  /**
    * The ID of the renderer frame that sent this message
    */
  var frameId: Double
  
  def preventDefault(): Unit
  
  /**
    * The internal ID of the renderer process that sent this message
    */
  var processId: Double
  
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
object IpcMainInvokeEvent {
  
  inline def apply(
    defaultPrevented: Boolean,
    frameId: Double,
    preventDefault: () => Unit,
    processId: Double,
    sender: WebContents_
  ): IpcMainInvokeEvent = {
    val __obj = js.Dynamic.literal(defaultPrevented = defaultPrevented.asInstanceOf[js.Any], frameId = frameId.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), processId = processId.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], senderFrame = null)
    __obj.updateDynamic("type")("frame")
    __obj.asInstanceOf[IpcMainInvokeEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IpcMainInvokeEvent] (val x: Self) extends AnyVal {
    
    inline def setDefaultPrevented(value: Boolean): Self = StObject.set(x, "defaultPrevented", value.asInstanceOf[js.Any])
    
    inline def setFrameId(value: Double): Self = StObject.set(x, "frameId", value.asInstanceOf[js.Any])
    
    inline def setPreventDefault(value: () => Unit): Self = StObject.set(x, "preventDefault", js.Any.fromFunction0(value))
    
    inline def setProcessId(value: Double): Self = StObject.set(x, "processId", value.asInstanceOf[js.Any])
    
    inline def setSender(value: WebContents_): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
    
    inline def setSenderFrame(value: WebFrameMain_): Self = StObject.set(x, "senderFrame", value.asInstanceOf[js.Any])
    
    inline def setSenderFrameNull: Self = StObject.set(x, "senderFrame", null)
    
    inline def setType(value: frame): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
