(ns com.google.cloud.compute.v1.InstanceGroupsListInstancesRequest
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 InstanceGroupsListInstancesRequest]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.InstanceGroupsListInstancesRequest`

  returns: `com.google.cloud.compute.v1.InstanceGroupsListInstancesRequest$Builder`"
  (^com.google.cloud.compute.v1.InstanceGroupsListInstancesRequest$Builder [^com.google.cloud.compute.v1.InstanceGroupsListInstancesRequest prototype]
    (InstanceGroupsListInstancesRequest/newBuilder prototype))
  (^com.google.cloud.compute.v1.InstanceGroupsListInstancesRequest$Builder []
    (InstanceGroupsListInstancesRequest/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.InstanceGroupsListInstancesRequest`"
  (^com.google.cloud.compute.v1.InstanceGroupsListInstancesRequest []
    (InstanceGroupsListInstancesRequest/getDefaultInstance )))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^InstanceGroupsListInstancesRequest this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^InstanceGroupsListInstancesRequest this]
    (-> this (.getApiMessageRequestBody))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^InstanceGroupsListInstancesRequest this]
    (-> this (.getFieldMask))))

(defn get-instance-state
  "A filter for the state of the instances in the instance group. Valid options are ALL or
   RUNNING. If you do not specify this parameter the list includes all instances regardless of
   their state.

  returns: `java.lang.String`"
  (^java.lang.String [^InstanceGroupsListInstancesRequest this]
    (-> this (.getInstanceState))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.InstanceGroupsListInstancesRequest$Builder`"
  (^com.google.cloud.compute.v1.InstanceGroupsListInstancesRequest$Builder [^InstanceGroupsListInstancesRequest this]
    (-> this (.toBuilder))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^InstanceGroupsListInstancesRequest this]
    (-> this (.toString))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^InstanceGroupsListInstancesRequest this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^InstanceGroupsListInstancesRequest this]
    (-> this (.hashCode))))

