package typings.std

import typings.std.stdStrings.auto
import typings.std.stdStrings.high
import typings.std.stdStrings.low
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * HTML <script> elements expose the HTMLScriptElement interface, which provides special properties and methods for manipulating the behavior and execution of <script> elements (beyond the inherited HTMLElement interface).
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLScriptElement)
  */
@js.native
trait HTMLScriptElement
  extends StObject
     with HTMLElement {
  
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, callback: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, callback: EventListenerOrEventListenerObject, options: scala.Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(
    `type`: java.lang.String,
    callback: EventListenerOrEventListenerObject,
    options: AddEventListenerOptions
  ): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLScriptElement/async) */
  /* standard dom */
  var async: scala.Boolean = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLScriptElement/blocking) */
  /* standard dom */
  def blocking: org.scalajs.dom.DOMTokenList = js.native
  /* standard dom */
  def blocking_=(value: java.lang.String): Unit = js.native
  
  /**
    * Sets or retrieves the character set used to encode the object.
    * @deprecated
    */
  /* standard dom */
  var charset: java.lang.String = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLScriptElement/crossOrigin) */
  /* standard dom */
  var crossOrigin: java.lang.String | Null = js.native
  
  /**
    * Sets or retrieves the status of the script.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLScriptElement/defer)
    */
  /* standard dom */
  var defer: scala.Boolean = js.native
  
  /**
    * Sets or retrieves the event for which the script is written.
    * @deprecated
    */
  /* standard dom */
  var event: java.lang.String = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLScriptElement/fetchPriority) */
  /* standard dom */
  var fetchPriority: high | low | auto = js.native
  
  /**
    * Sets or retrieves the object that is bound to the event script.
    * @deprecated
    */
  /* standard dom */
  var htmlFor: java.lang.String = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLScriptElement/integrity) */
  /* standard dom */
  var integrity: java.lang.String = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLScriptElement/noModule) */
  /* standard dom */
  var noModule: scala.Boolean = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLScriptElement/referrerPolicy) */
  /* standard dom */
  var referrerPolicy: java.lang.String = js.native
  
  /* InferMemberOverrides */
  override def removeEventListener(`type`: java.lang.String, callback: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(
    `type`: java.lang.String,
    callback: EventListenerOrEventListenerObject,
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: java.lang.String, callback: EventListenerOrEventListenerObject, options: scala.Boolean): Unit = js.native
  
  /**
    * Retrieves the URL to an external file that contains the source code or data.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLScriptElement/src)
    */
  /* standard dom */
  var src: java.lang.String = js.native
  
  /**
    * Retrieves or sets the text of the object as a string.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLScriptElement/text)
    */
  /* standard dom */
  var text: java.lang.String = js.native
  
  /**
    * Sets or retrieves the MIME type for the associated scripting engine.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLScriptElement/type)
    */
  /* standard dom */
  var `type`: java.lang.String = js.native
}
