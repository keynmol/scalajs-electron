package typings.electron.Electron

import typings.electron.electronStrings.action
import typings.electron.electronStrings.click
import typings.electron.electronStrings.close
import typings.electron.electronStrings.critical
import typings.electron.electronStrings.default
import typings.electron.electronStrings.failed
import typings.electron.electronStrings.low
import typings.electron.electronStrings.never
import typings.electron.electronStrings.normal
import typings.electron.electronStrings.reply
import typings.electron.electronStrings.show
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Notification extends StObject {
  
  /**
    * A `NotificationAction[]` property representing the actions of the notification.
    */
  var actions: js.Array[NotificationAction] = js.native
  
  /**
    * @platform darwin
    */
  @JSName("addListener")
  def addListener_action(event: action, listener: js.Function2[/* event */ Event[js.Object], /* index */ Double, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_click(event: click, listener: js.Function1[/* event */ Event[js.Object], Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_close(event: close, listener: js.Function1[/* event */ Event[js.Object], Unit]): this.type = js.native
  /**
    * @platform win32
    */
  @JSName("addListener")
  def addListener_failed(event: failed, listener: js.Function2[/* event */ Event[js.Object], /* error */ String, Unit]): this.type = js.native
  /**
    * @platform darwin
    */
  @JSName("addListener")
  def addListener_reply(event: reply, listener: js.Function2[/* event */ Event[js.Object], /* reply */ String, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_show(event: show, listener: js.Function1[/* event */ Event[js.Object], Unit]): this.type = js.native
  
  /**
    * A `string` property representing the body of the notification.
    */
  var body: String = js.native
  
  /**
    * Dismisses the notification.
    *
    * On Windows, calling `notification.close()` while the notification is visible on
    * screen will dismiss the notification and remove it from the Action Center. If
    * `notification.close()` is called after the notification is no longer visible on
    * screen, calling `notification.close()` will try remove it from the Action
    * Center.
    */
  def close(): Unit = js.native
  
  /**
    * A `string` property representing the close button text of the notification.
    */
  var closeButtonText: String = js.native
  
  /**
    * A `boolean` property representing whether the notification has a reply action.
    */
  var hasReply: Boolean = js.native
  
  /**
    * @platform darwin
    */
  @JSName("off")
  def off_action(event: action, listener: js.Function2[/* event */ Event[js.Object], /* index */ Double, Unit]): this.type = js.native
  @JSName("off")
  def off_click(event: click, listener: js.Function1[/* event */ Event[js.Object], Unit]): this.type = js.native
  @JSName("off")
  def off_close(event: close, listener: js.Function1[/* event */ Event[js.Object], Unit]): this.type = js.native
  /**
    * @platform win32
    */
  @JSName("off")
  def off_failed(event: failed, listener: js.Function2[/* event */ Event[js.Object], /* error */ String, Unit]): this.type = js.native
  /**
    * @platform darwin
    */
  @JSName("off")
  def off_reply(event: reply, listener: js.Function2[/* event */ Event[js.Object], /* reply */ String, Unit]): this.type = js.native
  @JSName("off")
  def off_show(event: show, listener: js.Function1[/* event */ Event[js.Object], Unit]): this.type = js.native
  
  // Docs: https://electronjs.org/docs/api/notification
  /**
    * @platform darwin
    */
  @JSName("on")
  def on_action(event: action, listener: js.Function2[/* event */ Event[js.Object], /* index */ Double, Unit]): this.type = js.native
  /**
    * Emitted when the notification is clicked by the user.
    */
  @JSName("on")
  def on_click(event: click, listener: js.Function1[/* event */ Event[js.Object], Unit]): this.type = js.native
  /**
    * Emitted when the notification is closed by manual intervention from the user.
    *
    * This event is not guaranteed to be emitted in all cases where the notification
    * is closed.
    *
    * On Windows, the `close` event can be emitted in one of three ways: programmatic
    * dismissal with `notification.close()`, by the user closing the notification, or
    * via system timeout. If a notification is in the Action Center after the initial
    * `close` event is emitted, a call to `notification.close()` will remove the
    * notification from the action center but the `close` event will not be emitted
    * again.
    */
  @JSName("on")
  def on_close(event: close, listener: js.Function1[/* event */ Event[js.Object], Unit]): this.type = js.native
  /**
    * Emitted when an error is encountered while creating and showing the native
    * notification.
    *
    * @platform win32
    */
  @JSName("on")
  def on_failed(event: failed, listener: js.Function2[/* event */ Event[js.Object], /* error */ String, Unit]): this.type = js.native
  /**
    * Emitted when the user clicks the "Reply" button on a notification with
    * `hasReply: true`.
    *
    * @platform darwin
    */
  @JSName("on")
  def on_reply(event: reply, listener: js.Function2[/* event */ Event[js.Object], /* reply */ String, Unit]): this.type = js.native
  /**
    * Emitted when the notification is shown to the user. Note that this event can be
    * fired multiple times as a notification can be shown multiple times through the
    * `show()` method.
    */
  @JSName("on")
  def on_show(event: show, listener: js.Function1[/* event */ Event[js.Object], Unit]): this.type = js.native
  
  /**
    * @platform darwin
    */
  @JSName("once")
  def once_action(event: action, listener: js.Function2[/* event */ Event[js.Object], /* index */ Double, Unit]): this.type = js.native
  @JSName("once")
  def once_click(event: click, listener: js.Function1[/* event */ Event[js.Object], Unit]): this.type = js.native
  @JSName("once")
  def once_close(event: close, listener: js.Function1[/* event */ Event[js.Object], Unit]): this.type = js.native
  /**
    * @platform win32
    */
  @JSName("once")
  def once_failed(event: failed, listener: js.Function2[/* event */ Event[js.Object], /* error */ String, Unit]): this.type = js.native
  /**
    * @platform darwin
    */
  @JSName("once")
  def once_reply(event: reply, listener: js.Function2[/* event */ Event[js.Object], /* reply */ String, Unit]): this.type = js.native
  @JSName("once")
  def once_show(event: show, listener: js.Function1[/* event */ Event[js.Object], Unit]): this.type = js.native
  
  /**
    * @platform darwin
    */
  @JSName("removeListener")
  def removeListener_action(event: action, listener: js.Function2[/* event */ Event[js.Object], /* index */ Double, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_click(event: click, listener: js.Function1[/* event */ Event[js.Object], Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_close(event: close, listener: js.Function1[/* event */ Event[js.Object], Unit]): this.type = js.native
  /**
    * @platform win32
    */
  @JSName("removeListener")
  def removeListener_failed(event: failed, listener: js.Function2[/* event */ Event[js.Object], /* error */ String, Unit]): this.type = js.native
  /**
    * @platform darwin
    */
  @JSName("removeListener")
  def removeListener_reply(event: reply, listener: js.Function2[/* event */ Event[js.Object], /* reply */ String, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_show(event: show, listener: js.Function1[/* event */ Event[js.Object], Unit]): this.type = js.native
  
  /**
    * A `string` property representing the reply placeholder of the notification.
    */
  var replyPlaceholder: String = js.native
  
  /**
    * Immediately shows the notification to the user. Unlike the web notification API,
    * instantiating a `new Notification()` does not immediately show it to the user.
    * Instead, you need to call this method before the OS will display it.
    *
    * If the notification has been shown before, this method will dismiss the
    * previously shown notification and create a new one with identical properties.
    */
  def show(): Unit = js.native
  
  /**
    * A `boolean` property representing whether the notification is silent.
    */
  var silent: Boolean = js.native
  
  /**
    * A `string` property representing the sound of the notification.
    */
  var sound: String = js.native
  
  /**
    * A `string` property representing the subtitle of the notification.
    */
  var subtitle: String = js.native
  
  /**
    * A `string` property representing the type of timeout duration for the
    * notification. Can be 'default' or 'never'.
    *
    * If `timeoutType` is set to 'never', the notification never expires. It stays
    * open until closed by the calling API or the user.
    *
    * @platform linux,win32
    */
  var timeoutType: default | never = js.native
  
  /**
    * A `string` property representing the title of the notification.
    */
  var title: String = js.native
  
  /**
    * A `string` property representing the custom Toast XML of the notification.
    *
    * @platform win32
    */
  var toastXml: String = js.native
  
  /**
    * A `string` property representing the urgency level of the notification. Can be
    * 'normal', 'critical', or 'low'.
    *
    * Default is 'low' - see NotifyUrgency for more information.
    *
    * @platform linux
    */
  var urgency: normal | critical | low = js.native
}
