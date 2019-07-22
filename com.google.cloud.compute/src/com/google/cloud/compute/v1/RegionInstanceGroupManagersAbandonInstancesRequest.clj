(ns com.google.cloud.compute.v1.RegionInstanceGroupManagersAbandonInstancesRequest
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 RegionInstanceGroupManagersAbandonInstancesRequest]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.RegionInstanceGroupManagersAbandonInstancesRequest`

  returns: `com.google.cloud.compute.v1.RegionInstanceGroupManagersAbandonInstancesRequest$Builder`"
  (^com.google.cloud.compute.v1.RegionInstanceGroupManagersAbandonInstancesRequest$Builder [^com.google.cloud.compute.v1.RegionInstanceGroupManagersAbandonInstancesRequest prototype]
    (RegionInstanceGroupManagersAbandonInstancesRequest/newBuilder prototype))
  (^com.google.cloud.compute.v1.RegionInstanceGroupManagersAbandonInstancesRequest$Builder []
    (RegionInstanceGroupManagersAbandonInstancesRequest/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.RegionInstanceGroupManagersAbandonInstancesRequest`"
  (^com.google.cloud.compute.v1.RegionInstanceGroupManagersAbandonInstancesRequest []
    (RegionInstanceGroupManagersAbandonInstancesRequest/getDefaultInstance )))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^RegionInstanceGroupManagersAbandonInstancesRequest this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^RegionInstanceGroupManagersAbandonInstancesRequest this]
    (-> this (.getApiMessageRequestBody))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^RegionInstanceGroupManagersAbandonInstancesRequest this]
    (-> this (.getFieldMask))))

(defn get-instances-list
  "The URLs of one or more instances to abandon. This can be a full URL or a partial URL, such as
   zones/[ZONE]/instances/[INSTANCE_NAME].

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^RegionInstanceGroupManagersAbandonInstancesRequest this]
    (-> this (.getInstancesList))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.RegionInstanceGroupManagersAbandonInstancesRequest$Builder`"
  (^com.google.cloud.compute.v1.RegionInstanceGroupManagersAbandonInstancesRequest$Builder [^RegionInstanceGroupManagersAbandonInstancesRequest this]
    (-> this (.toBuilder))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^RegionInstanceGroupManagersAbandonInstancesRequest this]
    (-> this (.toString))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^RegionInstanceGroupManagersAbandonInstancesRequest this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^RegionInstanceGroupManagersAbandonInstancesRequest this]
    (-> this (.hashCode))))

