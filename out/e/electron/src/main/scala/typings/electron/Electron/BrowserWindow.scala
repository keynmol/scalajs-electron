package typings.electron.Electron

import typings.electron.electronStrings.`enter-html-full-screen`
import typings.electron.electronStrings.`fullscreen-ui`
import typings.electron.electronStrings.`leave-html-full-screen`
import typings.electron.electronStrings.`page-title-updated`
import typings.electron.electronStrings.`ready-to-show`
import typings.electron.electronStrings.`under-page`
import typings.electron.electronStrings.`under-window`
import typings.electron.electronStrings.blur
import typings.electron.electronStrings.content
import typings.electron.electronStrings.focus
import typings.electron.electronStrings.header
import typings.electron.electronStrings.hud
import typings.electron.electronStrings.menu
import typings.electron.electronStrings.popover
import typings.electron.electronStrings.responsive
import typings.electron.electronStrings.selection
import typings.electron.electronStrings.sheet
import typings.electron.electronStrings.sidebar
import typings.electron.electronStrings.titlebar
import typings.electron.electronStrings.tooltip
import typings.electron.electronStrings.unresponsive
import typings.electron.electronStrings.window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BrowserWindow
  extends StObject
     with BaseWindow {
  
  /**
    * Replacement API for setBrowserView supporting work with multi browser views.
    *
    * > [!WARNING] The `BrowserView` class is deprecated, and replaced by the new
    * `WebContentsView` class.
    *
    * @experimental
    * @deprecated
    */
  def addBrowserView(browserView: BrowserView): Unit = js.native
  
  @JSName("addListener")
  def addListener_blur(event: blur, listener: js.Function0[Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_enterhtmlfullscreen(event: `enter-html-full-screen`, listener: js.Function0[Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_focus(event: focus, listener: js.Function0[Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_leavehtmlfullscreen(event: `leave-html-full-screen`, listener: js.Function0[Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_pagetitleupdated(
    event: `page-title-updated`,
    listener: js.Function3[/* event */ Event[js.Object], /* title */ String, /* explicitSet */ Boolean, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_readytoshow(event: `ready-to-show`, listener: js.Function0[Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_responsive(event: responsive, listener: js.Function0[Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_unresponsive(event: unresponsive, listener: js.Function0[Unit]): this.type = js.native
  
  /**
    * Adds a window as a tab on this window, after the tab for the window instance.
    *
    * @platform darwin
    */
  def addTabbedWindow(browserWindow: BrowserWindow): Unit = js.native
  
  def blurWebView(): Unit = js.native
  
  /**
    * Resolves with a NativeImage
    *
    * Captures a snapshot of the page within `rect`. Omitting `rect` will capture the
    * whole visible page. If the page is not visible, `rect` may be empty. The page is
    * considered visible when its browser window is hidden and the capturer count is
    * non-zero. If you would like the page to stay hidden, you should ensure that
    * `stayHidden` is set to true.
    */
  def capturePage(): js.Promise[NativeImage_] = js.native
  def capturePage(rect: Unit, opts: Opts): js.Promise[NativeImage_] = js.native
  def capturePage(rect: Rectangle): js.Promise[NativeImage_] = js.native
  def capturePage(rect: Rectangle, opts: Opts): js.Promise[NativeImage_] = js.native
  
  def focusOnWebView(): Unit = js.native
  
  /**
    * The `BrowserView` attached to `win`. Returns `null` if one is not attached.
    * Throws an error if multiple `BrowserView`s are attached.
    *
    * > [!WARNING] The `BrowserView` class is deprecated, and replaced by the new
    * `WebContentsView` class.
    *
    * @experimental
    * @deprecated
    */
  def getBrowserView(): BrowserView | Null = js.native
  
  /**
    * a sorted by z-index array of all BrowserViews that have been attached with
    * `addBrowserView` or `setBrowserView`. The top-most BrowserView is the last
    * element of the array.
    *
    * > [!WARNING] The `BrowserView` class is deprecated, and replaced by the new
    * `WebContentsView` class.
    *
    * @experimental
    * @deprecated
    */
  def getBrowserViews(): js.Array[BrowserView] = js.native
  
  /**
    * the promise will resolve when the page has finished loading (see
    * `did-finish-load`), and rejects if the page fails to load (see `did-fail-load`).
    *
    * Same as `webContents.loadFile`, `filePath` should be a path to an HTML file
    * relative to the root of your application.  See the `webContents` docs for more
    * information.
    */
  def loadFile(filePath: String): js.Promise[Unit] = js.native
  def loadFile(filePath: String, options: LoadFileOptions): js.Promise[Unit] = js.native
  
  /**
    * the promise will resolve when the page has finished loading (see
    * `did-finish-load`), and rejects if the page fails to load (see `did-fail-load`).
    *
    * Same as `webContents.loadURL(url[, options])`.
    *
    * The `url` can be a remote address (e.g. `http://`) or a path to a local HTML
    * file using the `file://` protocol.
    *
    * To ensure that file URLs are properly formatted, it is recommended to use Node's
    * `url.format` method:
    *
    * You can load a URL using a `POST` request with URL-encoded data by doing the
    * following:
    */
  def loadURL(url: String): js.Promise[Unit] = js.native
  def loadURL(url: String, options: LoadURLOptions): js.Promise[Unit] = js.native
  
  @JSName("off")
  def off_blur(event: blur, listener: js.Function0[Unit]): this.type = js.native
  @JSName("off")
  def off_enterhtmlfullscreen(event: `enter-html-full-screen`, listener: js.Function0[Unit]): this.type = js.native
  @JSName("off")
  def off_focus(event: focus, listener: js.Function0[Unit]): this.type = js.native
  @JSName("off")
  def off_leavehtmlfullscreen(event: `leave-html-full-screen`, listener: js.Function0[Unit]): this.type = js.native
  @JSName("off")
  def off_pagetitleupdated(
    event: `page-title-updated`,
    listener: js.Function3[/* event */ Event[js.Object], /* title */ String, /* explicitSet */ Boolean, Unit]
  ): this.type = js.native
  @JSName("off")
  def off_readytoshow(event: `ready-to-show`, listener: js.Function0[Unit]): this.type = js.native
  @JSName("off")
  def off_responsive(event: responsive, listener: js.Function0[Unit]): this.type = js.native
  @JSName("off")
  def off_unresponsive(event: unresponsive, listener: js.Function0[Unit]): this.type = js.native
  
  /**
    * Emitted when the window loses focus.
    */
  @JSName("on")
  def on_blur(event: blur, listener: js.Function0[Unit]): this.type = js.native
  /**
    * Emitted when the window enters a full-screen state triggered by HTML API.
    */
  @JSName("on")
  def on_enterhtmlfullscreen(event: `enter-html-full-screen`, listener: js.Function0[Unit]): this.type = js.native
  /**
    * Emitted when the window gains focus.
    */
  @JSName("on")
  def on_focus(event: focus, listener: js.Function0[Unit]): this.type = js.native
  /**
    * Emitted when the window leaves a full-screen state triggered by HTML API.
    */
  @JSName("on")
  def on_leavehtmlfullscreen(event: `leave-html-full-screen`, listener: js.Function0[Unit]): this.type = js.native
  /**
    * Emitted when the document changed its title, calling `event.preventDefault()`
    * will prevent the native window's title from changing. `explicitSet` is false
    * when title is synthesized from file URL.
    */
  @JSName("on")
  def on_pagetitleupdated(
    event: `page-title-updated`,
    listener: js.Function3[/* event */ Event[js.Object], /* title */ String, /* explicitSet */ Boolean, Unit]
  ): this.type = js.native
  /**
    * Emitted when the web page has been rendered (while not being shown) and window
    * can be displayed without a visual flash.
    *
    * Please note that using this event implies that the renderer will be considered
    * "visible" and paint even though `show` is false.  This event will never fire if
    * you use `paintWhenInitiallyHidden: false`
    */
  @JSName("on")
  def on_readytoshow(event: `ready-to-show`, listener: js.Function0[Unit]): this.type = js.native
  /**
    * Emitted when the unresponsive web page becomes responsive again.
    */
  @JSName("on")
  def on_responsive(event: responsive, listener: js.Function0[Unit]): this.type = js.native
  /**
    * Emitted when the web page becomes unresponsive.
    */
  @JSName("on")
  def on_unresponsive(event: unresponsive, listener: js.Function0[Unit]): this.type = js.native
  
  @JSName("once")
  def once_blur(event: blur, listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_enterhtmlfullscreen(event: `enter-html-full-screen`, listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_focus(event: focus, listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_leavehtmlfullscreen(event: `leave-html-full-screen`, listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_pagetitleupdated(
    event: `page-title-updated`,
    listener: js.Function3[/* event */ Event[js.Object], /* title */ String, /* explicitSet */ Boolean, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_readytoshow(event: `ready-to-show`, listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_responsive(event: responsive, listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_unresponsive(event: unresponsive, listener: js.Function0[Unit]): this.type = js.native
  
  /**
    * Same as `webContents.reload`.
    */
  def reload(): Unit = js.native
  
  /**
    * > [!WARNING] The `BrowserView` class is deprecated, and replaced by the new
    * `WebContentsView` class.
    *
    * @experimental
    * @deprecated
    */
  def removeBrowserView(browserView: BrowserView): Unit = js.native
  
  @JSName("removeListener")
  def removeListener_blur(event: blur, listener: js.Function0[Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_enterhtmlfullscreen(event: `enter-html-full-screen`, listener: js.Function0[Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_focus(event: focus, listener: js.Function0[Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_leavehtmlfullscreen(event: `leave-html-full-screen`, listener: js.Function0[Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_pagetitleupdated(
    event: `page-title-updated`,
    listener: js.Function3[/* event */ Event[js.Object], /* title */ String, /* explicitSet */ Boolean, Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_readytoshow(event: `ready-to-show`, listener: js.Function0[Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_responsive(event: responsive, listener: js.Function0[Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_unresponsive(event: unresponsive, listener: js.Function0[Unit]): this.type = js.native
  
  /**
    * > [!WARNING] The `BrowserView` class is deprecated, and replaced by the new
    * `WebContentsView` class.
    *
    * @experimental
    * @deprecated
    */
  def setBrowserView(): Unit = js.native
  def setBrowserView(browserView: BrowserView): Unit = js.native
  
  def setParentWindow(parent: BrowserWindow): Unit = js.native
  
  /**
    * Raises `browserView` above other `BrowserView`s attached to `win`. Throws an
    * error if `browserView` is not attached to `win`.
    *
    * > [!WARNING] The `BrowserView` class is deprecated, and replaced by the new
    * `WebContentsView` class.
    *
    * @experimental
    * @deprecated
    */
  def setTopBrowserView(browserView: BrowserView): Unit = js.native
  
  def setVibrancy(
    `type`: titlebar | selection | menu | popover | sidebar | header | sheet | window | hud | `fullscreen-ui` | tooltip | content | `under-window` | `under-page`,
    options: VibrancyOptions
  ): Unit = js.native
  def setVibrancy(`type`: Null, options: VibrancyOptions): Unit = js.native
  
  /**
    * Same as `webContents.showDefinitionForSelection()`.
    *
    * @platform darwin
    */
  def showDefinitionForSelection(): Unit = js.native
  
  /**
    * A `WebContents` object this window owns. All web page related events and
    * operations will be done via it.
    *
    * See the `webContents` documentation for its methods and events.
    *
    */
  val webContents: WebContents_ = js.native
}
