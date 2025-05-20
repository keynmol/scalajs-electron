package typings.electron.Electron

import typings.electron.electronStrings.`appearance-based`
import typings.electron.electronStrings.`fullscreen-ui`
import typings.electron.electronStrings.`under-page`
import typings.electron.electronStrings.`under-window`
import typings.electron.electronStrings.acrylic
import typings.electron.electronStrings.active
import typings.electron.electronStrings.auto
import typings.electron.electronStrings.content
import typings.electron.electronStrings.customButtonsOnHover
import typings.electron.electronStrings.default
import typings.electron.electronStrings.followWindow
import typings.electron.electronStrings.header
import typings.electron.electronStrings.hidden
import typings.electron.electronStrings.hiddenInset
import typings.electron.electronStrings.hud
import typings.electron.electronStrings.inactive
import typings.electron.electronStrings.menu
import typings.electron.electronStrings.mica
import typings.electron.electronStrings.none
import typings.electron.electronStrings.popover
import typings.electron.electronStrings.selection
import typings.electron.electronStrings.sheet
import typings.electron.electronStrings.sidebar
import typings.electron.electronStrings.tabbed
import typings.electron.electronStrings.titlebar
import typings.electron.electronStrings.tooltip
import typings.electron.electronStrings.window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseWindowConstructorOptions extends StObject {
  
  // Docs: https://electronjs.org/docs/api/structures/base-window-options
  /**
    * Whether clicking an inactive window will also click through to the web contents.
    * Default is `false` on macOS. This option is not configurable on other platforms.
    *
    * @platform darwin
    */
  var acceptFirstMouse: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether the window should always stay on top of other windows. Default is
    * `false`.
    */
  var alwaysOnTop: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Auto hide the menu bar unless the `Alt` key is pressed. Default is `false`.
    *
    * @platform linux,win32
    */
  var autoHideMenuBar: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The window's background color in Hex, RGB, RGBA, HSL, HSLA or named CSS color
    * format. Alpha in #AARRGGBB format is supported if `transparent` is set to
    * `true`. Default is `#FFF` (white). See win.setBackgroundColor for more
    * information.
    */
  var backgroundColor: js.UndefOr[String] = js.undefined
  
  /**
    * Set the window's system-drawn background material, including behind the
    * non-client area. Can be `auto`, `none`, `mica`, `acrylic` or `tabbed`. See
    * win.setBackgroundMaterial for more information.
    *
    * @platform win32
    */
  var backgroundMaterial: js.UndefOr[auto | none | mica | acrylic | tabbed] = js.undefined
  
  /**
    * Show window in the center of the screen. Default is `false`.
    */
  var center: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether window is closable. This is not implemented on Linux. Default is `true`.
    *
    * @platform darwin,win32
    */
  var closable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Forces using dark theme for the window, only works on some GTK+3 desktop
    * environments. Default is `false`.
    */
  var darkTheme: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether to hide cursor when typing. Default is `false`.
    */
  var disableAutoHideCursor: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Enable the window to be resized larger than screen. Only relevant for macOS, as
    * other OSes allow larger-than-screen windows by default. Default is `false`.
    *
    * @platform darwin
    */
  var enableLargerThanScreen: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether the window can be focused. Default is `true`. On Windows setting
    * `focusable: false` also implies setting `skipTaskbar: true`. On Linux setting
    * `focusable: false` makes the window stop interacting with wm, so the window will
    * always stay on top in all workspaces.
    */
  var focusable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specify `false` to create a frameless window. Default is `true`.
    */
  var frame: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether the window should show in fullscreen. When explicitly set to `false` the
    * fullscreen button will be hidden or disabled on macOS. Default is `false`.
    */
  var fullscreen: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether the window can be put into fullscreen mode. On macOS, also whether the
    * maximize/zoom button should toggle full screen mode or maximize window. Default
    * is `true`.
    */
  var fullscreenable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether window should have a shadow. Default is `true`.
    */
  var hasShadow: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Window's height in pixels. Default is `600`.
    */
  var height: js.UndefOr[Double] = js.undefined
  
  /**
    * Whether window should be hidden when the user toggles into mission control.
    *
    * @platform darwin
    */
  var hiddenInMissionControl: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The window icon. On Windows it is recommended to use `ICO` icons to get best
    * visual effects, you can also leave it undefined so the executable's icon will be
    * used.
    */
  var icon: js.UndefOr[NativeImage_ | String] = js.undefined
  
  /**
    * Whether the window is in kiosk mode. Default is `false`.
    */
  var kiosk: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Window's maximum height. Default is no limit.
    */
  var maxHeight: js.UndefOr[Double] = js.undefined
  
  /**
    * Window's maximum width. Default is no limit.
    */
  var maxWidth: js.UndefOr[Double] = js.undefined
  
  /**
    * Whether window is maximizable. This is not implemented on Linux. Default is
    * `true`.
    *
    * @platform darwin,win32
    */
  var maximizable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Window's minimum height. Default is `0`.
    */
  var minHeight: js.UndefOr[Double] = js.undefined
  
  /**
    * Window's minimum width. Default is `0`.
    */
  var minWidth: js.UndefOr[Double] = js.undefined
  
  /**
    * Whether window is minimizable. This is not implemented on Linux. Default is
    * `true`.
    *
    * @platform darwin,win32
    */
  var minimizable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether this is a modal window. This only works when the window is a child
    * window. Default is `false`.
    */
  var modal: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether window is movable. This is not implemented on Linux. Default is `true`.
    *
    * @platform darwin,win32
    */
  var movable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Set the initial opacity of the window, between 0.0 (fully transparent) and 1.0
    * (fully opaque). This is only implemented on Windows and macOS.
    *
    * @platform darwin,win32
    */
  var opacity: js.UndefOr[Double] = js.undefined
  
  /**
    * Specify parent window. Default is `null`.
    */
  var parent: js.UndefOr[BaseWindow] = js.undefined
  
  /**
    * Whether window is resizable. Default is `true`.
    */
  var resizable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether frameless window should have rounded corners. Default is `true`. Setting
    * this property to `false` will prevent the window from being fullscreenable on
    * macOS. On Windows versions older than Windows 11 Build 22000 this property has
    * no effect, and frameless windows will not have rounded corners.
    *
    * @platform darwin,win32
    */
  var roundedCorners: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether window should be shown when created. Default is `true`.
    */
  var show: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Use pre-Lion fullscreen on macOS. Default is `false`.
    *
    * @platform darwin
    */
  var simpleFullscreen: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether to show the window in taskbar. Default is `false`.
    *
    * @platform darwin,win32
    */
  var skipTaskbar: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Tab group name, allows opening the window as a native tab. Windows with the same
    * tabbing identifier will be grouped together. This also adds a native new tab
    * button to your window's tab bar and allows your `app` and window to receive the
    * `new-window-for-tab` event.
    *
    * @platform darwin
    */
  var tabbingIdentifier: js.UndefOr[String] = js.undefined
  
  /**
    * Use `WS_THICKFRAME` style for frameless windows on Windows, which adds standard
    * window frame. Setting it to `false` will remove window shadow and window
    * animations. Default is `true`.
    */
  var thickFrame: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Default window title. Default is `"Electron"`. If the HTML tag `<title>` is
    * defined in the HTML file loaded by `loadURL()`, this property will be ignored.
    */
  var title: js.UndefOr[String] = js.undefined
  
  /**
    *  When using a frameless window in conjunction with
    * `win.setWindowButtonVisibility(true)` on macOS or using a `titleBarStyle` so
    * that the standard window controls ("traffic lights" on macOS) are visible, this
    * property enables the Window Controls Overlay JavaScript APIs and CSS Environment
    * Variables. Specifying `true` will result in an overlay with default system
    * colors. Default is `false`.
    */
  var titleBarOverlay: js.UndefOr[TitleBarOverlay | Boolean] = js.undefined
  
  /**
    * The style of window title bar. Default is `default`. Possible values are:
    */
  var titleBarStyle: js.UndefOr[default | hidden | hiddenInset | customButtonsOnHover] = js.undefined
  
  /**
    * Set a custom position for the traffic light buttons in frameless windows.
    *
    * @platform darwin
    */
  var trafficLightPosition: js.UndefOr[Point] = js.undefined
  
  /**
    * Makes the window transparent. Default is `false`. On Windows, does not work
    * unless the window is frameless.
    */
  var transparent: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The type of window, default is normal window. See more about this below.
    */
  var `type`: js.UndefOr[String] = js.undefined
  
  /**
    * The `width` and `height` would be used as web page's size, which means the
    * actual window's size will include window frame's size and be slightly larger.
    * Default is `false`.
    */
  var useContentSize: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Add a type of vibrancy effect to the window, only on macOS. Can be
    * `appearance-based`, `titlebar`, `selection`, `menu`, `popover`, `sidebar`,
    * `header`, `sheet`, `window`, `hud`, `fullscreen-ui`, `tooltip`, `content`,
    * `under-window`, or `under-page`.
    *
    * @platform darwin
    */
  var vibrancy: js.UndefOr[
    `appearance-based` | titlebar | selection | menu | popover | sidebar | header | sheet | window | hud | `fullscreen-ui` | tooltip | content | `under-window` | `under-page`
  ] = js.undefined
  
  /**
    * Specify how the material appearance should reflect window activity state on
    * macOS. Must be used with the `vibrancy` property. Possible values are:
    *
    * @platform darwin
    */
  var visualEffectState: js.UndefOr[followWindow | active | inactive] = js.undefined
  
  /**
    * Window's width in pixels. Default is `800`.
    */
  var width: js.UndefOr[Double] = js.undefined
  
  /**
    * (**required** if y is used) Window's left offset from screen. Default is to
    * center the window.
    */
  var x: js.UndefOr[Double] = js.undefined
  
  /**
    * (**required** if x is used) Window's top offset from screen. Default is to
    * center the window.
    */
  var y: js.UndefOr[Double] = js.undefined
  
  /**
    * Controls the behavior on macOS when option-clicking the green stoplight button
    * on the toolbar or by clicking the Window > Zoom menu item. If `true`, the window
    * will grow to the preferred width of the web page when zoomed, `false` will cause
    * it to zoom to the width of the screen. This will also affect the behavior when
    * calling `maximize()` directly. Default is `false`.
    *
    * @platform darwin
    */
  var zoomToPageWidth: js.UndefOr[Boolean] = js.undefined
}
object BaseWindowConstructorOptions {
  
