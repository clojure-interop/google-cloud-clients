(ns com.google.cloud.compute.v1.RegionInstanceGroupManagersListInstancesResponse
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 RegionInstanceGroupManagersListInstancesResponse]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.RegionInstanceGroupManagersListInstancesResponse`

  returns: `com.google.cloud.compute.v1.RegionInstanceGroupManagersListInstancesResponse$Builder`"
  (^com.google.cloud.compute.v1.RegionInstanceGroupManagersListInstancesResponse$Builder [^com.google.cloud.compute.v1.RegionInstanceGroupManagersListInstancesResponse prototype]
    (RegionInstanceGroupManagersListInstancesResponse/newBuilder prototype))
  (^com.google.cloud.compute.v1.RegionInstanceGroupManagersListInstancesResponse$Builder []
    (RegionInstanceGroupManagersListInstancesResponse/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.RegionInstanceGroupManagersListInstancesResponse`"
  (^com.google.cloud.compute.v1.RegionInstanceGroupManagersListInstancesResponse []
    (RegionInstanceGroupManagersListInstancesResponse/getDefaultInstance )))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^RegionInstanceGroupManagersListInstancesResponse this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^RegionInstanceGroupManagersListInstancesResponse this]
    (-> this (.getApiMessageRequestBody))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^RegionInstanceGroupManagersListInstancesResponse this]
    (-> this (.getFieldMask))))

(defn get-managed-instances-list
  "A list of managed instances.

  returns: `java.util.List<com.google.cloud.compute.v1.ManagedInstance>`"
  (^java.util.List [^RegionInstanceGroupManagersListInstancesResponse this]
    (-> this (.getManagedInstancesList))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.RegionInstanceGroupManagersListInstancesResponse$Builder`"
  (^com.google.cloud.compute.v1.RegionInstanceGroupManagersListInstancesResponse$Builder [^RegionInstanceGroupManagersListInstancesResponse this]
    (-> this (.toBuilder))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^RegionInstanceGroupManagersListInstancesResponse this]
    (-> this (.toString))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^RegionInstanceGroupManagersListInstancesResponse this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^RegionInstanceGroupManagersListInstancesResponse this]
    (-> this (.hashCode))))

