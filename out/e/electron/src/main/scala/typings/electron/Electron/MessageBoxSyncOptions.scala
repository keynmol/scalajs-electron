package typings.electron.Electron

import typings.electron.electronStrings.error
import typings.electron.electronStrings.info
import typings.electron.electronStrings.none
import typings.electron.electronStrings.question
import typings.electron.electronStrings.warning
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageBoxSyncOptions extends StObject {
  
  /**
    * Array of texts for buttons. On Windows, an empty array will result in one button
    * labeled "OK".
    */
  var buttons: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The index of the button to be used to cancel the dialog, via the `Esc` key. By
    * default this is assigned to the first button with "cancel" or "no" as the label.
    * If no such labeled buttons exist and this option is not set, `0` will be used as
    * the return value.
    */
  var cancelId: js.UndefOr[Double] = js.undefined
  
  /**
    * Index of the button in the buttons array which will be selected by default when
    * the message box opens.
    */
  var defaultId: js.UndefOr[Double] = js.undefined
  
  /**
    * Extra information of the message.
    */
  var detail: js.UndefOr[String] = js.undefined
  
  var icon: js.UndefOr[NativeImage_ | String] = js.undefined
  
  /**
    * Content of the message box.
    */
  var message: String
  
  /**
    * On Windows Electron will try to figure out which one of the `buttons` are common
    * buttons (like "Cancel" or "Yes"), and show the others as command links in the
    * dialog. This can make the dialog appear in the style of modern Windows apps. If
    * you don't like this behavior, you can set `noLink` to `true`.
    */
  var noLink: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Normalize the keyboard access keys across platforms. Default is `false`.
    * Enabling this assumes `&` is used in the button labels for the placement of the
    * keyboard shortcut access key and labels will be converted so they work correctly
    * on each platform, `&` characters are removed on macOS, converted to `_` on
    * Linux, and left untouched on Windows. For example, a button label of `Vie&w`
    * will be converted to `Vie_w` on Linux and `View` on macOS and can be selected
    * via `Alt-W` on Windows and Linux.
    */
  var normalizeAccessKeys: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Custom width of the text in the message box.
    *
    * @platform darwin
    */
  var textWidth: js.UndefOr[Double] = js.undefined
  
  /**
    * Title of the message box, some platforms will not show it.
    */
  var title: js.UndefOr[String] = js.undefined
  
  /**
    * Can be `none`, `info`, `error`, `question` or `warning`. On Windows, `question`
    * displays the same icon as `info`, unless you set an icon using the `icon`
    * option. On macOS, both `warning` and `error` display the same warning icon.
    */
  var `type`: js.UndefOr[none | info | error | question | warning] = js.undefined
}
object MessageBoxSyncOptions {
  
  inline def apply(message: String): MessageBoxSyncOptions = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageBoxSyncOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MessageBoxSyncOptions] (val x: Self) extends AnyVal {
    
    inline def setButtons(value: js.Array[String]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    inline def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
    
    inline def setButtonsVarargs(value: String*): Self = StObject.set(x, "buttons", js.Array(value*))
    
    inline def setCancelId(value: Double): Self = StObject.set(x, "cancelId", value.asInstanceOf[js.Any])
    
    inline def setCancelIdUndefined: Self = StObject.set(x, "cancelId", js.undefined)
    
    inline def setDefaultId(value: Double): Self = StObject.set(x, "defaultId", value.asInstanceOf[js.Any])
    
    inline def setDefaultIdUndefined: Self = StObject.set(x, "defaultId", js.undefined)
    
    inline def setDetail(value: String): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    
    inline def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
    
    inline def setIcon(value: NativeImage_ | String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setNoLink(value: Boolean): Self = StObject.set(x, "noLink", value.asInstanceOf[js.Any])
    
    inline def setNoLinkUndefined: Self = StObject.set(x, "noLink", js.undefined)
    
    inline def setNormalizeAccessKeys(value: Boolean): Self = StObject.set(x, "normalizeAccessKeys", value.asInstanceOf[js.Any])
    
    inline def setNormalizeAccessKeysUndefined: Self = StObject.set(x, "normalizeAccessKeys", js.undefined)
    
    inline def setTextWidth(value: Double): Self = StObject.set(x, "textWidth", value.asInstanceOf[js.Any])
    
    inline def setTextWidthUndefined: Self = StObject.set(x, "textWidth", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setType(value: none | info | error | question | warning): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
