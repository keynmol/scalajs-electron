package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PageSwapEventInit
  extends StObject
     with EventInit {
  
  /* standard dom */
  var activation: js.UndefOr[NavigationActivation | Null] = js.undefined
  
  /* standard dom */
  var viewTransition: js.UndefOr[ViewTransition | Null] = js.undefined
}
object PageSwapEventInit {
  
  inline def apply(): PageSwapEventInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageSwapEventInit]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PageSwapEventInit] (val x: Self) extends AnyVal {
    
    inline def setActivation(value: NavigationActivation): Self = StObject.set(x, "activation", value.asInstanceOf[js.Any])
    
    inline def setActivationNull: Self = StObject.set(x, "activation", null)
    
    inline def setActivationUndefined: Self = StObject.set(x, "activation", js.undefined)
    
    inline def setViewTransition(value: ViewTransition): Self = StObject.set(x, "viewTransition", value.asInstanceOf[js.Any])
    
    inline def setViewTransitionNull: Self = StObject.set(x, "viewTransition", null)
    
    inline def setViewTransitionUndefined: Self = StObject.set(x, "viewTransition", js.undefined)
  }
}
