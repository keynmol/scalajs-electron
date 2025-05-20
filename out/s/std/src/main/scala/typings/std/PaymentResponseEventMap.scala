package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaymentResponseEventMap extends StObject {
  
  /* standard dom */
  var payerdetailchange: PaymentRequestUpdateEvent
}
object PaymentResponseEventMap {
  
  inline def apply(payerdetailchange: PaymentRequestUpdateEvent): PaymentResponseEventMap = {
    val __obj = js.Dynamic.literal(payerdetailchange = payerdetailchange.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentResponseEventMap]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PaymentResponseEventMap] (val x: Self) extends AnyVal {
    
    inline def setPayerdetailchange(value: PaymentRequestUpdateEvent): Self = StObject.set(x, "payerdetailchange", value.asInstanceOf[js.Any])
  }
}
