(ns com.google.cloud.compute.v1.NetworkEndpointWithHealthStatus$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 NetworkEndpointWithHealthStatus$Builder]))

(defn merge-from
  "other - `com.google.cloud.compute.v1.NetworkEndpointWithHealthStatus`

  returns: `com.google.cloud.compute.v1.NetworkEndpointWithHealthStatus$Builder`"
  (^com.google.cloud.compute.v1.NetworkEndpointWithHealthStatus$Builder [^NetworkEndpointWithHealthStatus$Builder this ^com.google.cloud.compute.v1.NetworkEndpointWithHealthStatus other]
    (-> this (.mergeFrom other))))

(defn get-healths-list
  "[Output only] The health status of network endpoint;

  returns: `java.util.List<com.google.cloud.compute.v1.HealthStatusForNetworkEndpoint>`"
  (^java.util.List [^NetworkEndpointWithHealthStatus$Builder this]
    (-> this (.getHealthsList))))

(defn add-all-healths
  "[Output only] The health status of network endpoint;

  healths - `java.util.List`

  returns: `com.google.cloud.compute.v1.NetworkEndpointWithHealthStatus$Builder`"
  (^com.google.cloud.compute.v1.NetworkEndpointWithHealthStatus$Builder [^NetworkEndpointWithHealthStatus$Builder this ^java.util.List healths]
    (-> this (.addAllHealths healths))))

(defn add-healths
  "[Output only] The health status of network endpoint;

  healths - `com.google.cloud.compute.v1.HealthStatusForNetworkEndpoint`

  returns: `com.google.cloud.compute.v1.NetworkEndpointWithHealthStatus$Builder`"
  (^com.google.cloud.compute.v1.NetworkEndpointWithHealthStatus$Builder [^NetworkEndpointWithHealthStatus$Builder this ^com.google.cloud.compute.v1.HealthStatusForNetworkEndpoint healths]
    (-> this (.addHealths healths))))

(defn get-network-endpoint
  "[Output only] The network endpoint;

  returns: `com.google.cloud.compute.v1.NetworkEndpoint`"
  (^com.google.cloud.compute.v1.NetworkEndpoint [^NetworkEndpointWithHealthStatus$Builder this]
    (-> this (.getNetworkEndpoint))))

(defn set-network-endpoint
  "[Output only] The network endpoint;

  network-endpoint - `com.google.cloud.compute.v1.NetworkEndpoint`

  returns: `com.google.cloud.compute.v1.NetworkEndpointWithHealthStatus$Builder`"
  (^com.google.cloud.compute.v1.NetworkEndpointWithHealthStatus$Builder [^NetworkEndpointWithHealthStatus$Builder this ^com.google.cloud.compute.v1.NetworkEndpoint network-endpoint]
    (-> this (.setNetworkEndpoint network-endpoint))))

(defn build
  "returns: `com.google.cloud.compute.v1.NetworkEndpointWithHealthStatus`"
  (^com.google.cloud.compute.v1.NetworkEndpointWithHealthStatus [^NetworkEndpointWithHealthStatus$Builder this]
    (-> this (.build))))

(defn clone
  "returns: `com.google.cloud.compute.v1.NetworkEndpointWithHealthStatus$Builder`"
  (^com.google.cloud.compute.v1.NetworkEndpointWithHealthStatus$Builder [^NetworkEndpointWithHealthStatus$Builder this]
    (-> this (.clone))))

