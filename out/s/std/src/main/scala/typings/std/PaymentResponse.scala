package typings.std

import typings.std.stdStrings.payerdetailchange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This Payment Request API interface is returned after a user selects a payment method and approves a payment request.
  * Available only in secure contexts.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PaymentResponse)
  */
@js.native
trait PaymentResponse
  extends StObject
     with EventTarget {
  
  /* standard dom */
  @JSName("addEventListener")
  def addEventListener_payerdetailchange(
    `type`: payerdetailchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PaymentRequestUpdateEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_payerdetailchange(
    `type`: payerdetailchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PaymentRequestUpdateEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_payerdetailchange(
    `type`: payerdetailchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PaymentRequestUpdateEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PaymentResponse/complete) */
  /* standard dom */
  def complete(): js.Promise[Unit] = js.native
  def complete(result: PaymentComplete): js.Promise[Unit] = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PaymentResponse/details) */
  /* standard dom */
  val details: Any = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PaymentResponse/methodName) */
  /* standard dom */
  val methodName: java.lang.String = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PaymentResponse/payerdetailchange_event) */
  /* standard dom */
  var onpayerdetailchange: (js.ThisFunction1[/* this */ this.type, /* ev */ PaymentRequestUpdateEvent, Any]) | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PaymentResponse/payerEmail) */
  /* standard dom */
  val payerEmail: java.lang.String | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PaymentResponse/payerName) */
  /* standard dom */
  val payerName: java.lang.String | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PaymentResponse/payerPhone) */
  /* standard dom */
  val payerPhone: java.lang.String | Null = js.native
  
  /* standard dom */
  @JSName("removeEventListener")
  def removeEventListener_payerdetailchange(
    `type`: payerdetailchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PaymentRequestUpdateEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_payerdetailchange(
    `type`: payerdetailchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PaymentRequestUpdateEvent, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_payerdetailchange(
    `type`: payerdetailchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PaymentRequestUpdateEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PaymentResponse/requestId) */
  /* standard dom */
  val requestId: java.lang.String = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PaymentResponse/retry) */
  /* standard dom */
  def retry(): js.Promise[Unit] = js.native
  def retry(errorFields: PaymentValidationErrors): js.Promise[Unit] = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PaymentResponse/shippingAddress) */
  /* standard dom */
  val shippingAddress: PaymentAddress | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PaymentResponse/shippingOption) */
  /* standard dom */
  val shippingOption: java.lang.String | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PaymentResponse/toJSON) */
  /* standard dom */
  def toJSON(): Any = js.native
}
