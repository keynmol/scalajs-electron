package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains descriptive metadata about a document. It inherits all of the properties and methods described in the HTMLElement interface.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMetaElement)
  */
@js.native
trait HTMLMetaElement
  extends StObject
     with HTMLElement {
  
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, callback: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(`type`: java.lang.String, callback: EventListenerOrEventListenerObject, options: scala.Boolean): Unit = js.native
  /* InferMemberOverrides */
  override def addEventListener(
    `type`: java.lang.String,
    callback: EventListenerOrEventListenerObject,
    options: AddEventListenerOptions
  ): Unit = js.native
  
  /**
    * Gets or sets meta-information to associate with httpEquiv or name.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMetaElement/content)
    */
  /* standard dom */
  var content: java.lang.String = js.native
  
  /**
    * Gets or sets information used to bind the value of a content attribute of a meta element to an HTTP response header.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMetaElement/httpEquiv)
    */
  /* standard dom */
  var httpEquiv: java.lang.String = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMetaElement/media) */
  /* standard dom */
  var media: java.lang.String = js.native
  
  /**
    * Sets or retrieves the value specified in the content attribute of the meta object.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMetaElement/name)
    */
  /* standard dom */
  var name: java.lang.String = js.native
  
  /* InferMemberOverrides */
  override def removeEventListener(`type`: java.lang.String, callback: EventListenerOrEventListenerObject): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(
    `type`: java.lang.String,
    callback: EventListenerOrEventListenerObject,
    options: org.scalajs.dom.EventListenerOptions
  ): Unit = js.native
  /* InferMemberOverrides */
  override def removeEventListener(`type`: java.lang.String, callback: EventListenerOrEventListenerObject, options: scala.Boolean): Unit = js.native
  
  /**
    * Sets or retrieves a scheme to be used in interpreting the value of a property specified for the object.
    * @deprecated
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMetaElement/scheme)
    */
  /* standard dom */
  var scheme: java.lang.String = js.native
}
