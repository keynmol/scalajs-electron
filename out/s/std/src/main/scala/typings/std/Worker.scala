package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This Web Workers API interface represents a background task that can be easily created and can send messages back to its creator. Creating a worker is as simple as calling the Worker() constructor and specifying a script to be run in the worker thread.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Worker)
  */
@js.native
trait Worker
  extends StObject
     with EventTarget
     with AbstractWorker
     with MessageEventTarget[org.scalajs.dom.Worker] {
  
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
  
  /* standard dom */
  def postMessage(message: Any): Unit = js.native
  def postMessage(message: Any, options: StructuredSerializeOptions): Unit = js.native
  /**
    * Clones message and transmits it to worker's global environment. transfer can be passed as a list of objects that are to be transferred rather than cloned.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Worker/postMessage)
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
    * Aborts worker's associated global environment.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Worker/terminate)
    */
  /* standard dom */
  def terminate(): Unit = js.native
}
