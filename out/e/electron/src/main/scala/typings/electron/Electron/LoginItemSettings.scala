package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoginItemSettings extends StObject {
  
  /**
    * `true` if app is set to open at login and its run key is not deactivated. This
    * differs from `openAtLogin` as it ignores the `args` option, this property will
    * be true if the given executable would be launched at login with **any**
    * arguments.
    *
    * @platform win32
    */
  var executableWillLaunchAtLogin: Boolean
  
  var launchItems: js.Array[LaunchItems]
  
  /**
    * `true` if the app is set to open as hidden at login. This does not work on macOS
    * 13 and up.
    *
    * @deprecated
    * @platform darwin
    */
  var openAsHidden: Boolean
  
  /**
    * `true` if the app is set to open at login.
    */
  var openAtLogin: Boolean
  
  /**
    * `true` if the app was opened as a login item that should restore the state from
    * the previous session. This indicates that the app should restore the windows
    * that were open the last time the app was closed. This setting is not available
    * on MAS builds or on macOS 13 and up.
    *
    * @deprecated
    * @platform darwin
    */
  var restoreState: Boolean
  
  /**
    * can be one of `not-registered`, `enabled`, `requires-approval`, or `not-found`.
    *
    * @platform darwin
    */
  var status: String
  
  /**
    * `true` if the app was opened as a hidden login item. This indicates that the app
    * should not open any windows at startup. This setting is not available on MAS
    * builds or on macOS 13 and up.
    *
    * @deprecated
    * @platform darwin
    */
  var wasOpenedAsHidden: Boolean
  
  /**
    * `true` if the app was opened at login automatically.
    *
    * @platform darwin
    */
  var wasOpenedAtLogin: Boolean
}
object LoginItemSettings {
  
  inline def apply(
    executableWillLaunchAtLogin: Boolean,
    launchItems: js.Array[LaunchItems],
    openAsHidden: Boolean,
    openAtLogin: Boolean,
    restoreState: Boolean,
    status: String,
    wasOpenedAsHidden: Boolean,
    wasOpenedAtLogin: Boolean
  ): LoginItemSettings = {
    val __obj = js.Dynamic.literal(executableWillLaunchAtLogin = executableWillLaunchAtLogin.asInstanceOf[js.Any], launchItems = launchItems.asInstanceOf[js.Any], openAsHidden = openAsHidden.asInstanceOf[js.Any], openAtLogin = openAtLogin.asInstanceOf[js.Any], restoreState = restoreState.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], wasOpenedAsHidden = wasOpenedAsHidden.asInstanceOf[js.Any], wasOpenedAtLogin = wasOpenedAtLogin.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoginItemSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LoginItemSettings] (val x: Self) extends AnyVal {
    
    inline def setExecutableWillLaunchAtLogin(value: Boolean): Self = StObject.set(x, "executableWillLaunchAtLogin", value.asInstanceOf[js.Any])
    
    inline def setLaunchItems(value: js.Array[LaunchItems]): Self = StObject.set(x, "launchItems", value.asInstanceOf[js.Any])
    
    inline def setLaunchItemsVarargs(value: LaunchItems*): Self = StObject.set(x, "launchItems", js.Array(value*))
    
    inline def setOpenAsHidden(value: Boolean): Self = StObject.set(x, "openAsHidden", value.asInstanceOf[js.Any])
    
    inline def setOpenAtLogin(value: Boolean): Self = StObject.set(x, "openAtLogin", value.asInstanceOf[js.Any])
    
    inline def setRestoreState(value: Boolean): Self = StObject.set(x, "restoreState", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setWasOpenedAsHidden(value: Boolean): Self = StObject.set(x, "wasOpenedAsHidden", value.asInstanceOf[js.Any])
    
    inline def setWasOpenedAtLogin(value: Boolean): Self = StObject.set(x, "wasOpenedAtLogin", value.asInstanceOf[js.Any])
  }
}
