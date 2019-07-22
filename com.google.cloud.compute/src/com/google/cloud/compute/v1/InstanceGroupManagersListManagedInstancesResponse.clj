(ns com.google.cloud.compute.v1.InstanceGroupManagersListManagedInstancesResponse
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 InstanceGroupManagersListManagedInstancesResponse]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.InstanceGroupManagersListManagedInstancesResponse`

  returns: `com.google.cloud.compute.v1.InstanceGroupManagersListManagedInstancesResponse$Builder`"
  (^com.google.cloud.compute.v1.InstanceGroupManagersListManagedInstancesResponse$Builder [^com.google.cloud.compute.v1.InstanceGroupManagersListManagedInstancesResponse prototype]
    (InstanceGroupManagersListManagedInstancesResponse/newBuilder prototype))
  (^com.google.cloud.compute.v1.InstanceGroupManagersListManagedInstancesResponse$Builder []
    (InstanceGroupManagersListManagedInstancesResponse/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.InstanceGroupManagersListManagedInstancesResponse`"
  (^com.google.cloud.compute.v1.InstanceGroupManagersListManagedInstancesResponse []
    (InstanceGroupManagersListManagedInstancesResponse/getDefaultInstance )))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^InstanceGroupManagersListManagedInstancesResponse this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^InstanceGroupManagersListManagedInstancesResponse this]
    (-> this (.getApiMessageRequestBody))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^InstanceGroupManagersListManagedInstancesResponse this]
    (-> this (.getFieldMask))))

(defn get-managed-instances-list
  "[Output Only] The list of instances in the managed instance group.

  returns: `java.util.List<com.google.cloud.compute.v1.ManagedInstance>`"
  (^java.util.List [^InstanceGroupManagersListManagedInstancesResponse this]
    (-> this (.getManagedInstancesList))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.InstanceGroupManagersListManagedInstancesResponse$Builder`"
  (^com.google.cloud.compute.v1.InstanceGroupManagersListManagedInstancesResponse$Builder [^InstanceGroupManagersListManagedInstancesResponse this]
    (-> this (.toBuilder))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^InstanceGroupManagersListManagedInstancesResponse this]
    (-> this (.toString))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^InstanceGroupManagersListManagedInstancesResponse this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^InstanceGroupManagersListManagedInstancesResponse this]
    (-> this (.hashCode))))

