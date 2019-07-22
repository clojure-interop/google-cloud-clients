(ns com.google.cloud.compute.v1.NetworkEndpointGroupsDetachEndpointsRequest$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 NetworkEndpointGroupsDetachEndpointsRequest$Builder]))

(defn merge-from
  "other - `com.google.cloud.compute.v1.NetworkEndpointGroupsDetachEndpointsRequest`

  returns: `com.google.cloud.compute.v1.NetworkEndpointGroupsDetachEndpointsRequest$Builder`"
  (^com.google.cloud.compute.v1.NetworkEndpointGroupsDetachEndpointsRequest$Builder [^NetworkEndpointGroupsDetachEndpointsRequest$Builder this ^com.google.cloud.compute.v1.NetworkEndpointGroupsDetachEndpointsRequest other]
    (-> this (.mergeFrom other))))

(defn get-network-endpoints-list
  "The list of network endpoints to be detached.

  returns: `java.util.List<com.google.cloud.compute.v1.NetworkEndpoint>`"
  (^java.util.List [^NetworkEndpointGroupsDetachEndpointsRequest$Builder this]
    (-> this (.getNetworkEndpointsList))))

(defn add-all-network-endpoints
  "The list of network endpoints to be detached.

  network-endpoints - `java.util.List`

  returns: `com.google.cloud.compute.v1.NetworkEndpointGroupsDetachEndpointsRequest$Builder`"
  (^com.google.cloud.compute.v1.NetworkEndpointGroupsDetachEndpointsRequest$Builder [^NetworkEndpointGroupsDetachEndpointsRequest$Builder this ^java.util.List network-endpoints]
    (-> this (.addAllNetworkEndpoints network-endpoints))))

(defn add-network-endpoints
  "The list of network endpoints to be detached.

  network-endpoints - `com.google.cloud.compute.v1.NetworkEndpoint`

  returns: `com.google.cloud.compute.v1.NetworkEndpointGroupsDetachEndpointsRequest$Builder`"
  (^com.google.cloud.compute.v1.NetworkEndpointGroupsDetachEndpointsRequest$Builder [^NetworkEndpointGroupsDetachEndpointsRequest$Builder this ^com.google.cloud.compute.v1.NetworkEndpoint network-endpoints]
    (-> this (.addNetworkEndpoints network-endpoints))))

(defn build
  "returns: `com.google.cloud.compute.v1.NetworkEndpointGroupsDetachEndpointsRequest`"
  (^com.google.cloud.compute.v1.NetworkEndpointGroupsDetachEndpointsRequest [^NetworkEndpointGroupsDetachEndpointsRequest$Builder this]
    (-> this (.build))))

(defn clone
  "returns: `com.google.cloud.compute.v1.NetworkEndpointGroupsDetachEndpointsRequest$Builder`"
  (^com.google.cloud.compute.v1.NetworkEndpointGroupsDetachEndpointsRequest$Builder [^NetworkEndpointGroupsDetachEndpointsRequest$Builder this]
    (-> this (.clone))))

