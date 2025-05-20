package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The type of `import.meta`.
  *
  * If you need to declare that a given property exists on `import.meta`,
  * this type may be augmented via interface merging.
  */
trait ImportMeta extends StObject {
  
  /* standard dom */
  def resolve(specifier: java.lang.String): java.lang.String
  
  /* standard dom */
  var url: java.lang.String
}
object ImportMeta {
  
  inline def apply(resolve: java.lang.String => java.lang.String, url: java.lang.String): ImportMeta = {
    val __obj = js.Dynamic.literal(resolve = js.Any.fromFunction1(resolve), url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportMeta]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImportMeta] (val x: Self) extends AnyVal {
    
    inline def setResolve(value: java.lang.String => java.lang.String): Self = StObject.set(x, "resolve", js.Any.fromFunction1(value))
    
    inline def setUrl(value: java.lang.String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