  inline def apply(): BaseWindowConstructorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseWindowConstructorOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BaseWindowConstructorOptions] (val x: Self) extends AnyVal {
    
    inline def setAcceptFirstMouse(value: Boolean): Self = StObject.set(x, "acceptFirstMouse", value.asInstanceOf[js.Any])
    
    inline def setAcceptFirstMouseUndefined: Self = StObject.set(x, "acceptFirstMouse", js.undefined)
    
    inline def setAlwaysOnTop(value: Boolean): Self = StObject.set(x, "alwaysOnTop", value.asInstanceOf[js.Any])
    
    inline def setAlwaysOnTopUndefined: Self = StObject.set(x, "alwaysOnTop", js.undefined)
    
    inline def setAutoHideMenuBar(value: Boolean): Self = StObject.set(x, "autoHideMenuBar", value.asInstanceOf[js.Any])
    
    inline def setAutoHideMenuBarUndefined: Self = StObject.set(x, "autoHideMenuBar", js.undefined)
    
    inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    inline def setBackgroundMaterial(value: auto | none | mica | acrylic | tabbed): Self = StObject.set(x, "backgroundMaterial", value.asInstanceOf[js.Any])
    
    inline def setBackgroundMaterialUndefined: Self = StObject.set(x, "backgroundMaterial", js.undefined)
    
    inline def setCenter(value: Boolean): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    inline def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
    
    inline def setClosable(value: Boolean): Self = StObject.set(x, "closable", value.asInstanceOf[js.Any])
    
    inline def setClosableUndefined: Self = StObject.set(x, "closable", js.undefined)
    
    inline def setDarkTheme(value: Boolean): Self = StObject.set(x, "darkTheme", value.asInstanceOf[js.Any])
    
    inline def setDarkThemeUndefined: Self = StObject.set(x, "darkTheme", js.undefined)
    
    inline def setDisableAutoHideCursor(value: Boolean): Self = StObject.set(x, "disableAutoHideCursor", value.asInstanceOf[js.Any])
    
    inline def setDisableAutoHideCursorUndefined: Self = StObject.set(x, "disableAutoHideCursor", js.undefined)
    
    inline def setEnableLargerThanScreen(value: Boolean): Self = StObject.set(x, "enableLargerThanScreen", value.asInstanceOf[js.Any])
    
    inline def setEnableLargerThanScreenUndefined: Self = StObject.set(x, "enableLargerThanScreen", js.undefined)
    
    inline def setFocusable(value: Boolean): Self = StObject.set(x, "focusable", value.asInstanceOf[js.Any])
    
    inline def setFocusableUndefined: Self = StObject.set(x, "focusable", js.undefined)
    
    inline def setFrame(value: Boolean): Self = StObject.set(x, "frame", value.asInstanceOf[js.Any])
    
    inline def setFrameUndefined: Self = StObject.set(x, "frame", js.undefined)
    
    inline def setFullscreen(value: Boolean): Self = StObject.set(x, "fullscreen", value.asInstanceOf[js.Any])
    
    inline def setFullscreenUndefined: Self = StObject.set(x, "fullscreen", js.undefined)
    
    inline def setFullscreenable(value: Boolean): Self = StObject.set(x, "fullscreenable", value.asInstanceOf[js.Any])
    
    inline def setFullscreenableUndefined: Self = StObject.set(x, "fullscreenable", js.undefined)
    
    inline def setHasShadow(value: Boolean): Self = StObject.set(x, "hasShadow", value.asInstanceOf[js.Any])
    
    inline def setHasShadowUndefined: Self = StObject.set(x, "hasShadow", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setHiddenInMissionControl(value: Boolean): Self = StObject.set(x, "hiddenInMissionControl", value.asInstanceOf[js.Any])
    
    inline def setHiddenInMissionControlUndefined: Self = StObject.set(x, "hiddenInMissionControl", js.undefined)
    
    inline def setIcon(value: NativeImage_ | String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setKiosk(value: Boolean): Self = StObject.set(x, "kiosk", value.asInstanceOf[js.Any])
    
    inline def setKioskUndefined: Self = StObject.set(x, "kiosk", js.undefined)
    
    inline def setMaxHeight(value: Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
    
    inline def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
    
    inline def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
    
    inline def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
    
    inline def setMaximizable(value: Boolean): Self = StObject.set(x, "maximizable", value.asInstanceOf[js.Any])
    
    inline def setMaximizableUndefined: Self = StObject.set(x, "maximizable", js.undefined)
    
    inline def setMinHeight(value: Double): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
    
    inline def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
    
    inline def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
    
    inline def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
    
    inline def setMinimizable(value: Boolean): Self = StObject.set(x, "minimizable", value.asInstanceOf[js.Any])
    
    inline def setMinimizableUndefined: Self = StObject.set(x, "minimizable", js.undefined)
    
    inline def setModal(value: Boolean): Self = StObject.set(x, "modal", value.asInstanceOf[js.Any])
    
    inline def setModalUndefined: Self = StObject.set(x, "modal", js.undefined)
    
    inline def setMovable(value: Boolean): Self = StObject.set(x, "movable", value.asInstanceOf[js.Any])
    
    inline def setMovableUndefined: Self = StObject.set(x, "movable", js.undefined)
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    inline def setParent(value: BaseWindow): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setResizable(value: Boolean): Self = StObject.set(x, "resizable", value.asInstanceOf[js.Any])
    
    inline def setResizableUndefined: Self = StObject.set(x, "resizable", js.undefined)
    
    inline def setRoundedCorners(value: Boolean): Self = StObject.set(x, "roundedCorners", value.asInstanceOf[js.Any])
    
    inline def setRoundedCornersUndefined: Self = StObject.set(x, "roundedCorners", js.undefined)
    
    inline def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    
    inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
    
    inline def setSimpleFullscreen(value: Boolean): Self = StObject.set(x, "simpleFullscreen", value.asInstanceOf[js.Any])
    
    inline def setSimpleFullscreenUndefined: Self = StObject.set(x, "simpleFullscreen", js.undefined)
    
    inline def setSkipTaskbar(value: Boolean): Self = StObject.set(x, "skipTaskbar", value.asInstanceOf[js.Any])
    
    inline def setSkipTaskbarUndefined: Self = StObject.set(x, "skipTaskbar", js.undefined)
    
    inline def setTabbingIdentifier(value: String): Self = StObject.set(x, "tabbingIdentifier", value.asInstanceOf[js.Any])
    
    inline def setTabbingIdentifierUndefined: Self = StObject.set(x, "tabbingIdentifier", js.undefined)
    
    inline def setThickFrame(value: Boolean): Self = StObject.set(x, "thickFrame", value.asInstanceOf[js.Any])
    
    inline def setThickFrameUndefined: Self = StObject.set(x, "thickFrame", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleBarOverlay(value: TitleBarOverlay | Boolean): Self = StObject.set(x, "titleBarOverlay", value.asInstanceOf[js.Any])
    
    inline def setTitleBarOverlayUndefined: Self = StObject.set(x, "titleBarOverlay", js.undefined)
    
    inline def setTitleBarStyle(value: default | hidden | hiddenInset | customButtonsOnHover): Self = StObject.set(x, "titleBarStyle", value.asInstanceOf[js.Any])
    
    inline def setTitleBarStyleUndefined: Self = StObject.set(x, "titleBarStyle", js.undefined)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setTrafficLightPosition(value: Point): Self = StObject.set(x, "trafficLightPosition", value.asInstanceOf[js.Any])
    
    inline def setTrafficLightPositionUndefined: Self = StObject.set(x, "trafficLightPosition", js.undefined)
    
    inline def setTransparent(value: Boolean): Self = StObject.set(x, "transparent", value.asInstanceOf[js.Any])
    
    inline def setTransparentUndefined: Self = StObject.set(x, "transparent", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUseContentSize(value: Boolean): Self = StObject.set(x, "useContentSize", value.asInstanceOf[js.Any])
    
    inline def setUseContentSizeUndefined: Self = StObject.set(x, "useContentSize", js.undefined)
    
    inline def setVibrancy(
      value: `appearance-based` | titlebar | selection | menu | popover | sidebar | header | sheet | window | hud | `fullscreen-ui` | tooltip | content | `under-window` | `under-page`
    ): Self = StObject.set(x, "vibrancy", value.asInstanceOf[js.Any])
    
    inline def setVibrancyUndefined: Self = StObject.set(x, "vibrancy", js.undefined)
    
    inline def setVisualEffectState(value: followWindow | active | inactive): Self = StObject.set(x, "visualEffectState", value.asInstanceOf[js.Any])
    
    inline def setVisualEffectStateUndefined: Self = StObject.set(x, "visualEffectState", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    
    inline def setZoomToPageWidth(value: Boolean): Self = StObject.set(x, "zoomToPageWidth", value.asInstanceOf[js.Any])
    
    inline def setZoomToPageWidthUndefined: Self = StObject.set(x, "zoomToPageWidth", js.undefined)
  }
}
