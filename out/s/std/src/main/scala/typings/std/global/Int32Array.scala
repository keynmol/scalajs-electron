package typings.std.global

import typings.std.Int32ArrayConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("Int32Array")
@js.native
open class Int32Array[TArrayBuffer /* <: js.typedarray.ArrayBuffer */] protected ()
  extends StObject
     with typings.std.Int32Array[TArrayBuffer] {
  /* standard es5 */
  def this(buffer: TArrayBuffer) = this()
  def this(buffer: TArrayBuffer, byteOffset: Double) = this()
  def this(buffer: TArrayBuffer, byteOffset: Double, length: Double) = this()
  def this(buffer: TArrayBuffer, byteOffset: Unit, length: Double) = this()
}
object Int32Array {
  
  inline def apply: Int32ArrayConstructor = js.Dynamic.global.selectDynamic("Int32Array").asInstanceOf[Int32ArrayConstructor]
}
