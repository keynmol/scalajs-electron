package typings.std

import typings.std.stdStrings.backward
import typings.std.stdStrings.forward
import typings.std.stdStrings.none
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides special properties and methods for manipulating the layout and presentation of <textarea> elements.
  *
  * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTextAreaElement)
  */
@js.native
trait HTMLTextAreaElement
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
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTextAreaElement/autocomplete) */
  /* standard dom */
  var autocomplete: AutoFill = js.native
  
  /**
    * Returns whether a form will validate when it is submitted, without having to submit it.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTextAreaElement/checkValidity)
    */
  /* standard dom */
  def checkValidity(): scala.Boolean = js.native
  
  /**
    * Sets or retrieves the width of the object.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTextAreaElement/cols)
    */
  /* standard dom */
  var cols: Double = js.native
  
  /**
    * Sets or retrieves the initial contents of the object.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTextAreaElement/defaultValue)
    */
  /* standard dom */
  var defaultValue: java.lang.String = js.native
  
  /* standard dom */
  var dirName: java.lang.String = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTextAreaElement/disabled) */
  /* standard dom */
  var disabled: scala.Boolean = js.native
  
  /**
    * Retrieves a reference to the form that the object is embedded in.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTextAreaElement/form)
    */
  /* standard dom */
  val form: org.scalajs.dom.HTMLFormElement | Null = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTextAreaElement/labels) */
  /* standard dom */
  val labels: org.scalajs.dom.NodeList[org.scalajs.dom.HTMLLabelElement & org.scalajs.dom.Node] = js.native
  
  /**
    * Sets or retrieves the maximum number of characters that the user can enter in a text control.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTextAreaElement/maxLength)
    */
  /* standard dom */
  var maxLength: Double = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTextAreaElement/minLength) */
  /* standard dom */
  var minLength: Double = js.native
  
  /**
    * Sets or retrieves the name of the object.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTextAreaElement/name)
    */
  /* standard dom */
  var name: java.lang.String = js.native
  
  /**
    * Gets or sets a text string that is displayed in an input field as a hint or prompt to users as the format or type of information they need to enter.The text appears in an input field until the user puts focus on the field.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTextAreaElement/placeholder)
    */
  /* standard dom */
  var placeholder: java.lang.String = js.native
  
  /**
    * Sets or retrieves the value indicated whether the content of the object is read-only.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTextAreaElement/readOnly)
    */
  /* standard dom */
  var readOnly: scala.Boolean = js.native
  
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
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTextAreaElement/reportValidity) */
  /* standard dom */
  def reportValidity(): scala.Boolean = js.native
  
  /**
    * When present, marks an element that can't be submitted without a value.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTextAreaElement/required)
    */
  /* standard dom */
  var required: scala.Boolean = js.native
  
  /**
    * Sets or retrieves the number of horizontal rows contained in the object.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTextAreaElement/rows)
    */
  /* standard dom */
  var rows: Double = js.native
  
  /**
    * Highlights the input area of a form element.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTextAreaElement/select)
    */
  /* standard dom */
  def select(): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTextAreaElement/selectionDirection) */
  /* standard dom */
  var selectionDirection: forward | backward | none = js.native
  
  /**
    * Gets or sets the end position or offset of a text selection.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTextAreaElement/selectionEnd)
    */
  /* standard dom */
  var selectionEnd: Double = js.native
  
  /**
    * Gets or sets the starting position or offset of a text selection.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTextAreaElement/selectionStart)
    */
  /* standard dom */
  var selectionStart: Double = js.native
  
  /**
    * Sets a custom error message that is displayed when a form is submitted.
    * @param error Sets a custom error message that is displayed when a form is submitted.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTextAreaElement/setCustomValidity)
    */
  /* standard dom */
  def setCustomValidity(error: java.lang.String): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTextAreaElement/setRangeText) */
  /* standard dom */
  def setRangeText(replacement: java.lang.String): Unit = js.native
  /* standard dom */
  def setRangeText(replacement: java.lang.String, start: Double, end: Double): Unit = js.native
  def setRangeText(replacement: java.lang.String, start: Double, end: Double, selectionMode: SelectionMode): Unit = js.native
  
  /**
    * Sets the start and end positions of a selection in a text field.
    * @param start The offset into the text field for the start of the selection.
    * @param end The offset into the text field for the end of the selection.
    * @param direction The direction in which the selection is performed.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTextAreaElement/setSelectionRange)
    */
  /* standard dom */
  def setSelectionRange(): Unit = js.native
  def setSelectionRange(start: Double): Unit = js.native
  def setSelectionRange(start: Double, end: Double): Unit = js.native
  def setSelectionRange(start: Double, end: Double, direction: forward | backward | none): Unit = js.native
  def setSelectionRange(start: Double, end: Null, direction: forward | backward | none): Unit = js.native
  def setSelectionRange(start: Null, end: Double): Unit = js.native
  def setSelectionRange(start: Null, end: Double, direction: forward | backward | none): Unit = js.native
  def setSelectionRange(start: Null, end: Null, direction: forward | backward | none): Unit = js.native
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTextAreaElement/textLength) */
  /* standard dom */
  val textLength: Double = js.native
  
  /**
    * Retrieves the type of control.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTextAreaElement/type)
    */
  /* standard dom */
  val `type`: java.lang.String = js.native
  
  /**
    * Returns the error message that would be displayed if the user submits the form, or an empty string if no error message. It also triggers the standard error message, such as "this is a required field". The result is that the user sees validation messages without actually submitting.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTextAreaElement/validationMessage)
    */
  /* standard dom */
  val validationMessage: java.lang.String = js.native
  
  /**
    * Returns a  ValidityState object that represents the validity states of an element.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTextAreaElement/validity)
    */
  /* standard dom */
  val validity: org.scalajs.dom.ValidityState = js.native
  
  /**
    * Retrieves or sets the text in the entry field of the textArea element.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTextAreaElement/value)
    */
  /* standard dom */
  var value: java.lang.String = js.native
  
  /**
    * Returns whether an element will successfully validate based on forms validation rules and constraints.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTextAreaElement/willValidate)
    */
  /* standard dom */
  val willValidate: scala.Boolean = js.native
  
  /**
    * Sets or retrieves how to handle wordwrapping in the object.
    *
    * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTextAreaElement/wrap)
    */
  /* standard dom */
  var wrap: java.lang.String = js.native
}
