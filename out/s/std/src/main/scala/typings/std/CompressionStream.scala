package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CompressionStream) */
trait CompressionStream
  extends StObject
     with GenericTransformStream {
  
  /* standard dom */
  @JSName("readable")
  val readable_CompressionStream: org.scalajs.dom.ReadableStream[js.typedarray.Uint8Array]
  
  /* standard dom */
  @JSName("writable")
  val writable_CompressionStream: WritableStream[BufferSource]
}
object CompressionStream {
  
  inline def apply(
    readable: org.scalajs.dom.ReadableStream[js.typedarray.Uint8Array],
    writable: WritableStream[BufferSource]
  ): CompressionStream = {
    val __obj = js.Dynamic.literal(readable = readable.asInstanceOf[js.Any], writable = writable.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompressionStream]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CompressionStream] (val x: Self) extends AnyVal {
    
    inline def setReadable(value: org.scalajs.dom.ReadableStream[js.typedarray.Uint8Array]): Self = StObject.set(x, "readable", value.asInstanceOf[js.Any])
    
    inline def setWritable(value: WritableStream[BufferSource]): Self = StObject.set(x, "writable", value.asInstanceOf[js.Any])
  }
}
