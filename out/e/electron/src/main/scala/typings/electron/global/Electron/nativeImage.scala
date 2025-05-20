package typings.electron.global.Electron

import typings.electron.Electron.CreateFromBitmapOptions
import typings.electron.Electron.CreateFromBufferOptions
import typings.electron.Electron.Size
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* was `typeof NativeImage` */
@JSGlobal("Electron.nativeImage")
@js.native
open class nativeImage ()
  extends StObject
     with typings.electron.Electron.NativeImage_
/* was `typeof NativeImage` */
object nativeImage {
  
  @JSGlobal("Electron.nativeImage")
  @js.native
  val ^ : js.Any = js.native
  
  // Docs: https://electronjs.org/docs/api/native-image
  /**
    * Creates an empty `NativeImage` instance.
    */
  /* static member */
  inline def createEmpty(): typings.electron.Electron.NativeImage_ = ^.asInstanceOf[js.Dynamic].applyDynamic("createEmpty")().asInstanceOf[typings.electron.Electron.NativeImage_]
  
  /**
    * Creates a new `NativeImage` instance from `buffer` that contains the raw bitmap
    * pixel data returned by `toBitmap()`. The specific format is platform-dependent.
    */
  /* static member */
  inline def createFromBitmap(
    buffer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Buffer */ Any,
    options: CreateFromBitmapOptions
  ): typings.electron.Electron.NativeImage_ = (^.asInstanceOf[js.Dynamic].applyDynamic("createFromBitmap")(buffer.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.electron.Electron.NativeImage_]
  
  /**
    * Creates a new `NativeImage` instance from `buffer`. Tries to decode as PNG or
    * JPEG first.
    */
  /* static member */
  inline def createFromBuffer(
    buffer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Buffer */ Any
  ): typings.electron.Electron.NativeImage_ = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromBuffer")(buffer.asInstanceOf[js.Any]).asInstanceOf[typings.electron.Electron.NativeImage_]
  inline def createFromBuffer(
    buffer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Buffer */ Any,
    options: CreateFromBufferOptions
  ): typings.electron.Electron.NativeImage_ = (^.asInstanceOf[js.Dynamic].applyDynamic("createFromBuffer")(buffer.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.electron.Electron.NativeImage_]
  
  /**
    * Creates a new `NativeImage` instance from `dataUrl`, a base 64 encoded Data URL
    * string.
    */
  /* static member */
  inline def createFromDataURL(dataURL: String): typings.electron.Electron.NativeImage_ = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromDataURL")(dataURL.asInstanceOf[js.Any]).asInstanceOf[typings.electron.Electron.NativeImage_]
  
  /**
    * Creates a new `NativeImage` instance from the `NSImage` that maps to the given
    * image name. See Apple's `NSImageName` documentation for a list of possible
    * values.
    *
    * The `hslShift` is applied to the image with the following rules:
    *
    * * `hsl_shift[0]` (hue): The absolute hue value for the image - 0 and 1 map to 0
    * and 360 on the hue color wheel (red).
    * * `hsl_shift[1]` (saturation): A saturation shift for the image, with the
    * following key values: 0 = remove all color. 0.5 = leave unchanged. 1 = fully
    * saturate the image.
    * * `hsl_shift[2]` (lightness): A lightness shift for the image, with the
    * following key values: 0 = remove all lightness (make all pixels black). 0.5 =
    * leave unchanged. 1 = full lightness (make all pixels white).
    *
    * This means that `[-1, 0, 1]` will make the image completely white and `[-1, 1,
    * 0]` will make the image completely black.
    *
    * In some cases, the `NSImageName` doesn't match its string representation; one
    * example of this is `NSFolderImageName`, whose string representation would
    * actually be `NSFolder`. Therefore, you'll need to determine the correct string
    * representation for your image before passing it in. This can be done with the
    * following:
    *
    * where `SYSTEM_IMAGE_NAME` should be replaced with any value from this list.
    *
    * @platform darwin
    */
  /* static member */
  inline def createFromNamedImage(imageName: String): typings.electron.Electron.NativeImage_ = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromNamedImage")(imageName.asInstanceOf[js.Any]).asInstanceOf[typings.electron.Electron.NativeImage_]
  inline def createFromNamedImage(imageName: String, hslShift: js.Array[Double]): typings.electron.Electron.NativeImage_ = (^.asInstanceOf[js.Dynamic].applyDynamic("createFromNamedImage")(imageName.asInstanceOf[js.Any], hslShift.asInstanceOf[js.Any])).asInstanceOf[typings.electron.Electron.NativeImage_]
  
  /**
    * Creates a new `NativeImage` instance from an image file (e.g., PNG or JPEG)
    * located at `path`. This method returns an empty image if the `path` does not
    * exist, cannot be read, or is not a valid image.
    */
  /* static member */
  inline def createFromPath(path: String): typings.electron.Electron.NativeImage_ = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromPath")(path.asInstanceOf[js.Any]).asInstanceOf[typings.electron.Electron.NativeImage_]
  
  /**
    * fulfilled with the file's thumbnail preview image, which is a NativeImage.
    *
    * > [!NOTE] Windows implementation will ignore `size.height` and scale the height
    * according to `size.width`.
    *
    * @platform darwin,win32
    */
  /* static member */
  inline def createThumbnailFromPath(path: String, size: Size): js.Promise[typings.electron.Electron.NativeImage_] = (^.asInstanceOf[js.Dynamic].applyDynamic("createThumbnailFromPath")(path.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.electron.Electron.NativeImage_]]
}
