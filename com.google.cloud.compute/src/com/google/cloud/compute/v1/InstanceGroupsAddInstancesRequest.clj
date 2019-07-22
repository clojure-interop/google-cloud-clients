(ns com.google.cloud.compute.v1.InstanceGroupsAddInstancesRequest
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 InstanceGroupsAddInstancesRequest]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.InstanceGroupsAddInstancesRequest`

  returns: `com.google.cloud.compute.v1.InstanceGroupsAddInstancesRequest$Builder`"
  (^com.google.cloud.compute.v1.InstanceGroupsAddInstancesRequest$Builder [^com.google.cloud.compute.v1.InstanceGroupsAddInstancesRequest prototype]
    (InstanceGroupsAddInstancesRequest/newBuilder prototype))
  (^com.google.cloud.compute.v1.InstanceGroupsAddInstancesRequest$Builder []
    (InstanceGroupsAddInstancesRequest/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.InstanceGroupsAddInstancesRequest`"
  (^com.google.cloud.compute.v1.InstanceGroupsAddInstancesRequest []
    (InstanceGroupsAddInstancesRequest/getDefaultInstance )))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^InstanceGroupsAddInstancesRequest this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^InstanceGroupsAddInstancesRequest this]
    (-> this (.getApiMessageRequestBody))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^InstanceGroupsAddInstancesRequest this]
    (-> this (.getFieldMask))))

(defn get-instances-list
  "The list of instances to add to the instance group.

  returns: `java.util.List<com.google.cloud.compute.v1.InstanceReference>`"
  (^java.util.List [^InstanceGroupsAddInstancesRequest this]
    (-> this (.getInstancesList))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.InstanceGroupsAddInstancesRequest$Builder`"
  (^com.google.cloud.compute.v1.InstanceGroupsAddInstancesRequest$Builder [^InstanceGroupsAddInstancesRequest this]
    (-> this (.toBuilder))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^InstanceGroupsAddInstancesRequest this]
    (-> this (.toString))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^InstanceGroupsAddInstancesRequest this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^InstanceGroupsAddInstancesRequest this]
    (-> this (.hashCode))))

