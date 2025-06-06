package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CheckVisibilityOptions extends StObject {
  
  /* standard dom */
  var checkOpacity: js.UndefOr[scala.Boolean] = js.undefined
  
  /* standard dom */
  var checkVisibilityCSS: js.UndefOr[scala.Boolean] = js.undefined
  
  /* standard dom */
  var contentVisibilityAuto: js.UndefOr[scala.Boolean] = js.undefined
  
  /* standard dom */
  var opacityProperty: js.UndefOr[scala.Boolean] = js.undefined
  
  /* standard dom */
  var visibilityProperty: js.UndefOr[scala.Boolean] = js.undefined
}
object CheckVisibilityOptions {
  
  inline def apply(): CheckVisibilityOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CheckVisibilityOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CheckVisibilityOptions] (val x: Self) extends AnyVal {
    
    inline def setCheckOpacity(value: scala.Boolean): Self = StObject.set(x, "checkOpacity", value.asInstanceOf[js.Any])
    
    inline def setCheckOpacityUndefined: Self = StObject.set(x, "checkOpacity", js.undefined)
    
    inline def setCheckVisibilityCSS(value: scala.Boolean): Self = StObject.set(x, "checkVisibilityCSS", value.asInstanceOf[js.Any])
    
    inline def setCheckVisibilityCSSUndefined: Self = StObject.set(x, "checkVisibilityCSS", js.undefined)
    
    inline def setContentVisibilityAuto(value: scala.Boolean): Self = StObject.set(x, "contentVisibilityAuto", value.asInstanceOf[js.Any])
    
    inline def setContentVisibilityAutoUndefined: Self = StObject.set(x, "contentVisibilityAuto", js.undefined)
    
    inline def setOpacityProperty(value: scala.Boolean): Self = StObject.set(x, "opacityProperty", value.asInstanceOf[js.Any])
    
    inline def setOpacityPropertyUndefined: Self = StObject.set(x, "opacityProperty", js.undefined)
    
    inline def setVisibilityProperty(value: scala.Boolean): Self = StObject.set(x, "visibilityProperty", value.asInstanceOf[js.Any])
    
    inline def setVisibilityPropertyUndefined: Self = StObject.set(x, "visibilityProperty", js.undefined)
  }
}
