package typings.electron.Electron

import typings.electron.anon.RequestInitbypassCustomPr
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Net extends StObject {
  
  // Docs: https://electronjs.org/docs/api/net
  /**
    * see Response.
    *
    * Sends a request, similarly to how `fetch()` works in the renderer, using
    * Chrome's network stack. This differs from Node's `fetch()`, which uses Node.js's
    * HTTP stack.
    *
    * Example:
    *
    * This method will issue requests from the default session. To send a `fetch`
    * request from another session, use ses.fetch().
    *
    * See the MDN documentation for `fetch()` for more details.
    *
    * Limitations:
    *
    * * `net.fetch()` does not support the `data:` or `blob:` schemes.
    * * The value of the `integrity` option is ignored.
    * * The `.type` and `.url` values of the returned `Response` object are incorrect.
    *
    * By default, requests made with `net.fetch` can be made to custom protocols as
    * well as `file:`, and will trigger webRequest handlers if present. When the
    * non-standard `bypassCustomProtocolHandlers` option is set in RequestInit, custom
    * protocol handlers will not be called for this request. This allows forwarding an
    * intercepted request to the built-in handler. webRequest handlers will still be
    * triggered when bypassing custom protocols.
    *
    * > [!NOTE] In the utility process, custom protocols are not supported.
    */
  def fetch(input: String): js.Promise[org.scalajs.dom.Response] = js.native
  def fetch(input: String, init: RequestInitbypassCustomPr): js.Promise[org.scalajs.dom.Response] = js.native
  def fetch(input: org.scalajs.dom.Request): js.Promise[org.scalajs.dom.Response] = js.native
  def fetch(input: org.scalajs.dom.Request, init: RequestInitbypassCustomPr): js.Promise[org.scalajs.dom.Response] = js.native
  
  /**
    * Whether there is currently internet connection.
    *
    * A return value of `false` is a pretty strong indicator that the user won't be
    * able to connect to remote sites. However, a return value of `true` is
    * inconclusive; even if some link is up, it is uncertain whether a particular
    * connection attempt to a particular remote site will be successful.
    */
  def isOnline(): Boolean = js.native
  
  /**
    * A `boolean` property. Whether there is currently internet connection.
    *
    * A return value of `false` is a pretty strong indicator that the user won't be
    * able to connect to remote sites. However, a return value of `true` is
    * inconclusive; even if some link is up, it is uncertain whether a particular
    * connection attempt to a particular remote site will be successful.
    *
    */
  val online: Boolean = js.native
  
  def request(options: String): ClientRequest = js.native
  /**
    * Creates a `ClientRequest` instance using the provided `options` which are
    * directly forwarded to the `ClientRequest` constructor. The `net.request` method
    * would be used to issue both secure and insecure HTTP requests according to the
    * specified protocol scheme in the `options` object.
    */
  def request(options: ClientRequestConstructorOptions): ClientRequest = js.native
  
  /**
    * Resolves with the resolved IP addresses for the `host`.
    *
    * This method will resolve hosts from the default session. To resolve a host from
    * another session, use ses.resolveHost().
    */
  def resolveHost(host: String): js.Promise[ResolvedHost] = js.native
  def resolveHost(host: String, options: ResolveHostOptions): js.Promise[ResolvedHost] = js.native
}
