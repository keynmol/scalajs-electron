package typings.std.global

import typings.std.ImageDecoderInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("ImageDecoder")
@js.native
open class ImageDecoder protected ()
  extends StObject
     with typings.std.ImageDecoder {
  /* standard dom */
  def this(init: ImageDecoderInit) = this()
}
object ImageDecoder {
  
  @JSGlobal("ImageDecoder")
  @js.native
  val ^ : js.Any = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/ImageDecoder/isTypeSupported_static) */
  /* standard dom */
  inline def isTypeSupported(`type`: java.lang.String): js.Promise[scala.Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isTypeSupported")(`type`.asInstanceOf[js.Any]).asInstanceOf[js.Promise[scala.Boolean]]
}
