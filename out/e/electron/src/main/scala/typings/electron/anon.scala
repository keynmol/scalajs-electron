package typings.electron

import org.scalablytyped.runtime.Instantiable0
import org.scalajs.dom.AbortSignal
import org.scalajs.dom.ReferrerPolicy
import org.scalajs.dom.RequestCache
import org.scalajs.dom.RequestCredentials
import org.scalajs.dom.RequestMode
import org.scalajs.dom.RequestRedirect
import typings.electron.Electron.Common.Clipboard
import typings.electron.Electron.Common.CrashReporter
import typings.electron.Electron.Common.Shell
import typings.electron.Electron.CrossProcessExports.App
import typings.electron.Electron.CrossProcessExports.AutoUpdater
import typings.electron.Electron.CrossProcessExports.BaseWindow
import typings.electron.Electron.CrossProcessExports.BrowserView
import typings.electron.Electron.CrossProcessExports.BrowserWindow
import typings.electron.Electron.CrossProcessExports.ContentTracing
import typings.electron.Electron.CrossProcessExports.ContextBridge
import typings.electron.Electron.CrossProcessExports.DesktopCapturer
import typings.electron.Electron.CrossProcessExports.Dialog
import typings.electron.Electron.CrossProcessExports.GlobalShortcut
import typings.electron.Electron.CrossProcessExports.InAppPurchase
import typings.electron.Electron.CrossProcessExports.IpcMain
import typings.electron.Electron.CrossProcessExports.IpcMainServiceWorker
import typings.electron.Electron.CrossProcessExports.IpcRenderer
import typings.electron.Electron.CrossProcessExports.Menu
import typings.electron.Electron.CrossProcessExports.MenuItem
import typings.electron.Electron.CrossProcessExports.MessageChannelMain
import typings.electron.Electron.CrossProcessExports.NativeTheme
import typings.electron.Electron.CrossProcessExports.Net
import typings.electron.Electron.CrossProcessExports.NetLog
import typings.electron.Electron.CrossProcessExports.Notification
import typings.electron.Electron.CrossProcessExports.PowerMonitor
import typings.electron.Electron.CrossProcessExports.PowerSaveBlocker
import typings.electron.Electron.CrossProcessExports.Protocol
import typings.electron.Electron.CrossProcessExports.PushNotifications
import typings.electron.Electron.CrossProcessExports.SafeStorage
import typings.electron.Electron.CrossProcessExports.Screen
import typings.electron.Electron.CrossProcessExports.ShareMenu
import typings.electron.Electron.CrossProcessExports.SystemPreferences
import typings.electron.Electron.CrossProcessExports.TouchBar
import typings.electron.Electron.CrossProcessExports.Tray
import typings.electron.Electron.CrossProcessExports.View
import typings.electron.Electron.CrossProcessExports.WebContentsView
import typings.electron.Electron.CrossProcessExports.WebFrame
import typings.electron.Electron.CrossProcessExports.WebUtils
import typings.std.BodyInit
import typings.std.HeadersInit
import typings.std.RequestPriority
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<electron.Electron.Rectangle> */
  trait PartialRectangle extends StObject {
    
    var height: js.UndefOr[Double] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
    
    var x: js.UndefOr[Double] = js.undefined
    
    var y: js.UndefOr[Double] = js.undefined
  }
  object PartialRectangle {
    
    inline def apply(): PartialRectangle = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialRectangle]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialRectangle] (val x: Self) extends AnyVal {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  /* Inlined std.RequestInit & {  bypassCustomProtocolHandlers :boolean | undefined} */
  trait RequestInitbypassCustomPr extends StObject {
    
    /** A BodyInit object or null to set request's body. */
    /* standard dom */
    var body: js.UndefOr[BodyInit | Null] = js.undefined
    
    var bypassCustomProtocolHandlers: js.UndefOr[Boolean] = js.undefined
    
    /** A string indicating how the request will interact with the browser's cache to set request's cache. */
    /* standard dom */
    var cache: js.UndefOr[RequestCache] = js.undefined
    
    /** A string indicating whether credentials will be sent with the request always, never, or only when sent to a same-origin URL. Sets request's credentials. */
    /* standard dom */
    var credentials: js.UndefOr[RequestCredentials] = js.undefined
    
    /** A Headers object, an object literal, or an array of two-item arrays to set request's headers. */
    /* standard dom */
    var headers: js.UndefOr[HeadersInit] = js.undefined
    
    /** A cryptographic hash of the resource to be fetched by request. Sets request's integrity. */
    /* standard dom */
    var integrity: js.UndefOr[String] = js.undefined
    
    /** A boolean to set request's keepalive. */
    /* standard dom */
    var keepalive: js.UndefOr[Boolean] = js.undefined
    
    /** A string to set request's method. */
    /* standard dom */
    var method: js.UndefOr[String] = js.undefined
    
    /** A string to indicate whether the request will use CORS, or will be restricted to same-origin URLs. Sets request's mode. */
    /* standard dom */
    var mode: js.UndefOr[RequestMode] = js.undefined
    
    /* standard dom */
    var priority: js.UndefOr[RequestPriority] = js.undefined
    
    /** A string indicating whether request follows redirects, results in an error upon encountering a redirect, or returns the redirect (in an opaque fashion). Sets request's redirect. */
    /* standard dom */
    var redirect: js.UndefOr[RequestRedirect] = js.undefined
    
    /** A string whose value is a same-origin URL, "about:client", or the empty string, to set request's referrer. */
    /* standard dom */
    var referrer: js.UndefOr[String] = js.undefined
    
    /** A referrer policy to set request's referrerPolicy. */
    /* standard dom */
    var referrerPolicy: js.UndefOr[ReferrerPolicy] = js.undefined
    
    /** An AbortSignal to set request's signal. */
    /* standard dom */
    var signal: js.UndefOr[AbortSignal | Null] = js.undefined
    
    /** Can only be null. Used to disassociate request from any Window. */
    /* standard dom */
    var window: js.UndefOr[Null] = js.undefined
  }
  object RequestInitbypassCustomPr {
    
    inline def apply(): RequestInitbypassCustomPr = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RequestInitbypassCustomPr]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RequestInitbypassCustomPr] (val x: Self) extends AnyVal {
      
      inline def setBody(value: BodyInit): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyNull: Self = StObject.set(x, "body", null)
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setBypassCustomProtocolHandlers(value: Boolean): Self = StObject.set(x, "bypassCustomProtocolHandlers", value.asInstanceOf[js.Any])
      
      inline def setBypassCustomProtocolHandlersUndefined: Self = StObject.set(x, "bypassCustomProtocolHandlers", js.undefined)
      
      inline def setCache(value: RequestCache): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      inline def setCredentials(value: RequestCredentials): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
      
      inline def setCredentialsUndefined: Self = StObject.set(x, "credentials", js.undefined)
      
      inline def setHeaders(value: HeadersInit): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setHeadersVarargs(value: (js.Tuple2[String, String])*): Self = StObject.set(x, "headers", js.Array(value*))
      
      inline def setIntegrity(value: String): Self = StObject.set(x, "integrity", value.asInstanceOf[js.Any])
      
      inline def setIntegrityUndefined: Self = StObject.set(x, "integrity", js.undefined)
      
      inline def setKeepalive(value: Boolean): Self = StObject.set(x, "keepalive", value.asInstanceOf[js.Any])
      
      inline def setKeepaliveUndefined: Self = StObject.set(x, "keepalive", js.undefined)
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setMode(value: RequestMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setPriority(value: RequestPriority): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
      
      inline def setRedirect(value: RequestRedirect): Self = StObject.set(x, "redirect", value.asInstanceOf[js.Any])
      
      inline def setRedirectUndefined: Self = StObject.set(x, "redirect", js.undefined)
      
      inline def setReferrer(value: String): Self = StObject.set(x, "referrer", value.asInstanceOf[js.Any])
      
      inline def setReferrerPolicy(value: ReferrerPolicy): Self = StObject.set(x, "referrerPolicy", value.asInstanceOf[js.Any])
      
      inline def setReferrerPolicyUndefined: Self = StObject.set(x, "referrerPolicy", js.undefined)
      
      inline def setReferrerUndefined: Self = StObject.set(x, "referrer", js.undefined)
      
      inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
      
      inline def setSignalNull: Self = StObject.set(x, "signal", null)
      
      inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
    }
  }
  
  trait TypeofCommon extends StObject {
    
    val clipboard: Clipboard
    
    val crashReporter: CrashReporter
    
    val shell: Shell
  }
  object TypeofCommon {
    
    inline def apply(clipboard: Clipboard, crashReporter: CrashReporter, shell: Shell): TypeofCommon = {
      val __obj = js.Dynamic.literal(clipboard = clipboard.asInstanceOf[js.Any], crashReporter = crashReporter.asInstanceOf[js.Any], shell = shell.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeofCommon]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TypeofCommon] (val x: Self) extends AnyVal {
      
      inline def setClipboard(value: Clipboard): Self = StObject.set(x, "clipboard", value.asInstanceOf[js.Any])
      
      inline def setCrashReporter(value: CrashReporter): Self = StObject.set(x, "crashReporter", value.asInstanceOf[js.Any])
      
      inline def setShell(value: Shell): Self = StObject.set(x, "shell", value.asInstanceOf[js.Any])
    }
  }
  
  trait TypeofCrossProcessExports extends StObject {
    
    var BaseWindow: Instantiable0[typings.electron.Electron.CrossProcessExports.BaseWindow]
    
    var BrowserView: Instantiable0[typings.electron.Electron.CrossProcessExports.BrowserView]
    
    var BrowserWindow: Instantiable0[typings.electron.Electron.CrossProcessExports.BrowserWindow]
    
    var IpcMainServiceWorker: Instantiable0[typings.electron.Electron.CrossProcessExports.IpcMainServiceWorker]
    
    var Menu: Instantiable0[typings.electron.Electron.CrossProcessExports.Menu]
    
    var MenuItem: Instantiable0[typings.electron.Electron.CrossProcessExports.MenuItem]
    
    var MessageChannelMain: Instantiable0[typings.electron.Electron.CrossProcessExports.MessageChannelMain]
    
    var Notification: Instantiable0[typings.electron.Electron.CrossProcessExports.Notification]
    
    var ShareMenu: Instantiable0[typings.electron.Electron.CrossProcessExports.ShareMenu]
    
    var TouchBar: Instantiable0[typings.electron.Electron.CrossProcessExports.TouchBar]
    
    var Tray: Instantiable0[typings.electron.Electron.CrossProcessExports.Tray]
    
    var View: Instantiable0[typings.electron.Electron.CrossProcessExports.View]
    
    var WebContentsView: Instantiable0[typings.electron.Electron.CrossProcessExports.WebContentsView]
    
    val app: App
    
    val autoUpdater: AutoUpdater
    
    val clipboard: typings.electron.Electron.CrossProcessExports.Clipboard
    
    val contentTracing: ContentTracing
    
    val contextBridge: ContextBridge
    
    val crashReporter: typings.electron.Electron.CrossProcessExports.CrashReporter
    
    val desktopCapturer: DesktopCapturer
    
    val dialog: Dialog
    
    val globalShortcut: GlobalShortcut
    
    val inAppPurchase: InAppPurchase
    
    val ipcMain: IpcMain
    
    val ipcRenderer: IpcRenderer
    
    val nativeTheme: NativeTheme
    
    val net: Net
    
    val netLog: NetLog
    
    val powerMonitor: PowerMonitor
    
    val powerSaveBlocker: PowerSaveBlocker
    
    val protocol: Protocol
    
    val pushNotifications: PushNotifications
    
    val safeStorage: SafeStorage
    
    val screen: Screen
    
    val shell: typings.electron.Electron.CrossProcessExports.Shell
    
    val systemPreferences: SystemPreferences
    
    val webFrame: WebFrame
    
    val webUtils: WebUtils
  }
  object TypeofCrossProcessExports {
    
    inline def apply(
      BaseWindow: Instantiable0[BaseWindow],
      BrowserView: Instantiable0[BrowserView],
      BrowserWindow: Instantiable0[BrowserWindow],
      IpcMainServiceWorker: Instantiable0[IpcMainServiceWorker],
      Menu: Instantiable0[Menu],
      MenuItem: Instantiable0[MenuItem],
      MessageChannelMain: Instantiable0[MessageChannelMain],
      Notification: Instantiable0[Notification],
      ShareMenu: Instantiable0[ShareMenu],
      TouchBar: Instantiable0[TouchBar],
      Tray: Instantiable0[Tray],
      View: Instantiable0[View],
      WebContentsView: Instantiable0[WebContentsView],
      app: App,
      autoUpdater: AutoUpdater,
      clipboard: typings.electron.Electron.CrossProcessExports.Clipboard,
      contentTracing: ContentTracing,
      contextBridge: ContextBridge,
      crashReporter: typings.electron.Electron.CrossProcessExports.CrashReporter,
      desktopCapturer: DesktopCapturer,
      dialog: Dialog,
      globalShortcut: GlobalShortcut,
      inAppPurchase: InAppPurchase,
      ipcMain: IpcMain,
      ipcRenderer: IpcRenderer,
      nativeTheme: NativeTheme,
      net: Net,
      netLog: NetLog,
      powerMonitor: PowerMonitor,
      powerSaveBlocker: PowerSaveBlocker,
      protocol: Protocol,
      pushNotifications: PushNotifications,
      safeStorage: SafeStorage,
      screen: Screen,
      shell: typings.electron.Electron.CrossProcessExports.Shell,
      systemPreferences: SystemPreferences,
      webFrame: WebFrame,
      webUtils: WebUtils
    ): TypeofCrossProcessExports = {
      val __obj = js.Dynamic.literal(BaseWindow = BaseWindow.asInstanceOf[js.Any], BrowserView = BrowserView.asInstanceOf[js.Any], BrowserWindow = BrowserWindow.asInstanceOf[js.Any], IpcMainServiceWorker = IpcMainServiceWorker.asInstanceOf[js.Any], Menu = Menu.asInstanceOf[js.Any], MenuItem = MenuItem.asInstanceOf[js.Any], MessageChannelMain = MessageChannelMain.asInstanceOf[js.Any], Notification = Notification.asInstanceOf[js.Any], ShareMenu = ShareMenu.asInstanceOf[js.Any], TouchBar = TouchBar.asInstanceOf[js.Any], Tray = Tray.asInstanceOf[js.Any], View = View.asInstanceOf[js.Any], WebContentsView = WebContentsView.asInstanceOf[js.Any], app = app.asInstanceOf[js.Any], autoUpdater = autoUpdater.asInstanceOf[js.Any], clipboard = clipboard.asInstanceOf[js.Any], contentTracing = contentTracing.asInstanceOf[js.Any], contextBridge = contextBridge.asInstanceOf[js.Any], crashReporter = crashReporter.asInstanceOf[js.Any], desktopCapturer = desktopCapturer.asInstanceOf[js.Any], dialog = dialog.asInstanceOf[js.Any], globalShortcut = globalShortcut.asInstanceOf[js.Any], inAppPurchase = inAppPurchase.asInstanceOf[js.Any], ipcMain = ipcMain.asInstanceOf[js.Any], ipcRenderer = ipcRenderer.asInstanceOf[js.Any], nativeTheme = nativeTheme.asInstanceOf[js.Any], net = net.asInstanceOf[js.Any], netLog = netLog.asInstanceOf[js.Any], powerMonitor = powerMonitor.asInstanceOf[js.Any], powerSaveBlocker = powerSaveBlocker.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], pushNotifications = pushNotifications.asInstanceOf[js.Any], safeStorage = safeStorage.asInstanceOf[js.Any], screen = screen.asInstanceOf[js.Any], shell = shell.asInstanceOf[js.Any], systemPreferences = systemPreferences.asInstanceOf[js.Any], webFrame = webFrame.asInstanceOf[js.Any], webUtils = webUtils.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeofCrossProcessExports]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TypeofCrossProcessExports] (val x: Self) extends AnyVal {
      
      inline def setApp(value: App): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
      
      inline def setAutoUpdater(value: AutoUpdater): Self = StObject.set(x, "autoUpdater", value.asInstanceOf[js.Any])
      
      inline def setBaseWindow(value: Instantiable0[BaseWindow]): Self = StObject.set(x, "BaseWindow", value.asInstanceOf[js.Any])
      
      inline def setBrowserView(value: Instantiable0[BrowserView]): Self = StObject.set(x, "BrowserView", value.asInstanceOf[js.Any])
      
      inline def setBrowserWindow(value: Instantiable0[BrowserWindow]): Self = StObject.set(x, "BrowserWindow", value.asInstanceOf[js.Any])
      
      inline def setClipboard(value: typings.electron.Electron.CrossProcessExports.Clipboard): Self = StObject.set(x, "clipboard", value.asInstanceOf[js.Any])
      
      inline def setContentTracing(value: ContentTracing): Self = StObject.set(x, "contentTracing", value.asInstanceOf[js.Any])
      
      inline def setContextBridge(value: ContextBridge): Self = StObject.set(x, "contextBridge", value.asInstanceOf[js.Any])
      
      inline def setCrashReporter(value: typings.electron.Electron.CrossProcessExports.CrashReporter): Self = StObject.set(x, "crashReporter", value.asInstanceOf[js.Any])
      
      inline def setDesktopCapturer(value: DesktopCapturer): Self = StObject.set(x, "desktopCapturer", value.asInstanceOf[js.Any])
      
      inline def setDialog(value: Dialog): Self = StObject.set(x, "dialog", value.asInstanceOf[js.Any])
      
      inline def setGlobalShortcut(value: GlobalShortcut): Self = StObject.set(x, "globalShortcut", value.asInstanceOf[js.Any])
      
      inline def setInAppPurchase(value: InAppPurchase): Self = StObject.set(x, "inAppPurchase", value.asInstanceOf[js.Any])
      
      inline def setIpcMain(value: IpcMain): Self = StObject.set(x, "ipcMain", value.asInstanceOf[js.Any])
      
      inline def setIpcMainServiceWorker(value: Instantiable0[IpcMainServiceWorker]): Self = StObject.set(x, "IpcMainServiceWorker", value.asInstanceOf[js.Any])
      
      inline def setIpcRenderer(value: IpcRenderer): Self = StObject.set(x, "ipcRenderer", value.asInstanceOf[js.Any])
      
      inline def setMenu(value: Instantiable0[Menu]): Self = StObject.set(x, "Menu", value.asInstanceOf[js.Any])
      
      inline def setMenuItem(value: Instantiable0[MenuItem]): Self = StObject.set(x, "MenuItem", value.asInstanceOf[js.Any])
      
      inline def setMessageChannelMain(value: Instantiable0[MessageChannelMain]): Self = StObject.set(x, "MessageChannelMain", value.asInstanceOf[js.Any])
      
      inline def setNativeTheme(value: NativeTheme): Self = StObject.set(x, "nativeTheme", value.asInstanceOf[js.Any])
      
      inline def setNet(value: Net): Self = StObject.set(x, "net", value.asInstanceOf[js.Any])
      
      inline def setNetLog(value: NetLog): Self = StObject.set(x, "netLog", value.asInstanceOf[js.Any])
      
      inline def setNotification(value: Instantiable0[Notification]): Self = StObject.set(x, "Notification", value.asInstanceOf[js.Any])
      
      inline def setPowerMonitor(value: PowerMonitor): Self = StObject.set(x, "powerMonitor", value.asInstanceOf[js.Any])
      
      inline def setPowerSaveBlocker(value: PowerSaveBlocker): Self = StObject.set(x, "powerSaveBlocker", value.asInstanceOf[js.Any])
      
      inline def setProtocol(value: Protocol): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setPushNotifications(value: PushNotifications): Self = StObject.set(x, "pushNotifications", value.asInstanceOf[js.Any])
      
      inline def setSafeStorage(value: SafeStorage): Self = StObject.set(x, "safeStorage", value.asInstanceOf[js.Any])
      
      inline def setScreen(value: Screen): Self = StObject.set(x, "screen", value.asInstanceOf[js.Any])
      
      inline def setShareMenu(value: Instantiable0[ShareMenu]): Self = StObject.set(x, "ShareMenu", value.asInstanceOf[js.Any])
      
      inline def setShell(value: typings.electron.Electron.CrossProcessExports.Shell): Self = StObject.set(x, "shell", value.asInstanceOf[js.Any])
      
      inline def setSystemPreferences(value: SystemPreferences): Self = StObject.set(x, "systemPreferences", value.asInstanceOf[js.Any])
      
      inline def setTouchBar(value: Instantiable0[TouchBar]): Self = StObject.set(x, "TouchBar", value.asInstanceOf[js.Any])
      
      inline def setTray(value: Instantiable0[Tray]): Self = StObject.set(x, "Tray", value.asInstanceOf[js.Any])
      
      inline def setView(value: Instantiable0[View]): Self = StObject.set(x, "View", value.asInstanceOf[js.Any])
      
      inline def setWebContentsView(value: Instantiable0[WebContentsView]): Self = StObject.set(x, "WebContentsView", value.asInstanceOf[js.Any])
      
      inline def setWebFrame(value: WebFrame): Self = StObject.set(x, "webFrame", value.asInstanceOf[js.Any])
      
      inline def setWebUtils(value: WebUtils): Self = StObject.set(x, "webUtils", value.asInstanceOf[js.Any])
    }
  }
  
  trait TypeofMain extends StObject {
    
    var BaseWindow: Instantiable0[typings.electron.Electron.Main.BaseWindow]
    
    var BrowserView: Instantiable0[typings.electron.Electron.Main.BrowserView]
    
    var BrowserWindow: Instantiable0[typings.electron.Electron.Main.BrowserWindow]
    
    var IpcMainServiceWorker: Instantiable0[typings.electron.Electron.Main.IpcMainServiceWorker]
    
    var Menu: Instantiable0[typings.electron.Electron.Main.Menu]
    
    var MenuItem: Instantiable0[typings.electron.Electron.Main.MenuItem]
    
    var MessageChannelMain: Instantiable0[typings.electron.Electron.Main.MessageChannelMain]
    
    var Notification: Instantiable0[typings.electron.Electron.Main.Notification]
    
    var ShareMenu: Instantiable0[typings.electron.Electron.Main.ShareMenu]
    
    var TouchBar: Instantiable0[typings.electron.Electron.Main.TouchBar]
    
    var Tray: Instantiable0[typings.electron.Electron.Main.Tray]
    
    var View: Instantiable0[typings.electron.Electron.Main.View]
    
    var WebContentsView: Instantiable0[typings.electron.Electron.Main.WebContentsView]
    
    val app: typings.electron.Electron.Main.App
    
    val autoUpdater: typings.electron.Electron.Main.AutoUpdater
    
    val contentTracing: typings.electron.Electron.Main.ContentTracing
    
    val desktopCapturer: typings.electron.Electron.Main.DesktopCapturer
    
    val dialog: typings.electron.Electron.Main.Dialog
    
    val globalShortcut: typings.electron.Electron.Main.GlobalShortcut
    
    val inAppPurchase: typings.electron.Electron.Main.InAppPurchase
    
    val ipcMain: typings.electron.Electron.Main.IpcMain
    
    val nativeTheme: typings.electron.Electron.Main.NativeTheme
    
    val net: typings.electron.Electron.Main.Net
    
    val netLog: typings.electron.Electron.Main.NetLog
    
    val powerMonitor: typings.electron.Electron.Main.PowerMonitor
    
    val powerSaveBlocker: typings.electron.Electron.Main.PowerSaveBlocker
    
    val protocol: typings.electron.Electron.Main.Protocol
    
    val pushNotifications: typings.electron.Electron.Main.PushNotifications
    
    val safeStorage: typings.electron.Electron.Main.SafeStorage
    
    val screen: typings.electron.Electron.Main.Screen
    
    val systemPreferences: typings.electron.Electron.Main.SystemPreferences
  }
  object TypeofMain {
    
    inline def apply(
      BaseWindow: Instantiable0[typings.electron.Electron.Main.BaseWindow],
      BrowserView: Instantiable0[typings.electron.Electron.Main.BrowserView],
      BrowserWindow: Instantiable0[typings.electron.Electron.Main.BrowserWindow],
      IpcMainServiceWorker: Instantiable0[typings.electron.Electron.Main.IpcMainServiceWorker],
      Menu: Instantiable0[typings.electron.Electron.Main.Menu],
      MenuItem: Instantiable0[typings.electron.Electron.Main.MenuItem],
      MessageChannelMain: Instantiable0[typings.electron.Electron.Main.MessageChannelMain],
      Notification: Instantiable0[typings.electron.Electron.Main.Notification],
      ShareMenu: Instantiable0[typings.electron.Electron.Main.ShareMenu],
      TouchBar: Instantiable0[typings.electron.Electron.Main.TouchBar],
      Tray: Instantiable0[typings.electron.Electron.Main.Tray],
      View: Instantiable0[typings.electron.Electron.Main.View],
      WebContentsView: Instantiable0[typings.electron.Electron.Main.WebContentsView],
      app: typings.electron.Electron.Main.App,
      autoUpdater: typings.electron.Electron.Main.AutoUpdater,
      contentTracing: typings.electron.Electron.Main.ContentTracing,
      desktopCapturer: typings.electron.Electron.Main.DesktopCapturer,
      dialog: typings.electron.Electron.Main.Dialog,
      globalShortcut: typings.electron.Electron.Main.GlobalShortcut,
      inAppPurchase: typings.electron.Electron.Main.InAppPurchase,
      ipcMain: typings.electron.Electron.Main.IpcMain,
      nativeTheme: typings.electron.Electron.Main.NativeTheme,
      net: typings.electron.Electron.Main.Net,
      netLog: typings.electron.Electron.Main.NetLog,
      powerMonitor: typings.electron.Electron.Main.PowerMonitor,
      powerSaveBlocker: typings.electron.Electron.Main.PowerSaveBlocker,
      protocol: typings.electron.Electron.Main.Protocol,
      pushNotifications: typings.electron.Electron.Main.PushNotifications,
      safeStorage: typings.electron.Electron.Main.SafeStorage,
      screen: typings.electron.Electron.Main.Screen,
      systemPreferences: typings.electron.Electron.Main.SystemPreferences
    ): TypeofMain = {
      val __obj = js.Dynamic.literal(BaseWindow = BaseWindow.asInstanceOf[js.Any], BrowserView = BrowserView.asInstanceOf[js.Any], BrowserWindow = BrowserWindow.asInstanceOf[js.Any], IpcMainServiceWorker = IpcMainServiceWorker.asInstanceOf[js.Any], Menu = Menu.asInstanceOf[js.Any], MenuItem = MenuItem.asInstanceOf[js.Any], MessageChannelMain = MessageChannelMain.asInstanceOf[js.Any], Notification = Notification.asInstanceOf[js.Any], ShareMenu = ShareMenu.asInstanceOf[js.Any], TouchBar = TouchBar.asInstanceOf[js.Any], Tray = Tray.asInstanceOf[js.Any], View = View.asInstanceOf[js.Any], WebContentsView = WebContentsView.asInstanceOf[js.Any], app = app.asInstanceOf[js.Any], autoUpdater = autoUpdater.asInstanceOf[js.Any], contentTracing = contentTracing.asInstanceOf[js.Any], desktopCapturer = desktopCapturer.asInstanceOf[js.Any], dialog = dialog.asInstanceOf[js.Any], globalShortcut = globalShortcut.asInstanceOf[js.Any], inAppPurchase = inAppPurchase.asInstanceOf[js.Any], ipcMain = ipcMain.asInstanceOf[js.Any], nativeTheme = nativeTheme.asInstanceOf[js.Any], net = net.asInstanceOf[js.Any], netLog = netLog.asInstanceOf[js.Any], powerMonitor = powerMonitor.asInstanceOf[js.Any], powerSaveBlocker = powerSaveBlocker.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], pushNotifications = pushNotifications.asInstanceOf[js.Any], safeStorage = safeStorage.asInstanceOf[js.Any], screen = screen.asInstanceOf[js.Any], systemPreferences = systemPreferences.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeofMain]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TypeofMain] (val x: Self) extends AnyVal {
      
      inline def setApp(value: typings.electron.Electron.Main.App): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
      
      inline def setAutoUpdater(value: typings.electron.Electron.Main.AutoUpdater): Self = StObject.set(x, "autoUpdater", value.asInstanceOf[js.Any])
      
      inline def setBaseWindow(value: Instantiable0[typings.electron.Electron.Main.BaseWindow]): Self = StObject.set(x, "BaseWindow", value.asInstanceOf[js.Any])
      
      inline def setBrowserView(value: Instantiable0[typings.electron.Electron.Main.BrowserView]): Self = StObject.set(x, "BrowserView", value.asInstanceOf[js.Any])
      
      inline def setBrowserWindow(value: Instantiable0[typings.electron.Electron.Main.BrowserWindow]): Self = StObject.set(x, "BrowserWindow", value.asInstanceOf[js.Any])
      
      inline def setContentTracing(value: typings.electron.Electron.Main.ContentTracing): Self = StObject.set(x, "contentTracing", value.asInstanceOf[js.Any])
      
      inline def setDesktopCapturer(value: typings.electron.Electron.Main.DesktopCapturer): Self = StObject.set(x, "desktopCapturer", value.asInstanceOf[js.Any])
      
      inline def setDialog(value: typings.electron.Electron.Main.Dialog): Self = StObject.set(x, "dialog", value.asInstanceOf[js.Any])
      
      inline def setGlobalShortcut(value: typings.electron.Electron.Main.GlobalShortcut): Self = StObject.set(x, "globalShortcut", value.asInstanceOf[js.Any])
      
      inline def setInAppPurchase(value: typings.electron.Electron.Main.InAppPurchase): Self = StObject.set(x, "inAppPurchase", value.asInstanceOf[js.Any])
      
      inline def setIpcMain(value: typings.electron.Electron.Main.IpcMain): Self = StObject.set(x, "ipcMain", value.asInstanceOf[js.Any])
      
      inline def setIpcMainServiceWorker(value: Instantiable0[typings.electron.Electron.Main.IpcMainServiceWorker]): Self = StObject.set(x, "IpcMainServiceWorker", value.asInstanceOf[js.Any])
      
      inline def setMenu(value: Instantiable0[typings.electron.Electron.Main.Menu]): Self = StObject.set(x, "Menu", value.asInstanceOf[js.Any])
      
      inline def setMenuItem(value: Instantiable0[typings.electron.Electron.Main.MenuItem]): Self = StObject.set(x, "MenuItem", value.asInstanceOf[js.Any])
      
      inline def setMessageChannelMain(value: Instantiable0[typings.electron.Electron.Main.MessageChannelMain]): Self = StObject.set(x, "MessageChannelMain", value.asInstanceOf[js.Any])
      
      inline def setNativeTheme(value: typings.electron.Electron.Main.NativeTheme): Self = StObject.set(x, "nativeTheme", value.asInstanceOf[js.Any])
      
      inline def setNet(value: typings.electron.Electron.Main.Net): Self = StObject.set(x, "net", value.asInstanceOf[js.Any])
      
      inline def setNetLog(value: typings.electron.Electron.Main.NetLog): Self = StObject.set(x, "netLog", value.asInstanceOf[js.Any])
      
      inline def setNotification(value: Instantiable0[typings.electron.Electron.Main.Notification]): Self = StObject.set(x, "Notification", value.asInstanceOf[js.Any])
      
      inline def setPowerMonitor(value: typings.electron.Electron.Main.PowerMonitor): Self = StObject.set(x, "powerMonitor", value.asInstanceOf[js.Any])
      
      inline def setPowerSaveBlocker(value: typings.electron.Electron.Main.PowerSaveBlocker): Self = StObject.set(x, "powerSaveBlocker", value.asInstanceOf[js.Any])
      
      inline def setProtocol(value: typings.electron.Electron.Main.Protocol): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setPushNotifications(value: typings.electron.Electron.Main.PushNotifications): Self = StObject.set(x, "pushNotifications", value.asInstanceOf[js.Any])
      
      inline def setSafeStorage(value: typings.electron.Electron.Main.SafeStorage): Self = StObject.set(x, "safeStorage", value.asInstanceOf[js.Any])
      
      inline def setScreen(value: typings.electron.Electron.Main.Screen): Self = StObject.set(x, "screen", value.asInstanceOf[js.Any])
      
      inline def setShareMenu(value: Instantiable0[typings.electron.Electron.Main.ShareMenu]): Self = StObject.set(x, "ShareMenu", value.asInstanceOf[js.Any])
      
      inline def setSystemPreferences(value: typings.electron.Electron.Main.SystemPreferences): Self = StObject.set(x, "systemPreferences", value.asInstanceOf[js.Any])
      
      inline def setTouchBar(value: Instantiable0[typings.electron.Electron.Main.TouchBar]): Self = StObject.set(x, "TouchBar", value.asInstanceOf[js.Any])
      
      inline def setTray(value: Instantiable0[typings.electron.Electron.Main.Tray]): Self = StObject.set(x, "Tray", value.asInstanceOf[js.Any])
      
      inline def setView(value: Instantiable0[typings.electron.Electron.Main.View]): Self = StObject.set(x, "View", value.asInstanceOf[js.Any])
      
      inline def setWebContentsView(value: Instantiable0[typings.electron.Electron.Main.WebContentsView]): Self = StObject.set(x, "WebContentsView", value.asInstanceOf[js.Any])
    }
  }
  
  trait TypeofRenderer extends StObject {
    
    val contextBridge: typings.electron.Electron.Renderer.ContextBridge
    
    val ipcRenderer: typings.electron.Electron.Renderer.IpcRenderer
    
    val webFrame: typings.electron.Electron.Renderer.WebFrame
    
    val webUtils: typings.electron.Electron.Renderer.WebUtils
  }
  object TypeofRenderer {
    
    inline def apply(
      contextBridge: typings.electron.Electron.Renderer.ContextBridge,
      ipcRenderer: typings.electron.Electron.Renderer.IpcRenderer,
      webFrame: typings.electron.Electron.Renderer.WebFrame,
      webUtils: typings.electron.Electron.Renderer.WebUtils
    ): TypeofRenderer = {
      val __obj = js.Dynamic.literal(contextBridge = contextBridge.asInstanceOf[js.Any], ipcRenderer = ipcRenderer.asInstanceOf[js.Any], webFrame = webFrame.asInstanceOf[js.Any], webUtils = webUtils.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeofRenderer]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TypeofRenderer] (val x: Self) extends AnyVal {
      
      inline def setContextBridge(value: typings.electron.Electron.Renderer.ContextBridge): Self = StObject.set(x, "contextBridge", value.asInstanceOf[js.Any])
      
      inline def setIpcRenderer(value: typings.electron.Electron.Renderer.IpcRenderer): Self = StObject.set(x, "ipcRenderer", value.asInstanceOf[js.Any])
      
      inline def setWebFrame(value: typings.electron.Electron.Renderer.WebFrame): Self = StObject.set(x, "webFrame", value.asInstanceOf[js.Any])
      
      inline def setWebUtils(value: typings.electron.Electron.Renderer.WebUtils): Self = StObject.set(x, "webUtils", value.asInstanceOf[js.Any])
    }
  }
  
  trait TypeofUtility extends StObject {
    
    val net: typings.electron.Electron.Utility.Net
    
    val systemPreferences: typings.electron.Electron.Utility.SystemPreferences
  }
  object TypeofUtility {
    
    inline def apply(
      net: typings.electron.Electron.Utility.Net,
      systemPreferences: typings.electron.Electron.Utility.SystemPreferences
    ): TypeofUtility = {
      val __obj = js.Dynamic.literal(net = net.asInstanceOf[js.Any], systemPreferences = systemPreferences.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeofUtility]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TypeofUtility] (val x: Self) extends AnyVal {
      
      inline def setNet(value: typings.electron.Electron.Utility.Net): Self = StObject.set(x, "net", value.asInstanceOf[js.Any])
      
      inline def setSystemPreferences(value: typings.electron.Electron.Utility.SystemPreferences): Self = StObject.set(x, "systemPreferences", value.asInstanceOf[js.Any])
    }
  }
}
