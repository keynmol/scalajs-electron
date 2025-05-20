package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaKeysPolicy extends StObject {
  
  /* standard dom */
  var minHdcpVersion: js.UndefOr[java.lang.String] = js.undefined
}
object MediaKeysPolicy {
  
  inline def apply(): MediaKeysPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaKeysPolicy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MediaKeysPolicy] (val x: Self) extends AnyVal {
    
    inline def setMinHdcpVersion(value: java.lang.String): Self = StObject.set(x, "minHdcpVersion", value.asInstanceOf[js.Any])
    
    inline def setMinHdcpVersionUndefined: Self = StObject.set(x, "minHdcpVersion", js.undefined)
  }
}
