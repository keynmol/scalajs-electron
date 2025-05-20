package typings.electron.Electron

import typings.electron.electronStrings.basic_text
import typings.electron.electronStrings.gnome_libsecret
import typings.electron.electronStrings.kwallet
import typings.electron.electronStrings.kwallet5
import typings.electron.electronStrings.kwallet6
import typings.electron.electronStrings.unknown_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SafeStorage extends StObject {
  
  // Docs: https://electronjs.org/docs/api/safe-storage
  /**
    * the decrypted string. Decrypts the encrypted buffer obtained  with
    * `safeStorage.encryptString` back into a string.
    *
    * This function will throw an error if decryption fails.
    */
  def decryptString(
    encrypted: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Buffer */ Any
  ): String
  
  /**
    * An array of bytes representing the encrypted string.
    *
    * This function will throw an error if encryption fails.
    */
  def encryptString(plainText: String): Any
  
  /**
    * User friendly name of the password manager selected on Linux.
    *
    * This function will return one of the following values:
    *
    * * `basic_text` - When the desktop environment is not recognised or if the
    * following command line flag is provided `--password-store="basic"`.
    * * `gnome_libsecret` - When the desktop environment is `X-Cinnamon`, `Deepin`,
    * `GNOME`, `Pantheon`, `XFCE`, `UKUI`, `unity` or if the following command line
    * flag is provided `--password-store="gnome-libsecret"`.
    * * `kwallet` - When the desktop session is `kde4` or if the following command
    * line flag is provided `--password-store="kwallet"`.
    * * `kwallet5` - When the desktop session is `kde5` or if the following command
    * line flag is provided `--password-store="kwallet5"`.
    * * `kwallet6` - When the desktop session is `kde6`.
    * * `unknown` - When the function is called before app has emitted the `ready`
    * event.
    *
    * @platform linux
    */
  def getSelectedStorageBackend(): basic_text | gnome_libsecret | kwallet | kwallet5 | kwallet6 | unknown_
  
  /**
    * Whether encryption is available.
    *
    * On Linux, returns true if the app has emitted the `ready` event and the secret
    * key is available. On MacOS, returns true if Keychain is available. On Windows,
    * returns true once the app has emitted the `ready` event.
    */
  def isEncryptionAvailable(): Boolean
  
  /**
    * This function on Linux will force the module to use an in memory password for
    * creating symmetric key that is used for encrypt/decrypt functions when a valid
    * OS password manager cannot be determined for the current active desktop
    * environment. This function is a no-op on Windows and MacOS.
    */
  def setUsePlainTextEncryption(usePlainText: Boolean): Unit
}
object SafeStorage {
  
  inline def apply(
    decryptString: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Buffer */ Any => String,
    encryptString: String => Any,
    getSelectedStorageBackend: () => basic_text | gnome_libsecret | kwallet | kwallet5 | kwallet6 | unknown_,
    isEncryptionAvailable: () => Boolean,
    setUsePlainTextEncryption: Boolean => Unit
  ): SafeStorage = {
    val __obj = js.Dynamic.literal(decryptString = js.Any.fromFunction1(decryptString), encryptString = js.Any.fromFunction1(encryptString), getSelectedStorageBackend = js.Any.fromFunction0(getSelectedStorageBackend), isEncryptionAvailable = js.Any.fromFunction0(isEncryptionAvailable), setUsePlainTextEncryption = js.Any.fromFunction1(setUsePlainTextEncryption))
    __obj.asInstanceOf[SafeStorage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SafeStorage] (val x: Self) extends AnyVal {
    
    inline def setDecryptString(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Buffer */ Any => String
    ): Self = StObject.set(x, "decryptString", js.Any.fromFunction1(value))
    
    inline def setEncryptString(value: String => Any): Self = StObject.set(x, "encryptString", js.Any.fromFunction1(value))
    
    inline def setGetSelectedStorageBackend(value: () => basic_text | gnome_libsecret | kwallet | kwallet5 | kwallet6 | unknown_): Self = StObject.set(x, "getSelectedStorageBackend", js.Any.fromFunction0(value))
    
    inline def setIsEncryptionAvailable(value: () => Boolean): Self = StObject.set(x, "isEncryptionAvailable", js.Any.fromFunction0(value))
    
    inline def setSetUsePlainTextEncryption(value: Boolean => Unit): Self = StObject.set(x, "setUsePlainTextEncryption", js.Any.fromFunction1(value))
  }
}
