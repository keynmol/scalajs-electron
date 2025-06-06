package typings.electron.Electron

import typings.electron.electronStrings.`before-quit-for-update`
import typings.electron.electronStrings.`checking-for-update`
import typings.electron.electronStrings.`update-available`
import typings.electron.electronStrings.`update-downloaded`
import typings.electron.electronStrings.`update-not-available`
import typings.electron.electronStrings.error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.EventEmitter * / any */ @js.native
trait AutoUpdater extends StObject {
  
  @JSName("addListener")
  def addListener_beforequitforupdate(event: `before-quit-for-update`, listener: js.Function0[Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_checkingforupdate(event: `checking-for-update`, listener: js.Function0[Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_error(event: error, listener: js.Function1[/* error */ js.Error, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_updateavailable(event: `update-available`, listener: js.Function0[Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_updatedownloaded(
    event: `update-downloaded`,
    listener: js.Function5[
      /* event */ Event[js.Object], 
      /* releaseNotes */ String, 
      /* releaseName */ String, 
      /* releaseDate */ js.Date, 
      /* updateURL */ String, 
      Unit
    ]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_updatenotavailable(event: `update-not-available`, listener: js.Function0[Unit]): this.type = js.native
  
  /**
    * Asks the server whether there is an update. You must call `setFeedURL` before
    * using this API.
    *
    * > [!NOTE] If an update is available it will be downloaded automatically. Calling
    * `autoUpdater.checkForUpdates()` twice will download the update two times.
    */
  def checkForUpdates(): Unit = js.native
  
  /**
    * The current update feed URL.
    */
  def getFeedURL(): String = js.native
  
  @JSName("off")
  def off_beforequitforupdate(event: `before-quit-for-update`, listener: js.Function0[Unit]): this.type = js.native
  @JSName("off")
  def off_checkingforupdate(event: `checking-for-update`, listener: js.Function0[Unit]): this.type = js.native
  @JSName("off")
  def off_error(event: error, listener: js.Function1[/* error */ js.Error, Unit]): this.type = js.native
  @JSName("off")
  def off_updateavailable(event: `update-available`, listener: js.Function0[Unit]): this.type = js.native
  @JSName("off")
  def off_updatedownloaded(
    event: `update-downloaded`,
    listener: js.Function5[
      /* event */ Event[js.Object], 
      /* releaseNotes */ String, 
      /* releaseName */ String, 
      /* releaseDate */ js.Date, 
      /* updateURL */ String, 
      Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_updatenotavailable(event: `update-not-available`, listener: js.Function0[Unit]): this.type = js.native
  
  // Docs: https://electronjs.org/docs/api/auto-updater
  /**
    * This event is emitted after a user calls `quitAndInstall()`.
    *
    * When this API is called, the `before-quit` event is not emitted before all
    * windows are closed. As a result you should listen to this event if you wish to
    * perform actions before the windows are closed while a process is quitting, as
    * well as listening to `before-quit`.
    */
  @JSName("on")
  def on_beforequitforupdate(event: `before-quit-for-update`, listener: js.Function0[Unit]): this.type = js.native
  /**
    * Emitted when checking for an available update has started.
    */
  @JSName("on")
  def on_checkingforupdate(event: `checking-for-update`, listener: js.Function0[Unit]): this.type = js.native
  /**
    * Emitted when there is an error while updating.
    */
  @JSName("on")
  def on_error(event: error, listener: js.Function1[/* error */ js.Error, Unit]): this.type = js.native
  /**
    * Emitted when there is an available update. The update is downloaded
    * automatically.
    */
  @JSName("on")
  def on_updateavailable(event: `update-available`, listener: js.Function0[Unit]): this.type = js.native
  /**
    * Emitted when an update has been downloaded.
    *
    * On Windows only `releaseName` is available.
    *
    * > [!NOTE] It is not strictly necessary to handle this event. A successfully
    * downloaded update will still be applied the next time the application starts.
    */
  @JSName("on")
  def on_updatedownloaded(
    event: `update-downloaded`,
    listener: js.Function5[
      /* event */ Event[js.Object], 
      /* releaseNotes */ String, 
      /* releaseName */ String, 
      /* releaseDate */ js.Date, 
      /* updateURL */ String, 
      Unit
    ]
  ): this.type = js.native
  /**
    * Emitted when there is no available update.
    */
  @JSName("on")
  def on_updatenotavailable(event: `update-not-available`, listener: js.Function0[Unit]): this.type = js.native
  
  @JSName("once")
  def once_beforequitforupdate(event: `before-quit-for-update`, listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_checkingforupdate(event: `checking-for-update`, listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_error(event: error, listener: js.Function1[/* error */ js.Error, Unit]): this.type = js.native
  @JSName("once")
  def once_updateavailable(event: `update-available`, listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_updatedownloaded(
    event: `update-downloaded`,
    listener: js.Function5[
      /* event */ Event[js.Object], 
      /* releaseNotes */ String, 
      /* releaseName */ String, 
      /* releaseDate */ js.Date, 
      /* updateURL */ String, 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_updatenotavailable(event: `update-not-available`, listener: js.Function0[Unit]): this.type = js.native
  
  /**
    * Restarts the app and installs the update after it has been downloaded. It should
    * only be called after `update-downloaded` has been emitted.
    *
    * Under the hood calling `autoUpdater.quitAndInstall()` will close all application
    * windows first, and automatically call `app.quit()` after all windows have been
    * closed.
    *
    * > [!NOTE] It is not strictly necessary to call this function to apply an update,
    * as a successfully downloaded update will always be applied the next time the
    * application starts.
    */
  def quitAndInstall(): Unit = js.native
  
  @JSName("removeListener")
  def removeListener_beforequitforupdate(event: `before-quit-for-update`, listener: js.Function0[Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_checkingforupdate(event: `checking-for-update`, listener: js.Function0[Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_error(event: error, listener: js.Function1[/* error */ js.Error, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_updateavailable(event: `update-available`, listener: js.Function0[Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_updatedownloaded(
    event: `update-downloaded`,
    listener: js.Function5[
      /* event */ Event[js.Object], 
      /* releaseNotes */ String, 
      /* releaseName */ String, 
      /* releaseDate */ js.Date, 
      /* updateURL */ String, 
      Unit
    ]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_updatenotavailable(event: `update-not-available`, listener: js.Function0[Unit]): this.type = js.native
  
  /**
    * Sets the `url` and initialize the auto updater.
    */
  def setFeedURL(options: FeedURLOptions): Unit = js.native
}
