package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaymentRequestEventMap extends StObject {
  
  /* standard dom */
  var paymentmethodchange: PaymentMethodChangeEvent
  
  /* standard dom */
  var shippingaddresschange: PaymentRequestUpdateEvent
  
  /* standard dom */
  var shippingoptionchange: PaymentRequestUpdateEvent
}
object PaymentRequestEventMap {
  
  inline def apply(
    paymentmethodchange: PaymentMethodChangeEvent,
    shippingaddresschange: PaymentRequestUpdateEvent,
    shippingoptionchange: PaymentRequestUpdateEvent
  ): PaymentRequestEventMap = {
    val __obj = js.Dynamic.literal(paymentmethodchange = paymentmethodchange.asInstanceOf[js.Any], shippingaddresschange = shippingaddresschange.asInstanceOf[js.Any], shippingoptionchange = shippingoptionchange.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentRequestEventMap]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PaymentRequestEventMap] (val x: Self) extends AnyVal {
    
    inline def setPaymentmethodchange(value: PaymentMethodChangeEvent): Self = StObject.set(x, "paymentmethodchange", value.asInstanceOf[js.Any])
    
    inline def setShippingaddresschange(value: PaymentRequestUpdateEvent): Self = StObject.set(x, "shippingaddresschange", value.asInstanceOf[js.Any])
    
    inline def setShippingoptionchange(value: PaymentRequestUpdateEvent): Self = StObject.set(x, "shippingoptionchange", value.asInstanceOf[js.Any])
  }
}
