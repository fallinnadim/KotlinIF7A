import exceptions.BrokenEngineException
import exceptions.OutOfFuelException
import exceptions.SpaceToEarthConnectionFailedException
import java.lang.Exception

object SpacePort {
    fun investigateSpace (spaceCraft: SpaceCraft) {
        try {
            spaceCraft.launch()
        } catch (e: OutOfFuelException) {
            spaceCraft.sendMessageToEarth(e.localizedMessage)
            spaceCraft.refuel()
        } catch (e: BrokenEngineException) {
            spaceCraft.sendMessageToEarth(e.localizedMessage)
            spaceCraft.repairEngine()
        } catch (e: SpaceToEarthConnectionFailedException) {
            spaceCraft.sendMessageToEarth(e.localizedMessage)
            spaceCraft.fixConnection()
        } finally {
            if (spaceCraft.isInSpace) {
                spaceCraft.land()
            } else {
                investigateSpace(spaceCraft)
            }
        }
    }
}