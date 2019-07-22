(ns com.google.cloud.compute.v1.NetworkEndpointGroupsListEndpointsRequest$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 NetworkEndpointGroupsListEndpointsRequest$Builder]))

(defn merge-from
  "other - `com.google.cloud.compute.v1.NetworkEndpointGroupsListEndpointsRequest`

  returns: `com.google.cloud.compute.v1.NetworkEndpointGroupsListEndpointsRequest$Builder`"
  (^com.google.cloud.compute.v1.NetworkEndpointGroupsListEndpointsRequest$Builder [^NetworkEndpointGroupsListEndpointsRequest$Builder this ^com.google.cloud.compute.v1.NetworkEndpointGroupsListEndpointsRequest other]
    (-> this (.mergeFrom other))))

(defn get-health-status
  "Optional query parameter for showing the health status of each network endpoint. Valid
   options are SKIP or SHOW. If you don't specifiy this parameter, the health status of network
   endpoints will not be provided.

  returns: `java.lang.String`"
  (^java.lang.String [^NetworkEndpointGroupsListEndpointsRequest$Builder this]
    (-> this (.getHealthStatus))))

(defn set-health-status
  "Optional query parameter for showing the health status of each network endpoint. Valid
   options are SKIP or SHOW. If you don't specifiy this parameter, the health status of network
   endpoints will not be provided.

  health-status - `java.lang.String`

  returns: `com.google.cloud.compute.v1.NetworkEndpointGroupsListEndpointsRequest$Builder`"
  (^com.google.cloud.compute.v1.NetworkEndpointGroupsListEndpointsRequest$Builder [^NetworkEndpointGroupsListEndpointsRequest$Builder this ^java.lang.String health-status]
    (-> this (.setHealthStatus health-status))))

(defn build
  "returns: `com.google.cloud.compute.v1.NetworkEndpointGroupsListEndpointsRequest`"
  (^com.google.cloud.compute.v1.NetworkEndpointGroupsListEndpointsRequest [^NetworkEndpointGroupsListEndpointsRequest$Builder this]
    (-> this (.build))))

(defn clone
  "returns: `com.google.cloud.compute.v1.NetworkEndpointGroupsListEndpointsRequest$Builder`"
  (^com.google.cloud.compute.v1.NetworkEndpointGroupsListEndpointsRequest$Builder [^NetworkEndpointGroupsListEndpointsRequest$Builder this]
    (-> this (.clone))))

