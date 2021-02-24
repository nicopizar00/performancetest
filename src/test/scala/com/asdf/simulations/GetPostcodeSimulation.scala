package com.asdf.simulations

import com.asdf.config.Configuration._
import com.asdf.scenarios.GetPostcodesScenario
import io.gatling.core.Predef._

/**
 * The Simulation defines the load of the desired scenario and executes it.
 */
class GetPostcodeSimulation extends Simulation {
  private val getPostCodesRampExec = GetPostcodesScenario.getPostcodesScenario
    .inject(rampUsers(users) during rampup)

  setUp(getPostCodesRampExec)
    .assertions(global.responseTime.max.lt(5000))
}
