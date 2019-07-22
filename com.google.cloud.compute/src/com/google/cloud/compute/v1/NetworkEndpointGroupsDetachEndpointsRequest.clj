(ns com.google.cloud.compute.v1.NetworkEndpointGroupsDetachEndpointsRequest
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 NetworkEndpointGroupsDetachEndpointsRequest]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.NetworkEndpointGroupsDetachEndpointsRequest`

  returns: `com.google.cloud.compute.v1.NetworkEndpointGroupsDetachEndpointsRequest$Builder`"
  (^com.google.cloud.compute.v1.NetworkEndpointGroupsDetachEndpointsRequest$Builder [^com.google.cloud.compute.v1.NetworkEndpointGroupsDetachEndpointsRequest prototype]
    (NetworkEndpointGroupsDetachEndpointsRequest/newBuilder prototype))
  (^com.google.cloud.compute.v1.NetworkEndpointGroupsDetachEndpointsRequest$Builder []
    (NetworkEndpointGroupsDetachEndpointsRequest/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.NetworkEndpointGroupsDetachEndpointsRequest`"
  (^com.google.cloud.compute.v1.NetworkEndpointGroupsDetachEndpointsRequest []
    (NetworkEndpointGroupsDetachEndpointsRequest/getDefaultInstance )))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^NetworkEndpointGroupsDetachEndpointsRequest this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^NetworkEndpointGroupsDetachEndpointsRequest this]
    (-> this (.getApiMessageRequestBody))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^NetworkEndpointGroupsDetachEndpointsRequest this]
    (-> this (.getFieldMask))))

(defn get-network-endpoints-list
  "The list of network endpoints to be detached.

  returns: `java.util.List<com.google.cloud.compute.v1.NetworkEndpoint>`"
  (^java.util.List [^NetworkEndpointGroupsDetachEndpointsRequest this]
    (-> this (.getNetworkEndpointsList))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.NetworkEndpointGroupsDetachEndpointsRequest$Builder`"
  (^com.google.cloud.compute.v1.NetworkEndpointGroupsDetachEndpointsRequest$Builder [^NetworkEndpointGroupsDetachEndpointsRequest this]
    (-> this (.toBuilder))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^NetworkEndpointGroupsDetachEndpointsRequest this]
    (-> this (.toString))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^NetworkEndpointGroupsDetachEndpointsRequest this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^NetworkEndpointGroupsDetachEndpointsRequest this]
    (-> this (.hashCode))))

