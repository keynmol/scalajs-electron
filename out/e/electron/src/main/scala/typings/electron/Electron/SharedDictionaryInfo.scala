package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SharedDictionaryInfo extends StObject {
  
  // Docs: https://electronjs.org/docs/api/structures/shared-dictionary-info
  /**
    * URL of the dictionary.
    */
  var dictionaryUrl: String
  
  /**
    * The expiration time for the dictionary which was declared in 'use-as-dictionary'
    * response header's `expires` option in seconds.
    */
  var expirationDuration: Double
  
  /**
    * The sha256 hash of the dictionary binary.
    */
  var hash: String
  
  /**
    * The Id for the dictionary which was declared in 'use-as-dictionary' response
    * header's `id` option.
    */
  var id: String
  
  /**
    * The time of when the dictionary was received from the network layer.
    */
  var lastFetchTime: js.Date
  
  /**
    * The time when the dictionary was last used.
    */
  var lastUsedTime: js.Date
  
  /**
    * The matching path pattern for the dictionary which was declared in
    * 'use-as-dictionary' response header's `match` option.
    */
  var `match`: String
  
  /**
    * An array of matching destinations for the dictionary which was declared in
    * 'use-as-dictionary' response header's `match-dest` option.
    */
  var matchDestinations: js.Array[String]
  
  /**
    * The time of when the dictionary was received from the server. For cached
    * responses, this time could be "far" in the past.
    */
  var responseTime: js.Date
  
  /**
    * The amount of bytes stored for this shared dictionary information object in
    * Chromium's internal storage (usually Sqlite).
    */
  var size: Double
}
object SharedDictionaryInfo {
  
  inline def apply(
    dictionaryUrl: String,
    expirationDuration: Double,
    hash: String,
    id: String,
    lastFetchTime: js.Date,
    lastUsedTime: js.Date,
    `match`: String,
    matchDestinations: js.Array[String],
    responseTime: js.Date,
    size: Double
  ): SharedDictionaryInfo = {
    val __obj = js.Dynamic.literal(dictionaryUrl = dictionaryUrl.asInstanceOf[js.Any], expirationDuration = expirationDuration.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lastFetchTime = lastFetchTime.asInstanceOf[js.Any], lastUsedTime = lastUsedTime.asInstanceOf[js.Any], matchDestinations = matchDestinations.asInstanceOf[js.Any], responseTime = responseTime.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SharedDictionaryInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SharedDictionaryInfo] (val x: Self) extends AnyVal {
    
    inline def setDictionaryUrl(value: String): Self = StObject.set(x, "dictionaryUrl", value.asInstanceOf[js.Any])
    
    inline def setExpirationDuration(value: Double): Self = StObject.set(x, "expirationDuration", value.asInstanceOf[js.Any])
    
    inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLastFetchTime(value: js.Date): Self = StObject.set(x, "lastFetchTime", value.asInstanceOf[js.Any])
    
    inline def setLastUsedTime(value: js.Date): Self = StObject.set(x, "lastUsedTime", value.asInstanceOf[js.Any])
    
    inline def setMatch(value: String): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
    
    inline def setMatchDestinations(value: js.Array[String]): Self = StObject.set(x, "matchDestinations", value.asInstanceOf[js.Any])
    
    inline def setMatchDestinationsVarargs(value: String*): Self = StObject.set(x, "matchDestinations", js.Array(value*))
    
    inline def setResponseTime(value: js.Date): Self = StObject.set(x, "responseTime", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
