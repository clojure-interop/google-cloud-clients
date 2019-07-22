(ns com.google.cloud.compute.v1.InstancesSetMachineTypeRequest
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 InstancesSetMachineTypeRequest]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.InstancesSetMachineTypeRequest`

  returns: `com.google.cloud.compute.v1.InstancesSetMachineTypeRequest$Builder`"
  (^com.google.cloud.compute.v1.InstancesSetMachineTypeRequest$Builder [^com.google.cloud.compute.v1.InstancesSetMachineTypeRequest prototype]
    (InstancesSetMachineTypeRequest/newBuilder prototype))
  (^com.google.cloud.compute.v1.InstancesSetMachineTypeRequest$Builder []
    (InstancesSetMachineTypeRequest/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.InstancesSetMachineTypeRequest`"
  (^com.google.cloud.compute.v1.InstancesSetMachineTypeRequest []
    (InstancesSetMachineTypeRequest/getDefaultInstance )))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^InstancesSetMachineTypeRequest this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^InstancesSetMachineTypeRequest this]
    (-> this (.getApiMessageRequestBody))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^InstancesSetMachineTypeRequest this]
    (-> this (.getFieldMask))))

(defn get-machine-type
  "Full or partial URL of the machine type resource. See Machine Types for a full list of machine
   types. For example: zones/us-central1-f/machineTypes/n1-standard-1

  returns: `java.lang.String`"
  (^java.lang.String [^InstancesSetMachineTypeRequest this]
    (-> this (.getMachineType))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.InstancesSetMachineTypeRequest$Builder`"
  (^com.google.cloud.compute.v1.InstancesSetMachineTypeRequest$Builder [^InstancesSetMachineTypeRequest this]
    (-> this (.toBuilder))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^InstancesSetMachineTypeRequest this]
    (-> this (.toString))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^InstancesSetMachineTypeRequest this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^InstancesSetMachineTypeRequest this]
    (-> this (.hashCode))))

