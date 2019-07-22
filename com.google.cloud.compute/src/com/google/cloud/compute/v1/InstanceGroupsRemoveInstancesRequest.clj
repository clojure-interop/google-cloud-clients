(ns com.google.cloud.compute.v1.InstanceGroupsRemoveInstancesRequest
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 InstanceGroupsRemoveInstancesRequest]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.InstanceGroupsRemoveInstancesRequest`

  returns: `com.google.cloud.compute.v1.InstanceGroupsRemoveInstancesRequest$Builder`"
  (^com.google.cloud.compute.v1.InstanceGroupsRemoveInstancesRequest$Builder [^com.google.cloud.compute.v1.InstanceGroupsRemoveInstancesRequest prototype]
    (InstanceGroupsRemoveInstancesRequest/newBuilder prototype))
  (^com.google.cloud.compute.v1.InstanceGroupsRemoveInstancesRequest$Builder []
    (InstanceGroupsRemoveInstancesRequest/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.InstanceGroupsRemoveInstancesRequest`"
  (^com.google.cloud.compute.v1.InstanceGroupsRemoveInstancesRequest []
    (InstanceGroupsRemoveInstancesRequest/getDefaultInstance )))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^InstanceGroupsRemoveInstancesRequest this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^InstanceGroupsRemoveInstancesRequest this]
    (-> this (.getApiMessageRequestBody))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^InstanceGroupsRemoveInstancesRequest this]
    (-> this (.getFieldMask))))

(defn get-instances-list
  "The list of instances to remove from the instance group.

  returns: `java.util.List<com.google.cloud.compute.v1.InstanceReference>`"
  (^java.util.List [^InstanceGroupsRemoveInstancesRequest this]
    (-> this (.getInstancesList))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.InstanceGroupsRemoveInstancesRequest$Builder`"
  (^com.google.cloud.compute.v1.InstanceGroupsRemoveInstancesRequest$Builder [^InstanceGroupsRemoveInstancesRequest this]
    (-> this (.toBuilder))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^InstanceGroupsRemoveInstancesRequest this]
    (-> this (.toString))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^InstanceGroupsRemoveInstancesRequest this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^InstanceGroupsRemoveInstancesRequest this]
    (-> this (.hashCode))))

