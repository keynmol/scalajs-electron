package typings.std.global

import typings.std.Int8ArrayConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("Int8Array")
@js.native
open class Int8Array[TArrayBuffer /* <: js.typedarray.ArrayBuffer */] protected ()
  extends StObject
     with typings.std.Int8Array[TArrayBuffer] {
  /* standard es5 */
  def this(buffer: TArrayBuffer) = this()
  def this(buffer: TArrayBuffer, byteOffset: Double) = this()
  def this(buffer: TArrayBuffer, byteOffset: Double, length: Double) = this()
  def this(buffer: TArrayBuffer, byteOffset: Unit, length: Double) = this()
}
object Int8Array {
  
  inline def apply: Int8ArrayConstructor = js.Dynamic.global.selectDynamic("Int8Array").asInstanceOf[Int8ArrayConstructor]
}
