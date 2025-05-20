package typings.std

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Uint32ArrayConstructor
  extends StObject
     with /* standard es2015.iterable */
/* standard es5 */
Instantiable1[
      (/* buffer */ js.typedarray.ArrayBuffer) | (/* array */ ArrayLike[Double]) | (/* length */ Double) | (/* elements */ js.Iterable[Double]), 
      js.typedarray.Uint32Array
    ]
     with Instantiable2[
      /* buffer */ js.typedarray.ArrayBuffer, 
      /* byteOffset */ Double, 
      js.typedarray.Uint32Array
    ]
     with Instantiable3[
      /* buffer */ js.typedarray.ArrayBuffer, 
      (/* byteOffset */ Double) | (/* byteOffset */ Unit), 
      /* length */ Double, 
      js.typedarray.Uint32Array
    ] {
  
  /**
    * The size in bytes of each element in the array.
    */
  /* standard es5 */
  val BYTES_PER_ELEMENT: Double = js.native
  
  /**
    * Creates an array from an array-like or iterable object.
    * @param arrayLike An array-like object to convert to an array.
    */
  /* standard es5 */
  def from(arrayLike: ArrayLike[Double]): js.typedarray.Uint32Array = js.native
  /**
    * Creates an array from an array-like or iterable object.
    * @param elements An iterable object to convert to an array.
    */
  /* standard es2015.iterable */
  def from(elements: js.Iterable[Double]): js.typedarray.Uint32Array = js.native
  /**
    * Creates an array from an array-like or iterable object.
    * @param arrayLike An array-like object to convert to an array.
    * @param mapfn A mapping function to call on every element of the array.
    * @param thisArg Value of 'this' used to invoke the mapfn.
    */
  /* standard es5 */
  def from[T](arrayLike: ArrayLike[T], mapfn: js.Function2[/* v */ T, /* k */ Double, Double]): js.typedarray.Uint32Array = js.native
  def from[T](arrayLike: ArrayLike[T], mapfn: js.Function2[/* v */ T, /* k */ Double, Double], thisArg: Any): js.typedarray.Uint32Array = js.native
  def from[T](elements: js.Iterable[T], mapfn: js.Function2[/* v */ T, /* k */ Double, Double]): js.typedarray.Uint32Array = js.native
  def from[T](elements: js.Iterable[T], mapfn: js.Function2[/* v */ T, /* k */ Double, Double], thisArg: Any): js.typedarray.Uint32Array = js.native
  def from[T](elements: js.Iterable[T], mapfn: Unit, thisArg: Any): js.typedarray.Uint32Array = js.native
  /**
    * Creates an array from an array-like or iterable object.
    * @param elements An iterable object to convert to an array.
    * @param mapfn A mapping function to call on every element of the array.
    * @param thisArg Value of 'this' used to invoke the mapfn.
    */
  /* standard es2015.iterable */
  @JSName("from")
  def from_T[T](elements: js.Iterable[T]): js.typedarray.Uint32Array = js.native
  
  /**
    * Returns a new array from a set of elements.
    * @param items A set of elements to include in the new array object.
    */
  /* standard es5 */
  def of(items: Double*): js.typedarray.Uint32Array = js.native
}
