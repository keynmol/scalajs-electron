package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RestoreOptions extends StObject {
  
  /**
    * Result of a prior `getAllEntries()` call
    */
  var entries: js.Array[NavigationEntry]
  
  /**
    * Index of the stack that should be loaded. If you set it to `0`, the webContents
    * will load the first (oldest) entry. If you leave it undefined, Electron will
    * automatically load the last (newest) entry.
    */
  var index: js.UndefOr[Double] = js.undefined
}
object RestoreOptions {
  
  inline def apply(entries: js.Array[NavigationEntry]): RestoreOptions = {
    val __obj = js.Dynamic.literal(entries = entries.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestoreOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RestoreOptions] (val x: Self) extends AnyVal {
    
    inline def setEntries(value: js.Array[NavigationEntry]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
    
    inline def setEntriesVarargs(value: NavigationEntry*): Self = StObject.set(x, "entries", js.Array(value*))
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
  }
}
