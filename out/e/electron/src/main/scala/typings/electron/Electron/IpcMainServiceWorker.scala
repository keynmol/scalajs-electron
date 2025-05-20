package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IpcMainServiceWorker extends StObject {
  
  // Docs: https://electronjs.org/docs/api/ipc-main-service-worker
  def handle(
    channel: String,
    listener: js.Function2[
      /* event */ IpcMainServiceWorkerInvokeEvent, 
      /* repeated */ Any, 
      js.Promise[Any] | Any
    ]
  ): Unit = js.native
  
  /**
    * Handles a single `invoke`able IPC message, then removes the listener. See
    * `ipcMainServiceWorker.handle(channel, listener)`.
    */
  def handleOnce(
    channel: String,
    listener: js.Function2[
      /* event */ IpcMainServiceWorkerInvokeEvent, 
      /* repeated */ Any, 
      js.Promise[Any] | Any
    ]
  ): Unit = js.native
  
  /**
    * Listens to `channel`, when a new message arrives `listener` would be called with
    * `listener(event, args...)`.
    */
  def on(
    channel: String,
    listener: js.Function2[/* event */ IpcMainServiceWorkerEvent, /* repeated */ Any, Unit]
  ): this.type = js.native
  
  /**
    * Adds a one time `listener` function for the event. This `listener` is invoked
    * only the next time a message is sent to `channel`, after which it is removed.
    */
  def once(
    channel: String,
    listener: js.Function2[/* event */ IpcMainServiceWorkerEvent, /* repeated */ Any, Unit]
  ): this.type = js.native
  
  /**
    * Removes listeners of the specified `channel`.
    */
  def removeAllListeners(): this.type = js.native
  def removeAllListeners(channel: String): this.type = js.native
  
  /**
    * Removes any handler for `channel`, if present.
    */
  def removeHandler(channel: String): Unit = js.native
  
  /**
    * Removes the specified `listener` from the listener array for the specified
    * `channel`.
    */
  def removeListener(channel: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
}
