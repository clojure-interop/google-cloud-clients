(ns com.google.cloud.compute.v1.InstanceGroupManagersDeleteInstancesRequest
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 InstanceGroupManagersDeleteInstancesRequest]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.InstanceGroupManagersDeleteInstancesRequest`

  returns: `com.google.cloud.compute.v1.InstanceGroupManagersDeleteInstancesRequest$Builder`"
  (^com.google.cloud.compute.v1.InstanceGroupManagersDeleteInstancesRequest$Builder [^com.google.cloud.compute.v1.InstanceGroupManagersDeleteInstancesRequest prototype]
    (InstanceGroupManagersDeleteInstancesRequest/newBuilder prototype))
  (^com.google.cloud.compute.v1.InstanceGroupManagersDeleteInstancesRequest$Builder []
    (InstanceGroupManagersDeleteInstancesRequest/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.InstanceGroupManagersDeleteInstancesRequest`"
  (^com.google.cloud.compute.v1.InstanceGroupManagersDeleteInstancesRequest []
    (InstanceGroupManagersDeleteInstancesRequest/getDefaultInstance )))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^InstanceGroupManagersDeleteInstancesRequest this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^InstanceGroupManagersDeleteInstancesRequest this]
    (-> this (.getApiMessageRequestBody))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^InstanceGroupManagersDeleteInstancesRequest this]
    (-> this (.getFieldMask))))

(defn get-instances-list
  "The URLs of one or more instances to delete. This can be a full URL or a partial URL, such as
   zones/[ZONE]/instances/[INSTANCE_NAME].

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^InstanceGroupManagersDeleteInstancesRequest this]
    (-> this (.getInstancesList))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.InstanceGroupManagersDeleteInstancesRequest$Builder`"
  (^com.google.cloud.compute.v1.InstanceGroupManagersDeleteInstancesRequest$Builder [^InstanceGroupManagersDeleteInstancesRequest this]
    (-> this (.toBuilder))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^InstanceGroupManagersDeleteInstancesRequest this]
    (-> this (.toString))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^InstanceGroupManagersDeleteInstancesRequest this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^InstanceGroupManagersDeleteInstancesRequest this]
    (-> this (.hashCode))))

