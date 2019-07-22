(ns com.google.cloud.compute.v1.NetworkEndpointGroupsAttachEndpointsRequest
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 NetworkEndpointGroupsAttachEndpointsRequest]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.NetworkEndpointGroupsAttachEndpointsRequest`

  returns: `com.google.cloud.compute.v1.NetworkEndpointGroupsAttachEndpointsRequest$Builder`"
  (^com.google.cloud.compute.v1.NetworkEndpointGroupsAttachEndpointsRequest$Builder [^com.google.cloud.compute.v1.NetworkEndpointGroupsAttachEndpointsRequest prototype]
    (NetworkEndpointGroupsAttachEndpointsRequest/newBuilder prototype))
  (^com.google.cloud.compute.v1.NetworkEndpointGroupsAttachEndpointsRequest$Builder []
    (NetworkEndpointGroupsAttachEndpointsRequest/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.NetworkEndpointGroupsAttachEndpointsRequest`"
  (^com.google.cloud.compute.v1.NetworkEndpointGroupsAttachEndpointsRequest []
    (NetworkEndpointGroupsAttachEndpointsRequest/getDefaultInstance )))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^NetworkEndpointGroupsAttachEndpointsRequest this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^NetworkEndpointGroupsAttachEndpointsRequest this]
    (-> this (.getApiMessageRequestBody))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^NetworkEndpointGroupsAttachEndpointsRequest this]
    (-> this (.getFieldMask))))

(defn get-network-endpoints-list
  "The list of network endpoints to be attached.

  returns: `java.util.List<com.google.cloud.compute.v1.NetworkEndpoint>`"
  (^java.util.List [^NetworkEndpointGroupsAttachEndpointsRequest this]
    (-> this (.getNetworkEndpointsList))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.NetworkEndpointGroupsAttachEndpointsRequest$Builder`"
  (^com.google.cloud.compute.v1.NetworkEndpointGroupsAttachEndpointsRequest$Builder [^NetworkEndpointGroupsAttachEndpointsRequest this]
    (-> this (.toBuilder))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^NetworkEndpointGroupsAttachEndpointsRequest this]
    (-> this (.toString))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^NetworkEndpointGroupsAttachEndpointsRequest this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^NetworkEndpointGroupsAttachEndpointsRequest this]
    (-> this (.hashCode))))

