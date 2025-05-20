package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CPUUsage extends StObject {
  
  // Docs: https://electronjs.org/docs/api/structures/cpu-usage
  /**
    * Total seconds of CPU time used since process startup.
    */
  var cumulativeCPUUsage: js.UndefOr[Double] = js.undefined
  
  /**
    * The number of average idle CPU wakeups per second since the last call to
    * getCPUUsage. First call returns 0. Will always return 0 on Windows.
    */
  var idleWakeupsPerSecond: Double
  
  /**
    * Percentage of CPU used since the last call to getCPUUsage. First call returns 0.
    */
  var percentCPUUsage: Double
}
object CPUUsage {
  
  inline def apply(idleWakeupsPerSecond: Double, percentCPUUsage: Double): CPUUsage = {
    val __obj = js.Dynamic.literal(idleWakeupsPerSecond = idleWakeupsPerSecond.asInstanceOf[js.Any], percentCPUUsage = percentCPUUsage.asInstanceOf[js.Any])
    __obj.asInstanceOf[CPUUsage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CPUUsage] (val x: Self) extends AnyVal {
    
    inline def setCumulativeCPUUsage(value: Double): Self = StObject.set(x, "cumulativeCPUUsage", value.asInstanceOf[js.Any])
    
    inline def setCumulativeCPUUsageUndefined: Self = StObject.set(x, "cumulativeCPUUsage", js.undefined)
    
    inline def setIdleWakeupsPerSecond(value: Double): Self = StObject.set(x, "idleWakeupsPerSecond", value.asInstanceOf[js.Any])
    
    inline def setPercentCPUUsage(value: Double): Self = StObject.set(x, "percentCPUUsage", value.asInstanceOf[js.Any])
  }
}
