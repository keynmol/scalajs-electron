package typings.std.global

import typings.std.Float64ArrayConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("Float64Array")
@js.native
open class Float64Array[TArrayBuffer /* <: js.typedarray.ArrayBuffer */] protected ()
  extends StObject
     with typings.std.Float64Array[TArrayBuffer] {
  /* standard es5 */
  def this(buffer: TArrayBuffer) = this()
  def this(buffer: TArrayBuffer, byteOffset: Double) = this()
  def this(buffer: TArrayBuffer, byteOffset: Double, length: Double) = this()
  def this(buffer: TArrayBuffer, byteOffset: Unit, length: Double) = this()
}
object Float64Array {
  
  inline def apply: Float64ArrayConstructor = js.Dynamic.global.selectDynamic("Float64Array").asInstanceOf[Float64ArrayConstructor]
}
