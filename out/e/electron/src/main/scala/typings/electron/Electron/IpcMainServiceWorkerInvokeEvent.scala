package typings.electron.Electron

import typings.electron.electronStrings.`service-worker`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent electron.Electron.Event<{}> */
trait IpcMainServiceWorkerInvokeEvent extends StObject {
  
  val defaultPrevented: Boolean
  
  def preventDefault(): Unit
  
  // Docs: https://electronjs.org/docs/api/structures/ipc-main-service-worker-invoke-event
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
object IpcMainServiceWorkerInvokeEvent {
  
  inline def apply(
    defaultPrevented: Boolean,
    preventDefault: () => Unit,
    serviceWorker: ServiceWorkerMain,
    session: Session_,
    versionId: Double
  ): IpcMainServiceWorkerInvokeEvent = {
    val __obj = js.Dynamic.literal(defaultPrevented = defaultPrevented.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), serviceWorker = serviceWorker.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any], versionId = versionId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("service-worker")
    __obj.asInstanceOf[IpcMainServiceWorkerInvokeEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IpcMainServiceWorkerInvokeEvent] (val x: Self) extends AnyVal {
    
    inline def setDefaultPrevented(value: Boolean): Self = StObject.set(x, "defaultPrevented", value.asInstanceOf[js.Any])
    
    inline def setPreventDefault(value: () => Unit): Self = StObject.set(x, "preventDefault", js.Any.fromFunction0(value))
    
    inline def setServiceWorker(value: ServiceWorkerMain): Self = StObject.set(x, "serviceWorker", value.asInstanceOf[js.Any])
    
    inline def setSession(value: Session_): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    
    inline def setType(value: `service-worker`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setVersionId(value: Double): Self = StObject.set(x, "versionId", value.asInstanceOf[js.Any])
  }
}
