(ns com.google.cloud.compute.v1.InstanceGroupManagersRecreateInstancesRequest
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 InstanceGroupManagersRecreateInstancesRequest]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.InstanceGroupManagersRecreateInstancesRequest`

  returns: `com.google.cloud.compute.v1.InstanceGroupManagersRecreateInstancesRequest$Builder`"
  (^com.google.cloud.compute.v1.InstanceGroupManagersRecreateInstancesRequest$Builder [^com.google.cloud.compute.v1.InstanceGroupManagersRecreateInstancesRequest prototype]
    (InstanceGroupManagersRecreateInstancesRequest/newBuilder prototype))
  (^com.google.cloud.compute.v1.InstanceGroupManagersRecreateInstancesRequest$Builder []
    (InstanceGroupManagersRecreateInstancesRequest/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.InstanceGroupManagersRecreateInstancesRequest`"
  (^com.google.cloud.compute.v1.InstanceGroupManagersRecreateInstancesRequest []
    (InstanceGroupManagersRecreateInstancesRequest/getDefaultInstance )))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^InstanceGroupManagersRecreateInstancesRequest this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^InstanceGroupManagersRecreateInstancesRequest this]
    (-> this (.getApiMessageRequestBody))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^InstanceGroupManagersRecreateInstancesRequest this]
    (-> this (.getFieldMask))))

(defn get-instances-list
  "The URLs of one or more instances to recreate. This can be a full URL or a partial URL, such as
   zones/[ZONE]/instances/[INSTANCE_NAME].

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^InstanceGroupManagersRecreateInstancesRequest this]
    (-> this (.getInstancesList))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.InstanceGroupManagersRecreateInstancesRequest$Builder`"
  (^com.google.cloud.compute.v1.InstanceGroupManagersRecreateInstancesRequest$Builder [^InstanceGroupManagersRecreateInstancesRequest this]
    (-> this (.toBuilder))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^InstanceGroupManagersRecreateInstancesRequest this]
    (-> this (.toString))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^InstanceGroupManagersRecreateInstancesRequest this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^InstanceGroupManagersRecreateInstancesRequest this]
    (-> this (.hashCode))))

