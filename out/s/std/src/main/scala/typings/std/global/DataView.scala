package typings.std.global

import typings.std.DataViewConstructor
import typings.std.anon.BYTESPERELEMENT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("DataView")
@js.native
open class DataView[TArrayBuffer /* <: js.typedarray.ArrayBuffer & BYTESPERELEMENT */] protected ()
  extends StObject
     with typings.std.DataView[TArrayBuffer] {
  /* standard es5 */
  def this(buffer: TArrayBuffer) = this()
  def this(buffer: TArrayBuffer, byteOffset: Double) = this()
  def this(buffer: TArrayBuffer, byteOffset: Double, byteLength: Double) = this()
  def this(buffer: TArrayBuffer, byteOffset: Unit, byteLength: Double) = this()
}
object DataView {
  
  inline def apply: DataViewConstructor = js.Dynamic.global.selectDynamic("DataView").asInstanceOf[DataViewConstructor]
}
