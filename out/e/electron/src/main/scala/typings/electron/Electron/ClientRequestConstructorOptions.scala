package typings.electron.Electron

import typings.electron.electronStrings._empty
import typings.electron.electronStrings.`force-cache`
import typings.electron.electronStrings.`no-cache`
import typings.electron.electronStrings.`no-referrer-when-downgrade`
import typings.electron.electronStrings.`no-referrer`
import typings.electron.electronStrings.`no-store`
import typings.electron.electronStrings.`only-if-cached`
import typings.electron.electronStrings.`origin-when-cross-origin`
import typings.electron.electronStrings.`same-origin`
import typings.electron.electronStrings.`strict-origin-when-cross-origin`
import typings.electron.electronStrings.`strict-origin`
import typings.electron.electronStrings.`unsafe-url`
import typings.electron.electronStrings.default
import typings.electron.electronStrings.error
import typings.electron.electronStrings.follow
import typings.electron.electronStrings.httpColon
import typings.electron.electronStrings.httpsColon
import typings.electron.electronStrings.include
import typings.electron.electronStrings.manual
import typings.electron.electronStrings.omit
import typings.electron.electronStrings.origin
import typings.electron.electronStrings.reload
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientRequestConstructorOptions extends StObject {
  
  /**
    * can be `default`, `no-store`, `reload`, `no-cache`, `force-cache` or
    * `only-if-cached`.
    */
  var cache: js.UndefOr[default | `no-store` | reload | `no-cache` | `force-cache` | `only-if-cached`] = js.undefined
  
  /**
    * Can be `include`, `omit` or `same-origin`. Whether to send credentials with this
    * request. If set to `include`, credentials from the session associated with the
    * request will be used. If set to `omit`, credentials will not be sent with the
    * request (and the `'login'` event will not be triggered in the event of a 401).
    * If set to `same-origin`, `origin` must also be specified. This matches the
    * behavior of the fetch option of the same name. If this option is not specified,
    * authentication data from the session will be sent, and cookies will not be sent
    * (unless `useSessionCookies` is set).
    */
  var credentials: js.UndefOr[include | omit | `same-origin`] = js.undefined
  
  /**
    * Headers to be sent with the request.
    */
  var headers: js.UndefOr[Record[String, String | js.Array[String]]] = js.undefined
  
  /**
    * The server host provided as a concatenation of the hostname and the port number
    * 'hostname:port'.
    */
  var host: js.UndefOr[String] = js.undefined
  
  /**
    * The server host name.
    */
  var hostname: js.UndefOr[String] = js.undefined
  
  /**
    * The HTTP request method. Defaults to the GET method.
    */
  var method: js.UndefOr[String] = js.undefined
  
  /**
    * The origin URL of the request.
    */
  var origin: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the `partition` with which the request is associated. Defaults to
    * the empty string. The `session` option supersedes `partition`. Thus if a
    * `session` is explicitly specified, `partition` is ignored.
    */
  var partition: js.UndefOr[String] = js.undefined
  
  /**
    * The path part of the request URL.
    */
  var path: js.UndefOr[String] = js.undefined
  
  /**
    * The server's listening port number.
    */
  var port: js.UndefOr[Double] = js.undefined
  
  /**
    * Can be `http:` or `https:`. The protocol scheme in the form 'scheme:'. Defaults
    * to 'http:'.
    */
  var protocol: js.UndefOr[httpColon | httpsColon] = js.undefined
  
  /**
    * Can be `follow`, `error` or `manual`. The redirect mode for this request. When
    * mode is `error`, any redirection will be aborted. When mode is `manual` the
    * redirection will be cancelled unless `request.followRedirect` is invoked
    * synchronously during the `redirect` event.  Defaults to `follow`.
    */
  var redirect: js.UndefOr[follow | error | manual] = js.undefined
  
  /**
    * can be "", `no-referrer`, `no-referrer-when-downgrade`, `origin`,
    * `origin-when-cross-origin`, `unsafe-url`, `same-origin`, `strict-origin`, or
    * `strict-origin-when-cross-origin`. Defaults to
    * `strict-origin-when-cross-origin`.
    */
  var referrerPolicy: js.UndefOr[
    _empty | `no-referrer` | `no-referrer-when-downgrade` | origin | `origin-when-cross-origin` | `unsafe-url` | `same-origin` | `strict-origin` | `strict-origin-when-cross-origin`
  ] = js.undefined
  
  /**
    * The `Session` instance with which the request is associated.
    */
  var session: js.UndefOr[Session_] = js.undefined
  
  /**
    * The request URL. Must be provided in the absolute form with the protocol scheme
    * specified as http or https.
    */
  var url: js.UndefOr[String] = js.undefined
  
  /**
    * Whether to send cookies with this request from the provided session. If
    * `credentials` is specified, this option has no effect. Default is `false`.
    */
  var useSessionCookies: js.UndefOr[Boolean] = js.undefined
}
object ClientRequestConstructorOptions {
  
  inline def apply(): ClientRequestConstructorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientRequestConstructorOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClientRequestConstructorOptions] (val x: Self) extends AnyVal {
    
    inline def setCache(value: default | `no-store` | reload | `no-cache` | `force-cache` | `only-if-cached`): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
    
    inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
    
    inline def setCredentials(value: include | omit | `same-origin`): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
    
    inline def setCredentialsUndefined: Self = StObject.set(x, "credentials", js.undefined)
    
    inline def setHeaders(value: Record[String, String | js.Array[String]]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
    
    inline def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
    
    inline def setPartition(value: String): Self = StObject.set(x, "partition", value.asInstanceOf[js.Any])
    
    inline def setPartitionUndefined: Self = StObject.set(x, "partition", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    inline def setProtocol(value: httpColon | httpsColon): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
    
    inline def setRedirect(value: follow | error | manual): Self = StObject.set(x, "redirect", value.asInstanceOf[js.Any])
    
    inline def setRedirectUndefined: Self = StObject.set(x, "redirect", js.undefined)
    
    inline def setReferrerPolicy(
      value: _empty | `no-referrer` | `no-referrer-when-downgrade` | origin | `origin-when-cross-origin` | `unsafe-url` | `same-origin` | `strict-origin` | `strict-origin-when-cross-origin`
    ): Self = StObject.set(x, "referrerPolicy", value.asInstanceOf[js.Any])
    
    inline def setReferrerPolicyUndefined: Self = StObject.set(x, "referrerPolicy", js.undefined)
    
    inline def setSession(value: Session_): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    
    inline def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setUseSessionCookies(value: Boolean): Self = StObject.set(x, "useSessionCookies", value.asInstanceOf[js.Any])
    
    inline def setUseSessionCookiesUndefined: Self = StObject.set(x, "useSessionCookies", js.undefined)
  }
}
