(ns com.google.cloud.compute.v1.RegionInstanceGroupsListInstancesRequest
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 RegionInstanceGroupsListInstancesRequest]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.RegionInstanceGroupsListInstancesRequest`

  returns: `com.google.cloud.compute.v1.RegionInstanceGroupsListInstancesRequest$Builder`"
  (^com.google.cloud.compute.v1.RegionInstanceGroupsListInstancesRequest$Builder [^com.google.cloud.compute.v1.RegionInstanceGroupsListInstancesRequest prototype]
    (RegionInstanceGroupsListInstancesRequest/newBuilder prototype))
  (^com.google.cloud.compute.v1.RegionInstanceGroupsListInstancesRequest$Builder []
    (RegionInstanceGroupsListInstancesRequest/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.RegionInstanceGroupsListInstancesRequest`"
  (^com.google.cloud.compute.v1.RegionInstanceGroupsListInstancesRequest []
    (RegionInstanceGroupsListInstancesRequest/getDefaultInstance )))

(defn get-instance-state
  "Instances in which state should be returned. Valid options are: 'ALL', 'RUNNING'. By default,
   it lists all instances.

  returns: `java.lang.String`"
  (^java.lang.String [^RegionInstanceGroupsListInstancesRequest this]
    (-> this (.getInstanceState))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^RegionInstanceGroupsListInstancesRequest this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^RegionInstanceGroupsListInstancesRequest this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^RegionInstanceGroupsListInstancesRequest this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-port-name
  "Name of port user is interested in. It is optional. If it is set, only information about this
   ports will be returned. If it is not set, all the named ports will be returned. Always lists
   all instances.

  returns: `java.lang.String`"
  (^java.lang.String [^RegionInstanceGroupsListInstancesRequest this]
    (-> this (.getPortName))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^RegionInstanceGroupsListInstancesRequest this]
    (-> this (.getApiMessageRequestBody))))

(defn hash-code
  "returns: `int`"
  (^Integer [^RegionInstanceGroupsListInstancesRequest this]
    (-> this (.hashCode))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^RegionInstanceGroupsListInstancesRequest this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.RegionInstanceGroupsListInstancesRequest$Builder`"
  (^com.google.cloud.compute.v1.RegionInstanceGroupsListInstancesRequest$Builder [^RegionInstanceGroupsListInstancesRequest this]
    (-> this (.toBuilder))))

