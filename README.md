# Performance Testing

This is a practice project for Performance Testing in Gatling. It uses Maven.

## The tested API

**Postcodes.io** delivers UK postal codes info.
You can found the documentation [here](https://postcodes.io).

## Test Scenario

### Bulk lookup postalcodes
The goal is to verify the behavior of the endpoint given a desired amount of concurrent requests and load period.  

#### Test Case
- POST Bulk lookup postcodes with given simultaneous request and load period.

## Execution
For default values

    mvn clean gatling:test
For desired either simultaneous requests or load period (in seconds)

    mvn clean gatling:test -Dusers=<users> -Drampup=<rampup>

Simple ¯\_(ツ)_/¯