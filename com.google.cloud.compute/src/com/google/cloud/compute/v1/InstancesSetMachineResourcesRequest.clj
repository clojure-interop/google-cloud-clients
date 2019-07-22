(ns com.google.cloud.compute.v1.InstancesSetMachineResourcesRequest
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 InstancesSetMachineResourcesRequest]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.InstancesSetMachineResourcesRequest`

  returns: `com.google.cloud.compute.v1.InstancesSetMachineResourcesRequest$Builder`"
  (^com.google.cloud.compute.v1.InstancesSetMachineResourcesRequest$Builder [^com.google.cloud.compute.v1.InstancesSetMachineResourcesRequest prototype]
    (InstancesSetMachineResourcesRequest/newBuilder prototype))
  (^com.google.cloud.compute.v1.InstancesSetMachineResourcesRequest$Builder []
    (InstancesSetMachineResourcesRequest/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.InstancesSetMachineResourcesRequest`"
  (^com.google.cloud.compute.v1.InstancesSetMachineResourcesRequest []
    (InstancesSetMachineResourcesRequest/getDefaultInstance )))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^InstancesSetMachineResourcesRequest this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^InstancesSetMachineResourcesRequest this]
    (-> this (.getApiMessageRequestBody))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^InstancesSetMachineResourcesRequest this]
    (-> this (.getFieldMask))))

(defn get-guest-accelerators-list
  "A list of the type and count of accelerator cards attached to the instance.

  returns: `java.util.List<com.google.cloud.compute.v1.AcceleratorConfig>`"
  (^java.util.List [^InstancesSetMachineResourcesRequest this]
    (-> this (.getGuestAcceleratorsList))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.InstancesSetMachineResourcesRequest$Builder`"
  (^com.google.cloud.compute.v1.InstancesSetMachineResourcesRequest$Builder [^InstancesSetMachineResourcesRequest this]
    (-> this (.toBuilder))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^InstancesSetMachineResourcesRequest this]
    (-> this (.toString))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^InstancesSetMachineResourcesRequest this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^InstancesSetMachineResourcesRequest this]
    (-> this (.hashCode))))

