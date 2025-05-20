package typings.electron.global.Electron

import typings.electron.Electron.Cookie
import typings.electron.Electron.CookiesGetFilter
import typings.electron.Electron.CookiesSetDetails
import typings.electron.Electron.Event
import typings.electron.electronStrings.`expired-overwrite`
import typings.electron.electronStrings.changed
import typings.electron.electronStrings.evicted
import typings.electron.electronStrings.expired
import typings.electron.electronStrings.explicit
import typings.electron.electronStrings.overwrite
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Electron.Cookies")
@js.native
open class Cookies ()
  extends StObject
     with typings.electron.Electron.Cookies {
  
  /* CompleteClass */
  override def addListener(
    event: changed,
    listener: js.Function4[
      /* event */ Event[js.Object], 
      /* cookie */ Cookie, 
      /* cause */ explicit | overwrite | expired | evicted | `expired-overwrite`, 
      /* removed */ Boolean, 
      Unit
    ]
  ): this.type = js.native
  
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
  /* CompleteClass */
  override def flushStore(): js.Promise[Unit] = js.native
  
  /**
    * A promise which resolves an array of cookie objects.
    *
    * Sends a request to get all cookies matching `filter`, and resolves a promise
    * with the response.
    */
  /* CompleteClass */
  override def get(filter: CookiesGetFilter): js.Promise[js.Array[Cookie]] = js.native
  
  /* CompleteClass */
  override def off(
    event: changed,
    listener: js.Function4[
      /* event */ Event[js.Object], 
      /* cookie */ Cookie, 
      /* cause */ explicit | overwrite | expired | evicted | `expired-overwrite`, 
      /* removed */ Boolean, 
      Unit
    ]
  ): this.type = js.native
  
  // Docs: https://electronjs.org/docs/api/cookies
  /**
    * Emitted when a cookie is changed because it was added, edited, removed, or
    * expired.
    */
  /* CompleteClass */
  override def on(
    event: changed,
    listener: js.Function4[
      /* event */ Event[js.Object], 
      /* cookie */ Cookie, 
      /* cause */ explicit | overwrite | expired | evicted | `expired-overwrite`, 
      /* removed */ Boolean, 
      Unit
    ]
  ): this.type = js.native
  
  /* CompleteClass */
  override def once(
    event: changed,
    listener: js.Function4[
      /* event */ Event[js.Object], 
      /* cookie */ Cookie, 
      /* cause */ explicit | overwrite | expired | evicted | `expired-overwrite`, 
      /* removed */ Boolean, 
      Unit
    ]
  ): this.type = js.native
  
  /**
    * A promise which resolves when the cookie has been removed
    *
    * Removes the cookies matching `url` and `name`
    */
  /* CompleteClass */
  override def remove(url: String, name: String): js.Promise[Unit] = js.native
  
  /* CompleteClass */
  override def removeListener(
    event: changed,
    listener: js.Function4[
      /* event */ Event[js.Object], 
      /* cookie */ Cookie, 
      /* cause */ explicit | overwrite | expired | evicted | `expired-overwrite`, 
      /* removed */ Boolean, 
      Unit
    ]
  ): this.type = js.native
  
  /**
    * A promise which resolves when the cookie has been set
    *
    * Sets a cookie with `details`.
    */
  /* CompleteClass */
  override def set(details: CookiesSetDetails): js.Promise[Unit] = js.native
}
