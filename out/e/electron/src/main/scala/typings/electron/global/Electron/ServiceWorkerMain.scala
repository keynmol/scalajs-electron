package typings.electron.global.Electron

import typings.electron.Electron.StartTask
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Electron.ServiceWorkerMain")
@js.native
open class ServiceWorkerMain ()
  extends StObject
     with typings.electron.Electron.ServiceWorkerMain {
  
  /**
    * An `IpcMainServiceWorker` instance scoped to the service worker.
    *
    * @experimental
    */
  /* CompleteClass */
  override val ipc: typings.electron.Electron.IpcMainServiceWorker = js.native
  
  // Docs: https://electronjs.org/docs/api/service-worker-main
  /**
    * Whether the service worker has been destroyed.
    *
    * @experimental
    */
  /* CompleteClass */
  override def isDestroyed(): Boolean = js.native
  
  /**
    * A `string` representing the scope URL of the service worker.
    *
    * @experimental
    */
  /* CompleteClass */
  override val scope: String = js.native
  
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
  /* CompleteClass */
  override def send(channel: String, args: Any*): Unit = js.native
  
  /**
    * * `end` Function - Method to call when the task has ended. If never called, the
    * service won't terminate while otherwise idle.
    *
    * Initiate a task to keep the service worker alive until ended.
    *
    * @experimental
    */
  /* CompleteClass */
  override def startTask(): StartTask = js.native
  
  /**
    * A `number` representing the ID of the specific version of the service worker
    * script in its scope.
    *
    * @experimental
    */
  /* CompleteClass */
  override val versionId: Double = js.native
}
