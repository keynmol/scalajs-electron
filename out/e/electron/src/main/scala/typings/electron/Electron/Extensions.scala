package typings.electron.Electron

import typings.electron.electronStrings.`extension-loaded`
import typings.electron.electronStrings.`extension-ready`
import typings.electron.electronStrings.`extension-unloaded`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Extensions extends StObject {
  
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
  
  /**
    * A list of all loaded extensions.
    *
    * > [!NOTE] This API cannot be called before the `ready` event of the `app` module
    * is emitted.
    */
  def getAllExtensions(): js.Array[Extension] = js.native
  
  /**
    * The loaded extension with the given ID.
    *
    * > [!NOTE] This API cannot be called before the `ready` event of the `app` module
    * is emitted.
    */
  def getExtension(extensionId: String): Extension | Null = js.native
  
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
    */
  def loadExtension(path: String): js.Promise[Extension] = js.native
  def loadExtension(path: String, options: LoadExtensionOptions): js.Promise[Extension] = js.native
  
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
  
  // Docs: https://electronjs.org/docs/api/extensions-api
  /**
    * Emitted after an extension is loaded. This occurs whenever an extension is added
    * to the "enabled" set of extensions. This includes:
    *
    * * Extensions being loaded from `Extensions.loadExtension`.
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
  
  /**
    * Unloads an extension.
    *
    * > [!NOTE] This API cannot be called before the `ready` event of the `app` module
    * is emitted.
    */
  def removeExtension(extensionId: String): Unit = js.native
  
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
}
