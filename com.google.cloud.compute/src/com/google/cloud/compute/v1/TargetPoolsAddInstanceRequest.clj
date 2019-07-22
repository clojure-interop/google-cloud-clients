(ns com.google.cloud.compute.v1.TargetPoolsAddInstanceRequest
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 TargetPoolsAddInstanceRequest]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.TargetPoolsAddInstanceRequest`

  returns: `com.google.cloud.compute.v1.TargetPoolsAddInstanceRequest$Builder`"
  (^com.google.cloud.compute.v1.TargetPoolsAddInstanceRequest$Builder [^com.google.cloud.compute.v1.TargetPoolsAddInstanceRequest prototype]
    (TargetPoolsAddInstanceRequest/newBuilder prototype))
  (^com.google.cloud.compute.v1.TargetPoolsAddInstanceRequest$Builder []
    (TargetPoolsAddInstanceRequest/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.TargetPoolsAddInstanceRequest`"
  (^com.google.cloud.compute.v1.TargetPoolsAddInstanceRequest []
    (TargetPoolsAddInstanceRequest/getDefaultInstance )))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^TargetPoolsAddInstanceRequest this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^TargetPoolsAddInstanceRequest this]
    (-> this (.getApiMessageRequestBody))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^TargetPoolsAddInstanceRequest this]
    (-> this (.getFieldMask))))

(defn get-instances-list
  "A full or partial URL to an instance to add to this target pool. This can be a full or partial
   URL. For example, the following are valid URLs: -
   https://www.googleapis.com/compute/v1/projects/project-id/zones/zone/instances/instance-name -
   projects/project-id/zones/zone/instances/instance-name - zones/zone/instances/instance-name

  returns: `java.util.List<com.google.cloud.compute.v1.InstanceReference>`"
  (^java.util.List [^TargetPoolsAddInstanceRequest this]
    (-> this (.getInstancesList))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.TargetPoolsAddInstanceRequest$Builder`"
  (^com.google.cloud.compute.v1.TargetPoolsAddInstanceRequest$Builder [^TargetPoolsAddInstanceRequest this]
    (-> this (.toBuilder))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^TargetPoolsAddInstanceRequest this]
    (-> this (.toString))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^TargetPoolsAddInstanceRequest this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^TargetPoolsAddInstanceRequest this]
    (-> this (.hashCode))))

