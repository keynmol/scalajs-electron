package typings.std.global

import typings.std.Uint16ArrayConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("Uint16Array")
@js.native
open class Uint16Array[TArrayBuffer /* <: js.typedarray.ArrayBuffer */] protected ()
  extends StObject
     with typings.std.Uint16Array[TArrayBuffer] {
  /* standard es5 */
  def this(buffer: TArrayBuffer) = this()
  def this(buffer: TArrayBuffer, byteOffset: Double) = this()
  def this(buffer: TArrayBuffer, byteOffset: Double, length: Double) = this()
  def this(buffer: TArrayBuffer, byteOffset: Unit, length: Double) = this()
}
object Uint16Array {
  
  inline def apply: Uint16ArrayConstructor = js.Dynamic.global.selectDynamic("Uint16Array").asInstanceOf[Uint16ArrayConstructor]
}
