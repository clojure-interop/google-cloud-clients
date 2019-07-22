(ns com.google.cloud.compute.v1.RegionInstanceGroupManagersDeleteInstancesRequest
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 RegionInstanceGroupManagersDeleteInstancesRequest]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.RegionInstanceGroupManagersDeleteInstancesRequest`

  returns: `com.google.cloud.compute.v1.RegionInstanceGroupManagersDeleteInstancesRequest$Builder`"
  (^com.google.cloud.compute.v1.RegionInstanceGroupManagersDeleteInstancesRequest$Builder [^com.google.cloud.compute.v1.RegionInstanceGroupManagersDeleteInstancesRequest prototype]
    (RegionInstanceGroupManagersDeleteInstancesRequest/newBuilder prototype))
  (^com.google.cloud.compute.v1.RegionInstanceGroupManagersDeleteInstancesRequest$Builder []
    (RegionInstanceGroupManagersDeleteInstancesRequest/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.RegionInstanceGroupManagersDeleteInstancesRequest`"
  (^com.google.cloud.compute.v1.RegionInstanceGroupManagersDeleteInstancesRequest []
    (RegionInstanceGroupManagersDeleteInstancesRequest/getDefaultInstance )))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^RegionInstanceGroupManagersDeleteInstancesRequest this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^RegionInstanceGroupManagersDeleteInstancesRequest this]
    (-> this (.getApiMessageRequestBody))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^RegionInstanceGroupManagersDeleteInstancesRequest this]
    (-> this (.getFieldMask))))

(defn get-instances-list
  "The URLs of one or more instances to delete. This can be a full URL or a partial URL, such as
   zones/[ZONE]/instances/[INSTANCE_NAME].

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^RegionInstanceGroupManagersDeleteInstancesRequest this]
    (-> this (.getInstancesList))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.RegionInstanceGroupManagersDeleteInstancesRequest$Builder`"
  (^com.google.cloud.compute.v1.RegionInstanceGroupManagersDeleteInstancesRequest$Builder [^RegionInstanceGroupManagersDeleteInstancesRequest this]
    (-> this (.toBuilder))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^RegionInstanceGroupManagersDeleteInstancesRequest this]
    (-> this (.toString))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^RegionInstanceGroupManagersDeleteInstancesRequest this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^RegionInstanceGroupManagersDeleteInstancesRequest this]
    (-> this (.hashCode))))

