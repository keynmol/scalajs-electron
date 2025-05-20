package typings.std.global

import typings.std.AllowSharedBufferSource
import typings.std.EncodedAudioChunkInit
import typings.std.EncodedAudioChunkType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("EncodedAudioChunk")
@js.native
open class EncodedAudioChunk protected ()
  extends StObject
     with typings.std.EncodedAudioChunk {
  /* standard dom */
  def this(init: EncodedAudioChunkInit) = this()
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/EncodedAudioChunk/byteLength) */
  /* standard dom */
  /* CompleteClass */
  override val byteLength: Double = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/EncodedAudioChunk/copyTo) */
  /* standard dom */
  /* CompleteClass */
  override def copyTo(destination: AllowSharedBufferSource): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/EncodedAudioChunk/duration) */
  /* standard dom */
  /* CompleteClass */
  override val duration: Double | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/EncodedAudioChunk/timestamp) */
  /* standard dom */
  /* CompleteClass */
  override val timestamp: Double = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/EncodedAudioChunk/type) */
  /* standard dom */
  /* CompleteClass */
  override val `type`: EncodedAudioChunkType = js.native
}
