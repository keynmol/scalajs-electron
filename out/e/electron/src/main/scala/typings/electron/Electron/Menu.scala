package typings.electron.Electron

import typings.electron.electronStrings.`menu-will-close`
import typings.electron.electronStrings.`menu-will-show`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Menu extends StObject {
  
  @JSName("addListener")
  def addListener_menuwillclose(event: `menu-will-close`, listener: js.Function1[/* event */ Event[js.Object], Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_menuwillshow(event: `menu-will-show`, listener: js.Function1[/* event */ Event[js.Object], Unit]): this.type = js.native
  
  /**
    * Appends the `menuItem` to the menu.
    */
  def append(menuItem: MenuItem): Unit = js.native
  
  /**
    * Closes the context menu in the `window`.
    */
  def closePopup(): Unit = js.native
  def closePopup(window: BaseWindow): Unit = js.native
  
  /**
    * the item with the specified `id`
    */
  def getMenuItemById(id: String): MenuItem | Null = js.native
  
  /**
    * Inserts the `menuItem` to the `pos` position of the menu.
    */
  def insert(pos: Double, menuItem: MenuItem): Unit = js.native
  
  /**
    * A `MenuItem[]` array containing the menu's items.
    *
    * Each `Menu` consists of multiple `MenuItem`s and each `MenuItem` can have a
    * submenu.
    */
  var items: js.Array[MenuItem] = js.native
  
  @JSName("off")
  def off_menuwillclose(event: `menu-will-close`, listener: js.Function1[/* event */ Event[js.Object], Unit]): this.type = js.native
  @JSName("off")
  def off_menuwillshow(event: `menu-will-show`, listener: js.Function1[/* event */ Event[js.Object], Unit]): this.type = js.native
  
  // Docs: https://electronjs.org/docs/api/menu
  /**
    * Emitted when a popup is closed either manually or with `menu.closePopup()`.
    */
  @JSName("on")
  def on_menuwillclose(event: `menu-will-close`, listener: js.Function1[/* event */ Event[js.Object], Unit]): this.type = js.native
  /**
    * Emitted when `menu.popup()` is called.
    */
  @JSName("on")
  def on_menuwillshow(event: `menu-will-show`, listener: js.Function1[/* event */ Event[js.Object], Unit]): this.type = js.native
  
  @JSName("once")
  def once_menuwillclose(event: `menu-will-close`, listener: js.Function1[/* event */ Event[js.Object], Unit]): this.type = js.native
  @JSName("once")
  def once_menuwillshow(event: `menu-will-show`, listener: js.Function1[/* event */ Event[js.Object], Unit]): this.type = js.native
  
  /**
    * Pops up this menu as a context menu in the `BaseWindow`.
    */
  def popup(): Unit = js.native
  def popup(options: PopupOptions): Unit = js.native
  
  @JSName("removeListener")
  def removeListener_menuwillclose(event: `menu-will-close`, listener: js.Function1[/* event */ Event[js.Object], Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_menuwillshow(event: `menu-will-show`, listener: js.Function1[/* event */ Event[js.Object], Unit]): this.type = js.native
}
