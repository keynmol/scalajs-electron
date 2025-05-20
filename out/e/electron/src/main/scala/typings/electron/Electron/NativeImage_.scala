package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NativeImage_ extends StObject {
  
  /**
    * Add an image representation for a specific scale factor. This can be used to
    * programmatically add different scale factor representations to an image. This
    * can be called on empty images.
    */
  def addRepresentation(options: AddRepresentationOptions): Unit = js.native
  
  /**
    * The cropped image.
    */
  def crop(rect: Rectangle): NativeImage_ = js.native
  
  /**
    * The image's aspect ratio (width divided by height).
    *
    * If `scaleFactor` is passed, this will return the aspect ratio corresponding to
    * the image representation most closely matching the passed value.
    */
  def getAspectRatio(): Double = js.native
  def getAspectRatio(scaleFactor: Double): Double = js.native
  
  /**
    * Legacy alias for `image.toBitmap()`.
    *
    * @deprecated
    */
  def getBitmap(): Unit = js.native
  def getBitmap(options: BitmapOptions): Unit = js.native
  
  /**
    * A Buffer that stores C pointer to underlying native handle of the image. On
    * macOS, a pointer to `NSImage` instance is returned.
    *
    * Notice that the returned pointer is a weak pointer to the underlying native
    * image instead of a copy, so you _must_ ensure that the associated `nativeImage`
    * instance is kept around.
    *
    * @platform darwin
    */
  def getNativeHandle(): Any = js.native
  
  /**
    * An array of all scale factors corresponding to representations for a given
    * `NativeImage`.
    */
  def getScaleFactors(): js.Array[Double] = js.native
  
  /**
    * If `scaleFactor` is passed, this will return the size corresponding to the image
    * representation most closely matching the passed value.
    */
  def getSize(): Size = js.native
  def getSize(scaleFactor: Double): Size = js.native
  
  /**
    * Whether the image is empty.
    */
  def isEmpty(): Boolean = js.native
  
  /**
    * A `boolean` property that determines whether the image is considered a template
    * image.
    *
    * Please note that this property only has an effect on macOS.
    *
    * @platform darwin
    */
  var isMacTemplateImage: Boolean = js.native
  
  /**
    * Whether the image is a macOS template image.
    */
  def isTemplateImage(): Boolean = js.native
  
  /**
    * The resized image.
    *
    * If only the `height` or the `width` are specified then the current aspect ratio
    * will be preserved in the resized image.
    */
  def resize(options: ResizeOptions): NativeImage_ = js.native
  
  /**
    * Marks the image as a macOS template image.
    */
  def setTemplateImage(option: Boolean): Unit = js.native
  
  /**
    * A Buffer that contains a copy of the image's raw bitmap pixel data.
    */
  def toBitmap(): Any = js.native
  def toBitmap(options: ToBitmapOptions): Any = js.native
  
  /**
    * The Data URL of the image.
    */
  def toDataURL(): String = js.native
  def toDataURL(options: ToDataURLOptions): String = js.native
  
  /**
    * A Buffer that contains the image's `JPEG` encoded data.
    */
  def toJPEG(quality: Double): Any = js.native
  
  /**
    * A Buffer that contains the image's `PNG` encoded data.
    */
  def toPNG(): Any = js.native
  def toPNG(options: ToPNGOptions): Any = js.native
}
