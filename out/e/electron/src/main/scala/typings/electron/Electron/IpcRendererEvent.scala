package typings.electron.Electron

import org.scalajs.dom.MessagePort
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent electron.Electron.Event<{}> */
trait IpcRendererEvent extends StObject {
  
  val defaultPrevented: Boolean
  
  // Docs: https://electronjs.org/docs/api/structures/ipc-renderer-event
  /**
    * A list of MessagePorts that were transferred with this message
    */
  var ports: js.Array[MessagePort]
  
  def preventDefault(): Unit
  
  /**
    * The `IpcRenderer` instance that emitted the event originally
    */
  var sender: IpcRenderer
}
object IpcRendererEvent {
  
  inline def apply(
    defaultPrevented: Boolean,
    ports: js.Array[MessagePort],
    preventDefault: () => Unit,
    sender: IpcRenderer
  ): IpcRendererEvent = {
    val __obj = js.Dynamic.literal(defaultPrevented = defaultPrevented.asInstanceOf[js.Any], ports = ports.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[IpcRendererEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IpcRendererEvent] (val x: Self) extends AnyVal {
    
    inline def setDefaultPrevented(value: Boolean): Self = StObject.set(x, "defaultPrevented", value.asInstanceOf[js.Any])
    
    inline def setPorts(value: js.Array[MessagePort]): Self = StObject.set(x, "ports", value.asInstanceOf[js.Any])
    
    inline def setPortsVarargs(value: MessagePort*): Self = StObject.set(x, "ports", js.Array(value*))
    
    inline def setPreventDefault(value: () => Unit): Self = StObject.set(x, "preventDefault", js.Any.fromFunction0(value))
    
    inline def setSender(value: IpcRenderer): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
  }
}
