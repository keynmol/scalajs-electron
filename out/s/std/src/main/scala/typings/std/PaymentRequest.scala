package typings.std

import typings.std.stdStrings.paymentmethodchange
import typings.std.stdStrings.shippingaddresschange
import typings.std.stdStrings.shippingoptionchange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This Payment Request API interface is the primary access point into the API, and lets web content and apps accept payments from the end user.
  * Available only in secure contexts.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PaymentRequest)
  */
@js.native
trait PaymentRequest
  extends StObject
     with EventTarget {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PaymentRequest/abort) */
  /* standard dom */
  def abort(): js.Promise[Unit] = js.native
  
  /* standard dom */
  @JSName("addEventListener")
  def addEventListener_paymentmethodchange(
    `type`: paymentmethodchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PaymentMethodChangeEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_paymentmethodchange(
    `type`: paymentmethodchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PaymentMethodChangeEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_paymentmethodchange(
    `type`: paymentmethodchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PaymentMethodChangeEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_shippingaddresschange(
    `type`: shippingaddresschange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PaymentRequestUpdateEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_shippingaddresschange(
    `type`: shippingaddresschange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PaymentRequestUpdateEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_shippingaddresschange(
    `type`: shippingaddresschange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PaymentRequestUpdateEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_shippingoptionchange(
    `type`: shippingoptionchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PaymentRequestUpdateEvent, Any]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_shippingoptionchange(
    `type`: shippingoptionchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PaymentRequestUpdateEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_shippingoptionchange(
    `type`: shippingoptionchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PaymentRequestUpdateEvent, Any],
    options: AddEventListenerOptions
  ): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PaymentRequest/canMakePayment) */
  /* standard dom */
  def canMakePayment(): js.Promise[scala.Boolean] = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PaymentRequest/id) */
  /* standard dom */
  val id: java.lang.String = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PaymentRequest/paymentmethodchange_event) */
  /* standard dom */
  var onpaymentmethodchange: (js.ThisFunction1[/* this */ this.type, /* ev */ PaymentMethodChangeEvent, Any]) | Null = js.native
  
  /**
    * @deprecated
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PaymentRequest/shippingaddresschange_event)
    */
  /* standard dom */
  var onshippingaddresschange: (js.ThisFunction1[/* this */ this.type, /* ev */ PaymentRequestUpdateEvent, Any]) | Null = js.native
  
  /**
    * @deprecated
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PaymentRequest/shippingoptionchange_event)
    */
  /* standard dom */
  var onshippingoptionchange: (js.ThisFunction1[/* this */ this.type, /* ev */ PaymentRequestUpdateEvent, Any]) | Null = js.native
  
  /* standard dom */
  @JSName("removeEventListener")
  def removeEventListener_paymentmethodchange(
    `type`: paymentmethodchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PaymentMethodChangeEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_paymentmethodchange(
    `type`: paymentmethodchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PaymentMethodChangeEvent, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_paymentmethodchange(
    `type`: paymentmethodchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PaymentMethodChangeEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_shippingaddresschange(
    `type`: shippingaddresschange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PaymentRequestUpdateEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_shippingaddresschange(
    `type`: shippingaddresschange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PaymentRequestUpdateEvent, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_shippingaddresschange(
    `type`: shippingaddresschange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PaymentRequestUpdateEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_shippingoptionchange(
    `type`: shippingoptionchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PaymentRequestUpdateEvent, Any]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_shippingoptionchange(
    `type`: shippingoptionchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PaymentRequestUpdateEvent, Any],
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_shippingoptionchange(
    `type`: shippingoptionchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PaymentRequestUpdateEvent, Any],
    options: scala.Boolean
  ): Unit = js.native
  
  /**
    * @deprecated
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PaymentRequest/shippingAddress)
    */
  /* standard dom */
  val shippingAddress: PaymentAddress | Null = js.native
  
  /**
    * @deprecated
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PaymentRequest/shippingOption)
    */
  /* standard dom */
  val shippingOption: java.lang.String | Null = js.native
  
  /**
    * @deprecated
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PaymentRequest/shippingType)
    */
  /* standard dom */
  val shippingType: PaymentShippingType | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/PaymentRequest/show) */
  /* standard dom */
  def show(): js.Promise[PaymentResponse] = js.native
  def show(detailsPromise: PaymentDetailsUpdate): js.Promise[PaymentResponse] = js.native
  def show(detailsPromise: PromiseLike[PaymentDetailsUpdate]): js.Promise[PaymentResponse] = js.native
}
