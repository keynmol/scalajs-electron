package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WindowOrWorkerGlobalScope extends StObject {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/atob) */
  /* standard dom */
  def atob(data: java.lang.String): java.lang.String = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/btoa) */
  /* standard dom */
  def btoa(data: java.lang.String): java.lang.String = js.native
  
  /**
    * Available only in secure contexts.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/caches)
    */
  /* standard dom */
  val caches: org.scalajs.dom.CacheStorage = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/clearInterval) */
  /* standard dom */
  def clearInterval(): Unit = js.native
  def clearInterval(id: Double): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/clearTimeout) */
  /* standard dom */
  def clearTimeout(): Unit = js.native
  def clearTimeout(id: Double): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/createImageBitmap) */
  /* standard dom */
  def createImageBitmap(image: ImageBitmapSource): js.Promise[ImageBitmap] = js.native
  def createImageBitmap(image: ImageBitmapSource, options: ImageBitmapOptions): js.Promise[ImageBitmap] = js.native
  /* standard dom */
  def createImageBitmap(image: ImageBitmapSource, sx: Double, sy: Double, sw: Double, sh: Double): js.Promise[ImageBitmap] = js.native
  def createImageBitmap(
    image: ImageBitmapSource,
    sx: Double,
    sy: Double,
    sw: Double,
    sh: Double,
    options: ImageBitmapOptions
  ): js.Promise[ImageBitmap] = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/crossOriginIsolated) */
  /* standard dom */
  val crossOriginIsolated: scala.Boolean = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/crypto) */
  /* standard dom */
  val crypto: org.scalajs.dom.Crypto = js.native
  
  def fetch(input: org.scalajs.dom.URL): js.Promise[org.scalajs.dom.Response] = js.native
  def fetch(input: org.scalajs.dom.URL, init: org.scalajs.dom.RequestInit): js.Promise[org.scalajs.dom.Response] = js.native
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/fetch) */
  /* standard dom */
  def fetch(input: RequestInfo): js.Promise[org.scalajs.dom.Response] = js.native
  def fetch(input: RequestInfo, init: org.scalajs.dom.RequestInit): js.Promise[org.scalajs.dom.Response] = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/indexedDB) */
  /* standard dom */
  val indexedDB: org.scalajs.dom.IDBFactory = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/isSecureContext) */
  /* standard dom */
  val isSecureContext: scala.Boolean = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/origin) */
  /* standard dom */
  val origin: java.lang.String = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/performance) */
  /* standard dom */
  val performance: org.scalajs.dom.Performance = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/queueMicrotask) */
  /* standard dom */
  def queueMicrotask(callback: VoidFunction): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/reportError) */
  /* standard dom */
  def reportError(e: Any): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/setInterval) */
  /* standard dom */
  def setInterval(handler: TimerHandler, timeout: Double, arguments: Any*): Double = js.native
  def setInterval(handler: TimerHandler, timeout: Unit, arguments: Any*): Double = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/setTimeout) */
  /* standard dom */
  def setTimeout(handler: TimerHandler, timeout: Double, arguments: Any*): Double = js.native
  def setTimeout(handler: TimerHandler, timeout: Unit, arguments: Any*): Double = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/structuredClone) */
  /* standard dom */
  def structuredClone[T](value: T): T = js.native
  def structuredClone[T](value: T, options: StructuredSerializeOptions): T = js.native
}
