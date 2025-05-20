package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This Channel Messaging API interface represents one of the two ports of a MessageChannel, allowing messages to be sent from one port and listening out for them arriving at the other.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MessagePort)
  */
@js.native
trait MessagePort
  extends StObject
     with EventTarget
     with MessageEventTarget[org.scalajs.dom.MessagePort] {
  
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
  
  /**
    * Disconnects the port, so that it is no longer active.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MessagePort/close)
    */
  /* standard dom */
  def close(): Unit = js.native
  
  /* standard dom */
  def postMessage(message: Any): Unit = js.native
  def postMessage(message: Any, options: StructuredSerializeOptions): Unit = js.native
  /**
    * Posts a message through the channel. Objects listed in transfer are transferred, not just cloned, meaning that they are no longer usable on the sending side.
    *
    * Throws a "DataCloneError" DOMException if transfer contains duplicate objects or port, or if message could not be cloned.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MessagePort/postMessage)
    */
  /* standard dom */
  def postMessage(message: Any, transfer: js.Array[Transferable]): Unit = js.native
  
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
    * Begins dispatching messages received on the port.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MessagePort/start)
    */
  /* standard dom */
  def start(): Unit = js.native
}
