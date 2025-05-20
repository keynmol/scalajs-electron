package typings.electron.Electron

import typings.electron.electronStrings.`received-apns-notification`
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.EventEmitter * / any */ trait PushNotifications extends StObject {
  
  /**
    * @platform darwin
    */
  @JSName("addListener")
  def addListener_receivedapnsnotification(
    event: `received-apns-notification`,
    listener: js.Function2[/* event */ Event[js.Object], /* userInfo */ Record[String, Any], Unit]
  ): this.type
  
  /**
    * @platform darwin
    */
  @JSName("off")
  def off_receivedapnsnotification(
    event: `received-apns-notification`,
    listener: js.Function2[/* event */ Event[js.Object], /* userInfo */ Record[String, Any], Unit]
  ): this.type
  
  // Docs: https://electronjs.org/docs/api/push-notifications
  /**
    * Emitted when the app receives a remote notification while running. See:
    * https://developer.apple.com/documentation/appkit/nsapplicationdelegate/1428430-application?language=objc
    *
    * @platform darwin
    */
  @JSName("on")
  def on_receivedapnsnotification(
    event: `received-apns-notification`,
    listener: js.Function2[/* event */ Event[js.Object], /* userInfo */ Record[String, Any], Unit]
  ): this.type
  
  /**
    * @platform darwin
    */
  @JSName("once")
  def once_receivedapnsnotification(
    event: `received-apns-notification`,
    listener: js.Function2[/* event */ Event[js.Object], /* userInfo */ Record[String, Any], Unit]
  ): this.type
  
  /**
    * Registers the app with Apple Push Notification service (APNS) to receive Badge,
    * Sound, and Alert notifications. If registration is successful, the promise will
    * be resolved with the APNS device token. Otherwise, the promise will be rejected
    * with an error message. See:
    * https://developer.apple.com/documentation/appkit/nsapplication/1428476-registerforremotenotificationtyp?language=objc
    *
    * @platform darwin
    */
  def registerForAPNSNotifications(): js.Promise[String]
  
  /**
    * @platform darwin
    */
  @JSName("removeListener")
  def removeListener_receivedapnsnotification(
    event: `received-apns-notification`,
    listener: js.Function2[/* event */ Event[js.Object], /* userInfo */ Record[String, Any], Unit]
  ): this.type
  
  /**
    * Unregisters the app from notifications received from APNS.
    *
    * Apps unregistered through this method can always reregister.
    *
    * See:
    * https://developer.apple.com/documentation/appkit/nsapplication/1428747-unregisterforremotenotifications?language=objc
    *
    * @platform darwin
    */
  def unregisterForAPNSNotifications(): Unit
}
object PushNotifications {
  
  inline def apply(
    addListener: (`received-apns-notification`, js.Function2[/* event */ Event[js.Object], /* userInfo */ Record[String, Any], Unit]) => PushNotifications,
    off: (`received-apns-notification`, js.Function2[/* event */ Event[js.Object], /* userInfo */ Record[String, Any], Unit]) => PushNotifications,
    on: (`received-apns-notification`, js.Function2[/* event */ Event[js.Object], /* userInfo */ Record[String, Any], Unit]) => PushNotifications,
    once: (`received-apns-notification`, js.Function2[/* event */ Event[js.Object], /* userInfo */ Record[String, Any], Unit]) => PushNotifications,
    registerForAPNSNotifications: () => js.Promise[String],
    removeListener: (`received-apns-notification`, js.Function2[/* event */ Event[js.Object], /* userInfo */ Record[String, Any], Unit]) => PushNotifications,
    unregisterForAPNSNotifications: () => Unit
  ): PushNotifications = {
    val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction2(addListener), off = js.Any.fromFunction2(off), on = js.Any.fromFunction2(on), once = js.Any.fromFunction2(once), registerForAPNSNotifications = js.Any.fromFunction0(registerForAPNSNotifications), removeListener = js.Any.fromFunction2(removeListener), unregisterForAPNSNotifications = js.Any.fromFunction0(unregisterForAPNSNotifications))
    __obj.asInstanceOf[PushNotifications]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PushNotifications] (val x: Self) extends AnyVal {
    
    inline def setAddListener(
      value: (`received-apns-notification`, js.Function2[/* event */ Event[js.Object], /* userInfo */ Record[String, Any], Unit]) => PushNotifications
    ): Self = StObject.set(x, "addListener", js.Any.fromFunction2(value))
    
    inline def setOff(
      value: (`received-apns-notification`, js.Function2[/* event */ Event[js.Object], /* userInfo */ Record[String, Any], Unit]) => PushNotifications
    ): Self = StObject.set(x, "off", js.Any.fromFunction2(value))
    
    inline def setOn(
      value: (`received-apns-notification`, js.Function2[/* event */ Event[js.Object], /* userInfo */ Record[String, Any], Unit]) => PushNotifications
    ): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
    
    inline def setOnce(
      value: (`received-apns-notification`, js.Function2[/* event */ Event[js.Object], /* userInfo */ Record[String, Any], Unit]) => PushNotifications
    ): Self = StObject.set(x, "once", js.Any.fromFunction2(value))
    
    inline def setRegisterForAPNSNotifications(value: () => js.Promise[String]): Self = StObject.set(x, "registerForAPNSNotifications", js.Any.fromFunction0(value))
    
    inline def setRemoveListener(
      value: (`received-apns-notification`, js.Function2[/* event */ Event[js.Object], /* userInfo */ Record[String, Any], Unit]) => PushNotifications
    ): Self = StObject.set(x, "removeListener", js.Any.fromFunction2(value))
    
    inline def setUnregisterForAPNSNotifications(value: () => Unit): Self = StObject.set(x, "unregisterForAPNSNotifications", js.Any.fromFunction0(value))
  }
}
