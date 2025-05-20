package typings.std

import typings.std.stdStrings.midimessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Available only in secure contexts.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MIDIInput)
  */
@js.native
trait MIDIInput
  extends StObject
     with MIDIPort {
  
  /* standard dom */
  @JSName("addEventListener")
  def addEventListener_midimessage(
    `type`: midimessage,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MIDIMessageEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_midimessage(
    `type`: midimessage,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MIDIMessageEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_midimessage(
    `type`: midimessage,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MIDIMessageEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/MIDIInput/midimessage_event) */
  /* standard dom */
  var onmidimessage: (js.ThisFunction1[/* this */ this.type, /* ev */ MIDIMessageEvent, Any]) | Null = js.native
  
  /* standard dom */
  @JSName("removeEventListener")
  def removeEventListener_midimessage(
    `type`: midimessage,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MIDIMessageEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_midimessage(
    `type`: midimessage,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MIDIMessageEvent, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_midimessage(
    `type`: midimessage,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MIDIMessageEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
}
