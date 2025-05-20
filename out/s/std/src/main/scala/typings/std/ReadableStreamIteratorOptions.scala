package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReadableStreamIteratorOptions extends StObject {
  
  /**
    * Asynchronously iterates over the chunks in the stream's internal queue.
    *
    * Asynchronously iterating over the stream will lock it, preventing any other consumer from acquiring a reader. The lock will be released if the async iterator's return() method is called, e.g. by breaking out of the loop.
    *
    * By default, calling the async iterator's return() method will also cancel the stream. To prevent this, use the stream's values() method, passing true for the preventCancel option.
    */
  /* standard dom */
  var preventCancel: js.UndefOr[scala.Boolean] = js.undefined
}
object ReadableStreamIteratorOptions {
  
  inline def apply(): ReadableStreamIteratorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadableStreamIteratorOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReadableStreamIteratorOptions] (val x: Self) extends AnyVal {
    
    inline def setPreventCancel(value: scala.Boolean): Self = StObject.set(x, "preventCancel", value.asInstanceOf[js.Any])
    
    inline def setPreventCancelUndefined: Self = StObject.set(x, "preventCancel", js.undefined)
  }
}
