# api-gateway-service

# Read Me First
this service demos API gateway.
service discovery-client-feign-service running on port 8082 is configured here.
no need to hit directly hit http://localhost:8082/user/data
instead
hit http://localhost:8083/user/data
api-gateway-service acts as a single point of entry to interact with all the services
configured.

Redis rate limiting is enabled. only 2 requests per second is allowed. 
circuit breaker is also enabled. when the down stream service is down. 
it will run fallback method and print "Server is temporarily unavailable, Please try again later".

enabled micrometer tracing and zipkin for data visualization.
http://localhost:9411


This service shows how api gateway works.
