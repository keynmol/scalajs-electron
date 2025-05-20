package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @deprecated
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextEvent)
  */
@js.native
trait TextEvent
  extends StObject
     with UIEvent {
  
  /**
    * @deprecated
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextEvent/data)
    */
  /* standard dom */
  val data: java.lang.String = js.native
  
  /**
    * @deprecated
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextEvent/initTextEvent)
    */
  /* standard dom */
  def initTextEvent(`type`: java.lang.String): Unit = js.native
  def initTextEvent(`type`: java.lang.String, bubbles: scala.Boolean): Unit = js.native
  def initTextEvent(`type`: java.lang.String, bubbles: scala.Boolean, cancelable: scala.Boolean): Unit = js.native
  def initTextEvent(
    `type`: java.lang.String,
    bubbles: scala.Boolean,
    cancelable: scala.Boolean,
    view: org.scalajs.dom.Window
  ): Unit = js.native
  def initTextEvent(
    `type`: java.lang.String,
    bubbles: scala.Boolean,
    cancelable: scala.Boolean,
    view: org.scalajs.dom.Window,
    data: java.lang.String
  ): Unit = js.native
  def initTextEvent(
    `type`: java.lang.String,
    bubbles: scala.Boolean,
    cancelable: scala.Boolean,
    view: Null,
    data: java.lang.String
  ): Unit = js.native
  def initTextEvent(
    `type`: java.lang.String,
    bubbles: scala.Boolean,
    cancelable: scala.Boolean,
    view: Unit,
    data: java.lang.String
  ): Unit = js.native
  def initTextEvent(`type`: java.lang.String, bubbles: scala.Boolean, cancelable: Unit, view: org.scalajs.dom.Window): Unit = js.native
  def initTextEvent(
    `type`: java.lang.String,
    bubbles: scala.Boolean,
    cancelable: Unit,
    view: org.scalajs.dom.Window,
    data: java.lang.String
  ): Unit = js.native
  def initTextEvent(
    `type`: java.lang.String,
    bubbles: scala.Boolean,
    cancelable: Unit,
    view: Null,
    data: java.lang.String
  ): Unit = js.native
  def initTextEvent(
    `type`: java.lang.String,
    bubbles: scala.Boolean,
    cancelable: Unit,
    view: Unit,
    data: java.lang.String
  ): Unit = js.native
  def initTextEvent(`type`: java.lang.String, bubbles: Unit, cancelable: scala.Boolean): Unit = js.native
  def initTextEvent(`type`: java.lang.String, bubbles: Unit, cancelable: scala.Boolean, view: org.scalajs.dom.Window): Unit = js.native
  def initTextEvent(
    `type`: java.lang.String,
    bubbles: Unit,
    cancelable: scala.Boolean,
    view: org.scalajs.dom.Window,
    data: java.lang.String
  ): Unit = js.native
  def initTextEvent(
    `type`: java.lang.String,
    bubbles: Unit,
    cancelable: scala.Boolean,
    view: Null,
    data: java.lang.String
  ): Unit = js.native
  def initTextEvent(
    `type`: java.lang.String,
    bubbles: Unit,
    cancelable: scala.Boolean,
    view: Unit,
    data: java.lang.String
  ): Unit = js.native
  def initTextEvent(`type`: java.lang.String, bubbles: Unit, cancelable: Unit, view: org.scalajs.dom.Window): Unit = js.native
  def initTextEvent(
    `type`: java.lang.String,
    bubbles: Unit,
    cancelable: Unit,
    view: org.scalajs.dom.Window,
    data: java.lang.String
  ): Unit = js.native
  def initTextEvent(`type`: java.lang.String, bubbles: Unit, cancelable: Unit, view: Null, data: java.lang.String): Unit = js.native
  def initTextEvent(`type`: java.lang.String, bubbles: Unit, cancelable: Unit, view: Unit, data: java.lang.String): Unit = js.native
}
