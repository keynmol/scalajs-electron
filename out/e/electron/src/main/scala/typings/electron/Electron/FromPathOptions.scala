package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FromPathOptions extends StObject {
  
  /**
    * Whether to enable cache. Default is `true` unless the `--disable-http-cache`
    * switch is used.
    */
  var cache: Boolean
}
object FromPathOptions {
  
  inline def apply(cache: Boolean): FromPathOptions = {
    val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any])
    __obj.asInstanceOf[FromPathOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FromPathOptions] (val x: Self) extends AnyVal {
    
    inline def setCache(value: Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
  }
}
