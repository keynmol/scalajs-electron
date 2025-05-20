package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityPolicyViolationEventInit
  extends StObject
     with EventInit {
  
  /* standard dom */
  var blockedURI: js.UndefOr[java.lang.String] = js.undefined
  
  /* standard dom */
  var columnNumber: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var disposition: js.UndefOr[SecurityPolicyViolationEventDisposition] = js.undefined
  
  /* standard dom */
  var documentURI: js.UndefOr[java.lang.String] = js.undefined
  
  /* standard dom */
  var effectiveDirective: js.UndefOr[java.lang.String] = js.undefined
  
  /* standard dom */
  var lineNumber: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var originalPolicy: js.UndefOr[java.lang.String] = js.undefined
  
  /* standard dom */
  var referrer: js.UndefOr[java.lang.String] = js.undefined
  
  /* standard dom */
  var sample: js.UndefOr[java.lang.String] = js.undefined
  
  /* standard dom */
  var sourceFile: js.UndefOr[java.lang.String] = js.undefined
  
  /* standard dom */
  var statusCode: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var violatedDirective: js.UndefOr[java.lang.String] = js.undefined
}
object SecurityPolicyViolationEventInit {
  
  inline def apply(): SecurityPolicyViolationEventInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecurityPolicyViolationEventInit]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SecurityPolicyViolationEventInit] (val x: Self) extends AnyVal {
    
    inline def setBlockedURI(value: java.lang.String): Self = StObject.set(x, "blockedURI", value.asInstanceOf[js.Any])
    
    inline def setBlockedURIUndefined: Self = StObject.set(x, "blockedURI", js.undefined)
    
    inline def setColumnNumber(value: Double): Self = StObject.set(x, "columnNumber", value.asInstanceOf[js.Any])
    
    inline def setColumnNumberUndefined: Self = StObject.set(x, "columnNumber", js.undefined)
    
    inline def setDisposition(value: SecurityPolicyViolationEventDisposition): Self = StObject.set(x, "disposition", value.asInstanceOf[js.Any])
    
    inline def setDispositionUndefined: Self = StObject.set(x, "disposition", js.undefined)
    
    inline def setDocumentURI(value: java.lang.String): Self = StObject.set(x, "documentURI", value.asInstanceOf[js.Any])
    
    inline def setDocumentURIUndefined: Self = StObject.set(x, "documentURI", js.undefined)
    
    inline def setEffectiveDirective(value: java.lang.String): Self = StObject.set(x, "effectiveDirective", value.asInstanceOf[js.Any])
    
    inline def setEffectiveDirectiveUndefined: Self = StObject.set(x, "effectiveDirective", js.undefined)
    
    inline def setLineNumber(value: Double): Self = StObject.set(x, "lineNumber", value.asInstanceOf[js.Any])
    
    inline def setLineNumberUndefined: Self = StObject.set(x, "lineNumber", js.undefined)
    
    inline def setOriginalPolicy(value: java.lang.String): Self = StObject.set(x, "originalPolicy", value.asInstanceOf[js.Any])
    
    inline def setOriginalPolicyUndefined: Self = StObject.set(x, "originalPolicy", js.undefined)
    
    inline def setReferrer(value: java.lang.String): Self = StObject.set(x, "referrer", value.asInstanceOf[js.Any])
    
    inline def setReferrerUndefined: Self = StObject.set(x, "referrer", js.undefined)
    
    inline def setSample(value: java.lang.String): Self = StObject.set(x, "sample", value.asInstanceOf[js.Any])
    
    inline def setSampleUndefined: Self = StObject.set(x, "sample", js.undefined)
    
    inline def setSourceFile(value: java.lang.String): Self = StObject.set(x, "sourceFile", value.asInstanceOf[js.Any])
    
    inline def setSourceFileUndefined: Self = StObject.set(x, "sourceFile", js.undefined)
    
    inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    
    inline def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
    
    inline def setViolatedDirective(value: java.lang.String): Self = StObject.set(x, "violatedDirective", value.asInstanceOf[js.Any])
    
    inline def setViolatedDirectiveUndefined: Self = StObject.set(x, "violatedDirective", js.undefined)
  }
}
