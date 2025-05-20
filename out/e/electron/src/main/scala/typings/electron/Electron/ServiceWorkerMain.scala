package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceWorkerMain extends StObject {
  
  /**
    * An `IpcMainServiceWorker` instance scoped to the service worker.
    *
    * @experimental
    */
  val ipc: IpcMainServiceWorker
  
  // Docs: https://electronjs.org/docs/api/service-worker-main
  /**
    * Whether the service worker has been destroyed.
    *
    * @experimental
    */
  def isDestroyed(): Boolean
  
  /**
    * A `string` representing the scope URL of the service worker.
    *
    * @experimental
    */
  val scope: String
  
  /**
    * Send an asynchronous message to the service worker process via `channel`, along
    * with arguments. Arguments will be serialized with the Structured Clone
    * Algorithm, just like `postMessage`, so prototype chains will not be included.
    * Sending Functions, Promises, Symbols, WeakMaps, or WeakSets will throw an
    * exception.
    *
    * The service worker process can handle the message by listening to `channel` with
    * the `ipcRenderer` module.
    *
    * @experimental
    */
  def send(channel: String, args: Any*): Unit
  
  /**
    * * `end` Function - Method to call when the task has ended. If never called, the
    * service won't terminate while otherwise idle.
    *
    * Initiate a task to keep the service worker alive until ended.
    *
    * @experimental
    */
  def startTask(): StartTask
  
  /**
    * A `number` representing the ID of the specific version of the service worker
    * script in its scope.
    *
    * @experimental
    */
  val versionId: Double
}
object ServiceWorkerMain {
  
  inline def apply(
    ipc: IpcMainServiceWorker,
    isDestroyed: () => Boolean,
    scope: String,
    send: (String, /* repeated */ Any) => Unit,
    startTask: () => StartTask,
    versionId: Double
  ): ServiceWorkerMain = {
    val __obj = js.Dynamic.literal(ipc = ipc.asInstanceOf[js.Any], isDestroyed = js.Any.fromFunction0(isDestroyed), scope = scope.asInstanceOf[js.Any], send = js.Any.fromFunction2(send), startTask = js.Any.fromFunction0(startTask), versionId = versionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceWorkerMain]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ServiceWorkerMain] (val x: Self) extends AnyVal {
    
    inline def setIpc(value: IpcMainServiceWorker): Self = StObject.set(x, "ipc", value.asInstanceOf[js.Any])
    
    inline def setIsDestroyed(value: () => Boolean): Self = StObject.set(x, "isDestroyed", js.Any.fromFunction0(value))
    
    inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setSend(value: (String, /* repeated */ Any) => Unit): Self = StObject.set(x, "send", js.Any.fromFunction2(value))
    
    inline def setStartTask(value: () => StartTask): Self = StObject.set(x, "startTask", js.Any.fromFunction0(value))
    
    inline def setVersionId(value: Double): Self = StObject.set(x, "versionId", value.asInstanceOf[js.Any])
  }
}
