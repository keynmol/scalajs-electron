package typings.std.global

import typings.std.AllowSharedBufferSource
import typings.std.AudioDataCopyToOptions
import typings.std.AudioDataInit
import typings.std.AudioSampleFormat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("AudioData")
@js.native
open class AudioData protected ()
  extends StObject
     with typings.std.AudioData {
  /* standard dom */
  def this(init: AudioDataInit) = this()
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioData/allocationSize) */
  /* standard dom */
  /* CompleteClass */
  override def allocationSize(options: AudioDataCopyToOptions): Double = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioData/close) */
  /* standard dom */
  /* CompleteClass */
  override def close(): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioData/copyTo) */
  /* standard dom */
  /* CompleteClass */
  override def copyTo(destination: AllowSharedBufferSource, options: AudioDataCopyToOptions): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioData/duration) */
  /* standard dom */
  /* CompleteClass */
  override val duration: Double = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioData/format) */
  /* standard dom */
  /* CompleteClass */
  override val format: AudioSampleFormat | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioData/numberOfChannels) */
  /* standard dom */
  /* CompleteClass */
  override val numberOfChannels: Double = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioData/numberOfFrames) */
  /* standard dom */
  /* CompleteClass */
  override val numberOfFrames: Double = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioData/sampleRate) */
  /* standard dom */
  /* CompleteClass */
  override val sampleRate: Double = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioData/timestamp) */
  /* standard dom */
  /* CompleteClass */
  override val timestamp: Double = js.native
}
