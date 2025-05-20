package typings.electron.Electron

import typings.electron.electronStrings.`console-message`
import typings.electron.electronStrings.`registration-completed`
import typings.electron.electronStrings.`running-status-changed`
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServiceWorkers extends StObject {
  
  @JSName("addListener")
  def addListener_consolemessage(
    event: `console-message`,
    listener: js.Function2[/* event */ Event[js.Object], /* messageDetails */ MessageDetails, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_registrationcompleted(
    event: `registration-completed`,
    listener: js.Function2[/* event */ Event[js.Object], /* details */ RegistrationCompletedDetails, Unit]
  ): this.type = js.native
  /**
    * @experimental
    */
  @JSName("addListener")
  def addListener_runningstatuschanged(
    event: `running-status-changed`,
    listener: js.Function1[/* details */ Event[ServiceWorkersRunningStatusChangedEventParams], Unit]
  ): this.type = js.native
  
  /**
    * A ServiceWorkerInfo object where the keys are the service worker version ID and
    * the values are the information about that service worker.
    */
  def getAllRunning(): Record[Double, ServiceWorkerInfo] = js.native
  
  /**
    * Information about this service worker
    *
    * If the service worker does not exist or is not running this method will throw an
    * exception.
    *
    * **Deprecated:** Use the new `serviceWorkers.getInfoFromVersionID` API.
    *
    * @deprecated
    */
  def getFromVersionID(versionId: Double): ServiceWorkerInfo = js.native
  
  /**
    * Information about this service worker
    *
    * If the service worker does not exist or is not running this method will throw an
    * exception.
    */
  def getInfoFromVersionID(versionId: Double): ServiceWorkerInfo = js.native
  
  /**
    * Instance of the service worker associated with the given version ID. If there's
    * no associated version, or its running status has changed to 'stopped', this will
    * return `undefined`.
    *
    * @experimental
    */
  def getWorkerFromVersionID(versionId: Double): js.UndefOr[ServiceWorkerMain] = js.native
  
  @JSName("off")
  def off_consolemessage(
    event: `console-message`,
    listener: js.Function2[/* event */ Event[js.Object], /* messageDetails */ MessageDetails, Unit]
  ): this.type = js.native
  @JSName("off")
  def off_registrationcompleted(
    event: `registration-completed`,
    listener: js.Function2[/* event */ Event[js.Object], /* details */ RegistrationCompletedDetails, Unit]
  ): this.type = js.native
  /**
    * @experimental
    */
  @JSName("off")
  def off_runningstatuschanged(
    event: `running-status-changed`,
    listener: js.Function1[/* details */ Event[ServiceWorkersRunningStatusChangedEventParams], Unit]
  ): this.type = js.native
  
  // Docs: https://electronjs.org/docs/api/service-workers
  /**
    * Emitted when a service worker logs something to the console.
    */
  @JSName("on")
  def on_consolemessage(
    event: `console-message`,
    listener: js.Function2[/* event */ Event[js.Object], /* messageDetails */ MessageDetails, Unit]
  ): this.type = js.native
  /**
    * Emitted when a service worker has been registered. Can occur after a call to
    * `navigator.serviceWorker.register('/sw.js')` successfully resolves or when a
    * Chrome extension is loaded.
    */
  @JSName("on")
  def on_registrationcompleted(
    event: `registration-completed`,
    listener: js.Function2[/* event */ Event[js.Object], /* details */ RegistrationCompletedDetails, Unit]
  ): this.type = js.native
  /**
    * Emitted when a service worker's running status has changed.
    *
    * @experimental
    */
  @JSName("on")
  def on_runningstatuschanged(
    event: `running-status-changed`,
    listener: js.Function1[/* details */ Event[ServiceWorkersRunningStatusChangedEventParams], Unit]
  ): this.type = js.native
  
  @JSName("once")
  def once_consolemessage(
    event: `console-message`,
    listener: js.Function2[/* event */ Event[js.Object], /* messageDetails */ MessageDetails, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_registrationcompleted(
    event: `registration-completed`,
    listener: js.Function2[/* event */ Event[js.Object], /* details */ RegistrationCompletedDetails, Unit]
  ): this.type = js.native
  /**
    * @experimental
    */
  @JSName("once")
  def once_runningstatuschanged(
    event: `running-status-changed`,
    listener: js.Function1[/* details */ Event[ServiceWorkersRunningStatusChangedEventParams], Unit]
  ): this.type = js.native
  
  @JSName("removeListener")
  def removeListener_consolemessage(
    event: `console-message`,
    listener: js.Function2[/* event */ Event[js.Object], /* messageDetails */ MessageDetails, Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_registrationcompleted(
    event: `registration-completed`,
    listener: js.Function2[/* event */ Event[js.Object], /* details */ RegistrationCompletedDetails, Unit]
  ): this.type = js.native
  /**
    * @experimental
    */
  @JSName("removeListener")
  def removeListener_runningstatuschanged(
    event: `running-status-changed`,
    listener: js.Function1[/* details */ Event[ServiceWorkersRunningStatusChangedEventParams], Unit]
  ): this.type = js.native
  
  /**
    * Resolves with the service worker when it's started.
    *
    * Starts the service worker or does nothing if already running.
    *
    * @experimental
    */
  def startWorkerForScope(scope: String): js.Promise[ServiceWorkerMain] = js.native
}
