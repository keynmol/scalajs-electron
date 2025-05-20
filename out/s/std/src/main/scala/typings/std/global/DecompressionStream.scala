package typings.std.global

import typings.std.BufferSource
import typings.std.CompressionFormat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("DecompressionStream")
@js.native
open class DecompressionStream protected ()
  extends StObject
     with typings.std.DecompressionStream {
  /* standard dom */
  def this(format: CompressionFormat) = this()
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CompressionStream/readable) */
  /* standard dom */
  /* CompleteClass */
  override val readable: org.scalajs.dom.ReadableStream[Any] = js.native
  /* standard dom */
  /* CompleteClass */
  @JSName("readable")
  override val readable_DecompressionStream: org.scalajs.dom.ReadableStream[js.typedarray.Uint8Array] = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/CompressionStream/writable) */
  /* standard dom */
  /* CompleteClass */
  override val writable: typings.std.WritableStream[Any] = js.native
  /* standard dom */
  /* CompleteClass */
  @JSName("writable")
  override val writable_DecompressionStream: typings.std.WritableStream[BufferSource] = js.native
}
