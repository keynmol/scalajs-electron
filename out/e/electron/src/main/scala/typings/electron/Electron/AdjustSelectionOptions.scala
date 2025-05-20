package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdjustSelectionOptions extends StObject {
  
  /**
    * Amount to shift the end index of the current selection.
    */
  var end: js.UndefOr[Double] = js.undefined
  
  /**
    * Amount to shift the start index of the current selection.
    */
  var start: js.UndefOr[Double] = js.undefined
}
object AdjustSelectionOptions {
  
  inline def apply(): AdjustSelectionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdjustSelectionOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AdjustSelectionOptions] (val x: Self) extends AnyVal {
    
    inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
  }
}
