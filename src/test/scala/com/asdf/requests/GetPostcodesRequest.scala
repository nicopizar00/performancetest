package com.asdf.requests

import com.asdf.config.Configuration.baseUrl
import io.gatling.http.request.builder.HttpRequestBuilder
import io.gatling.core.Predef._
import io.gatling.http.Predef._

/**
 * POST Request
 * Bulk lookup postcodes.
 * sends a JSON with the post codes to consult.
 */
object GetPostcodesRequest {
  var get_postcodes: HttpRequestBuilder = http("Get Postcodes")
    .post(baseUrl + "/postcodes")
    .body(RawFileBody("../resources/bodies/GetPostcodes.json"))
    .header("content-type","application/json")
    .check(status is 200)
}
