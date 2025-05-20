package typings.electron.Electron

import typings.electron.electronStrings.flexible
import typings.electron.electronStrings.large
import typings.electron.electronStrings.small
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TouchBarSpacer extends StObject {
  
  /**
    * A `string` representing the size of the spacer.  Can be `small`, `large` or
    * `flexible`.
    */
  var size: small | large | flexible
}
object TouchBarSpacer {
  
  inline def apply(size: small | large | flexible): TouchBarSpacer = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[TouchBarSpacer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TouchBarSpacer] (val x: Self) extends AnyVal {
    
    inline def setSize(value: small | large | flexible): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
