package typings.electron.Electron

import typings.electron.anon.PartialRectangle
import typings.electron.electronStrings.`always-on-top-changed`
import typings.electron.electronStrings.`app-command`
import typings.electron.electronStrings.`enter-full-screen`
import typings.electron.electronStrings.`fullscreen-ui`
import typings.electron.electronStrings.`leave-full-screen`
import typings.electron.electronStrings.`main-menu`
import typings.electron.electronStrings.`modal-panel`
import typings.electron.electronStrings.`new-window-for-tab`
import typings.electron.electronStrings.`pop-up-menu`
import typings.electron.electronStrings.`query-session-end`
import typings.electron.electronStrings.`rotate-gesture`
import typings.electron.electronStrings.`screen-saver`
import typings.electron.electronStrings.`session-end`
import typings.electron.electronStrings.`sheet-begin`
import typings.electron.electronStrings.`sheet-end`
import typings.electron.electronStrings.`system-context-menu`
import typings.electron.electronStrings.`torn-off-menu`
import typings.electron.electronStrings.`under-page`
import typings.electron.electronStrings.`under-window`
import typings.electron.electronStrings.`will-move`
import typings.electron.electronStrings.`will-resize`
import typings.electron.electronStrings.acrylic
import typings.electron.electronStrings.auto
import typings.electron.electronStrings.blur
import typings.electron.electronStrings.close
import typings.electron.electronStrings.closed
import typings.electron.electronStrings.content
import typings.electron.electronStrings.dock
import typings.electron.electronStrings.floating
import typings.electron.electronStrings.focus
import typings.electron.electronStrings.header
import typings.electron.electronStrings.hide
import typings.electron.electronStrings.hud
import typings.electron.electronStrings.maximize
import typings.electron.electronStrings.menu
import typings.electron.electronStrings.mica
import typings.electron.electronStrings.minimize
import typings.electron.electronStrings.move
import typings.electron.electronStrings.moved
import typings.electron.electronStrings.none
import typings.electron.electronStrings.normal
import typings.electron.electronStrings.popover
import typings.electron.electronStrings.resize
import typings.electron.electronStrings.resized
import typings.electron.electronStrings.restore
import typings.electron.electronStrings.selection
import typings.electron.electronStrings.sheet
import typings.electron.electronStrings.show
import typings.electron.electronStrings.sidebar
import typings.electron.electronStrings.status
import typings.electron.electronStrings.swipe
import typings.electron.electronStrings.tabbed
import typings.electron.electronStrings.titlebar
import typings.electron.electronStrings.tooltip
import typings.electron.electronStrings.unmaximize
import typings.electron.electronStrings.window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseWindow extends StObject {
  
  /**
    * A `string` property that defines an alternative title provided only to
    * accessibility tools such as screen readers. This string is not directly visible
    * to users.
    */
  var accessibleTitle: String = js.native
  
  @JSName("addListener")
  def addListener_alwaysontopchanged(
    event: `always-on-top-changed`,
    listener: js.Function2[/* event */ Event[js.Object], /* isAlwaysOnTop */ Boolean, Unit]
  ): this.type = js.native
  /**
    * @platform win32,linux
    */
  @JSName("addListener")
  def addListener_appcommand(
    event: `app-command`,
    listener: js.Function2[/* event */ Event[js.Object], /* command */ String, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_blur(event: blur, listener: js.Function1[/* event */ Event[js.Object], Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_close(event: close, listener: js.Function1[/* event */ Event[js.Object], Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_closed(event: closed, listener: js.Function0[Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_enterfullscreen(event: `enter-full-screen`, listener: js.Function0[Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_focus(event: focus, listener: js.Function1[/* event */ Event[js.Object], Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_hide(event: hide, listener: js.Function0[Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_leavefullscreen(event: `leave-full-screen`, listener: js.Function0[Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_maximize(event: maximize, listener: js.Function0[Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_minimize(event: minimize, listener: js.Function0[Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_move(event: move, listener: js.Function0[Unit]): this.type = js.native
  /**
    * @platform darwin,win32
    */
  @JSName("addListener")
  def addListener_moved(event: moved, listener: js.Function0[Unit]): this.type = js.native
  /**
    * @platform darwin
    */
  @JSName("addListener")
  def addListener_newwindowfortab(event: `new-window-for-tab`, listener: js.Function0[Unit]): this.type = js.native
  /**
    * @platform win32
    */
  @JSName("addListener")
  def addListener_querysessionend(event: `query-session-end`, listener: js.Function1[/* event */ WindowSessionEndEvent, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_resize(event: resize, listener: js.Function0[Unit]): this.type = js.native
  /**
    * @platform darwin,win32
    */
  @JSName("addListener")
  def addListener_resized(event: resized, listener: js.Function0[Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_restore(event: restore, listener: js.Function0[Unit]): this.type = js.native
  /**
    * @platform darwin
    */
  @JSName("addListener")
  def addListener_rotategesture(
    event: `rotate-gesture`,
    listener: js.Function2[/* event */ Event[js.Object], /* rotation */ Double, Unit]
  ): this.type = js.native
  /**
    * @platform win32
    */
  @JSName("addListener")
  def addListener_sessionend(event: `session-end`, listener: js.Function1[/* event */ WindowSessionEndEvent, Unit]): this.type = js.native
  /**
    * @platform darwin
    */
  @JSName("addListener")
  def addListener_sheetbegin(event: `sheet-begin`, listener: js.Function0[Unit]): this.type = js.native
  /**
    * @platform darwin
    */
  @JSName("addListener")
  def addListener_sheetend(event: `sheet-end`, listener: js.Function0[Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_show(event: show, listener: js.Function0[Unit]): this.type = js.native
  /**
    * @platform darwin
    */
  @JSName("addListener")
  def addListener_swipe(event: swipe, listener: js.Function2[/* event */ Event[js.Object], /* direction */ String, Unit]): this.type = js.native
  /**
    * @platform win32,linux
    */
  @JSName("addListener")
  def addListener_systemcontextmenu(
    event: `system-context-menu`,
    listener: js.Function2[/* event */ Event[js.Object], /* point */ Point, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_unmaximize(event: unmaximize, listener: js.Function0[Unit]): this.type = js.native
  /**
    * @platform darwin,win32
    */
  @JSName("addListener")
  def addListener_willmove(
    event: `will-move`,
    listener: js.Function2[/* event */ Event[js.Object], /* newBounds */ Rectangle, Unit]
  ): this.type = js.native
  /**
    * @platform darwin,win32
    */
  @JSName("addListener")
  def addListener_willresize(
    event: `will-resize`,
    listener: js.Function3[
      /* event */ Event[js.Object], 
      /* newBounds */ Rectangle, 
      /* details */ WillResizeDetails, 
      Unit
    ]
  ): this.type = js.native
  
  /**
    * Adds a window as a tab on this window, after the tab for the window instance.
    *
    * @platform darwin
    */
  def addTabbedWindow(baseWindow: BaseWindow): Unit = js.native
  
  /**
    * A `boolean` property that determines whether the window menu bar should hide
    * itself automatically. Once set, the menu bar will only show when users press the
    * single `Alt` key.
    *
    * If the menu bar is already visible, setting this property to `true` won't hide
    * it immediately.
    *
    * @platform linux,win32
    */
  var autoHideMenuBar: Boolean = js.native
  
  /**
    * Removes focus from the window.
    */
  def blur(): Unit = js.native
  
  /**
    * Moves window to the center of the screen.
    */
  def center(): Unit = js.native
  
  /**
    * A `boolean` property that determines whether the window can be manually closed
    * by user.
    *
    * On Linux the setter is a no-op, although the getter returns `true`.
    *
    * @platform darwin,win32
    */
  var closable: Boolean = js.native
  
  /**
    * Try to close the window. This has the same effect as a user manually clicking
    * the close button of the window. The web page may cancel the close though. See
    * the close event.
    */
  def close(): Unit = js.native
  
  /**
    * Closes the currently open Quick Look panel.
    *
    * @platform darwin
    */
  def closeFilePreview(): Unit = js.native
  
  /**
    * A `View` property for the content view of the window.
    */
  var contentView: View = js.native
  
  /**
    * Force closing the window, the `unload` and `beforeunload` event won't be emitted
    * for the web page, and `close` event will also not be emitted for this window,
    * but it guarantees the `closed` event will be emitted.
    */
  def destroy(): Unit = js.native
  
  /**
    * A `boolean` property that specifies whether the window’s document has been
    * edited.
    *
    * The icon in title bar will become gray when set to `true`.
    *
    * @platform darwin
    */
  var documentEdited: Boolean = js.native
  
  /**
    * A `boolean` property that determines whether the window is excluded from the
    * application’s Windows menu. `false` by default.
    *
    * @platform darwin
    */
  var excludedFromShownWindowsMenu: Boolean = js.native
  
  /**
    * Starts or stops flashing the window to attract user's attention.
    */
  def flashFrame(flag: Boolean): Unit = js.native
  
  /**
    * Focuses on the window.
    */
  def focus(): Unit = js.native
  
  /**
    * A `boolean` property that determines whether the window is focusable.
    *
    * @platform win32,darwin
    */
  var focusable: Boolean = js.native
  
  /**
    * A `boolean` property that determines whether the window is in fullscreen mode.
    */
  var fullScreen: Boolean = js.native
  
  /**
    * A `boolean` property that determines whether the maximize/zoom window button
    * toggles fullscreen mode or maximizes the window.
    */
  var fullScreenable: Boolean = js.native
  
  /**
    * Gets the background color of the window in Hex (`#RRGGBB`) format.
    *
    * See Setting `backgroundColor`.
    *
    * > [!NOTE] The alpha value is _not_ returned alongside the red, green, and blue
    * values.
    */
  def getBackgroundColor(): String = js.native
  
  /**
    * The `bounds` of the window as `Object`.
    *
    * > [!NOTE] On macOS, the y-coordinate value returned will be at minimum the Tray
    * height. For example, calling `win.setBounds({ x: 25, y: 20, width: 800, height:
    * 600 })` with a tray height of 38 means that `win.getBounds()` will return `{ x:
    * 25, y: 38, width: 800, height: 600 }`.
    */
  def getBounds(): Rectangle = js.native
  
  /**
    * All child windows.
    */
  def getChildWindows(): js.Array[BaseWindow] = js.native
  
  /**
    * The `bounds` of the window's client area as `Object`.
    */
  def getContentBounds(): Rectangle = js.native
  
  /**
    * Contains the window's client area's width and height.
    */
  def getContentSize(): js.Array[Double] = js.native
  
  /**
    * The content view of the window.
    */
  def getContentView(): View = js.native
  
  /**
    * Contains the window's maximum width and height.
    */
  def getMaximumSize(): js.Array[Double] = js.native
  
  /**
    * Window id in the format of DesktopCapturerSource's id. For example
    * "window:1324:0".
    *
    * More precisely the format is `window:id:other_id` where `id` is `HWND` on
    * Windows, `CGWindowID` (`uint64_t`) on macOS and `Window` (`unsigned long`) on
    * Linux. `other_id` is used to identify web contents (tabs) so within the same top
    * level window.
    */
  def getMediaSourceId(): String = js.native
  
  /**
    * Contains the window's minimum width and height.
    */
  def getMinimumSize(): js.Array[Double] = js.native
  
  /**
    * The platform-specific handle of the window.
    *
    * The native type of the handle is `HWND` on Windows, `NSView*` on macOS, and
    * `Window` (`unsigned long`) on Linux.
    */
  def getNativeWindowHandle(): Any = js.native
  
  /**
    * Contains the window bounds of the normal state
    *
    * > [!NOTE] Whatever the current state of the window : maximized, minimized or in
    * fullscreen, this function always returns the position and size of the window in
    * normal state. In normal state, getBounds and getNormalBounds returns the same
    * `Rectangle`.
    */
  def getNormalBounds(): Rectangle = js.native
  
  /**
    * between 0.0 (fully transparent) and 1.0 (fully opaque). On Linux, always returns
    * 1.
    */
  def getOpacity(): Double = js.native
  
  /**
    * The parent window or `null` if there is no parent.
    */
  def getParentWindow(): BaseWindow | Null = js.native
  
  /**
    * Contains the window's current position.
    */
  def getPosition(): js.Array[Double] = js.native
  
  /**
    * The pathname of the file the window represents.
    *
    * @platform darwin
    */
  def getRepresentedFilename(): String = js.native
  
  /**
    * Contains the window's width and height.
    */
  def getSize(): js.Array[Double] = js.native
  
  /**
    * The title of the native window.
    *
    * > [!NOTE] The title of the web page can be different from the title of the
    * native window.
    */
  def getTitle(): String = js.native
  
  /**
    * The custom position for the traffic light buttons in frameless window, `null`
    * will be returned when there is no custom position.
    *
    * @platform darwin
    */
  def getWindowButtonPosition(): Point | Null = js.native
  
  /**
    * Whether the window has a shadow.
    */
  def hasShadow(): Boolean = js.native
  
  /**
    * Hides the window.
    */
  def hide(): Unit = js.native
  
  /**
    * Hooks a windows message. The `callback` is called when the message is received
    * in the WndProc.
    *
    * @platform win32
    */
  def hookWindowMessage(
    message: Double,
    callback: js.Function2[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Buffer */ /* wParam */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Buffer */ /* lParam */ Any, 
      Unit
    ]
  ): Unit = js.native
  
  /**
    * A `Integer` property representing the unique ID of the window. Each ID is unique
    * among all `BaseWindow` instances of the entire Electron application.
    *
    */
  val id: Double = js.native
  
  /**
    * Invalidates the window shadow so that it is recomputed based on the current
    * window shape.
    *
    * `BaseWindow`s that are transparent can sometimes leave behind visual artifacts
    * on macOS. This method can be used to clear these artifacts when, for example,
    * performing an animation.
    *
    * @platform darwin
    */
  def invalidateShadow(): Unit = js.native
  
  /**
    * Whether the window is always on top of other windows.
    */
  def isAlwaysOnTop(): Boolean = js.native
  
  /**
    * Whether the window can be manually closed by user.
    *
    * On Linux always returns `true`.
    *
    * @platform darwin,win32
    */
  def isClosable(): Boolean = js.native
  
  /**
    * Whether the window is destroyed.
    */
  def isDestroyed(): Boolean = js.native
  
  /**
    * Whether the window's document has been edited.
    *
    * @platform darwin
    */
  def isDocumentEdited(): Boolean = js.native
  
  /**
    * whether the window is enabled.
    */
  def isEnabled(): Boolean = js.native
  
  /**
    * Whether the window can be focused.
    *
    * @platform darwin,win32
    */
  def isFocusable(): Boolean = js.native
  
  /**
    * Whether the window is focused.
    */
  def isFocused(): Boolean = js.native
  
  /**
    * Whether the window is in fullscreen mode.
    */
  def isFullScreen(): Boolean = js.native
  
  /**
    * Whether the maximize/zoom window button toggles fullscreen mode or maximizes the
    * window.
    */
  def isFullScreenable(): Boolean = js.native
  
  /**
    * Whether the window will be hidden when the user toggles into mission control.
    *
    * @platform darwin
    */
  def isHiddenInMissionControl(): Boolean = js.native
  
  /**
    * Whether the window is in kiosk mode.
    */
  def isKiosk(): Boolean = js.native
  
  /**
    * Whether the window can be manually maximized by user.
    *
    * On Linux always returns `true`.
    *
    * @platform darwin,win32
    */
  def isMaximizable(): Boolean = js.native
  
  /**
    * Whether the window is maximized.
    */
  def isMaximized(): Boolean = js.native
  
  /**
    * Whether menu bar automatically hides itself.
    *
    * @platform win32,linux
    */
  def isMenuBarAutoHide(): Boolean = js.native
  
  /**
    * Whether the menu bar is visible.
    *
    * @platform win32,linux
    */
  def isMenuBarVisible(): Boolean = js.native
  
  /**
    * Whether the window can be manually minimized by the user.
    *
    * On Linux always returns `true`.
    *
    * @platform darwin,win32
    */
  def isMinimizable(): Boolean = js.native
  
  /**
    * Whether the window is minimized.
    */
  def isMinimized(): Boolean = js.native
  
  /**
    * Whether current window is a modal window.
    */
  def isModal(): Boolean = js.native
  
  /**
    * Whether the window can be moved by user.
    *
    * On Linux always returns `true`.
    *
    * @platform darwin,win32
    */
  def isMovable(): Boolean = js.native
  
  /**
    * Whether the window is in normal state (not maximized, not minimized, not in
    * fullscreen mode).
    */
  def isNormal(): Boolean = js.native
  
  /**
    * Whether the window can be manually resized by the user.
    */
  def isResizable(): Boolean = js.native
  
  /**
    * Whether the window is in simple (pre-Lion) fullscreen mode.
    *
    * @platform darwin
    */
  def isSimpleFullScreen(): Boolean = js.native
  
  /**
    * whether the window is arranged via Snap.
    *
    * The window is snapped via buttons shown when the mouse is hovered over window
    * maximize button, or by dragging it to the edges of the screen.
    *
    * @platform win32
    */
  def isSnapped(): Boolean = js.native
  
  /**
    * Whether the window is in Windows 10 tablet mode.
    *
    * Since Windows 10 users can use their PC as tablet, under this mode apps can
    * choose to optimize their UI for tablets, such as enlarging the titlebar and
    * hiding titlebar buttons.
    *
    * This API returns whether the window is in tablet mode, and the `resize` event
    * can be be used to listen to changes to tablet mode.
    *
    * @platform win32
    */
  def isTabletMode(): Boolean = js.native
  
  /**
    * Whether the window is visible to the user in the foreground of the app.
    */
  def isVisible(): Boolean = js.native
  
  /**
    * Whether the window is visible on all workspaces.
    *
    * > [!NOTE] This API always returns false on Windows.
    *
    * @platform darwin,linux
    */
  def isVisibleOnAllWorkspaces(): Boolean = js.native
  
  /**
    * `true` or `false` depending on whether the message is hooked.
    *
    * @platform win32
    */
  def isWindowMessageHooked(message: Double): Boolean = js.native
  
  /**
    * A `boolean` property that determines whether the window is in kiosk mode.
    */
  var kiosk: Boolean = js.native
  
  /**
    * A `boolean` property that determines whether the window can be manually
    * maximized by user.
    *
    * On Linux the setter is a no-op, although the getter returns `true`.
    *
    * @platform darwin,win32
    */
  var maximizable: Boolean = js.native
  
  /**
    * Maximizes the window. This will also show (but not focus) the window if it isn't
    * being displayed already.
    */
  def maximize(): Unit = js.native
  
  /**
    * A `boolean` property that determines whether the menu bar should be visible.
    *
    * > [!NOTE] If the menu bar is auto-hide, users can still bring up the menu bar by
    * pressing the single `Alt` key.
    *
    * @platform win32,linux
    */
  var menuBarVisible: Boolean = js.native
  
  /**
    * Merges all windows into one window with multiple tabs when native tabs are
    * enabled and there is more than one open window.
    *
    * @platform darwin
    */
  def mergeAllWindows(): Unit = js.native
  
  /**
    * A `boolean` property that determines whether the window can be manually
    * minimized by user.
    *
    * On Linux the setter is a no-op, although the getter returns `true`.
    *
    * @platform darwin,win32
    */
  var minimizable: Boolean = js.native
  
  /**
    * Minimizes the window. On some platforms the minimized window will be shown in
    * the Dock.
    */
  def minimize(): Unit = js.native
  
  /**
    * A `boolean` property that determines Whether the window can be moved by user.
    *
    * On Linux the setter is a no-op, although the getter returns `true`.
    *
    * @platform darwin,win32
    */
  var movable: Boolean = js.native
  
  /**
    * Moves window above the source window in the sense of z-order. If the
    * `mediaSourceId` is not of type window or if the window does not exist then this
    * method throws an error.
    */
  def moveAbove(mediaSourceId: String): Unit = js.native
  
  /**
    * Moves the current tab into a new window if native tabs are enabled and there is
    * more than one tab in the current window.
    *
    * @platform darwin
    */
  def moveTabToNewWindow(): Unit = js.native
  
  /**
    * Moves window to top(z-order) regardless of focus
    */
  def moveTop(): Unit = js.native
  
  @JSName("off")
  def off_alwaysontopchanged(
    event: `always-on-top-changed`,
    listener: js.Function2[/* event */ Event[js.Object], /* isAlwaysOnTop */ Boolean, Unit]
  ): this.type = js.native
  /**
    * @platform win32,linux
    */
  @JSName("off")
  def off_appcommand(
    event: `app-command`,
    listener: js.Function2[/* event */ Event[js.Object], /* command */ String, Unit]
  ): this.type = js.native
  @JSName("off")
  def off_blur(event: blur, listener: js.Function1[/* event */ Event[js.Object], Unit]): this.type = js.native
  @JSName("off")
  def off_close(event: close, listener: js.Function1[/* event */ Event[js.Object], Unit]): this.type = js.native
  @JSName("off")
  def off_closed(event: closed, listener: js.Function0[Unit]): this.type = js.native
  @JSName("off")
  def off_enterfullscreen(event: `enter-full-screen`, listener: js.Function0[Unit]): this.type = js.native
  @JSName("off")
  def off_focus(event: focus, listener: js.Function1[/* event */ Event[js.Object], Unit]): this.type = js.native
  @JSName("off")
  def off_hide(event: hide, listener: js.Function0[Unit]): this.type = js.native
  @JSName("off")
  def off_leavefullscreen(event: `leave-full-screen`, listener: js.Function0[Unit]): this.type = js.native
  @JSName("off")
  def off_maximize(event: maximize, listener: js.Function0[Unit]): this.type = js.native
  @JSName("off")
  def off_minimize(event: minimize, listener: js.Function0[Unit]): this.type = js.native
  @JSName("off")
  def off_move(event: move, listener: js.Function0[Unit]): this.type = js.native
  /**
    * @platform darwin,win32
    */
  @JSName("off")
  def off_moved(event: moved, listener: js.Function0[Unit]): this.type = js.native
  /**
    * @platform darwin
    */
  @JSName("off")
  def off_newwindowfortab(event: `new-window-for-tab`, listener: js.Function0[Unit]): this.type = js.native
  /**
    * @platform win32
    */
  @JSName("off")
  def off_querysessionend(event: `query-session-end`, listener: js.Function1[/* event */ WindowSessionEndEvent, Unit]): this.type = js.native
  @JSName("off")
  def off_resize(event: resize, listener: js.Function0[Unit]): this.type = js.native
  /**
    * @platform darwin,win32
    */
  @JSName("off")
  def off_resized(event: resized, listener: js.Function0[Unit]): this.type = js.native
  @JSName("off")
  def off_restore(event: restore, listener: js.Function0[Unit]): this.type = js.native
  /**
    * @platform darwin
    */
  @JSName("off")
  def off_rotategesture(
    event: `rotate-gesture`,
    listener: js.Function2[/* event */ Event[js.Object], /* rotation */ Double, Unit]
  ): this.type = js.native
  /**
    * @platform win32
    */
  @JSName("off")
  def off_sessionend(event: `session-end`, listener: js.Function1[/* event */ WindowSessionEndEvent, Unit]): this.type = js.native
  /**
    * @platform darwin
    */
  @JSName("off")
  def off_sheetbegin(event: `sheet-begin`, listener: js.Function0[Unit]): this.type = js.native
  /**
    * @platform darwin
    */
  @JSName("off")
  def off_sheetend(event: `sheet-end`, listener: js.Function0[Unit]): this.type = js.native
  @JSName("off")
  def off_show(event: show, listener: js.Function0[Unit]): this.type = js.native
  /**
    * @platform darwin
    */
  @JSName("off")
  def off_swipe(event: swipe, listener: js.Function2[/* event */ Event[js.Object], /* direction */ String, Unit]): this.type = js.native
  /**
    * @platform win32,linux
    */
  @JSName("off")
  def off_systemcontextmenu(
    event: `system-context-menu`,
    listener: js.Function2[/* event */ Event[js.Object], /* point */ Point, Unit]
  ): this.type = js.native
  @JSName("off")
  def off_unmaximize(event: unmaximize, listener: js.Function0[Unit]): this.type = js.native
  /**
    * @platform darwin,win32
    */
  @JSName("off")
  def off_willmove(
    event: `will-move`,
    listener: js.Function2[/* event */ Event[js.Object], /* newBounds */ Rectangle, Unit]
  ): this.type = js.native
  /**
    * @platform darwin,win32
    */
  @JSName("off")
  def off_willresize(
    event: `will-resize`,
    listener: js.Function3[
      /* event */ Event[js.Object], 
      /* newBounds */ Rectangle, 
      /* details */ WillResizeDetails, 
      Unit
    ]
  ): this.type = js.native
  
  // Docs: https://electronjs.org/docs/api/base-window
  /**
    * Emitted when the window is set or unset to show always on top of other windows.
    */
  @JSName("on")
  def on_alwaysontopchanged(
    event: `always-on-top-changed`,
    listener: js.Function2[/* event */ Event[js.Object], /* isAlwaysOnTop */ Boolean, Unit]
  ): this.type = js.native
  /**
    * Emitted when an App Command is invoked. These are typically related to keyboard
    * media keys or browser commands, as well as the "Back" button built into some
    * mice on Windows.
    *
    * Commands are lowercased, underscores are replaced with hyphens, and the
    * `APPCOMMAND_` prefix is stripped off. e.g. `APPCOMMAND_BROWSER_BACKWARD` is
    * emitted as `browser-backward`.
    *
    * The following app commands are explicitly supported on Linux:
    *
    * * `browser-backward`
    * * `browser-forward`
    *
    * @platform win32,linux
    */
  @JSName("on")
  def on_appcommand(
    event: `app-command`,
    listener: js.Function2[/* event */ Event[js.Object], /* command */ String, Unit]
  ): this.type = js.native
  /**
    * Emitted when the window loses focus.
    */
  @JSName("on")
  def on_blur(event: blur, listener: js.Function1[/* event */ Event[js.Object], Unit]): this.type = js.native
  /**
    * Emitted when the window is going to be closed. It's emitted before the
    * `beforeunload` and `unload` event of the DOM. Calling `event.preventDefault()`
    * will cancel the close.
    *
    * Usually you would want to use the `beforeunload` handler to decide whether the
    * window should be closed, which will also be called when the window is reloaded.
    * In Electron, returning any value other than `undefined` would cancel the close.
    * For example:
    *
    * > [!NOTE] There is a subtle difference between the behaviors of
    * `window.onbeforeunload = handler` and `window.addEventListener('beforeunload',
    * handler)`. It is recommended to always set the `event.returnValue` explicitly,
    * instead of only returning a value, as the former works more consistently within
    * Electron.
    */
  @JSName("on")
  def on_close(event: close, listener: js.Function1[/* event */ Event[js.Object], Unit]): this.type = js.native
  /**
    * Emitted when the window is closed. After you have received this event you should
    * remove the reference to the window and avoid using it any more.
    */
  @JSName("on")
  def on_closed(event: closed, listener: js.Function0[Unit]): this.type = js.native
  /**
    * Emitted when the window enters a full-screen state.
    */
  @JSName("on")
  def on_enterfullscreen(event: `enter-full-screen`, listener: js.Function0[Unit]): this.type = js.native
  /**
    * Emitted when the window gains focus.
    */
  @JSName("on")
  def on_focus(event: focus, listener: js.Function1[/* event */ Event[js.Object], Unit]): this.type = js.native
  /**
    * Emitted when the window is hidden.
    */
  @JSName("on")
  def on_hide(event: hide, listener: js.Function0[Unit]): this.type = js.native
  /**
    * Emitted when the window leaves a full-screen state.
    */
  @JSName("on")
  def on_leavefullscreen(event: `leave-full-screen`, listener: js.Function0[Unit]): this.type = js.native
  /**
    * Emitted when window is maximized.
    */
  @JSName("on")
  def on_maximize(event: maximize, listener: js.Function0[Unit]): this.type = js.native
  /**
    * Emitted when the window is minimized.
    */
  @JSName("on")
  def on_minimize(event: minimize, listener: js.Function0[Unit]): this.type = js.native
  /**
    * Emitted when the window is being moved to a new position.
    */
  @JSName("on")
  def on_move(event: move, listener: js.Function0[Unit]): this.type = js.native
  /**
    * Emitted once when the window is moved to a new position.
    *
    * > [!NOTE] On macOS, this event is an alias of `move`.
    *
    * @platform darwin,win32
    */
  @JSName("on")
  def on_moved(event: moved, listener: js.Function0[Unit]): this.type = js.native
  /**
    * Emitted when the native new tab button is clicked.
    *
    * @platform darwin
    */
  @JSName("on")
  def on_newwindowfortab(event: `new-window-for-tab`, listener: js.Function0[Unit]): this.type = js.native
  /**
    * Emitted when a session is about to end due to a shutdown, machine restart, or
    * user log-off. Calling `event.preventDefault()` can delay the system shutdown,
    * though it’s generally best to respect the user’s choice to end the session.
    * However, you may choose to use it if ending the session puts the user at risk of
    * losing data.
    *
    * @platform win32
    */
  @JSName("on")
  def on_querysessionend(event: `query-session-end`, listener: js.Function1[/* event */ WindowSessionEndEvent, Unit]): this.type = js.native
  /**
    * Emitted after the window has been resized.
    */
  @JSName("on")
  def on_resize(event: resize, listener: js.Function0[Unit]): this.type = js.native
  /**
    * Emitted once when the window has finished being resized.
    *
    * This is usually emitted when the window has been resized manually. On macOS,
    * resizing the window with `setBounds`/`setSize` and setting the `animate`
    * parameter to `true` will also emit this event once resizing has finished.
    *
    * @platform darwin,win32
    */
  @JSName("on")
  def on_resized(event: resized, listener: js.Function0[Unit]): this.type = js.native
  /**
    * Emitted when the window is restored from a minimized state.
    */
  @JSName("on")
  def on_restore(event: restore, listener: js.Function0[Unit]): this.type = js.native
  /**
    * Emitted on trackpad rotation gesture. Continually emitted until rotation gesture
    * is ended. The `rotation` value on each emission is the angle in degrees rotated
    * since the last emission. The last emitted event upon a rotation gesture will
    * always be of value `0`. Counter-clockwise rotation values are positive, while
    * clockwise ones are negative.
    *
    * @platform darwin
    */
  @JSName("on")
  def on_rotategesture(
    event: `rotate-gesture`,
    listener: js.Function2[/* event */ Event[js.Object], /* rotation */ Double, Unit]
  ): this.type = js.native
  /**
    * Emitted when a session is about to end due to a shutdown, machine restart, or
    * user log-off. Once this event fires, there is no way to prevent the session from
    * ending.
    *
    * @platform win32
    */
  @JSName("on")
  def on_sessionend(event: `session-end`, listener: js.Function1[/* event */ WindowSessionEndEvent, Unit]): this.type = js.native
  /**
    * Emitted when the window opens a sheet.
    *
    * @platform darwin
    */
  @JSName("on")
  def on_sheetbegin(event: `sheet-begin`, listener: js.Function0[Unit]): this.type = js.native
  /**
    * Emitted when the window has closed a sheet.
    *
    * @platform darwin
    */
  @JSName("on")
  def on_sheetend(event: `sheet-end`, listener: js.Function0[Unit]): this.type = js.native
  /**
    * Emitted when the window is shown.
    */
  @JSName("on")
  def on_show(event: show, listener: js.Function0[Unit]): this.type = js.native
  /**
    * Emitted on 3-finger swipe. Possible directions are `up`, `right`, `down`,
    * `left`.
    *
    * The method underlying this event is built to handle older macOS-style trackpad
    * swiping, where the content on the screen doesn't move with the swipe. Most macOS
    * trackpads are not configured to allow this kind of swiping anymore, so in order
    * for it to emit properly the 'Swipe between pages' preference in `System
    * Preferences > Trackpad > More Gestures` must be set to 'Swipe with two or three
    * fingers'.
    *
    * @platform darwin
    */
  @JSName("on")
  def on_swipe(event: swipe, listener: js.Function2[/* event */ Event[js.Object], /* direction */ String, Unit]): this.type = js.native
  /**
    * Emitted when the system context menu is triggered on the window, this is
    * normally only triggered when the user right clicks on the non-client area of
    * your window.  This is the window titlebar or any area you have declared as
    * `-webkit-app-region: drag` in a frameless window.
    *
    * Calling `event.preventDefault()` will prevent the menu from being displayed.
    *
    * To convert `point` to DIP, use `screen.screenToDipPoint(point)`.
    *
    * @platform win32,linux
    */
  @JSName("on")
  def on_systemcontextmenu(
    event: `system-context-menu`,
    listener: js.Function2[/* event */ Event[js.Object], /* point */ Point, Unit]
  ): this.type = js.native
  /**
    * Emitted when the window exits from a maximized state.
    */
  @JSName("on")
  def on_unmaximize(event: unmaximize, listener: js.Function0[Unit]): this.type = js.native
  /**
    * Emitted before the window is moved. On Windows, calling `event.preventDefault()`
    * will prevent the window from being moved.
    *
    * Note that this is only emitted when the window is being moved manually. Moving
    * the window with `setPosition`/`setBounds`/`center` will not emit this event.
    *
    * @platform darwin,win32
    */
  @JSName("on")
  def on_willmove(
    event: `will-move`,
    listener: js.Function2[/* event */ Event[js.Object], /* newBounds */ Rectangle, Unit]
  ): this.type = js.native
  /**
    * Emitted before the window is resized. Calling `event.preventDefault()` will
    * prevent the window from being resized.
    *
    * Note that this is only emitted when the window is being resized manually.
    * Resizing the window with `setBounds`/`setSize` will not emit this event.
    *
    * The possible values and behaviors of the `edge` option are platform dependent.
    * Possible values are:
    *
    * * On Windows, possible values are `bottom`, `top`, `left`, `right`, `top-left`,
    * `top-right`, `bottom-left`, `bottom-right`.
    * * On macOS, possible values are `bottom` and `right`.
    *   * The value `bottom` is used to denote vertical resizing.
    *   * The value `right` is used to denote horizontal resizing.
    *
    * @platform darwin,win32
    */
  @JSName("on")
  def on_willresize(
    event: `will-resize`,
    listener: js.Function3[
      /* event */ Event[js.Object], 
      /* newBounds */ Rectangle, 
      /* details */ WillResizeDetails, 
      Unit
    ]
  ): this.type = js.native
  
  @JSName("once")
  def once_alwaysontopchanged(
    event: `always-on-top-changed`,
    listener: js.Function2[/* event */ Event[js.Object], /* isAlwaysOnTop */ Boolean, Unit]
  ): this.type = js.native
  /**
    * @platform win32,linux
    */
  @JSName("once")
  def once_appcommand(
    event: `app-command`,
    listener: js.Function2[/* event */ Event[js.Object], /* command */ String, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_blur(event: blur, listener: js.Function1[/* event */ Event[js.Object], Unit]): this.type = js.native
  @JSName("once")
  def once_close(event: close, listener: js.Function1[/* event */ Event[js.Object], Unit]): this.type = js.native
  @JSName("once")
  def once_closed(event: closed, listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_enterfullscreen(event: `enter-full-screen`, listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_focus(event: focus, listener: js.Function1[/* event */ Event[js.Object], Unit]): this.type = js.native
  @JSName("once")
  def once_hide(event: hide, listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_leavefullscreen(event: `leave-full-screen`, listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_maximize(event: maximize, listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_minimize(event: minimize, listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_move(event: move, listener: js.Function0[Unit]): this.type = js.native
  /**
    * @platform darwin,win32
    */
  @JSName("once")
  def once_moved(event: moved, listener: js.Function0[Unit]): this.type = js.native
  /**
    * @platform darwin
    */
  @JSName("once")
  def once_newwindowfortab(event: `new-window-for-tab`, listener: js.Function0[Unit]): this.type = js.native
  /**
    * @platform win32
    */
  @JSName("once")
  def once_querysessionend(event: `query-session-end`, listener: js.Function1[/* event */ WindowSessionEndEvent, Unit]): this.type = js.native
  @JSName("once")
  def once_resize(event: resize, listener: js.Function0[Unit]): this.type = js.native
  /**
    * @platform darwin,win32
    */
  @JSName("once")
  def once_resized(event: resized, listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_restore(event: restore, listener: js.Function0[Unit]): this.type = js.native
  /**
    * @platform darwin
    */
  @JSName("once")
  def once_rotategesture(
    event: `rotate-gesture`,
    listener: js.Function2[/* event */ Event[js.Object], /* rotation */ Double, Unit]
  ): this.type = js.native
  /**
    * @platform win32
    */
  @JSName("once")
  def once_sessionend(event: `session-end`, listener: js.Function1[/* event */ WindowSessionEndEvent, Unit]): this.type = js.native
  /**
    * @platform darwin
    */
  @JSName("once")
  def once_sheetbegin(event: `sheet-begin`, listener: js.Function0[Unit]): this.type = js.native
  /**
    * @platform darwin
    */
  @JSName("once")
  def once_sheetend(event: `sheet-end`, listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_show(event: show, listener: js.Function0[Unit]): this.type = js.native
  /**
    * @platform darwin
    */
  @JSName("once")
  def once_swipe(event: swipe, listener: js.Function2[/* event */ Event[js.Object], /* direction */ String, Unit]): this.type = js.native
  /**
    * @platform win32,linux
    */
  @JSName("once")
  def once_systemcontextmenu(
    event: `system-context-menu`,
    listener: js.Function2[/* event */ Event[js.Object], /* point */ Point, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_unmaximize(event: unmaximize, listener: js.Function0[Unit]): this.type = js.native
  /**
    * @platform darwin,win32
    */
  @JSName("once")
  def once_willmove(
    event: `will-move`,
    listener: js.Function2[/* event */ Event[js.Object], /* newBounds */ Rectangle, Unit]
  ): this.type = js.native
  /**
    * @platform darwin,win32
    */
  @JSName("once")
  def once_willresize(
    event: `will-resize`,
    listener: js.Function3[
      /* event */ Event[js.Object], 
      /* newBounds */ Rectangle, 
      /* details */ WillResizeDetails, 
      Unit
    ]
  ): this.type = js.native
  
  /**
    * Uses Quick Look to preview a file at a given path.
    *
    * @platform darwin
    */
  def previewFile(path: String): Unit = js.native
  def previewFile(path: String, displayName: String): Unit = js.native
  
  @JSName("removeListener")
  def removeListener_alwaysontopchanged(
    event: `always-on-top-changed`,
    listener: js.Function2[/* event */ Event[js.Object], /* isAlwaysOnTop */ Boolean, Unit]
  ): this.type = js.native
  /**
    * @platform win32,linux
    */
  @JSName("removeListener")
  def removeListener_appcommand(
    event: `app-command`,
    listener: js.Function2[/* event */ Event[js.Object], /* command */ String, Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_blur(event: blur, listener: js.Function1[/* event */ Event[js.Object], Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_close(event: close, listener: js.Function1[/* event */ Event[js.Object], Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_closed(event: closed, listener: js.Function0[Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_enterfullscreen(event: `enter-full-screen`, listener: js.Function0[Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_focus(event: focus, listener: js.Function1[/* event */ Event[js.Object], Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_hide(event: hide, listener: js.Function0[Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_leavefullscreen(event: `leave-full-screen`, listener: js.Function0[Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_maximize(event: maximize, listener: js.Function0[Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_minimize(event: minimize, listener: js.Function0[Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_move(event: move, listener: js.Function0[Unit]): this.type = js.native
  /**
    * @platform darwin,win32
    */
  @JSName("removeListener")
  def removeListener_moved(event: moved, listener: js.Function0[Unit]): this.type = js.native
  /**
    * @platform darwin
    */
  @JSName("removeListener")
  def removeListener_newwindowfortab(event: `new-window-for-tab`, listener: js.Function0[Unit]): this.type = js.native
  /**
    * @platform win32
    */
  @JSName("removeListener")
  def removeListener_querysessionend(event: `query-session-end`, listener: js.Function1[/* event */ WindowSessionEndEvent, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_resize(event: resize, listener: js.Function0[Unit]): this.type = js.native
  /**
    * @platform darwin,win32
    */
  @JSName("removeListener")
  def removeListener_resized(event: resized, listener: js.Function0[Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_restore(event: restore, listener: js.Function0[Unit]): this.type = js.native
  /**
    * @platform darwin
    */
  @JSName("removeListener")
  def removeListener_rotategesture(
    event: `rotate-gesture`,
    listener: js.Function2[/* event */ Event[js.Object], /* rotation */ Double, Unit]
  ): this.type = js.native
  /**
    * @platform win32
    */
  @JSName("removeListener")
  def removeListener_sessionend(event: `session-end`, listener: js.Function1[/* event */ WindowSessionEndEvent, Unit]): this.type = js.native
  /**
    * @platform darwin
    */
  @JSName("removeListener")
  def removeListener_sheetbegin(event: `sheet-begin`, listener: js.Function0[Unit]): this.type = js.native
  /**
    * @platform darwin
    */
  @JSName("removeListener")
  def removeListener_sheetend(event: `sheet-end`, listener: js.Function0[Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_show(event: show, listener: js.Function0[Unit]): this.type = js.native
  /**
    * @platform darwin
    */
  @JSName("removeListener")
  def removeListener_swipe(event: swipe, listener: js.Function2[/* event */ Event[js.Object], /* direction */ String, Unit]): this.type = js.native
  /**
    * @platform win32,linux
    */
  @JSName("removeListener")
  def removeListener_systemcontextmenu(
    event: `system-context-menu`,
    listener: js.Function2[/* event */ Event[js.Object], /* point */ Point, Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_unmaximize(event: unmaximize, listener: js.Function0[Unit]): this.type = js.native
  /**
    * @platform darwin,win32
    */
  @JSName("removeListener")
  def removeListener_willmove(
    event: `will-move`,
    listener: js.Function2[/* event */ Event[js.Object], /* newBounds */ Rectangle, Unit]
  ): this.type = js.native
  /**
    * @platform darwin,win32
    */
  @JSName("removeListener")
  def removeListener_willresize(
    event: `will-resize`,
    listener: js.Function3[
      /* event */ Event[js.Object], 
      /* newBounds */ Rectangle, 
      /* details */ WillResizeDetails, 
      Unit
    ]
  ): this.type = js.native
  
  /**
    * Remove the window's menu bar.
    *
    * @platform linux,win32
    */
  def removeMenu(): Unit = js.native
  
  /**
    * A `string` property that determines the pathname of the file the window
    * represents, and the icon of the file will show in window's title bar.
    *
    * @platform darwin
    */
  var representedFilename: String = js.native
  
  /**
    * A `boolean` property that determines whether the window can be manually resized
    * by user.
    */
  var resizable: Boolean = js.native
  
  /**
    * Restores the window from minimized state to its previous state.
    */
  def restore(): Unit = js.native
  
  /**
    * Selects the next tab when native tabs are enabled and there are other tabs in
    * the window.
    *
    * @platform darwin
    */
  def selectNextTab(): Unit = js.native
  
  /**
    * Selects the previous tab when native tabs are enabled and there are other tabs
    * in the window.
    *
    * @platform darwin
    */
  def selectPreviousTab(): Unit = js.native
  
  /**
    * Sets whether the window should show always on top of other windows. After
    * setting this, the window is still a normal window, not a toolbox window which
    * can not be focused on.
    */
  def setAlwaysOnTop(flag: Boolean): Unit = js.native
  def setAlwaysOnTop(
    flag: Boolean,
    level: normal | floating | `torn-off-menu` | `modal-panel` | `main-menu` | status | `pop-up-menu` | `screen-saver` | dock
  ): Unit = js.native
  def setAlwaysOnTop(
    flag: Boolean,
    level: normal | floating | `torn-off-menu` | `modal-panel` | `main-menu` | status | `pop-up-menu` | `screen-saver` | dock,
    relativeLevel: Double
  ): Unit = js.native
  def setAlwaysOnTop(flag: Boolean, level: Unit, relativeLevel: Double): Unit = js.native
  
  /**
    * Sets the properties for the window's taskbar button.
    *
    * > [!NOTE] `relaunchCommand` and `relaunchDisplayName` must always be set
    * together. If one of those properties is not set, then neither will be used.
    *
    * @platform win32
    */
  def setAppDetails(options: AppDetailsOptions): Unit = js.native
  
  /**
    * This will make a window maintain an aspect ratio. The extra size allows a
    * developer to have space, specified in pixels, not included within the aspect
    * ratio calculations. This API already takes into account the difference between a
    * window's size and its content size.
    *
    * Consider a normal window with an HD video player and associated controls.
    * Perhaps there are 15 pixels of controls on the left edge, 25 pixels of controls
    * on the right edge and 50 pixels of controls below the player. In order to
    * maintain a 16:9 aspect ratio (standard aspect ratio for HD @1920x1080) within
    * the player itself we would call this function with arguments of 16/9 and {
    * width: 40, height: 50 }. The second argument doesn't care where the extra width
    * and height are within the content view--only that they exist. Sum any extra
    * width and height areas you have within the overall content view.
    *
    * The aspect ratio is not respected when window is resized programmatically with
    * APIs like `win.setSize`.
    *
    * To reset an aspect ratio, pass 0 as the `aspectRatio` value:
    * `win.setAspectRatio(0)`.
    */
  def setAspectRatio(aspectRatio: Double): Unit = js.native
  def setAspectRatio(aspectRatio: Double, extraSize: Size): Unit = js.native
  
  /**
    * Controls whether to hide cursor when typing.
    *
    * @platform darwin
    */
  def setAutoHideCursor(autoHide: Boolean): Unit = js.native
  
  /**
    * Sets whether the window menu bar should hide itself automatically. Once set the
    * menu bar will only show when users press the single `Alt` key.
    *
    * If the menu bar is already visible, calling `setAutoHideMenuBar(true)` won't
    * hide it immediately.
    *
    * @platform win32,linux
    */
  def setAutoHideMenuBar(hide: Boolean): Unit = js.native
  
  /**
    * Examples of valid `backgroundColor` values:
    *
    * * Hex
    *   * #fff (shorthand RGB)
    *   * #ffff (shorthand ARGB)
    *   * #ffffff (RGB)
    *   * #ffffffff (ARGB)
    * * RGB
    *   * `rgb\(([\d]+),\s*([\d]+),\s*([\d]+)\)`
    *     * e.g. rgb(255, 255, 255)
    * * RGBA
    *   * `rgba\(([\d]+),\s*([\d]+),\s*([\d]+),\s*([\d.]+)\)`
    *     * e.g. rgba(255, 255, 255, 1.0)
    * * HSL
    *   * `hsl\((-?[\d.]+),\s*([\d.]+)%,\s*([\d.]+)%\)`
    *     * e.g. hsl(200, 20%, 50%)
    * * HSLA
    *   * `hsla\((-?[\d.]+),\s*([\d.]+)%,\s*([\d.]+)%,\s*([\d.]+)\)`
    *     * e.g. hsla(200, 20%, 50%, 0.5)
    * * Color name
    *   * Options are listed in SkParseColor.cpp
    *   * Similar to CSS Color Module Level 3 keywords, but case-sensitive.
    *     * e.g. `blueviolet` or `red`
    *
    * Sets the background color of the window. See Setting `backgroundColor`.
    */
  def setBackgroundColor(backgroundColor: String): Unit = js.native
  
  /**
    * This method sets the browser window's system-drawn background material,
    * including behind the non-client area.
    *
    * See the Windows documentation for more details.
    *
    * > [!NOTE] This method is only supported on Windows 11 22H2 and up.
    *
    * @platform win32
    */
  def setBackgroundMaterial(material: auto | none | mica | acrylic | tabbed): Unit = js.native
  
  /**
    * Resizes and moves the window to the supplied bounds. Any properties that are not
    * supplied will default to their current values.
    *
    * > [!NOTE] On macOS, the y-coordinate value cannot be smaller than the Tray
    * height. The tray height has changed over time and depends on the operating
    * system, but is between 20-40px. Passing a value lower than the tray height will
    * result in a window that is flush to the tray.
    */
  def setBounds(bounds: PartialRectangle): Unit = js.native
  def setBounds(bounds: PartialRectangle, animate: Boolean): Unit = js.native
  
  /**
    * Sets whether the window can be manually closed by user. On Linux does nothing.
    *
    * @platform darwin,win32
    */
  def setClosable(closable: Boolean): Unit = js.native
  
  /**
    * Resizes and moves the window's client area (e.g. the web page) to the supplied
    * bounds.
    */
  def setContentBounds(bounds: Rectangle): Unit = js.native
  def setContentBounds(bounds: Rectangle, animate: Boolean): Unit = js.native
  
  /**
    * Prevents the window contents from being captured by other apps.
    *
    * On macOS it sets the NSWindow's sharingType to NSWindowSharingNone. On Windows
    * it calls SetWindowDisplayAffinity with `WDA_EXCLUDEFROMCAPTURE`. For Windows 10
    * version 2004 and up the window will be removed from capture entirely, older
    * Windows versions behave as if `WDA_MONITOR` is applied capturing a black window.
    *
    * @platform darwin,win32
    */
  def setContentProtection(enable: Boolean): Unit = js.native
  
  /**
    * Resizes the window's client area (e.g. the web page) to `width` and `height`.
    */
  def setContentSize(width: Double, height: Double): Unit = js.native
  def setContentSize(width: Double, height: Double, animate: Boolean): Unit = js.native
  
  /**
    * Sets the content view of the window.
    */
  def setContentView(view: View): Unit = js.native
  
  /**
    * Specifies whether the window’s document has been edited, and the icon in title
    * bar will become gray when set to `true`.
    *
    * @platform darwin
    */
  def setDocumentEdited(edited: Boolean): Unit = js.native
  
  /**
    * Disable or enable the window.
    */
  def setEnabled(enable: Boolean): Unit = js.native
  
  /**
    * Changes whether the window can be focused.
    *
    * On macOS it does not remove the focus from the window.
    *
    * @platform darwin,win32
    */
  def setFocusable(focusable: Boolean): Unit = js.native
  
  /**
    * Sets whether the window should be in fullscreen mode.
    *
    * > [!NOTE] On macOS, fullscreen transitions take place asynchronously. If further
    * actions depend on the fullscreen state, use the 'enter-full-screen' or >
    * 'leave-full-screen' events.
    */
  def setFullScreen(flag: Boolean): Unit = js.native
  
  /**
    * Sets whether the maximize/zoom window button toggles fullscreen mode or
    * maximizes the window.
    */
  def setFullScreenable(fullscreenable: Boolean): Unit = js.native
  
  /**
    * Sets whether the window should have a shadow.
    */
  def setHasShadow(hasShadow: Boolean): Unit = js.native
  
  /**
    * Sets whether the window will be hidden when the user toggles into mission
    * control.
    *
    * @platform darwin
    */
  def setHiddenInMissionControl(hidden: Boolean): Unit = js.native
  
  def setIcon(icon: String): Unit = js.native
  /**
    * Changes window icon.
    *
    * @platform win32,linux
    */
  def setIcon(icon: NativeImage_): Unit = js.native
  
  /**
    * Makes the window ignore all mouse events.
    *
    * All mouse events happened in this window will be passed to the window below this
    * window, but if this window has focus, it will still receive keyboard events.
    */
  def setIgnoreMouseEvents(ignore: Boolean): Unit = js.native
  def setIgnoreMouseEvents(ignore: Boolean, options: IgnoreMouseEventsOptions): Unit = js.native
  
  /**
    * Enters or leaves kiosk mode.
    */
  def setKiosk(flag: Boolean): Unit = js.native
  
  /**
    * Sets whether the window can be manually maximized by user. On Linux does
    * nothing.
    *
    * @platform darwin,win32
    */
  def setMaximizable(maximizable: Boolean): Unit = js.native
  
  /**
    * Sets the maximum size of window to `width` and `height`.
    */
  def setMaximumSize(width: Double, height: Double): Unit = js.native
  
  /**
    * Sets the `menu` as the window's menu bar.
    *
    * @platform linux,win32
    */
  def setMenu(): Unit = js.native
  def setMenu(menu: Menu): Unit = js.native
  
  /**
    * Sets whether the menu bar should be visible. If the menu bar is auto-hide, users
    * can still bring up the menu bar by pressing the single `Alt` key.
    *
    * @platform win32,linux
    */
  def setMenuBarVisibility(visible: Boolean): Unit = js.native
  
  /**
    * Sets whether the window can be manually minimized by user. On Linux does
    * nothing.
    *
    * @platform darwin,win32
    */
  def setMinimizable(minimizable: Boolean): Unit = js.native
  
  /**
    * Sets the minimum size of window to `width` and `height`.
    */
  def setMinimumSize(width: Double, height: Double): Unit = js.native
  
  /**
    * Sets whether the window can be moved by user. On Linux does nothing.
    *
    * @platform darwin,win32
    */
  def setMovable(movable: Boolean): Unit = js.native
  
  /**
    * Sets the opacity of the window. On Linux, does nothing. Out of bound number
    * values are clamped to the [0, 1] range.
    *
    * @platform win32,darwin
    */
  def setOpacity(opacity: Double): Unit = js.native
  
  def setOverlayIcon(overlay: Null, description: String): Unit = js.native
  /**
    * Sets a 16 x 16 pixel overlay onto the current taskbar icon, usually used to
    * convey some sort of application status or to passively notify the user.
    *
    * @platform win32
    */
  def setOverlayIcon(overlay: NativeImage_, description: String): Unit = js.native
  
  /**
    * Sets `parent` as current window's parent window, passing `null` will turn
    * current window into a top-level window.
    */
  def setParentWindow(): Unit = js.native
  def setParentWindow(parent: BaseWindow): Unit = js.native
  
  /**
    * Moves window to `x` and `y`.
    */
  def setPosition(x: Double, y: Double): Unit = js.native
  def setPosition(x: Double, y: Double, animate: Boolean): Unit = js.native
  
  /**
    * Sets progress value in progress bar. Valid range is [0, 1.0].
    *
    * Remove progress bar when progress < 0; Change to indeterminate mode when
    * progress > 1.
    *
    * On Linux platform, only supports Unity desktop environment, you need to specify
    * the `*.desktop` file name to `desktopName` field in `package.json`. By default,
    * it will assume `{app.name}.desktop`.
    *
    * On Windows, a mode can be passed. Accepted values are `none`, `normal`,
    * `indeterminate`, `error`, and `paused`. If you call `setProgressBar` without a
    * mode set (but with a value within the valid range), `normal` will be assumed.
    */
  def setProgressBar(progress: Double): Unit = js.native
  def setProgressBar(progress: Double, options: ProgressBarOptions): Unit = js.native
  
  /**
    * Sets the pathname of the file the window represents, and the icon of the file
    * will show in window's title bar.
    *
    * @platform darwin
    */
  def setRepresentedFilename(filename: String): Unit = js.native
  
  /**
    * Sets whether the window can be manually resized by the user.
    */
  def setResizable(resizable: Boolean): Unit = js.native
  
  /**
    * Setting a window shape determines the area within the window where the system
    * permits drawing and user interaction. Outside of the given region, no pixels
    * will be drawn and no mouse events will be registered. Mouse events outside of
    * the region will not be received by that window, but will fall through to
    * whatever is behind the window.
    *
    * @experimental
    * @platform win32,linux
    */
  def setShape(rects: js.Array[Rectangle]): Unit = js.native
  
  /**
    * Changes the attachment point for sheets on macOS. By default, sheets are
    * attached just below the window frame, but you may want to display them beneath a
    * HTML-rendered toolbar. For example:
    *
    * @platform darwin
    */
  def setSheetOffset(offsetY: Double): Unit = js.native
  def setSheetOffset(offsetY: Double, offsetX: Double): Unit = js.native
  
  /**
    * Enters or leaves simple fullscreen mode.
    *
    * Simple fullscreen mode emulates the native fullscreen behavior found in versions
    * of macOS prior to Lion (10.7).
    *
    * @platform darwin
    */
  def setSimpleFullScreen(flag: Boolean): Unit = js.native
  
  /**
    * Resizes the window to `width` and `height`. If `width` or `height` are below any
    * set minimum size constraints the window will snap to its minimum size.
    */
  def setSize(width: Double, height: Double): Unit = js.native
  def setSize(width: Double, height: Double, animate: Boolean): Unit = js.native
  
  /**
    * Makes the window not show in the taskbar.
    *
    * @platform darwin,win32
    */
  def setSkipTaskbar(skip: Boolean): Unit = js.native
  
  /**
    * Whether the buttons were added successfully
    *
    * Add a thumbnail toolbar with a specified set of buttons to the thumbnail image
    * of a window in a taskbar button layout. Returns a `boolean` object indicates
    * whether the thumbnail has been added successfully.
    *
    * The number of buttons in thumbnail toolbar should be no greater than 7 due to
    * the limited room. Once you setup the thumbnail toolbar, the toolbar cannot be
    * removed due to the platform's limitation. But you can call the API with an empty
    * array to clean the buttons.
    *
    * The `buttons` is an array of `Button` objects:
    *
    * * `Button` Object
    *   * `icon` NativeImage - The icon showing in thumbnail toolbar.
    *   * `click` Function
    *   * `tooltip` string (optional) - The text of the button's tooltip.
    *   * `flags` string[] (optional) - Control specific states and behaviors of the
    * button. By default, it is `['enabled']`.
    *
    * The `flags` is an array that can include following `string`s:
    *
    * * `enabled` - The button is active and available to the user.
    * * `disabled` - The button is disabled. It is present, but has a visual state
    * indicating it will not respond to user action.
    * * `dismissonclick` - When the button is clicked, the thumbnail window closes
    * immediately.
    * * `nobackground` - Do not draw a button border, use only the image.
    * * `hidden` - The button is not shown to the user.
    * * `noninteractive` - The button is enabled but not interactive; no pressed
    * button state is drawn. This value is intended for instances where the button is
    * used in a notification.
    *
    * @platform win32
    */
  def setThumbarButtons(buttons: js.Array[ThumbarButton]): Boolean = js.native
  
  /**
    * Sets the region of the window to show as the thumbnail image displayed when
    * hovering over the window in the taskbar. You can reset the thumbnail to be the
    * entire window by specifying an empty region: `{ x: 0, y: 0, width: 0, height: 0
    * }`.
    *
    * @platform win32
    */
  def setThumbnailClip(region: Rectangle): Unit = js.native
  
  /**
    * Sets the toolTip that is displayed when hovering over the window thumbnail in
    * the taskbar.
    *
    * @platform win32
    */
  def setThumbnailToolTip(toolTip: String): Unit = js.native
  
  /**
    * Changes the title of native window to `title`.
    */
  def setTitle(title: String): Unit = js.native
  
  /**
    * On a Window with Window Controls Overlay already enabled, this method updates
    * the style of the title bar overlay.
    *
    * On Linux, the `symbolColor` is automatically calculated to have minimum
    * accessible contrast to the `color` if not explicitly set.
    *
    * @platform win32,linux
    */
  def setTitleBarOverlay(options: TitleBarOverlayOptions): Unit = js.native
  
  /**
    * Sets the touchBar layout for the current window. Specifying `null` or
    * `undefined` clears the touch bar. This method only has an effect if the machine
    * has a touch bar.
    *
    * > [!NOTE] The TouchBar API is currently experimental and may change or be
    * removed in future Electron releases.
    *
    * @platform darwin
    */
  def setTouchBar(): Unit = js.native
  def setTouchBar(touchBar: TouchBar): Unit = js.native
  
  /**
    * Adds a vibrancy effect to the window. Passing `null` or an empty string will
    * remove the vibrancy effect on the window.
    *
    * @platform darwin
    */
  def setVibrancy(): Unit = js.native
  def setVibrancy(
    `type`: titlebar | selection | menu | popover | sidebar | header | sheet | window | hud | `fullscreen-ui` | tooltip | content | `under-window` | `under-page`
  ): Unit = js.native
  
  /**
    * Sets whether the window should be visible on all workspaces.
    *
    * > [!NOTE] This API does nothing on Windows.
    *
    * @platform darwin,linux
    */
  def setVisibleOnAllWorkspaces(visible: Boolean): Unit = js.native
  def setVisibleOnAllWorkspaces(visible: Boolean, options: VisibleOnAllWorkspacesOptions): Unit = js.native
  
  /**
    * Set a custom position for the traffic light buttons in frameless window. Passing
    * `null` will reset the position to default.
    *
    * @platform darwin
    */
  def setWindowButtonPosition(): Unit = js.native
  def setWindowButtonPosition(position: Point): Unit = js.native
  
  /**
    * Sets whether the window traffic light buttons should be visible.
    *
    * @platform darwin
    */
  def setWindowButtonVisibility(visible: Boolean): Unit = js.native
  
  /**
    * A `boolean` property that determines whether the window has a shadow.
    */
  var shadow: Boolean = js.native
  
  /**
    * Shows and gives focus to the window.
    */
  def show(): Unit = js.native
  
  /**
    * Shows or hides the tab overview when native tabs are enabled.
    *
    * @platform darwin
    */
  def showAllTabs(): Unit = js.native
  
  /**
    * Shows the window but doesn't focus on it.
    */
  def showInactive(): Unit = js.native
  
  /**
    * A `boolean` property that determines whether the window is in simple (pre-Lion)
    * fullscreen mode.
    */
  var simpleFullScreen: Boolean = js.native
  
  /**
    * A `boolean` property that indicates whether the window is arranged via Snap.
    *
    * @platform win32
    */
  val snapped: Boolean = js.native
  
  /**
    * A `string` (optional) property that is equal to the `tabbingIdentifier` passed
    * to the `BrowserWindow` constructor or `undefined` if none was set.
    *
    * @platform darwin
    */
  val tabbingIdentifier: js.UndefOr[String] = js.native
  
  /**
    * A `string` property that determines the title of the native window.
    *
    * > [!NOTE] The title of the web page can be different from the title of the
    * native window.
    */
  var title: String = js.native
  
  /**
    * Toggles the visibility of the tab bar if native tabs are enabled and there is
    * only one tab in the current window.
    *
    * @platform darwin
    */
  def toggleTabBar(): Unit = js.native
  
  /**
    * Unhooks all of the window messages.
    *
    * @platform win32
    */
  def unhookAllWindowMessages(): Unit = js.native
  
  /**
    * Unhook the window message.
    *
    * @platform win32
    */
  def unhookWindowMessage(message: Double): Unit = js.native
  
  /**
    * Unmaximizes the window.
    */
  def unmaximize(): Unit = js.native
  
  /**
    * A `boolean` property that determines whether the window is visible on all
    * workspaces.
    *
    * > [!NOTE] Always returns false on Windows.
    *
    * @platform darwin,linux
    */
  var visibleOnAllWorkspaces: Boolean = js.native
}
