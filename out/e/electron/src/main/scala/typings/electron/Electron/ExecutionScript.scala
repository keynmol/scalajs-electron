package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExecutionScript extends StObject {
  
  /**
    * An array of arguments to pass to the provided function. These arguments will be
    * copied between worlds in accordance with the table of supported types.
    */
  var args: js.UndefOr[js.Array[Any]] = js.undefined
  
  /**
    * A JavaScript function to execute. This function will be serialized which means
    * that any bound parameters and execution context will be lost.
    */
  def func(args: Any*): Any
}
object ExecutionScript {
  
  inline def apply(func: /* repeated */ Any => Any): ExecutionScript = {
    val __obj = js.Dynamic.literal(func = js.Any.fromFunction1(func))
    __obj.asInstanceOf[ExecutionScript]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExecutionScript] (val x: Self) extends AnyVal {
    
    inline def setArgs(value: js.Array[Any]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
    
    inline def setArgsVarargs(value: Any*): Self = StObject.set(x, "args", js.Array(value*))
    
    inline def setFunc(value: /* repeated */ Any => Any): Self = StObject.set(x, "func", js.Any.fromFunction1(value))
  }
}
