(ns com.google.cloud.compute.v1.NetworkEndpointGroupsListEndpointsRequest
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 NetworkEndpointGroupsListEndpointsRequest]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.NetworkEndpointGroupsListEndpointsRequest`

  returns: `com.google.cloud.compute.v1.NetworkEndpointGroupsListEndpointsRequest$Builder`"
  (^com.google.cloud.compute.v1.NetworkEndpointGroupsListEndpointsRequest$Builder [^com.google.cloud.compute.v1.NetworkEndpointGroupsListEndpointsRequest prototype]
    (NetworkEndpointGroupsListEndpointsRequest/newBuilder prototype))
  (^com.google.cloud.compute.v1.NetworkEndpointGroupsListEndpointsRequest$Builder []
    (NetworkEndpointGroupsListEndpointsRequest/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.NetworkEndpointGroupsListEndpointsRequest`"
  (^com.google.cloud.compute.v1.NetworkEndpointGroupsListEndpointsRequest []
    (NetworkEndpointGroupsListEndpointsRequest/getDefaultInstance )))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^NetworkEndpointGroupsListEndpointsRequest this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^NetworkEndpointGroupsListEndpointsRequest this]
    (-> this (.getApiMessageRequestBody))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^NetworkEndpointGroupsListEndpointsRequest this]
    (-> this (.getFieldMask))))

(defn get-health-status
  "Optional query parameter for showing the health status of each network endpoint. Valid options
   are SKIP or SHOW. If you don't specifiy this parameter, the health status of network endpoints
   will not be provided.

  returns: `java.lang.String`"
  (^java.lang.String [^NetworkEndpointGroupsListEndpointsRequest this]
    (-> this (.getHealthStatus))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.NetworkEndpointGroupsListEndpointsRequest$Builder`"
  (^com.google.cloud.compute.v1.NetworkEndpointGroupsListEndpointsRequest$Builder [^NetworkEndpointGroupsListEndpointsRequest this]
    (-> this (.toBuilder))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^NetworkEndpointGroupsListEndpointsRequest this]
    (-> this (.toString))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^NetworkEndpointGroupsListEndpointsRequest this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^NetworkEndpointGroupsListEndpointsRequest this]
    (-> this (.hashCode))))

