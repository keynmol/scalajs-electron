package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This EncryptedMediaExtensions API interface is a read-only map of media key statuses by key IDs.
  * Available only in secure contexts.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaKeyStatusMap)
  */
@js.native
trait MediaKeyStatusMap extends StObject {
  
  /* standard dom.iterable */
  def entries(): MediaKeyStatusMapIterator[js.Tuple2[BufferSource, MediaKeyStatus]] = js.native
  
  /* standard dom */
  def forEach(
    callbackfn: js.Function3[/* value */ MediaKeyStatus, /* key */ BufferSource, /* parent */ this.type, Unit]
  ): Unit = js.native
  def forEach(
    callbackfn: js.Function3[/* value */ MediaKeyStatus, /* key */ BufferSource, /* parent */ this.type, Unit],
    thisArg: Any
  ): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaKeyStatusMap/get) */
  /* standard dom */
  def get(keyId: BufferSource): js.UndefOr[MediaKeyStatus] = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaKeyStatusMap/has) */
  /* standard dom */
  def has(keyId: BufferSource): scala.Boolean = js.native
  
  /* standard dom.iterable */
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[MediaKeyStatusMapIterator[js.Tuple2[BufferSource, MediaKeyStatus]]] = js.native
  
  /* standard dom.iterable */
  def keys(): MediaKeyStatusMapIterator[BufferSource] = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaKeyStatusMap/size) */
  /* standard dom */
  val size: Double = js.native
  
  /* standard dom.iterable */
  def values(): MediaKeyStatusMapIterator[MediaKeyStatus] = js.native
}
