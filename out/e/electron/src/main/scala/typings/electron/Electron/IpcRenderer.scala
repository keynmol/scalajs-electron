package typings.electron.Electron

import org.scalajs.dom.MessagePort
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.EventEmitter * / any */ @js.native
trait IpcRenderer extends StObject {
  
  // Docs: https://electronjs.org/docs/api/ipc-renderer
  /**
    * Alias for `ipcRenderer.on`.
    */
  def addListener(channel: String, listener: js.Function2[/* event */ IpcRendererEvent, /* repeated */ Any, Unit]): this.type = js.native
  
  /**
    * Resolves with the response from the main process.
    *
    * Send a message to the main process via `channel` and expect a result
    * asynchronously. Arguments will be serialized with the Structured Clone
    * Algorithm, just like `window.postMessage`, so prototype chains will not be
    * included. Sending Functions, Promises, Symbols, WeakMaps, or WeakSets will throw
    * an exception.
    *
    * The main process should listen for `channel` with `ipcMain.handle()`.
    *
    * For example:
    *
    * If you need to transfer a `MessagePort` to the main process, use
    * `ipcRenderer.postMessage`.
    *
    * If you do not need a response to the message, consider using `ipcRenderer.send`.
    *
    * > [!NOTE] Sending non-standard JavaScript types such as DOM objects or special
    * Electron objects will throw an exception.
    *
    * Since the main process does not have support for DOM objects such as
    * `ImageBitmap`, `File`, `DOMMatrix` and so on, such objects cannot be sent over
    * Electron's IPC to the main process, as the main process would have no way to
    * decode them. Attempting to send such objects over IPC will result in an error.
    *
    * > [!NOTE] If the handler in the main process throws an error, the promise
    * returned by `invoke` will reject. However, the `Error` object in the renderer
    * process will not be the same as the one thrown in the main process.
    */
  def invoke(channel: String, args: Any*): js.Promise[Any] = js.native
  
  /**
    * Removes the specified `listener` from the listener array for the specified
    * `channel`.
    */
  def off(channel: String, listener: js.Function2[/* event */ IpcRendererEvent, /* repeated */ Any, Unit]): this.type = js.native
  
  /**
    * Listens to `channel`, when a new message arrives `listener` would be called with
    * `listener(event, args...)`.
    *
    * :::warning Do not expose the `event` argument to the renderer for security
    * reasons! Wrap any callback that you receive from the renderer in another
    * function like this: `ipcRenderer.on('my-channel', (event, ...args) =>
    * callback(...args))`. Not wrapping the callback in such a function would expose
    * dangerous Electron APIs to the renderer process. See the security guide for more
    * info. :::
    */
  def on(channel: String, listener: js.Function2[/* event */ IpcRendererEvent, /* repeated */ Any, Unit]): this.type = js.native
  
  /**
    * Adds a one time `listener` function for the event. This `listener` is invoked
    * only the next time a message is sent to `channel`, after which it is removed.
    */
  def once(channel: String, listener: js.Function2[/* event */ IpcRendererEvent, /* repeated */ Any, Unit]): this.type = js.native
  
  /**
    * Send a message to the main process, optionally transferring ownership of zero or
    * more `MessagePort` objects.
    *
    * The transferred `MessagePort` objects will be available in the main process as
    * `MessagePortMain` objects by accessing the `ports` property of the emitted
    * event.
    *
    * For example:
    *
    * For more information on using `MessagePort` and `MessageChannel`, see the MDN
    * documentation.
    */
  def postMessage(channel: String, message: Any): Unit = js.native
  def postMessage(channel: String, message: Any, transfer: js.Array[MessagePort]): Unit = js.native
  
  /**
    * Removes all listeners from the specified `channel`. Removes all listeners from
    * all channels if no channel is specified.
    */
  def removeAllListeners(): this.type = js.native
  def removeAllListeners(channel: String): this.type = js.native
  
  /**
    * Alias for `ipcRenderer.off`.
    */
  def removeListener(channel: String, listener: js.Function2[/* event */ IpcRendererEvent, /* repeated */ Any, Unit]): this.type = js.native
  
  /**
    * Send an asynchronous message to the main process via `channel`, along with
    * arguments. Arguments will be serialized with the Structured Clone Algorithm,
    * just like `window.postMessage`, so prototype chains will not be included.
    * Sending Functions, Promises, Symbols, WeakMaps, or WeakSets will throw an
    * exception.
    *
    * > **NOTE:** Sending non-standard JavaScript types such as DOM objects or special
    * Electron objects will throw an exception.
    *
    * Since the main process does not have support for DOM objects such as
    * `ImageBitmap`, `File`, `DOMMatrix` and so on, such objects cannot be sent over
    * Electron's IPC to the main process, as the main process would have no way to
    * decode them. Attempting to send such objects over IPC will result in an error.
    *
    * The main process handles it by listening for `channel` with the `ipcMain`
    * module.
    *
    * If you need to transfer a `MessagePort` to the main process, use
    * `ipcRenderer.postMessage`.
    *
    * If you want to receive a single response from the main process, like the result
    * of a method call, consider using `ipcRenderer.invoke`.
    */
  def send(channel: String, args: Any*): Unit = js.native
  
  /**
    * The value sent back by the `ipcMain` handler.
    *
    * Send a message to the main process via `channel` and expect a result
    * synchronously. Arguments will be serialized with the Structured Clone Algorithm,
    * just like `window.postMessage`, so prototype chains will not be included.
    * Sending Functions, Promises, Symbols, WeakMaps, or WeakSets will throw an
    * exception.
    *
    * > **NOTE:** Sending non-standard JavaScript types such as DOM objects or special
    * Electron objects will throw an exception.
    *
    * Since the main process does not have support for DOM objects such as
    * `ImageBitmap`, `File`, `DOMMatrix` and so on, such objects cannot be sent over
    * Electron's IPC to the main process, as the main process would have no way to
    * decode them. Attempting to send such objects over IPC will result in an error.
    *
    * The main process handles it by listening for `channel` with `ipcMain` module,
    * and replies by setting `event.returnValue`.
    *
    * > [!WARNING] Sending a synchronous message will block the whole renderer process
    * until the reply is received, so use this method only as a last resort. It's much
    * better to use the asynchronous version, `invoke()`.
    */
  def sendSync(channel: String, args: Any*): Any = js.native
  
  /**
    * Like `ipcRenderer.send` but the event will be sent to the `<webview>` element in
    * the host page instead of the main process.
    */
  def sendToHost(channel: String, args: Any*): Unit = js.native
}
