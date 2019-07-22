(ns com.google.cloud.compute.v1.NetworkEndpointWithHealthStatus
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 NetworkEndpointWithHealthStatus]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.NetworkEndpointWithHealthStatus`

  returns: `com.google.cloud.compute.v1.NetworkEndpointWithHealthStatus$Builder`"
  (^com.google.cloud.compute.v1.NetworkEndpointWithHealthStatus$Builder [^com.google.cloud.compute.v1.NetworkEndpointWithHealthStatus prototype]
    (NetworkEndpointWithHealthStatus/newBuilder prototype))
  (^com.google.cloud.compute.v1.NetworkEndpointWithHealthStatus$Builder []
    (NetworkEndpointWithHealthStatus/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.NetworkEndpointWithHealthStatus`"
  (^com.google.cloud.compute.v1.NetworkEndpointWithHealthStatus []
    (NetworkEndpointWithHealthStatus/getDefaultInstance )))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^NetworkEndpointWithHealthStatus this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^NetworkEndpointWithHealthStatus this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^NetworkEndpointWithHealthStatus this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^NetworkEndpointWithHealthStatus this]
    (-> this (.getApiMessageRequestBody))))

(defn get-healths-list
  "[Output only] The health status of network endpoint;

  returns: `java.util.List<com.google.cloud.compute.v1.HealthStatusForNetworkEndpoint>`"
  (^java.util.List [^NetworkEndpointWithHealthStatus this]
    (-> this (.getHealthsList))))

(defn hash-code
  "returns: `int`"
  (^Integer [^NetworkEndpointWithHealthStatus this]
    (-> this (.hashCode))))

(defn get-network-endpoint
  "[Output only] The network endpoint;

  returns: `com.google.cloud.compute.v1.NetworkEndpoint`"
  (^com.google.cloud.compute.v1.NetworkEndpoint [^NetworkEndpointWithHealthStatus this]
    (-> this (.getNetworkEndpoint))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^NetworkEndpointWithHealthStatus this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.NetworkEndpointWithHealthStatus$Builder`"
  (^com.google.cloud.compute.v1.NetworkEndpointWithHealthStatus$Builder [^NetworkEndpointWithHealthStatus this]
    (-> this (.toBuilder))))

