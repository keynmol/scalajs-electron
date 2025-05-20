package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FontFaceSetEventMap extends StObject {
  
  /* standard dom */
  var loading: FontFaceSetLoadEvent
  
  /* standard dom */
  var loadingdone: FontFaceSetLoadEvent
  
  /* standard dom */
  var loadingerror: FontFaceSetLoadEvent
}
object FontFaceSetEventMap {
  
  inline def apply(
    loading: FontFaceSetLoadEvent,
    loadingdone: FontFaceSetLoadEvent,
    loadingerror: FontFaceSetLoadEvent
  ): FontFaceSetEventMap = {
    val __obj = js.Dynamic.literal(loading = loading.asInstanceOf[js.Any], loadingdone = loadingdone.asInstanceOf[js.Any], loadingerror = loadingerror.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontFaceSetEventMap]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FontFaceSetEventMap] (val x: Self) extends AnyVal {
    
    inline def setLoading(value: FontFaceSetLoadEvent): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
    
    inline def setLoadingdone(value: FontFaceSetLoadEvent): Self = StObject.set(x, "loadingdone", value.asInstanceOf[js.Any])
    
    inline def setLoadingerror(value: FontFaceSetLoadEvent): Self = StObject.set(x, "loadingerror", value.asInstanceOf[js.Any])
  }
}
