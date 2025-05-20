package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PageRevealEventInit
  extends StObject
     with EventInit {
  
  /* standard dom */
  var viewTransition: js.UndefOr[ViewTransition | Null] = js.undefined
}
object PageRevealEventInit {
  
  inline def apply(): PageRevealEventInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageRevealEventInit]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PageRevealEventInit] (val x: Self) extends AnyVal {
    
    inline def setViewTransition(value: ViewTransition): Self = StObject.set(x, "viewTransition", value.asInstanceOf[js.Any])
    
    inline def setViewTransitionNull: Self = StObject.set(x, "viewTransition", null)
    
    inline def setViewTransitionUndefined: Self = StObject.set(x, "viewTransition", js.undefined)
  }
}
