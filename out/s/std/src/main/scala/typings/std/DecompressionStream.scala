package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DecompressionStream) */
trait DecompressionStream
  extends StObject
     with GenericTransformStream {
  
  /* standard dom */
  @JSName("readable")
  val readable_DecompressionStream: org.scalajs.dom.ReadableStream[js.typedarray.Uint8Array]
  
  /* standard dom */
  @JSName("writable")
  val writable_DecompressionStream: WritableStream[BufferSource]
}
object DecompressionStream {
  
  inline def apply(
    readable: org.scalajs.dom.ReadableStream[js.typedarray.Uint8Array],
    writable: WritableStream[BufferSource]
  ): DecompressionStream = {
    val __obj = js.Dynamic.literal(readable = readable.asInstanceOf[js.Any], writable = writable.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecompressionStream]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DecompressionStream] (val x: Self) extends AnyVal {
    
    inline def setReadable(value: org.scalajs.dom.ReadableStream[js.typedarray.Uint8Array]): Self = StObject.set(x, "readable", value.asInstanceOf[js.Any])
    
    inline def setWritable(value: WritableStream[BufferSource]): Self = StObject.set(x, "writable", value.asInstanceOf[js.Any])
  }
}
