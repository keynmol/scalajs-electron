package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommandLine extends StObject {
  
  // Docs: https://electronjs.org/docs/api/command-line
  /**
    * Append an argument to Chromium's command line. The argument will be quoted
    * correctly. Switches will precede arguments regardless of appending order.
    *
    * If you're appending an argument like `--switch=value`, consider using
    * `appendSwitch('switch', 'value')` instead.
    *
    * > [!NOTE] This will not affect `process.argv`. The intended usage of this
    * function is to control Chromium's behavior.
    */
  def appendArgument(value: String): Unit = js.native
  
  /**
    * Append a switch (with optional `value`) to Chromium's command line.
    *
    * > [!NOTE] This will not affect `process.argv`. The intended usage of this
    * function is to control Chromium's behavior.
    */
  def appendSwitch(the_switch: String): Unit = js.native
  def appendSwitch(the_switch: String, value: String): Unit = js.native
  
  /**
    * The command-line switch value.
    *
    * This function is meant to obtain Chromium command line switches. It is not meant
    * to be used for application-specific command line arguments. For the latter,
    * please use `process.argv`.
    *
    * > [!NOTE] When the switch is not present or has no value, it returns empty
    * string.
    */
  def getSwitchValue(the_switch: String): String = js.native
  
  /**
    * Whether the command-line switch is present.
    */
  def hasSwitch(the_switch: String): Boolean = js.native
  
  /**
    * Removes the specified switch from Chromium's command line.
    *
    * > [!NOTE] This will not affect `process.argv`. The intended usage of this
    * function is to control Chromium's behavior.
    */
  def removeSwitch(the_switch: String): Unit = js.native
}
