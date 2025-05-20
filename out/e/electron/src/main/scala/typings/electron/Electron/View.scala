package typings.electron.Electron

import typings.electron.electronStrings.`bounds-changed`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait View extends StObject {
  
  /**
    * If the same View is added to a parent which already contains it, it will be
    * reordered such that it becomes the topmost view.
    */
  def addChildView(view: View): Unit = js.native
  def addChildView(view: View, index: Double): Unit = js.native
  
  @JSName("addListener")
  def addListener_boundschanged(event: `bounds-changed`, listener: js.Function0[Unit]): this.type = js.native
  
  /**
    * A `View[]` property representing the child views of this view.
    *
    */
  val children: js.Array[View] = js.native
  
  /**
    * The bounds of this View, relative to its parent.
    */
  def getBounds(): Rectangle = js.native
  
  /**
    * Whether the view should be drawn. Note that this is different from whether the
    * view is visible on screen—it may still be obscured or out of view.
    */
  def getVisible(): Boolean = js.native
  
  @JSName("off")
  def off_boundschanged(event: `bounds-changed`, listener: js.Function0[Unit]): this.type = js.native
  
  // Docs: https://electronjs.org/docs/api/view
  /**
    * Emitted when the view's bounds have changed in response to being laid out. The
    * new bounds can be retrieved with `view.getBounds()`.
    */
  @JSName("on")
  def on_boundschanged(event: `bounds-changed`, listener: js.Function0[Unit]): this.type = js.native
  
  @JSName("once")
  def once_boundschanged(event: `bounds-changed`, listener: js.Function0[Unit]): this.type = js.native
  
  /**
    * If the view passed as a parameter is not a child of this view, this method is a
    * no-op.
    */
  def removeChildView(view: View): Unit = js.native
  
  @JSName("removeListener")
  def removeListener_boundschanged(event: `bounds-changed`, listener: js.Function0[Unit]): this.type = js.native
  
  /**
    * Examples of valid `color` values:
    *
    * * Hex
    *   * `#fff` (RGB)
    *   * `#ffff` (ARGB)
    *   * `#ffffff` (RRGGBB)
    *   * `#ffffffff` (AARRGGBB)
    * * RGB
    *   * `rgb\(([\d]+),\s*([\d]+),\s*([\d]+)\)`
    *     * e.g. `rgb(255, 255, 255)`
    * * RGBA
    *   * `rgba\(([\d]+),\s*([\d]+),\s*([\d]+),\s*([\d.]+)\)`
    *     * e.g. `rgba(255, 255, 255, 1.0)`
    * * HSL
    *   * `hsl\((-?[\d.]+),\s*([\d.]+)%,\s*([\d.]+)%\)`
    *     * e.g. `hsl(200, 20%, 50%)`
    * * HSLA
    *   * `hsla\((-?[\d.]+),\s*([\d.]+)%,\s*([\d.]+)%,\s*([\d.]+)\)`
    *     * e.g. `hsla(200, 20%, 50%, 0.5)`
    * * Color name
    *   * Options are listed in SkParseColor.cpp
    *   * Similar to CSS Color Module Level 3 keywords, but case-sensitive.
    *     * e.g. `blueviolet` or `red`
    *
    * > [!NOTE] Hex format with alpha takes `AARRGGBB` or `ARGB`, _not_ `RRGGBBAA` or
    * `RGB`.
    */
  def setBackgroundColor(color: String): Unit = js.native
  
  /**
    * > [!NOTE] The area cutout of the view's border still captures clicks.
    */
  def setBorderRadius(radius: Double): Unit = js.native
  
  def setBounds(bounds: Rectangle): Unit = js.native
  
  def setVisible(visible: Boolean): Unit = js.native
}
