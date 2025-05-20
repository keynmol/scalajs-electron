package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReadonlyMap[K, V] extends StObject {
  
  /**
    * Returns an iterable of key, value pairs for every entry in the map.
    */
  /* standard es2015.iterable */
  def entries(): MapIterator[js.Tuple2[K, V]] = js.native
  
  /* standard es2015.collection */
  def forEach(callbackfn: js.Function3[/* value */ V, /* key */ K, /* map */ ReadonlyMap[K, V], Unit]): Unit = js.native
  def forEach(
    callbackfn: js.Function3[/* value */ V, /* key */ K, /* map */ ReadonlyMap[K, V], Unit],
    thisArg: Any
  ): Unit = js.native
  
  /* standard es2015.collection */
  def get(key: K): js.UndefOr[V] = js.native
  
  /* standard es2015.collection */
  def has(key: K): scala.Boolean = js.native
  
  /** Returns an iterable of entries in the map. */
  /* standard es2015.iterable */
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[MapIterator[js.Tuple2[K, V]]] = js.native
  
  /**
    * Returns an iterable of keys in the map
    */
  /* standard es2015.iterable */
  def keys(): MapIterator[K] = js.native
  
  /* standard es2015.collection */
  val size: Double = js.native
  
  /**
    * Returns an iterable of values in the map
    */
  /* standard es2015.iterable */
  def values(): MapIterator[V] = js.native
}
