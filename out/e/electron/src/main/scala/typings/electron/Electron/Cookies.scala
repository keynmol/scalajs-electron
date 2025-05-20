package typings.electron.Electron

import typings.electron.electronStrings.`expired-overwrite`
import typings.electron.electronStrings.changed
import typings.electron.electronStrings.evicted
import typings.electron.electronStrings.expired
import typings.electron.electronStrings.explicit
import typings.electron.electronStrings.overwrite
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cookies extends StObject {
  
  def addListener(
    event: changed,
    listener: js.Function4[
      /* event */ Event[js.Object], 
      /* cookie */ Cookie, 
      /* cause */ explicit | overwrite | expired | evicted | `expired-overwrite`, 
      /* removed */ Boolean, 
      Unit
    ]
  ): this.type
  
  /**
    * A promise which resolves when the cookie store has been flushed
    *
    * Writes any unwritten cookies data to disk
    *
    * Cookies written by any method will not be written to disk immediately, but will
    * be written every 30 seconds or 512 operations
    *
    * Calling this method can cause the cookie to be written to disk immediately.
    */
  def flushStore(): js.Promise[Unit]
  
  /**
    * A promise which resolves an array of cookie objects.
    *
    * Sends a request to get all cookies matching `filter`, and resolves a promise
    * with the response.
    */
  def get(filter: CookiesGetFilter): js.Promise[js.Array[Cookie]]
  
  def off(
    event: changed,
    listener: js.Function4[
      /* event */ Event[js.Object], 
      /* cookie */ Cookie, 
      /* cause */ explicit | overwrite | expired | evicted | `expired-overwrite`, 
      /* removed */ Boolean, 
      Unit
    ]
  ): this.type
  
  // Docs: https://electronjs.org/docs/api/cookies
  /**
    * Emitted when a cookie is changed because it was added, edited, removed, or
    * expired.
    */
  def on(
    event: changed,
    listener: js.Function4[
      /* event */ Event[js.Object], 
      /* cookie */ Cookie, 
      /* cause */ explicit | overwrite | expired | evicted | `expired-overwrite`, 
      /* removed */ Boolean, 
      Unit
    ]
  ): this.type
  
  def once(
    event: changed,
    listener: js.Function4[
      /* event */ Event[js.Object], 
      /* cookie */ Cookie, 
      /* cause */ explicit | overwrite | expired | evicted | `expired-overwrite`, 
      /* removed */ Boolean, 
      Unit
    ]
  ): this.type
  
  /**
    * A promise which resolves when the cookie has been removed
    *
    * Removes the cookies matching `url` and `name`
    */
  def remove(url: String, name: String): js.Promise[Unit]
  
  def removeListener(
    event: changed,
    listener: js.Function4[
      /* event */ Event[js.Object], 
      /* cookie */ Cookie, 
      /* cause */ explicit | overwrite | expired | evicted | `expired-overwrite`, 
      /* removed */ Boolean, 
      Unit
    ]
  ): this.type
  
  /**
    * A promise which resolves when the cookie has been set
    *
    * Sets a cookie with `details`.
    */
  def set(details: CookiesSetDetails): js.Promise[Unit]
}
object Cookies {
  
  inline def apply(
    addListener: (changed, js.Function4[
      /* event */ Event[js.Object], 
      /* cookie */ Cookie, 
      /* cause */ explicit | overwrite | expired | evicted | `expired-overwrite`, 
      /* removed */ Boolean, 
      Unit
    ]) => Cookies,
    flushStore: () => js.Promise[Unit],
    get: CookiesGetFilter => js.Promise[js.Array[Cookie]],
    off: (changed, js.Function4[
      /* event */ Event[js.Object], 
      /* cookie */ Cookie, 
      /* cause */ explicit | overwrite | expired | evicted | `expired-overwrite`, 
      /* removed */ Boolean, 
      Unit
    ]) => Cookies,
    on: (changed, js.Function4[
      /* event */ Event[js.Object], 
      /* cookie */ Cookie, 
      /* cause */ explicit | overwrite | expired | evicted | `expired-overwrite`, 
      /* removed */ Boolean, 
      Unit
    ]) => Cookies,
    once: (changed, js.Function4[
      /* event */ Event[js.Object], 
      /* cookie */ Cookie, 
      /* cause */ explicit | overwrite | expired | evicted | `expired-overwrite`, 
      /* removed */ Boolean, 
      Unit
    ]) => Cookies,
    remove: (String, String) => js.Promise[Unit],
    removeListener: (changed, js.Function4[
      /* event */ Event[js.Object], 
      /* cookie */ Cookie, 
      /* cause */ explicit | overwrite | expired | evicted | `expired-overwrite`, 
      /* removed */ Boolean, 
      Unit
    ]) => Cookies,
    set: CookiesSetDetails => js.Promise[Unit]
  ): Cookies = {
    val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction2(addListener), flushStore = js.Any.fromFunction0(flushStore), get = js.Any.fromFunction1(get), off = js.Any.fromFunction2(off), on = js.Any.fromFunction2(on), once = js.Any.fromFunction2(once), remove = js.Any.fromFunction2(remove), removeListener = js.Any.fromFunction2(removeListener), set = js.Any.fromFunction1(set))
    __obj.asInstanceOf[Cookies]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Cookies] (val x: Self) extends AnyVal {
    
    inline def setAddListener(
      value: (changed, js.Function4[
          /* event */ Event[js.Object], 
          /* cookie */ Cookie, 
          /* cause */ explicit | overwrite | expired | evicted | `expired-overwrite`, 
          /* removed */ Boolean, 
          Unit
        ]) => Cookies
    ): Self = StObject.set(x, "addListener", js.Any.fromFunction2(value))
    
    inline def setFlushStore(value: () => js.Promise[Unit]): Self = StObject.set(x, "flushStore", js.Any.fromFunction0(value))
    
    inline def setGet(value: CookiesGetFilter => js.Promise[js.Array[Cookie]]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    inline def setOff(
      value: (changed, js.Function4[
          /* event */ Event[js.Object], 
          /* cookie */ Cookie, 
          /* cause */ explicit | overwrite | expired | evicted | `expired-overwrite`, 
          /* removed */ Boolean, 
          Unit
        ]) => Cookies
    ): Self = StObject.set(x, "off", js.Any.fromFunction2(value))
    
    inline def setOn(
      value: (changed, js.Function4[
          /* event */ Event[js.Object], 
          /* cookie */ Cookie, 
          /* cause */ explicit | overwrite | expired | evicted | `expired-overwrite`, 
          /* removed */ Boolean, 
          Unit
        ]) => Cookies
    ): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
    
    inline def setOnce(
      value: (changed, js.Function4[
          /* event */ Event[js.Object], 
          /* cookie */ Cookie, 
          /* cause */ explicit | overwrite | expired | evicted | `expired-overwrite`, 
          /* removed */ Boolean, 
          Unit
        ]) => Cookies
    ): Self = StObject.set(x, "once", js.Any.fromFunction2(value))
    
    inline def setRemove(value: (String, String) => js.Promise[Unit]): Self = StObject.set(x, "remove", js.Any.fromFunction2(value))
    
    inline def setRemoveListener(
      value: (changed, js.Function4[
          /* event */ Event[js.Object], 
          /* cookie */ Cookie, 
          /* cause */ explicit | overwrite | expired | evicted | `expired-overwrite`, 
          /* removed */ Boolean, 
          Unit
        ]) => Cookies
    ): Self = StObject.set(x, "removeListener", js.Any.fromFunction2(value))
    
    inline def setSet(value: CookiesSetDetails => js.Promise[Unit]): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
  }
}
