package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Dialog extends StObject {
  
  /**
    * resolves when the certificate trust dialog is shown.
    *
    * On macOS, this displays a modal dialog that shows a message and certificate
    * information, and gives the user the option of trusting/importing the
    * certificate. If you provide a `window` argument the dialog will be attached to
    * the parent window, making it modal.
    *
    * On Windows the options are more limited, due to the Win32 APIs used:
    *
    * * The `message` argument is not used, as the OS provides its own confirmation
    * dialog.
    * * The `window` argument is ignored since it is not possible to make this
    * confirmation dialog modal.
    *
    * @platform darwin,win32
    */
  def showCertificateTrustDialog(options: CertificateTrustDialogOptions): js.Promise[Unit] = js.native
  // Docs: https://electronjs.org/docs/api/dialog
  /**
    * resolves when the certificate trust dialog is shown.
    *
    * On macOS, this displays a modal dialog that shows a message and certificate
    * information, and gives the user the option of trusting/importing the
    * certificate. If you provide a `window` argument the dialog will be attached to
    * the parent window, making it modal.
    *
    * On Windows the options are more limited, due to the Win32 APIs used:
    *
    * * The `message` argument is not used, as the OS provides its own confirmation
    * dialog.
    * * The `window` argument is ignored since it is not possible to make this
    * confirmation dialog modal.
    *
    * @platform darwin,win32
    */
  def showCertificateTrustDialog(window: BaseWindow, options: CertificateTrustDialogOptions): js.Promise[Unit] = js.native
  
  /**
    * Displays a modal dialog that shows an error message.
    *
    * This API can be called safely before the `ready` event the `app` module emits,
    * it is usually used to report errors in early stage of startup. If called before
    * the app `ready`event on Linux, the message will be emitted to stderr, and no GUI
    * dialog will appear.
    */
  def showErrorBox(title: String, content: String): Unit = js.native
  
  /**
    * resolves with a promise containing the following properties:
    *
    * * `response` number - The index of the clicked button.
    * * `checkboxChecked` boolean - The checked state of the checkbox if
    * `checkboxLabel` was set. Otherwise `false`.
    *
    * Shows a message box.
    *
    * The `window` argument allows the dialog to attach itself to a parent window,
    * making it modal.
    */
  def showMessageBox(options: MessageBoxOptions): js.Promise[MessageBoxReturnValue] = js.native
  /**
    * resolves with a promise containing the following properties:
    *
    * * `response` number - The index of the clicked button.
    * * `checkboxChecked` boolean - The checked state of the checkbox if
    * `checkboxLabel` was set. Otherwise `false`.
    *
    * Shows a message box.
    *
    * The `window` argument allows the dialog to attach itself to a parent window,
    * making it modal.
    */
  def showMessageBox(window: BaseWindow, options: MessageBoxOptions): js.Promise[MessageBoxReturnValue] = js.native
  
  /**
    * the index of the clicked button.
    *
    * Shows a message box, it will block the process until the message box is closed.
    * It returns the index of the clicked button.
    *
    * The `window` argument allows the dialog to attach itself to a parent window,
    * making it modal. If `window` is not shown dialog will not be attached to it. In
    * such case it will be displayed as an independent window.
    */
  def showMessageBoxSync(options: MessageBoxSyncOptions): Double = js.native
  /**
    * the index of the clicked button.
    *
    * Shows a message box, it will block the process until the message box is closed.
    * It returns the index of the clicked button.
    *
    * The `window` argument allows the dialog to attach itself to a parent window,
    * making it modal. If `window` is not shown dialog will not be attached to it. In
    * such case it will be displayed as an independent window.
    */
  def showMessageBoxSync(window: BaseWindow, options: MessageBoxSyncOptions): Double = js.native
  
  /**
    * Resolve with an object containing the following:
    *
    * * `canceled` boolean - whether or not the dialog was canceled.
    * * `filePaths` string[] - An array of file paths chosen by the user. If the
    * dialog is cancelled this will be an empty array.
    * * `bookmarks` string[] (optional) _macOS_ _mas_ - An array matching the
    * `filePaths` array of base64 encoded strings which contains security scoped
    * bookmark data. `securityScopedBookmarks` must be enabled for this to be
    * populated. (For return values, see table here.)
    *
    * The `window` argument allows the dialog to attach itself to a parent window,
    * making it modal.
    *
    * The `filters` specifies an array of file types that can be displayed or selected
    * when you want to limit the user to a specific type. For example:
    *
    * The `extensions` array should contain extensions without wildcards or dots (e.g.
    * `'png'` is good but `'.png'` and `'*.png'` are bad). To show all files, use the
    * `'*'` wildcard (no other wildcard is supported).
    *
    * > [!NOTE] On Windows and Linux an open dialog can not be both a file selector
    * and a directory selector, so if you set `properties` to `['openFile',
    * 'openDirectory']` on these platforms, a directory selector will be shown.
    *
    * > [!NOTE] On Linux `defaultPath` is not supported when using portal file chooser
    * dialogs unless the portal backend is version 4 or higher. You can use
    * `--xdg-portal-required-version` command-line switch to force gtk or kde dialogs.
    */
  def showOpenDialog(options: OpenDialogOptions): js.Promise[OpenDialogReturnValue] = js.native
  /**
    * Resolve with an object containing the following:
    *
    * * `canceled` boolean - whether or not the dialog was canceled.
    * * `filePaths` string[] - An array of file paths chosen by the user. If the
    * dialog is cancelled this will be an empty array.
    * * `bookmarks` string[] (optional) _macOS_ _mas_ - An array matching the
    * `filePaths` array of base64 encoded strings which contains security scoped
    * bookmark data. `securityScopedBookmarks` must be enabled for this to be
    * populated. (For return values, see table here.)
    *
    * The `window` argument allows the dialog to attach itself to a parent window,
    * making it modal.
    *
    * The `filters` specifies an array of file types that can be displayed or selected
    * when you want to limit the user to a specific type. For example:
    *
    * The `extensions` array should contain extensions without wildcards or dots (e.g.
    * `'png'` is good but `'.png'` and `'*.png'` are bad). To show all files, use the
    * `'*'` wildcard (no other wildcard is supported).
    *
    * > [!NOTE] On Windows and Linux an open dialog can not be both a file selector
    * and a directory selector, so if you set `properties` to `['openFile',
    * 'openDirectory']` on these platforms, a directory selector will be shown.
    *
    * > [!NOTE] On Linux `defaultPath` is not supported when using portal file chooser
    * dialogs unless the portal backend is version 4 or higher. You can use
    * `--xdg-portal-required-version` command-line switch to force gtk or kde dialogs.
    */
  def showOpenDialog(window: BaseWindow, options: OpenDialogOptions): js.Promise[OpenDialogReturnValue] = js.native
  
  /**
    * the file paths chosen by the user; if the dialog is cancelled it returns
    * `undefined`.
    *
    * The `window` argument allows the dialog to attach itself to a parent window,
    * making it modal.
    *
    * The `filters` specifies an array of file types that can be displayed or selected
    * when you want to limit the user to a specific type. For example:
    *
    * The `extensions` array should contain extensions without wildcards or dots (e.g.
    * `'png'` is good but `'.png'` and `'*.png'` are bad). To show all files, use the
    * `'*'` wildcard (no other wildcard is supported).
    *
    * > [!NOTE] On Windows and Linux an open dialog can not be both a file selector
    * and a directory selector, so if you set `properties` to `['openFile',
    * 'openDirectory']` on these platforms, a directory selector will be shown.
    *
    * > [!NOTE] On Linux `defaultPath` is not supported when using portal file chooser
    * dialogs unless the portal backend is version 4 or higher. You can use
    * `--xdg-portal-required-version` command-line switch to force gtk or kde dialogs.
    */
  def showOpenDialogSync(options: OpenDialogSyncOptions): js.UndefOr[js.Array[String]] = js.native
  /**
    * the file paths chosen by the user; if the dialog is cancelled it returns
    * `undefined`.
    *
    * The `window` argument allows the dialog to attach itself to a parent window,
    * making it modal.
    *
    * The `filters` specifies an array of file types that can be displayed or selected
    * when you want to limit the user to a specific type. For example:
    *
    * The `extensions` array should contain extensions without wildcards or dots (e.g.
    * `'png'` is good but `'.png'` and `'*.png'` are bad). To show all files, use the
    * `'*'` wildcard (no other wildcard is supported).
    *
    * > [!NOTE] On Windows and Linux an open dialog can not be both a file selector
    * and a directory selector, so if you set `properties` to `['openFile',
    * 'openDirectory']` on these platforms, a directory selector will be shown.
    *
    * > [!NOTE] On Linux `defaultPath` is not supported when using portal file chooser
    * dialogs unless the portal backend is version 4 or higher. You can use
    * `--xdg-portal-required-version` command-line switch to force gtk or kde dialogs.
    */
  def showOpenDialogSync(window: BaseWindow, options: OpenDialogSyncOptions): js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Resolve with an object containing the following:
    *
    * * `canceled` boolean - whether or not the dialog was canceled.
    * * `filePath` string - If the dialog is canceled, this will be an empty string.
    * * `bookmark` string (optional) _macOS_ _mas_ - Base64 encoded string which
    * contains the security scoped bookmark data for the saved file.
    * `securityScopedBookmarks` must be enabled for this to be present. (For return
    * values, see table here.)
    *
    * The `window` argument allows the dialog to attach itself to a parent window,
    * making it modal.
    *
    * The `filters` specifies an array of file types that can be displayed, see
    * `dialog.showOpenDialog` for an example.
    *
    * > [!NOTE] On macOS, using the asynchronous version is recommended to avoid
    * issues when expanding and collapsing the dialog.
    */
  def showSaveDialog(options: SaveDialogOptions): js.Promise[SaveDialogReturnValue] = js.native
  /**
    * Resolve with an object containing the following:
    *
    * * `canceled` boolean - whether or not the dialog was canceled.
    * * `filePath` string - If the dialog is canceled, this will be an empty string.
    * * `bookmark` string (optional) _macOS_ _mas_ - Base64 encoded string which
    * contains the security scoped bookmark data for the saved file.
    * `securityScopedBookmarks` must be enabled for this to be present. (For return
    * values, see table here.)
    *
    * The `window` argument allows the dialog to attach itself to a parent window,
    * making it modal.
    *
    * The `filters` specifies an array of file types that can be displayed, see
    * `dialog.showOpenDialog` for an example.
    *
    * > [!NOTE] On macOS, using the asynchronous version is recommended to avoid
    * issues when expanding and collapsing the dialog.
    */
  def showSaveDialog(window: BaseWindow, options: SaveDialogOptions): js.Promise[SaveDialogReturnValue] = js.native
  
  /**
    * the path of the file chosen by the user; if the dialog is cancelled it returns
    * an empty string.
    *
    * The `window` argument allows the dialog to attach itself to a parent window,
    * making it modal.
    *
    * The `filters` specifies an array of file types that can be displayed, see
    * `dialog.showOpenDialog` for an example.
    */
  def showSaveDialogSync(options: SaveDialogSyncOptions): String = js.native
  /**
    * the path of the file chosen by the user; if the dialog is cancelled it returns
    * an empty string.
    *
    * The `window` argument allows the dialog to attach itself to a parent window,
    * making it modal.
    *
    * The `filters` specifies an array of file types that can be displayed, see
    * `dialog.showOpenDialog` for an example.
    */
  def showSaveDialogSync(window: BaseWindow, options: SaveDialogSyncOptions): String = js.native
}
