package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentVisibilityAutoStateChangeEventInit
  extends StObject
     with EventInit {
  
  /* standard dom */
  var skipped: js.UndefOr[scala.Boolean] = js.undefined
}
object ContentVisibilityAutoStateChangeEventInit {
  
  inline def apply(): ContentVisibilityAutoStateChangeEventInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContentVisibilityAutoStateChangeEventInit]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentVisibilityAutoStateChangeEventInit] (val x: Self) extends AnyVal {
    
    inline def setSkipped(value: scala.Boolean): Self = StObject.set(x, "skipped", value.asInstanceOf[js.Any])
    
    inline def setSkippedUndefined: Self = StObject.set(x, "skipped", js.undefined)
  }
}
