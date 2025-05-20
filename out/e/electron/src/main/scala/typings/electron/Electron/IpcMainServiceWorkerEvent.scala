package typings.electron.Electron

import typings.electron.electronStrings.`service-worker`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent electron.Electron.Event<{}> */
trait IpcMainServiceWorkerEvent extends StObject {
  
  val defaultPrevented: Boolean
  
  // Docs: https://electronjs.org/docs/api/structures/ipc-main-service-worker-event
  /**
    * A list of MessagePorts that were transferred with this message
    */
  var ports: js.Array[MessagePortMain]
  
  def preventDefault(): Unit
  
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
    * The service worker that sent this message
    *
    */
  val serviceWorker: ServiceWorkerMain
  
  /**
    * The `Session` instance with which the event is associated.
    */
  var session: Session_
  
  /**
    * Possible values include `service-worker`.
    */
  var `type`: `service-worker`
  
  /**
    * The service worker version ID.
    */
  var versionId: Double
}
object IpcMainServiceWorkerEvent {
  
  inline def apply(
    defaultPrevented: Boolean,
    ports: js.Array[MessagePortMain],
    preventDefault: () => Unit,
    reply: (String, /* repeated */ Any) => Unit,
    returnValue: Any,
    serviceWorker: ServiceWorkerMain,
    session: Session_,
    versionId: Double
  ): IpcMainServiceWorkerEvent = {
    val __obj = js.Dynamic.literal(defaultPrevented = defaultPrevented.asInstanceOf[js.Any], ports = ports.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), reply = js.Any.fromFunction2(reply), returnValue = returnValue.asInstanceOf[js.Any], serviceWorker = serviceWorker.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any], versionId = versionId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("service-worker")
    __obj.asInstanceOf[IpcMainServiceWorkerEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IpcMainServiceWorkerEvent] (val x: Self) extends AnyVal {
    
    inline def setDefaultPrevented(value: Boolean): Self = StObject.set(x, "defaultPrevented", value.asInstanceOf[js.Any])
    
    inline def setPorts(value: js.Array[MessagePortMain]): Self = StObject.set(x, "ports", value.asInstanceOf[js.Any])
    
    inline def setPortsVarargs(value: MessagePortMain*): Self = StObject.set(x, "ports", js.Array(value*))
    
    inline def setPreventDefault(value: () => Unit): Self = StObject.set(x, "preventDefault", js.Any.fromFunction0(value))
    
    inline def setReply(value: (String, /* repeated */ Any) => Unit): Self = StObject.set(x, "reply", js.Any.fromFunction2(value))
    
    inline def setReturnValue(value: Any): Self = StObject.set(x, "returnValue", value.asInstanceOf[js.Any])
    
    inline def setServiceWorker(value: ServiceWorkerMain): Self = StObject.set(x, "serviceWorker", value.asInstanceOf[js.Any])
    
    inline def setSession(value: Session_): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    
    inline def setType(value: `service-worker`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setVersionId(value: Double): Self = StObject.set(x, "versionId", value.asInstanceOf[js.Any])
  }
}
