package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArrayBufferView[TArrayBuffer /* <: js.typedarray.ArrayBuffer */] extends StObject {
  
  /**
    * The ArrayBuffer instance referenced by the array.
    */
  /* standard es5 */
  val buffer: TArrayBuffer
  
  /**
    * The length in bytes of the array.
    */
  /* standard es5 */
  val byteLength: Double
  
  /**
    * The offset in bytes of the array.
    */
  /* standard es5 */
  val byteOffset: Double
}
object ArrayBufferView {
  
  inline def apply[TArrayBuffer /* <: js.typedarray.ArrayBuffer */](buffer: TArrayBuffer, byteLength: Double, byteOffset: Double): ArrayBufferView[TArrayBuffer] = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], byteLength = byteLength.asInstanceOf[js.Any], byteOffset = byteOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrayBufferView[TArrayBuffer]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ArrayBufferView[?], TArrayBuffer /* <: js.typedarray.ArrayBuffer */] (val x: Self & ArrayBufferView[TArrayBuffer]) extends AnyVal {
    
    inline def setBuffer(value: TArrayBuffer): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
    
    inline def setByteLength(value: Double): Self = StObject.set(x, "byteLength", value.asInstanceOf[js.Any])
    
    inline def setByteOffset(value: Double): Self = StObject.set(x, "byteOffset", value.asInstanceOf[js.Any])
  }
}
