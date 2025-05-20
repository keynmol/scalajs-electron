package typings.electron.Electron

import org.scalajs.dom.ReadableStream
import typings.electron.electronStrings.FatalError
import typings.electron.electronStrings.error
import typings.electron.electronStrings.exit
import typings.electron.electronStrings.message
import typings.electron.electronStrings.spawn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UtilityProcess_ extends StObject {
  
  /**
    * @experimental
    */
  def addListener(event: error, listener: js.Function3[FatalError, /* location */ String, /* report */ String, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_exit(event: exit, listener: js.Function1[/* code */ Double, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_message(event: message, listener: js.Function1[/* message */ Any, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_spawn(event: spawn, listener: js.Function0[Unit]): this.type = js.native
  
  /**
    * Terminates the process gracefully. On POSIX, it uses SIGTERM but will ensure the
    * process is reaped on exit. This function returns true if the kill is successful,
    * and false otherwise.
    */
  def kill(): Boolean = js.native
  
  /**
    * @experimental
    */
  def off(event: error, listener: js.Function3[FatalError, /* location */ String, /* report */ String, Unit]): this.type = js.native
  @JSName("off")
  def off_exit(event: exit, listener: js.Function1[/* code */ Double, Unit]): this.type = js.native
  @JSName("off")
  def off_message(event: message, listener: js.Function1[/* message */ Any, Unit]): this.type = js.native
  @JSName("off")
  def off_spawn(event: spawn, listener: js.Function0[Unit]): this.type = js.native
  
  /**
    * Emitted when the child process needs to terminate due to non continuable error
    * from V8.
    *
    * No matter if you listen to the `error` event, the `exit` event will be emitted
    * after the child process terminates.
    *
    * @experimental
    */
  def on(event: error, listener: js.Function3[FatalError, /* location */ String, /* report */ String, Unit]): this.type = js.native
  /**
    * Emitted after the child process ends.
    */
  @JSName("on")
  def on_exit(event: exit, listener: js.Function1[/* code */ Double, Unit]): this.type = js.native
  /**
    * Emitted when the child process sends a message using
    * `process.parentPort.postMessage()`.
    */
  @JSName("on")
  def on_message(event: message, listener: js.Function1[/* message */ Any, Unit]): this.type = js.native
  /**
    * Emitted once the child process has spawned successfully.
    */
  @JSName("on")
  def on_spawn(event: spawn, listener: js.Function0[Unit]): this.type = js.native
  
  /**
    * @experimental
    */
  def once(event: error, listener: js.Function3[FatalError, /* location */ String, /* report */ String, Unit]): this.type = js.native
  @JSName("once")
  def once_exit(event: exit, listener: js.Function1[/* code */ Double, Unit]): this.type = js.native
  @JSName("once")
  def once_message(event: message, listener: js.Function1[/* message */ Any, Unit]): this.type = js.native
  @JSName("once")
  def once_spawn(event: spawn, listener: js.Function0[Unit]): this.type = js.native
  
  /**
    * A `Integer | undefined` representing the process identifier (PID) of the child
    * process. Until the child process has spawned successfully, the value is
    * `undefined`. When the child process exits, then the value is `undefined` after
    * the `exit` event is emitted.
    *
    * > [!NOTE] You can use the `pid` to determine if the process is currently
    * running.
    */
  var pid: js.UndefOr[Double] = js.native
  
  /**
    * Send a message to the child process, optionally transferring ownership of zero
    * or more `MessagePortMain` objects.
    *
    * For example:
    */
  def postMessage(message: Any): Unit = js.native
  def postMessage(message: Any, transfer: js.Array[MessagePortMain]): Unit = js.native
  
  /**
    * @experimental
    */
  def removeListener(event: error, listener: js.Function3[FatalError, /* location */ String, /* report */ String, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_exit(event: exit, listener: js.Function1[/* code */ Double, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_message(event: message, listener: js.Function1[/* message */ Any, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_spawn(event: spawn, listener: js.Function0[Unit]): this.type = js.native
  
  /**
    * A `NodeJS.ReadableStream | null` that represents the child process's stderr. If
    * the child was spawned with options.stdio[2] set to anything other than 'pipe',
    * then this will be `null`. When the child process exits, then the value is `null`
    * after the `exit` event is emitted.
    */
  var stderr: ReadableStream[Any] | Null = js.native
  
  /**
    * A `NodeJS.ReadableStream | null` that represents the child process's stdout. If
    * the child was spawned with options.stdio[1] set to anything other than 'pipe',
    * then this will be `null`. When the child process exits, then the value is `null`
    * after the `exit` event is emitted.
    */
  var stdout: ReadableStream[Any] | Null = js.native
}
