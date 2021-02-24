package com.asdf.scenarios

import com.asdf.requests.GetPostcodesRequest
import io.gatling.core.structure.ScenarioBuilder
import io.gatling.core.Predef.scenario

/**
 * The Scenario defines the flow of the test.
 * In this case we just use the Bulk lookup postcodes.
 */
object GetPostcodesScenario {
  val getPostcodesScenario: ScenarioBuilder = scenario("getPostcodesScenario")
    .exec(GetPostcodesRequest.get_postcodes)
}
