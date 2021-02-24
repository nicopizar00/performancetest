package com.asdf.config

/**
 * Contains the base config to use;
 * The base url from the service.
 * The default simultaneous request and load time.
 */
object Configuration {
  val baseUrl: String = "https://api.postcodes.io"
  val users: Int = Integer.getInteger("users", 1).toInt
  val rampup: Int = Integer.getInteger("rampup", 1).toInt
}
