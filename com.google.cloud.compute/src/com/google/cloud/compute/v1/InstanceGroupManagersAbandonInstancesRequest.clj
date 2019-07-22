(ns com.google.cloud.compute.v1.InstanceGroupManagersAbandonInstancesRequest
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 InstanceGroupManagersAbandonInstancesRequest]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.InstanceGroupManagersAbandonInstancesRequest`

  returns: `com.google.cloud.compute.v1.InstanceGroupManagersAbandonInstancesRequest$Builder`"
  (^com.google.cloud.compute.v1.InstanceGroupManagersAbandonInstancesRequest$Builder [^com.google.cloud.compute.v1.InstanceGroupManagersAbandonInstancesRequest prototype]
    (InstanceGroupManagersAbandonInstancesRequest/newBuilder prototype))
  (^com.google.cloud.compute.v1.InstanceGroupManagersAbandonInstancesRequest$Builder []
    (InstanceGroupManagersAbandonInstancesRequest/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.InstanceGroupManagersAbandonInstancesRequest`"
  (^com.google.cloud.compute.v1.InstanceGroupManagersAbandonInstancesRequest []
    (InstanceGroupManagersAbandonInstancesRequest/getDefaultInstance )))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^InstanceGroupManagersAbandonInstancesRequest this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^InstanceGroupManagersAbandonInstancesRequest this]
    (-> this (.getApiMessageRequestBody))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^InstanceGroupManagersAbandonInstancesRequest this]
    (-> this (.getFieldMask))))

(defn get-instances-list
  "The URLs of one or more instances to abandon. This can be a full URL or a partial URL, such as
   zones/[ZONE]/instances/[INSTANCE_NAME].

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^InstanceGroupManagersAbandonInstancesRequest this]
    (-> this (.getInstancesList))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.InstanceGroupManagersAbandonInstancesRequest$Builder`"
  (^com.google.cloud.compute.v1.InstanceGroupManagersAbandonInstancesRequest$Builder [^InstanceGroupManagersAbandonInstancesRequest this]
    (-> this (.toBuilder))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^InstanceGroupManagersAbandonInstancesRequest this]
    (-> this (.toString))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^InstanceGroupManagersAbandonInstancesRequest this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^InstanceGroupManagersAbandonInstancesRequest this]
    (-> this (.hashCode))))

