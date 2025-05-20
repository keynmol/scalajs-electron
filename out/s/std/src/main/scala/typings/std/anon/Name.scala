package typings.std.anon

import typings.std.stdStrings.Ed25519
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Name extends StObject {
  
  /* standard dom */
  var name: Ed25519
}
object Name {
  
  inline def apply(): Name = {
    val __obj = js.Dynamic.literal(name = "Ed25519")
    __obj.asInstanceOf[Name]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Name] (val x: Self) extends AnyVal {
    
    inline def setName(value: Ed25519): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
