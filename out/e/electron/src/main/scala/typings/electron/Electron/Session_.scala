package typings.electron.Electron

import typings.electron.anon.RequestInitbypassCustomPr
import typings.electron.electronStrings.`clipboard-read`
import typings.electron.electronStrings.`clipboard-sanitized-write`
import typings.electron.electronStrings.`deprecated-sync-clipboard-read`
import typings.electron.electronStrings.`display-capture`
import typings.electron.electronStrings.`extension-loaded`
import typings.electron.electronStrings.`extension-ready`
import typings.electron.electronStrings.`extension-unloaded`
import typings.electron.electronStrings.`file-system-access-restricted`
import typings.electron.electronStrings.`hid-device-added`
import typings.electron.electronStrings.`hid-device-removed`
import typings.electron.electronStrings.`hid-device-revoked`
import typings.electron.electronStrings.`idle-detection`
import typings.electron.electronStrings.`select-hid-device`
import typings.electron.electronStrings.`select-serial-port`
import typings.electron.electronStrings.`select-usb-device`
import typings.electron.electronStrings.`serial-port-added`
import typings.electron.electronStrings.`serial-port-removed`
import typings.electron.electronStrings.`serial-port-revoked`
import typings.electron.electronStrings.`speaker-selection`
import typings.electron.electronStrings.`spellcheck-dictionary-download-begin`
import typings.electron.electronStrings.`spellcheck-dictionary-download-failure`
import typings.electron.electronStrings.`spellcheck-dictionary-download-success`
import typings.electron.electronStrings.`spellcheck-dictionary-initialized`
import typings.electron.electronStrings.`storage-access`
import typings.electron.electronStrings.`top-level-storage-access`
import typings.electron.electronStrings.`usb-device-added`
import typings.electron.electronStrings.`usb-device-removed`
import typings.electron.electronStrings.`usb-device-revoked`
import typings.electron.electronStrings.`will-download`
import typings.electron.electronStrings.`window-management`
import typings.electron.electronStrings.allow
import typings.electron.electronStrings.deny
import typings.electron.electronStrings.fileSystem
import typings.electron.electronStrings.fullscreen
import typings.electron.electronStrings.geolocation
import typings.electron.electronStrings.hid
import typings.electron.electronStrings.keyboardLock
import typings.electron.electronStrings.media
import typings.electron.electronStrings.mediaKeySystem
import typings.electron.electronStrings.midi
import typings.electron.electronStrings.midiSysex
import typings.electron.electronStrings.notifications
import typings.electron.electronStrings.openExternal
import typings.electron.electronStrings.pointerLock
import typings.electron.electronStrings.preconnect
import typings.electron.electronStrings.serial
import typings.electron.electronStrings.tryAgain
import typings.electron.electronStrings.unknown_
import typings.electron.electronStrings.usb
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Session_ extends StObject {
  
  def addListener(
    event: `file-system-access-restricted`,
    listener: js.Function3[
      /* event */ Event[js.Object], 
      /* details */ FileSystemAccessRestrictedDetails, 
      /* callback */ js.Function1[/* action */ allow | deny | tryAgain, Unit], 
      Unit
    ]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_extensionloaded(
    event: `extension-loaded`,
    listener: js.Function2[/* event */ Event[js.Object], /* extension */ Extension, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_extensionready(
    event: `extension-ready`,
    listener: js.Function2[/* event */ Event[js.Object], /* extension */ Extension, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_extensionunloaded(
    event: `extension-unloaded`,
    listener: js.Function2[/* event */ Event[js.Object], /* extension */ Extension, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_hiddeviceadded(
    event: `hid-device-added`,
    listener: js.Function2[/* event */ Event[js.Object], /* details */ HidDeviceAddedDetails, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_hiddeviceremoved(
    event: `hid-device-removed`,
    listener: js.Function2[/* event */ Event[js.Object], /* details */ HidDeviceRemovedDetails, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_hiddevicerevoked(
    event: `hid-device-revoked`,
    listener: js.Function2[/* event */ Event[js.Object], /* details */ HidDeviceRevokedDetails, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_preconnect(
    event: preconnect,
    listener: js.Function3[
      /* event */ Event[js.Object], 
      /* preconnectUrl */ String, 
      /* allowCredentials */ Boolean, 
      Unit
    ]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_selecthiddevice(
    event: `select-hid-device`,
    listener: js.Function3[
      /* event */ Event[js.Object], 
      /* details */ SelectHidDeviceDetails, 
      /* callback */ js.Function1[/* deviceId */ js.UndefOr[String | Null], Unit], 
      Unit
    ]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_selectserialport(
    event: `select-serial-port`,
    listener: js.Function4[
      /* event */ Event[js.Object], 
      /* portList */ js.Array[SerialPort], 
      /* webContents */ WebContents_, 
      /* callback */ js.Function1[/* portId */ String, Unit], 
      Unit
    ]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_selectusbdevice(
    event: `select-usb-device`,
    listener: js.Function3[
      /* event */ Event[js.Object], 
      /* details */ SelectUsbDeviceDetails, 
      /* callback */ js.Function1[/* deviceId */ js.UndefOr[String], Unit], 
      Unit
    ]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_serialportadded(
    event: `serial-port-added`,
    listener: js.Function3[
      /* event */ Event[js.Object], 
      /* port */ SerialPort, 
      /* webContents */ WebContents_, 
      Unit
    ]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_serialportremoved(
    event: `serial-port-removed`,
    listener: js.Function3[
      /* event */ Event[js.Object], 
      /* port */ SerialPort, 
      /* webContents */ WebContents_, 
      Unit
    ]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_serialportrevoked(
    event: `serial-port-revoked`,
    listener: js.Function2[/* event */ Event[js.Object], /* details */ SerialPortRevokedDetails, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_spellcheckdictionarydownloadbegin(
    event: `spellcheck-dictionary-download-begin`,
    listener: js.Function2[/* event */ Event[js.Object], /* languageCode */ String, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_spellcheckdictionarydownloadfailure(
    event: `spellcheck-dictionary-download-failure`,
    listener: js.Function2[/* event */ Event[js.Object], /* languageCode */ String, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_spellcheckdictionarydownloadsuccess(
    event: `spellcheck-dictionary-download-success`,
    listener: js.Function2[/* event */ Event[js.Object], /* languageCode */ String, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_spellcheckdictionaryinitialized(
    event: `spellcheck-dictionary-initialized`,
    listener: js.Function2[/* event */ Event[js.Object], /* languageCode */ String, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_usbdeviceadded(
    event: `usb-device-added`,
    listener: js.Function3[
      /* event */ Event[js.Object], 
      /* device */ USBDevice, 
      /* webContents */ WebContents_, 
      Unit
    ]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_usbdeviceremoved(
    event: `usb-device-removed`,
    listener: js.Function3[
      /* event */ Event[js.Object], 
      /* device */ USBDevice, 
      /* webContents */ WebContents_, 
      Unit
    ]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_usbdevicerevoked(
    event: `usb-device-revoked`,
    listener: js.Function2[/* event */ Event[js.Object], /* details */ UsbDeviceRevokedDetails, Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_willdownload(
    event: `will-download`,
    listener: js.Function3[
      /* event */ Event[js.Object], 
      /* item */ DownloadItem, 
      /* webContents */ WebContents_, 
      Unit
    ]
  ): this.type = js.native
  
  /**
    * Whether the word was successfully written to the custom dictionary. This API
    * will not work on non-persistent (in-memory) sessions.
    *
    * > [!NOTE] On macOS and Windows, this word will be written to the OS custom
    * dictionary as well.
    */
  def addWordToSpellCheckerDictionary(word: String): Boolean = js.native
  
  /**
    * Dynamically sets whether to always send credentials for HTTP NTLM or Negotiate
    * authentication.
    */
  def allowNTLMCredentialsForDomains(domains: String): Unit = js.native
  
  /**
    * A `string[]` array which consists of all the known available spell checker
    * languages.  Providing a language code to the `setSpellCheckerLanguages` API that
    * isn't in this array will result in an error.
    *
    */
  val availableSpellCheckerLanguages: js.Array[String] = js.native
  
  /**
    * resolves when the session’s HTTP authentication cache has been cleared.
    */
  def clearAuthCache(): js.Promise[Unit] = js.native
  
  /**
    * resolves when the cache clear operation is complete.
    *
    * Clears the session’s HTTP cache.
    */
  def clearCache(): js.Promise[Unit] = js.native
  
  /**
    * resolves when the code cache clear operation is complete.
    */
  def clearCodeCaches(options: ClearCodeCachesOptions): js.Promise[Unit] = js.native
  
  /**
    * resolves when all data has been cleared.
    *
    * Clears various different types of data.
    *
    * This method clears more types of data and is more thorough than the
    * `clearStorageData` method.
    *
    * > [!NOTE] Cookies are stored at a broader scope than origins. When removing
    * cookies and filtering by `origins` (or `excludeOrigins`), the cookies will be
    * removed at the registrable domain level. For example, clearing cookies for the
    * origin `https://really.specific.origin.example.com/` will end up clearing all
    * cookies for `example.com`. Clearing cookies for the origin
    * `https://my.website.example.co.uk/` will end up clearing all cookies for
    * `example.co.uk`.
    *
    * > [!NOTE] Clearing cache data will also clear the shared dictionary cache. This
    * means that any dictionaries used for compression may be reloaded after clearing
    * the cache. If you wish to clear the shared dictionary cache but leave other
    * cached data intact, you may want to use the `clearSharedDictionaryCache` method.
    *
    * For more information, refer to Chromium's `BrowsingDataRemover` interface.
    */
  def clearData(): js.Promise[Unit] = js.native
  def clearData(options: ClearDataOptions): js.Promise[Unit] = js.native
  
  /**
    * Resolves when the operation is complete.
    *
    * Clears the host resolver cache.
    */
  def clearHostResolverCache(): js.Promise[Unit] = js.native
  
  /**
    * resolves when the dictionary cache has been cleared, both in memory and on disk.
    */
  def clearSharedDictionaryCache(): js.Promise[Unit] = js.native
  
  /**
    * resolves when the dictionary cache has been cleared for the specified isolation
    * key, both in memory and on disk.
    */
  def clearSharedDictionaryCacheForIsolationKey(options: ClearSharedDictionaryCacheForIsolationKeyOptions): js.Promise[Unit] = js.native
  
  /**
    * resolves when the storage data has been cleared.
    */
  def clearStorageData(): js.Promise[Unit] = js.native
  def clearStorageData(options: ClearStorageDataOptions): js.Promise[Unit] = js.native
  
  /**
    * Resolves when all connections are closed.
    *
    * > [!NOTE] It will terminate / fail all requests currently in flight.
    */
  def closeAllConnections(): js.Promise[Unit] = js.native
  
  /**
    * A `Cookies` object for this session.
    *
    */
  val cookies: Cookies = js.native
  
  /**
    * Allows resuming `cancelled` or `interrupted` downloads from previous `Session`.
    * The API will generate a DownloadItem that can be accessed with the will-download
    * event. The DownloadItem will not have any `WebContents` associated with it and
    * the initial state will be `interrupted`. The download will start only when the
    * `resume` API is called on the DownloadItem.
    */
  def createInterruptedDownload(options: CreateInterruptedDownloadOptions): Unit = js.native
  
  /**
    * Disables any network emulation already active for the `session`. Resets to the
    * original network configuration.
    */
  def disableNetworkEmulation(): Unit = js.native
  
  /**
    * Initiates a download of the resource at `url`. The API will generate a
    * DownloadItem that can be accessed with the will-download event.
    *
    * > [!NOTE] This does not perform any security checks that relate to a page's
    * origin, unlike `webContents.downloadURL`.
    */
  def downloadURL(url: String): Unit = js.native
  def downloadURL(url: String, options: DownloadURLOptions): Unit = js.native
  
  /**
    * Emulates network with the given configuration for the `session`.
    */
  def enableNetworkEmulation(options: EnableNetworkEmulationOptions): Unit = js.native
  
  /**
    * A `Extensions` object for this session.
    *
    */
  val extensions: Extensions = js.native
  
  /**
    * see Response.
    *
    * Sends a request, similarly to how `fetch()` works in the renderer, using
    * Chrome's network stack. This differs from Node's `fetch()`, which uses Node.js's
    * HTTP stack.
    *
    * Example:
    *
    * See also `net.fetch()`, a convenience method which issues requests from the
    * default session.
    *
    * See the MDN documentation for `fetch()` for more details.
    *
    * Limitations:
    *
    * * `net.fetch()` does not support the `data:` or `blob:` schemes.
    * * The value of the `integrity` option is ignored.
    * * The `.type` and `.url` values of the returned `Response` object are incorrect.
    *
    * By default, requests made with `net.fetch` can be made to custom protocols as
    * well as `file:`, and will trigger webRequest handlers if present. When the
    * non-standard `bypassCustomProtocolHandlers` option is set in RequestInit, custom
    * protocol handlers will not be called for this request. This allows forwarding an
    * intercepted request to the built-in handler. webRequest handlers will still be
    * triggered when bypassing custom protocols.
    */
  def fetch(input: String): js.Promise[org.scalajs.dom.Response] = js.native
  def fetch(input: String, init: RequestInitbypassCustomPr): js.Promise[org.scalajs.dom.Response] = js.native
  def fetch(input: org.scalajs.dom.Request): js.Promise[org.scalajs.dom.Response] = js.native
  def fetch(input: org.scalajs.dom.Request, init: RequestInitbypassCustomPr): js.Promise[org.scalajs.dom.Response] = js.native
  
  /**
    * Writes any unwritten DOMStorage data to disk.
    */
  def flushStorageData(): Unit = js.native
  
  /**
    * Resolves when the all internal states of proxy service is reset and the latest
    * proxy configuration is reapplied if it's already available. The pac script will
    * be fetched from `pacScript` again if the proxy mode is `pac_script`.
    */
  def forceReloadProxyConfig(): js.Promise[Unit] = js.native
  
  /**
    * A list of all loaded extensions.
    *
    * > [!NOTE] This API cannot be called before the `ready` event of the `app` module
    * is emitted.
    *
    * **Deprecated:** Use the new `ses.extensions.getAllExtensions` API.
    *
    * @deprecated
    */
  def getAllExtensions(): js.Array[Extension] = js.native
  
  /**
    * resolves with blob data.
    */
  def getBlobData(identifier: String): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Buffer */ Any
  ] = js.native
  
  /**
    * the session's current cache size, in bytes.
    */
  def getCacheSize(): js.Promise[Double] = js.native
  
  /**
    * The loaded extension with the given ID.
    *
    * > [!NOTE] This API cannot be called before the `ready` event of the `app` module
    * is emitted.
    *
    * **Deprecated:** Use the new `ses.extensions.getExtension` API.
    *
    * @deprecated
    */
  def getExtension(extensionId: String): Extension | Null = js.native
  
  /**
    * An array of paths to preload scripts that have been registered.
    */
  def getPreloadScripts(): js.Array[PreloadScript] = js.native
  
  /**
    * an array of paths to preload scripts that have been registered.
    *
    * **Deprecated:** Use the new `ses.getPreloadScripts` API. This will only return
    * preload script paths for `frame` context types.
    *
    * @deprecated
    */
  def getPreloads(): js.Array[String] = js.native
  
  /**
    * an array of shared dictionary information entries in Chromium's networking
    * service's storage.
    *
    * To get information about all present shared dictionaries, call
    * `getSharedDictionaryUsageInfo()`.
    */
  def getSharedDictionaryInfo(options: SharedDictionaryInfoOptions): js.Promise[js.Array[SharedDictionaryInfo]] = js.native
  
  /**
    * an array of shared dictionary information entries in Chromium's networking
    * service's storage.
    *
    * Shared dictionaries are used to power advanced compression of data sent over the
    * wire, specifically with Brotli and ZStandard. You don't need to call any of the
    * shared dictionary APIs in Electron to make use of this advanced web feature, but
    * if you do, they allow deeper control and inspection of the shared dictionaries
    * used during decompression.
    *
    * To get detailed information about a specific shared dictionary entry, call
    * `getSharedDictionaryInfo(options)`.
    */
  def getSharedDictionaryUsageInfo(): js.Promise[js.Array[SharedDictionaryUsageInfo]] = js.native
  
  /**
    * An array of language codes the spellchecker is enabled for.  If this list is
    * empty the spellchecker will fallback to using `en-US`.  By default on launch if
    * this setting is an empty list Electron will try to populate this setting with
    * the current OS locale.  This setting is persisted across restarts.
    *
    * > [!NOTE] On macOS, the OS spellchecker is used and has its own list of
    * languages. On macOS, this API will return whichever languages have been
    * configured by the OS.
    */
  def getSpellCheckerLanguages(): js.Array[String] = js.native
  
  /**
    * The absolute file system path where data for this session is persisted on disk.
    * For in memory sessions this returns `null`.
    */
  def getStoragePath(): String | Null = js.native
  
  /**
    * The user agent for this session.
    */
  def getUserAgent(): String = js.native
  
  /**
    * Whether or not this session is a persistent one. The default `webContents`
    * session of a `BrowserWindow` is persistent. When creating a session from a
    * partition, session prefixed with `persist:` will be persistent, while others
    * will be temporary.
    */
  def isPersistent(): Boolean = js.native
  
  /**
    * Whether the builtin spell checker is enabled.
    */
  def isSpellCheckerEnabled(): Boolean = js.native
  
  /**
    * An array of all words in app's custom dictionary. Resolves when the full
    * dictionary is loaded from disk.
    */
  def listWordsInSpellCheckerDictionary(): js.Promise[js.Array[String]] = js.native
  
  /**
    * resolves when the extension is loaded.
    *
    * This method will raise an exception if the extension could not be loaded. If
    * there are warnings when installing the extension (e.g. if the extension requests
    * an API that Electron does not support) then they will be logged to the console.
    *
    * Note that Electron does not support the full range of Chrome extensions APIs.
    * See Supported Extensions APIs for more details on what is supported.
    *
    * Note that in previous versions of Electron, extensions that were loaded would be
    * remembered for future runs of the application. This is no longer the case:
    * `loadExtension` must be called on every boot of your app if you want the
    * extension to be loaded.
    *
    * This API does not support loading packed (.crx) extensions.
    *
    * > [!NOTE] This API cannot be called before the `ready` event of the `app` module
    * is emitted.
    *
    * > [!NOTE] Loading extensions into in-memory (non-persistent) sessions is not
    * supported and will throw an error.
    *
    * **Deprecated:** Use the new `ses.extensions.loadExtension` API.
    *
    * @deprecated
    */
  def loadExtension(path: String): js.Promise[Extension] = js.native
  def loadExtension(path: String, options: LoadExtensionOptions): js.Promise[Extension] = js.native
  
  /**
    * A `NetLog` object for this session.
    *
    */
  val netLog: NetLog = js.native
  
  def off(
    event: `file-system-access-restricted`,
    listener: js.Function3[
      /* event */ Event[js.Object], 
      /* details */ FileSystemAccessRestrictedDetails, 
      /* callback */ js.Function1[/* action */ allow | deny | tryAgain, Unit], 
      Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_extensionloaded(
    event: `extension-loaded`,
    listener: js.Function2[/* event */ Event[js.Object], /* extension */ Extension, Unit]
  ): this.type = js.native
  @JSName("off")
  def off_extensionready(
    event: `extension-ready`,
    listener: js.Function2[/* event */ Event[js.Object], /* extension */ Extension, Unit]
  ): this.type = js.native
  @JSName("off")
  def off_extensionunloaded(
    event: `extension-unloaded`,
    listener: js.Function2[/* event */ Event[js.Object], /* extension */ Extension, Unit]
  ): this.type = js.native
  @JSName("off")
  def off_hiddeviceadded(
    event: `hid-device-added`,
    listener: js.Function2[/* event */ Event[js.Object], /* details */ HidDeviceAddedDetails, Unit]
  ): this.type = js.native
  @JSName("off")
  def off_hiddeviceremoved(
    event: `hid-device-removed`,
    listener: js.Function2[/* event */ Event[js.Object], /* details */ HidDeviceRemovedDetails, Unit]
  ): this.type = js.native
  @JSName("off")
  def off_hiddevicerevoked(
    event: `hid-device-revoked`,
    listener: js.Function2[/* event */ Event[js.Object], /* details */ HidDeviceRevokedDetails, Unit]
  ): this.type = js.native
  @JSName("off")
  def off_preconnect(
    event: preconnect,
    listener: js.Function3[
      /* event */ Event[js.Object], 
      /* preconnectUrl */ String, 
      /* allowCredentials */ Boolean, 
      Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_selecthiddevice(
    event: `select-hid-device`,
    listener: js.Function3[
      /* event */ Event[js.Object], 
      /* details */ SelectHidDeviceDetails, 
      /* callback */ js.Function1[/* deviceId */ js.UndefOr[String | Null], Unit], 
      Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_selectserialport(
    event: `select-serial-port`,
    listener: js.Function4[
      /* event */ Event[js.Object], 
      /* portList */ js.Array[SerialPort], 
      /* webContents */ WebContents_, 
      /* callback */ js.Function1[/* portId */ String, Unit], 
      Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_selectusbdevice(
    event: `select-usb-device`,
    listener: js.Function3[
      /* event */ Event[js.Object], 
      /* details */ SelectUsbDeviceDetails, 
      /* callback */ js.Function1[/* deviceId */ js.UndefOr[String], Unit], 
      Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_serialportadded(
    event: `serial-port-added`,
    listener: js.Function3[
      /* event */ Event[js.Object], 
      /* port */ SerialPort, 
      /* webContents */ WebContents_, 
      Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_serialportremoved(
    event: `serial-port-removed`,
    listener: js.Function3[
      /* event */ Event[js.Object], 
      /* port */ SerialPort, 
      /* webContents */ WebContents_, 
      Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_serialportrevoked(
    event: `serial-port-revoked`,
    listener: js.Function2[/* event */ Event[js.Object], /* details */ SerialPortRevokedDetails, Unit]
  ): this.type = js.native
  @JSName("off")
  def off_spellcheckdictionarydownloadbegin(
    event: `spellcheck-dictionary-download-begin`,
    listener: js.Function2[/* event */ Event[js.Object], /* languageCode */ String, Unit]
  ): this.type = js.native
  @JSName("off")
  def off_spellcheckdictionarydownloadfailure(
    event: `spellcheck-dictionary-download-failure`,
    listener: js.Function2[/* event */ Event[js.Object], /* languageCode */ String, Unit]
  ): this.type = js.native
  @JSName("off")
  def off_spellcheckdictionarydownloadsuccess(
    event: `spellcheck-dictionary-download-success`,
    listener: js.Function2[/* event */ Event[js.Object], /* languageCode */ String, Unit]
  ): this.type = js.native
  @JSName("off")
  def off_spellcheckdictionaryinitialized(
    event: `spellcheck-dictionary-initialized`,
    listener: js.Function2[/* event */ Event[js.Object], /* languageCode */ String, Unit]
  ): this.type = js.native
  @JSName("off")
  def off_usbdeviceadded(
    event: `usb-device-added`,
    listener: js.Function3[
      /* event */ Event[js.Object], 
      /* device */ USBDevice, 
      /* webContents */ WebContents_, 
      Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_usbdeviceremoved(
    event: `usb-device-removed`,
    listener: js.Function3[
      /* event */ Event[js.Object], 
      /* device */ USBDevice, 
      /* webContents */ WebContents_, 
      Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_usbdevicerevoked(
    event: `usb-device-revoked`,
    listener: js.Function2[/* event */ Event[js.Object], /* details */ UsbDeviceRevokedDetails, Unit]
  ): this.type = js.native
  @JSName("off")
  def off_willdownload(
    event: `will-download`,
    listener: js.Function3[
      /* event */ Event[js.Object], 
      /* item */ DownloadItem, 
      /* webContents */ WebContents_, 
      Unit
    ]
  ): this.type = js.native
  
  def on(
    event: `file-system-access-restricted`,
    listener: js.Function3[
      /* event */ Event[js.Object], 
      /* details */ FileSystemAccessRestrictedDetails, 
      /* callback */ js.Function1[/* action */ allow | deny | tryAgain, Unit], 
      Unit
    ]
  ): this.type = js.native
  /**
    * Emitted after an extension is loaded. This occurs whenever an extension is added
    * to the "enabled" set of extensions. This includes:
    *
    * * Extensions being loaded from `Session.loadExtension`.
    * * Extensions being reloaded:
    *   * from a crash.
    *   * if the extension requested it (`chrome.runtime.reload()`).
    */
  @JSName("on")
  def on_extensionloaded(
    event: `extension-loaded`,
    listener: js.Function2[/* event */ Event[js.Object], /* extension */ Extension, Unit]
  ): this.type = js.native
  /**
    * Emitted after an extension is loaded and all necessary browser state is
    * initialized to support the start of the extension's background page.
    */
  @JSName("on")
  def on_extensionready(
    event: `extension-ready`,
    listener: js.Function2[/* event */ Event[js.Object], /* extension */ Extension, Unit]
  ): this.type = js.native
  /**
    * Emitted after an extension is unloaded. This occurs when
    * `Session.removeExtension` is called.
    */
  @JSName("on")
  def on_extensionunloaded(
    event: `extension-unloaded`,
    listener: js.Function2[/* event */ Event[js.Object], /* extension */ Extension, Unit]
  ): this.type = js.native
  /**
    * Emitted after `navigator.hid.requestDevice` has been called and
    * `select-hid-device` has fired if a new device becomes available before the
    * callback from `select-hid-device` is called.  This event is intended for use
    * when using a UI to ask users to pick a device so that the UI can be updated with
    * the newly added device.
    */
  @JSName("on")
  def on_hiddeviceadded(
    event: `hid-device-added`,
    listener: js.Function2[/* event */ Event[js.Object], /* details */ HidDeviceAddedDetails, Unit]
  ): this.type = js.native
  /**
    * Emitted after `navigator.hid.requestDevice` has been called and
    * `select-hid-device` has fired if a device has been removed before the callback
    * from `select-hid-device` is called.  This event is intended for use when using a
    * UI to ask users to pick a device so that the UI can be updated to remove the
    * specified device.
    */
  @JSName("on")
  def on_hiddeviceremoved(
    event: `hid-device-removed`,
    listener: js.Function2[/* event */ Event[js.Object], /* details */ HidDeviceRemovedDetails, Unit]
  ): this.type = js.native
  /**
    * Emitted after `HIDDevice.forget()` has been called.  This event can be used to
    * help maintain persistent storage of permissions when
    * `setDevicePermissionHandler` is used.
    */
  @JSName("on")
  def on_hiddevicerevoked(
    event: `hid-device-revoked`,
    listener: js.Function2[/* event */ Event[js.Object], /* details */ HidDeviceRevokedDetails, Unit]
  ): this.type = js.native
  /**
    * Emitted when a render process requests preconnection to a URL, generally due to
    * a resource hint.
    */
  @JSName("on")
  def on_preconnect(
    event: preconnect,
    listener: js.Function3[
      /* event */ Event[js.Object], 
      /* preconnectUrl */ String, 
      /* allowCredentials */ Boolean, 
      Unit
    ]
  ): this.type = js.native
  /**
    * Emitted when a HID device needs to be selected when a call to
    * `navigator.hid.requestDevice` is made. `callback` should be called with
    * `deviceId` to be selected; passing no arguments to `callback` will cancel the
    * request.  Additionally, permissioning on `navigator.hid` can be further managed
    * by using `ses.setPermissionCheckHandler(handler)` and
    * `ses.setDevicePermissionHandler(handler)`.
    */
  @JSName("on")
  def on_selecthiddevice(
    event: `select-hid-device`,
    listener: js.Function3[
      /* event */ Event[js.Object], 
      /* details */ SelectHidDeviceDetails, 
      /* callback */ js.Function1[/* deviceId */ js.UndefOr[String | Null], Unit], 
      Unit
    ]
  ): this.type = js.native
  /**
    * Emitted when a serial port needs to be selected when a call to
    * `navigator.serial.requestPort` is made. `callback` should be called with
    * `portId` to be selected, passing an empty string to `callback` will cancel the
    * request.  Additionally, permissioning on `navigator.serial` can be managed by
    * using ses.setPermissionCheckHandler(handler) with the `serial` permission.
    */
  @JSName("on")
  def on_selectserialport(
    event: `select-serial-port`,
    listener: js.Function4[
      /* event */ Event[js.Object], 
      /* portList */ js.Array[SerialPort], 
      /* webContents */ WebContents_, 
      /* callback */ js.Function1[/* portId */ String, Unit], 
      Unit
    ]
  ): this.type = js.native
  /**
    * Emitted when a USB device needs to be selected when a call to
    * `navigator.usb.requestDevice` is made. `callback` should be called with
    * `deviceId` to be selected; passing no arguments to `callback` will cancel the
    * request.  Additionally, permissioning on `navigator.usb` can be further managed
    * by using `ses.setPermissionCheckHandler(handler)` and
    * `ses.setDevicePermissionHandler(handler)`.
    */
  @JSName("on")
  def on_selectusbdevice(
    event: `select-usb-device`,
    listener: js.Function3[
      /* event */ Event[js.Object], 
      /* details */ SelectUsbDeviceDetails, 
      /* callback */ js.Function1[/* deviceId */ js.UndefOr[String], Unit], 
      Unit
    ]
  ): this.type = js.native
  /**
    * Emitted after `navigator.serial.requestPort` has been called and
    * `select-serial-port` has fired if a new serial port becomes available before the
    * callback from `select-serial-port` is called.  This event is intended for use
    * when using a UI to ask users to pick a port so that the UI can be updated with
    * the newly added port.
    */
  @JSName("on")
  def on_serialportadded(
    event: `serial-port-added`,
    listener: js.Function3[
      /* event */ Event[js.Object], 
      /* port */ SerialPort, 
      /* webContents */ WebContents_, 
      Unit
    ]
  ): this.type = js.native
  /**
    * Emitted after `navigator.serial.requestPort` has been called and
    * `select-serial-port` has fired if a serial port has been removed before the
    * callback from `select-serial-port` is called.  This event is intended for use
    * when using a UI to ask users to pick a port so that the UI can be updated to
    * remove the specified port.
    */
  @JSName("on")
  def on_serialportremoved(
    event: `serial-port-removed`,
    listener: js.Function3[
      /* event */ Event[js.Object], 
      /* port */ SerialPort, 
      /* webContents */ WebContents_, 
      Unit
    ]
  ): this.type = js.native
  /**
    * Emitted after `SerialPort.forget()` has been called.  This event can be used to
    * help maintain persistent storage of permissions when
    * `setDevicePermissionHandler` is used.
    */
  @JSName("on")
  def on_serialportrevoked(
    event: `serial-port-revoked`,
    listener: js.Function2[/* event */ Event[js.Object], /* details */ SerialPortRevokedDetails, Unit]
  ): this.type = js.native
  /**
    * Emitted when a hunspell dictionary file starts downloading
    */
  @JSName("on")
  def on_spellcheckdictionarydownloadbegin(
    event: `spellcheck-dictionary-download-begin`,
    listener: js.Function2[/* event */ Event[js.Object], /* languageCode */ String, Unit]
  ): this.type = js.native
  /**
    * Emitted when a hunspell dictionary file download fails.  For details on the
    * failure you should collect a netlog and inspect the download request.
    */
  @JSName("on")
  def on_spellcheckdictionarydownloadfailure(
    event: `spellcheck-dictionary-download-failure`,
    listener: js.Function2[/* event */ Event[js.Object], /* languageCode */ String, Unit]
  ): this.type = js.native
  /**
    * Emitted when a hunspell dictionary file has been successfully downloaded
    */
  @JSName("on")
  def on_spellcheckdictionarydownloadsuccess(
    event: `spellcheck-dictionary-download-success`,
    listener: js.Function2[/* event */ Event[js.Object], /* languageCode */ String, Unit]
  ): this.type = js.native
  /**
    * Emitted when a hunspell dictionary file has been successfully initialized. This
    * occurs after the file has been downloaded.
    */
  @JSName("on")
  def on_spellcheckdictionaryinitialized(
    event: `spellcheck-dictionary-initialized`,
    listener: js.Function2[/* event */ Event[js.Object], /* languageCode */ String, Unit]
  ): this.type = js.native
  /**
    * Emitted after `navigator.usb.requestDevice` has been called and
    * `select-usb-device` has fired if a new device becomes available before the
    * callback from `select-usb-device` is called.  This event is intended for use
    * when using a UI to ask users to pick a device so that the UI can be updated with
    * the newly added device.
    */
  @JSName("on")
  def on_usbdeviceadded(
    event: `usb-device-added`,
    listener: js.Function3[
      /* event */ Event[js.Object], 
      /* device */ USBDevice, 
      /* webContents */ WebContents_, 
      Unit
    ]
  ): this.type = js.native
  /**
    * Emitted after `navigator.usb.requestDevice` has been called and
    * `select-usb-device` has fired if a device has been removed before the callback
    * from `select-usb-device` is called.  This event is intended for use when using a
    * UI to ask users to pick a device so that the UI can be updated to remove the
    * specified device.
    */
  @JSName("on")
  def on_usbdeviceremoved(
    event: `usb-device-removed`,
    listener: js.Function3[
      /* event */ Event[js.Object], 
      /* device */ USBDevice, 
      /* webContents */ WebContents_, 
      Unit
    ]
  ): this.type = js.native
  /**
    * Emitted after `USBDevice.forget()` has been called.  This event can be used to
    * help maintain persistent storage of permissions when
    * `setDevicePermissionHandler` is used.
    */
  @JSName("on")
  def on_usbdevicerevoked(
    event: `usb-device-revoked`,
    listener: js.Function2[/* event */ Event[js.Object], /* details */ UsbDeviceRevokedDetails, Unit]
  ): this.type = js.native
  /**
    * Emitted when Electron is about to download `item` in `webContents`.
    *
    * Calling `event.preventDefault()` will cancel the download and `item` will not be
    * available from next tick of the process.
    */
  @JSName("on")
  def on_willdownload(
    event: `will-download`,
    listener: js.Function3[
      /* event */ Event[js.Object], 
      /* item */ DownloadItem, 
      /* webContents */ WebContents_, 
      Unit
    ]
  ): this.type = js.native
  
  def once(
    event: `file-system-access-restricted`,
    listener: js.Function3[
      /* event */ Event[js.Object], 
      /* details */ FileSystemAccessRestrictedDetails, 
      /* callback */ js.Function1[/* action */ allow | deny | tryAgain, Unit], 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_extensionloaded(
    event: `extension-loaded`,
    listener: js.Function2[/* event */ Event[js.Object], /* extension */ Extension, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_extensionready(
    event: `extension-ready`,
    listener: js.Function2[/* event */ Event[js.Object], /* extension */ Extension, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_extensionunloaded(
    event: `extension-unloaded`,
    listener: js.Function2[/* event */ Event[js.Object], /* extension */ Extension, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_hiddeviceadded(
    event: `hid-device-added`,
    listener: js.Function2[/* event */ Event[js.Object], /* details */ HidDeviceAddedDetails, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_hiddeviceremoved(
    event: `hid-device-removed`,
    listener: js.Function2[/* event */ Event[js.Object], /* details */ HidDeviceRemovedDetails, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_hiddevicerevoked(
    event: `hid-device-revoked`,
    listener: js.Function2[/* event */ Event[js.Object], /* details */ HidDeviceRevokedDetails, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_preconnect(
    event: preconnect,
    listener: js.Function3[
      /* event */ Event[js.Object], 
      /* preconnectUrl */ String, 
      /* allowCredentials */ Boolean, 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_selecthiddevice(
    event: `select-hid-device`,
    listener: js.Function3[
      /* event */ Event[js.Object], 
      /* details */ SelectHidDeviceDetails, 
      /* callback */ js.Function1[/* deviceId */ js.UndefOr[String | Null], Unit], 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_selectserialport(
    event: `select-serial-port`,
    listener: js.Function4[
      /* event */ Event[js.Object], 
      /* portList */ js.Array[SerialPort], 
      /* webContents */ WebContents_, 
      /* callback */ js.Function1[/* portId */ String, Unit], 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_selectusbdevice(
    event: `select-usb-device`,
    listener: js.Function3[
      /* event */ Event[js.Object], 
      /* details */ SelectUsbDeviceDetails, 
      /* callback */ js.Function1[/* deviceId */ js.UndefOr[String], Unit], 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_serialportadded(
    event: `serial-port-added`,
    listener: js.Function3[
      /* event */ Event[js.Object], 
      /* port */ SerialPort, 
      /* webContents */ WebContents_, 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_serialportremoved(
    event: `serial-port-removed`,
    listener: js.Function3[
      /* event */ Event[js.Object], 
      /* port */ SerialPort, 
      /* webContents */ WebContents_, 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_serialportrevoked(
    event: `serial-port-revoked`,
    listener: js.Function2[/* event */ Event[js.Object], /* details */ SerialPortRevokedDetails, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_spellcheckdictionarydownloadbegin(
    event: `spellcheck-dictionary-download-begin`,
    listener: js.Function2[/* event */ Event[js.Object], /* languageCode */ String, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_spellcheckdictionarydownloadfailure(
    event: `spellcheck-dictionary-download-failure`,
    listener: js.Function2[/* event */ Event[js.Object], /* languageCode */ String, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_spellcheckdictionarydownloadsuccess(
    event: `spellcheck-dictionary-download-success`,
    listener: js.Function2[/* event */ Event[js.Object], /* languageCode */ String, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_spellcheckdictionaryinitialized(
    event: `spellcheck-dictionary-initialized`,
    listener: js.Function2[/* event */ Event[js.Object], /* languageCode */ String, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_usbdeviceadded(
    event: `usb-device-added`,
    listener: js.Function3[
      /* event */ Event[js.Object], 
      /* device */ USBDevice, 
      /* webContents */ WebContents_, 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_usbdeviceremoved(
    event: `usb-device-removed`,
    listener: js.Function3[
      /* event */ Event[js.Object], 
      /* device */ USBDevice, 
      /* webContents */ WebContents_, 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_usbdevicerevoked(
    event: `usb-device-revoked`,
    listener: js.Function2[/* event */ Event[js.Object], /* details */ UsbDeviceRevokedDetails, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_willdownload(
    event: `will-download`,
    listener: js.Function3[
      /* event */ Event[js.Object], 
      /* item */ DownloadItem, 
      /* webContents */ WebContents_, 
      Unit
    ]
  ): this.type = js.native
  
  /**
    * Preconnects the given number of sockets to an origin.
    */
  def preconnect(options: PreconnectOptions): Unit = js.native
  
  /**
    * A `Protocol` object for this session.
    *
    */
  val protocol: Protocol = js.native
  
  /**
    * Registers preload script that will be executed in its associated context type in
    * this session. For `frame` contexts, this will run prior to any preload defined
    * in the web preferences of a WebContents.
    *
    * The ID of the registered preload script.
    */
  def registerPreloadScript(script: PreloadScriptRegistration): String = js.native
  
  /**
    * Unloads an extension.
    *
    * > [!NOTE] This API cannot be called before the `ready` event of the `app` module
    * is emitted.
    *
    * **Deprecated:** Use the new `ses.extensions.removeExtension` API.
    *
    * @deprecated
    */
  def removeExtension(extensionId: String): Unit = js.native
  
  def removeListener(
    event: `file-system-access-restricted`,
    listener: js.Function3[
      /* event */ Event[js.Object], 
      /* details */ FileSystemAccessRestrictedDetails, 
      /* callback */ js.Function1[/* action */ allow | deny | tryAgain, Unit], 
      Unit
    ]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_extensionloaded(
    event: `extension-loaded`,
    listener: js.Function2[/* event */ Event[js.Object], /* extension */ Extension, Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_extensionready(
    event: `extension-ready`,
    listener: js.Function2[/* event */ Event[js.Object], /* extension */ Extension, Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_extensionunloaded(
    event: `extension-unloaded`,
    listener: js.Function2[/* event */ Event[js.Object], /* extension */ Extension, Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_hiddeviceadded(
    event: `hid-device-added`,
    listener: js.Function2[/* event */ Event[js.Object], /* details */ HidDeviceAddedDetails, Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_hiddeviceremoved(
    event: `hid-device-removed`,
    listener: js.Function2[/* event */ Event[js.Object], /* details */ HidDeviceRemovedDetails, Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_hiddevicerevoked(
    event: `hid-device-revoked`,
    listener: js.Function2[/* event */ Event[js.Object], /* details */ HidDeviceRevokedDetails, Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_preconnect(
    event: preconnect,
    listener: js.Function3[
      /* event */ Event[js.Object], 
      /* preconnectUrl */ String, 
      /* allowCredentials */ Boolean, 
      Unit
    ]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_selecthiddevice(
    event: `select-hid-device`,
    listener: js.Function3[
      /* event */ Event[js.Object], 
      /* details */ SelectHidDeviceDetails, 
      /* callback */ js.Function1[/* deviceId */ js.UndefOr[String | Null], Unit], 
      Unit
    ]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_selectserialport(
    event: `select-serial-port`,
    listener: js.Function4[
      /* event */ Event[js.Object], 
      /* portList */ js.Array[SerialPort], 
      /* webContents */ WebContents_, 
      /* callback */ js.Function1[/* portId */ String, Unit], 
      Unit
    ]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_selectusbdevice(
    event: `select-usb-device`,
    listener: js.Function3[
      /* event */ Event[js.Object], 
      /* details */ SelectUsbDeviceDetails, 
      /* callback */ js.Function1[/* deviceId */ js.UndefOr[String], Unit], 
      Unit
    ]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_serialportadded(
    event: `serial-port-added`,
    listener: js.Function3[
      /* event */ Event[js.Object], 
      /* port */ SerialPort, 
      /* webContents */ WebContents_, 
      Unit
    ]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_serialportremoved(
    event: `serial-port-removed`,
    listener: js.Function3[
      /* event */ Event[js.Object], 
      /* port */ SerialPort, 
      /* webContents */ WebContents_, 
      Unit
    ]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_serialportrevoked(
    event: `serial-port-revoked`,
    listener: js.Function2[/* event */ Event[js.Object], /* details */ SerialPortRevokedDetails, Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_spellcheckdictionarydownloadbegin(
    event: `spellcheck-dictionary-download-begin`,
    listener: js.Function2[/* event */ Event[js.Object], /* languageCode */ String, Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_spellcheckdictionarydownloadfailure(
    event: `spellcheck-dictionary-download-failure`,
    listener: js.Function2[/* event */ Event[js.Object], /* languageCode */ String, Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_spellcheckdictionarydownloadsuccess(
    event: `spellcheck-dictionary-download-success`,
    listener: js.Function2[/* event */ Event[js.Object], /* languageCode */ String, Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_spellcheckdictionaryinitialized(
    event: `spellcheck-dictionary-initialized`,
    listener: js.Function2[/* event */ Event[js.Object], /* languageCode */ String, Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_usbdeviceadded(
    event: `usb-device-added`,
    listener: js.Function3[
      /* event */ Event[js.Object], 
      /* device */ USBDevice, 
      /* webContents */ WebContents_, 
      Unit
    ]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_usbdeviceremoved(
    event: `usb-device-removed`,
    listener: js.Function3[
      /* event */ Event[js.Object], 
      /* device */ USBDevice, 
      /* webContents */ WebContents_, 
      Unit
    ]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_usbdevicerevoked(
    event: `usb-device-revoked`,
    listener: js.Function2[/* event */ Event[js.Object], /* details */ UsbDeviceRevokedDetails, Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_willdownload(
    event: `will-download`,
    listener: js.Function3[
      /* event */ Event[js.Object], 
      /* item */ DownloadItem, 
      /* webContents */ WebContents_, 
      Unit
    ]
  ): this.type = js.native
  
  /**
    * Whether the word was successfully removed from the custom dictionary. This API
    * will not work on non-persistent (in-memory) sessions.
    *
    * > [!NOTE] On macOS and Windows, this word will be removed from the OS custom
    * dictionary as well.
    */
  def removeWordFromSpellCheckerDictionary(word: String): Boolean = js.native
  
  /**
    * Resolves with the resolved IP addresses for the `host`.
    */
  def resolveHost(host: String): js.Promise[ResolvedHost] = js.native
  def resolveHost(host: String, options: ResolveHostOptions): js.Promise[ResolvedHost] = js.native
  
  /**
    * Resolves with the proxy information for `url`.
    */
  def resolveProxy(url: String): js.Promise[String] = js.native
  
  /**
    * A `ServiceWorkers` object for this session.
    *
    */
  val serviceWorkers: ServiceWorkers = js.native
  
  /**
    * Sets a handler to respond to Bluetooth pairing requests. This handler allows
    * developers to handle devices that require additional validation before pairing.
    * When a handler is not defined, any pairing on Linux or Windows that requires
    * additional validation will be automatically cancelled. macOS does not require a
    * handler because macOS handles the pairing automatically.  To clear the handler,
    * call `setBluetoothPairingHandler(null)`.
    *
    * @platform win32,linux
    */
  def setBluetoothPairingHandler(): Unit = js.native
  def setBluetoothPairingHandler(
    handler: js.Function2[
      /* details */ BluetoothPairingHandlerHandlerDetails, 
      /* callback */ js.Function1[/* response */ Response, Unit], 
      Unit
    ]
  ): Unit = js.native
  
  /**
    * Sets the certificate verify proc for `session`, the `proc` will be called with
    * `proc(request, callback)` whenever a server certificate verification is
    * requested. Calling `callback(0)` accepts the certificate, calling `callback(-2)`
    * rejects it.
    *
    * Calling `setCertificateVerifyProc(null)` will revert back to default certificate
    * verify proc.
    *
    * > **NOTE:** The result of this procedure is cached by the network service.
    */
  def setCertificateVerifyProc(): Unit = js.native
  def setCertificateVerifyProc(
    proc: js.Function2[
      /* request */ Request, 
      /* callback */ js.Function1[/* verificationResult */ Double, Unit], 
      Unit
    ]
  ): Unit = js.native
  
  /**
    * Sets the directory to store the generated JS code cache for this session. The
    * directory is not required to be created by the user before this call, the
    * runtime will create if it does not exist otherwise will use the existing
    * directory. If directory cannot be created, then code cache will not be used and
    * all operations related to code cache will fail silently inside the runtime. By
    * default, the directory will be `Code Cache` under the respective user data
    * folder.
    *
    * Note that by default code cache is only enabled for http(s) URLs, to enable code
    * cache for custom protocols, `codeCache: true` and `standard: true` must be
    * specified when registering the protocol.
    */
  def setCodeCachePath(path: String): Unit = js.native
  
  /**
    * Sets the handler which can be used to respond to device permission checks for
    * the `session`. Returning `true` will allow the device to be permitted and
    * `false` will reject it. To clear the handler, call
    * `setDevicePermissionHandler(null)`. This handler can be used to provide default
    * permissioning to devices without first calling for permission to devices (eg via
    * `navigator.hid.requestDevice`).  If this handler is not defined, the default
    * device permissions as granted through device selection (eg via
    * `navigator.hid.requestDevice`) will be used. Additionally, the default behavior
    * of Electron is to store granted device permission in memory. If longer term
    * storage is needed, a developer can store granted device permissions (eg when
    * handling the `select-hid-device` event) and then read from that storage with
    * `setDevicePermissionHandler`.
    */
  def setDevicePermissionHandler(): Unit = js.native
  def setDevicePermissionHandler(handler: js.Function1[/* details */ DevicePermissionHandlerHandlerDetails, Boolean]): Unit = js.native
  
  /**
    * This handler will be called when web content requests access to display media
    * via the `navigator.mediaDevices.getDisplayMedia` API. Use the desktopCapturer
    * API to choose which stream(s) to grant access to.
    *
    * `useSystemPicker` allows an application to use the system picker instead of
    * providing a specific video source from `getSources`. This option is
    * experimental, and currently available for MacOS 15+ only. If the system picker
    * is available and `useSystemPicker` is set to `true`, the handler will not be
    * invoked.
    *
    * Passing a WebFrameMain object as a video or audio stream will capture the video
    * or audio stream from that frame.
    *
    * Passing `null` instead of a function resets the handler to its default state.
    */
  def setDisplayMediaRequestHandler(): Unit = js.native
  def setDisplayMediaRequestHandler(
    handler: js.Function2[
      /* request */ DisplayMediaRequestHandlerHandlerRequest, 
      /* callback */ js.Function1[/* streams */ Streams, Unit], 
      Unit
    ]
  ): Unit = js.native
  def setDisplayMediaRequestHandler(
    handler: js.Function2[
      /* request */ DisplayMediaRequestHandlerHandlerRequest, 
      /* callback */ js.Function1[/* streams */ Streams, Unit], 
      Unit
    ],
    opts: DisplayMediaRequestHandlerOpts
  ): Unit = js.native
  def setDisplayMediaRequestHandler(handler: Null, opts: DisplayMediaRequestHandlerOpts): Unit = js.native
  
  /**
    * Sets download saving directory. By default, the download directory will be the
    * `Downloads` under the respective app folder.
    */
  def setDownloadPath(path: String): Unit = js.native
  
  /**
    * Sets the handler which can be used to respond to permission checks for the
    * `session`. Returning `true` will allow the permission and `false` will reject
    * it.  Please note that you must also implement `setPermissionRequestHandler` to
    * get complete permission handling. Most web APIs do a permission check and then
    * make a permission request if the check is denied. To clear the handler, call
    * `setPermissionCheckHandler(null)`.
    */
  def setPermissionCheckHandler(): Unit = js.native
  def setPermissionCheckHandler(
    handler: js.Function4[
      /* webContents */ WebContents_ | Null, 
      /* permission */ `clipboard-read` | `clipboard-sanitized-write` | geolocation | fullscreen | hid | `idle-detection` | media | mediaKeySystem | midi | midiSysex | notifications | openExternal | pointerLock | serial | `storage-access` | `top-level-storage-access` | usb | `deprecated-sync-clipboard-read`, 
      /* requestingOrigin */ String, 
      /* details */ PermissionCheckHandlerHandlerDetails, 
      Boolean
    ]
  ): Unit = js.native
  
  /**
    * Sets the handler which can be used to respond to permission requests for the
    * `session`. Calling `callback(true)` will allow the permission and
    * `callback(false)` will reject it. To clear the handler, call
    * `setPermissionRequestHandler(null)`.  Please note that you must also implement
    * `setPermissionCheckHandler` to get complete permission handling. Most web APIs
    * do a permission check and then make a permission request if the check is denied.
    */
  def setPermissionRequestHandler(): Unit = js.native
  def setPermissionRequestHandler(
    handler: js.Function4[
      /* webContents */ WebContents_, 
      /* permission */ `clipboard-read` | `clipboard-sanitized-write` | `display-capture` | fullscreen | geolocation | `idle-detection` | media | mediaKeySystem | midi | midiSysex | notifications | pointerLock | keyboardLock | openExternal | `speaker-selection` | `storage-access` | `top-level-storage-access` | `window-management` | unknown_ | fileSystem, 
      /* callback */ js.Function1[/* permissionGranted */ Boolean, Unit], 
      /* details */ PermissionRequest | FilesystemPermissionRequest | MediaAccessPermissionRequest | OpenExternalPermissionRequest, 
      Unit
    ]
  ): Unit = js.native
  
  /**
    * Adds scripts that will be executed on ALL web contents that are associated with
    * this session just before normal `preload` scripts run.
    *
    * **Deprecated:** Use the new `ses.registerPreloadScript` API.
    *
    * @deprecated
    */
  def setPreloads(preloads: js.Array[String]): Unit = js.native
  
  /**
    * Resolves when the proxy setting process is complete.
    *
    * Sets the proxy settings.
    *
    * You may need `ses.closeAllConnections` to close currently in flight connections
    * to prevent pooled sockets using previous proxy from being reused by future
    * requests.
    */
  def setProxy(config: ProxyConfig): js.Promise[Unit] = js.native
  
  /**
    * Sets the SSL configuration for the session. All subsequent network requests will
    * use the new configuration. Existing network connections (such as WebSocket
    * connections) will not be terminated, but old sockets in the pool will not be
    * reused for new connections.
    */
  def setSSLConfig(config: Config): Unit = js.native
  
  /**
    * By default Electron will download hunspell dictionaries from the Chromium CDN.
    * If you want to override this behavior you can use this API to point the
    * dictionary downloader at your own hosted version of the hunspell dictionaries.
    * We publish a `hunspell_dictionaries.zip` file with each release which contains
    * the files you need to host here.
    *
    * The file server must be **case insensitive**. If you cannot do this, you must
    * upload each file twice: once with the case it has in the ZIP file and once with
    * the filename as all lowercase.
    *
    * If the files present in `hunspell_dictionaries.zip` are available at
    * `https://example.com/dictionaries/language-code.bdic` then you should call this
    * api with
    * `ses.setSpellCheckerDictionaryDownloadURL('https://example.com/dictionaries/')`.
    *  Please note the trailing slash.  The URL to the dictionaries is formed as
    * `${url}${filename}`.
    *
    * > [!NOTE] On macOS, the OS spellchecker is used and therefore we do not download
    * any dictionary files. This API is a no-op on macOS.
    */
  def setSpellCheckerDictionaryDownloadURL(url: String): Unit = js.native
  
  /**
    * Sets whether to enable the builtin spell checker.
    */
  def setSpellCheckerEnabled(enable: Boolean): Unit = js.native
  
  /**
    * The built in spellchecker does not automatically detect what language a user is
    * typing in.  In order for the spell checker to correctly check their words you
    * must call this API with an array of language codes.  You can get the list of
    * supported language codes with the `ses.availableSpellCheckerLanguages` property.
    *
    * > [!NOTE] On macOS, the OS spellchecker is used and will detect your language
    * automatically. This API is a no-op on macOS.
    */
  def setSpellCheckerLanguages(languages: js.Array[String]): Unit = js.native
  
  /**
    * Sets the handler which can be used to override which USB classes are protected.
    * The return value for the handler is a string array of USB classes which should
    * be considered protected (eg not available in the renderer).  Valid values for
    * the array are:
    *
    * * `audio`
    * * `audio-video`
    * * `hid`
    * * `mass-storage`
    * * `smart-card`
    * * `video`
    * * `wireless`
    *
    * Returning an empty string array from the handler will allow all USB classes;
    * returning the passed in array will maintain the default list of protected USB
    * classes (this is also the default behavior if a handler is not defined). To
    * clear the handler, call `setUSBProtectedClassesHandler(null)`.
    */
  def setUSBProtectedClassesHandler(): Unit = js.native
  def setUSBProtectedClassesHandler(handler: js.Function1[/* details */ USBProtectedClassesHandlerHandlerDetails, js.Array[String]]): Unit = js.native
  
  /**
    * Overrides the `userAgent` and `acceptLanguages` for this session.
    *
    * The `acceptLanguages` must a comma separated ordered list of language codes, for
    * example `"en-US,fr,de,ko,zh-CN,ja"`.
    *
    * This doesn't affect existing `WebContents`, and each `WebContents` can use
    * `webContents.setUserAgent` to override the session-wide user agent.
    */
  def setUserAgent(userAgent: String): Unit = js.native
  def setUserAgent(userAgent: String, acceptLanguages: String): Unit = js.native
  
  /**
    * A `boolean` indicating whether builtin spell checker is enabled.
    */
  var spellCheckerEnabled: Boolean = js.native
  
  /**
    * A `string | null` indicating the absolute file system path where data for this
    * session is persisted on disk.  For in memory sessions this returns `null`.
    *
    */
  val storagePath: String | Null = js.native
  
  /**
    * Unregisters script.
    */
  def unregisterPreloadScript(id: String): Unit = js.native
  
  /**
    * A `WebRequest` object for this session.
    *
    */
  val webRequest: WebRequest = js.native
}
