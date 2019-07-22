(ns com.google.cloud.compute.v1.NetworkEndpointGroupsAttachEndpointsRequest$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 NetworkEndpointGroupsAttachEndpointsRequest$Builder]))

(defn merge-from
  "other - `com.google.cloud.compute.v1.NetworkEndpointGroupsAttachEndpointsRequest`

  returns: `com.google.cloud.compute.v1.NetworkEndpointGroupsAttachEndpointsRequest$Builder`"
  (^com.google.cloud.compute.v1.NetworkEndpointGroupsAttachEndpointsRequest$Builder [^NetworkEndpointGroupsAttachEndpointsRequest$Builder this ^com.google.cloud.compute.v1.NetworkEndpointGroupsAttachEndpointsRequest other]
    (-> this (.mergeFrom other))))

(defn get-network-endpoints-list
  "The list of network endpoints to be attached.

  returns: `java.util.List<com.google.cloud.compute.v1.NetworkEndpoint>`"
  (^java.util.List [^NetworkEndpointGroupsAttachEndpointsRequest$Builder this]
    (-> this (.getNetworkEndpointsList))))

(defn add-all-network-endpoints
  "The list of network endpoints to be attached.

  network-endpoints - `java.util.List`

  returns: `com.google.cloud.compute.v1.NetworkEndpointGroupsAttachEndpointsRequest$Builder`"
  (^com.google.cloud.compute.v1.NetworkEndpointGroupsAttachEndpointsRequest$Builder [^NetworkEndpointGroupsAttachEndpointsRequest$Builder this ^java.util.List network-endpoints]
    (-> this (.addAllNetworkEndpoints network-endpoints))))

(defn add-network-endpoints
  "The list of network endpoints to be attached.

  network-endpoints - `com.google.cloud.compute.v1.NetworkEndpoint`

  returns: `com.google.cloud.compute.v1.NetworkEndpointGroupsAttachEndpointsRequest$Builder`"
  (^com.google.cloud.compute.v1.NetworkEndpointGroupsAttachEndpointsRequest$Builder [^NetworkEndpointGroupsAttachEndpointsRequest$Builder this ^com.google.cloud.compute.v1.NetworkEndpoint network-endpoints]
    (-> this (.addNetworkEndpoints network-endpoints))))

(defn build
  "returns: `com.google.cloud.compute.v1.NetworkEndpointGroupsAttachEndpointsRequest`"
  (^com.google.cloud.compute.v1.NetworkEndpointGroupsAttachEndpointsRequest [^NetworkEndpointGroupsAttachEndpointsRequest$Builder this]
    (-> this (.build))))

(defn clone
  "returns: `com.google.cloud.compute.v1.NetworkEndpointGroupsAttachEndpointsRequest$Builder`"
  (^com.google.cloud.compute.v1.NetworkEndpointGroupsAttachEndpointsRequest$Builder [^NetworkEndpointGroupsAttachEndpointsRequest$Builder this]
    (-> this (.clone))))

