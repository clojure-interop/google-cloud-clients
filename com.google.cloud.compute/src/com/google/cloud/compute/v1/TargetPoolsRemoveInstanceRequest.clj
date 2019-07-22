(ns com.google.cloud.compute.v1.TargetPoolsRemoveInstanceRequest
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 TargetPoolsRemoveInstanceRequest]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.TargetPoolsRemoveInstanceRequest`

  returns: `com.google.cloud.compute.v1.TargetPoolsRemoveInstanceRequest$Builder`"
  (^com.google.cloud.compute.v1.TargetPoolsRemoveInstanceRequest$Builder [^com.google.cloud.compute.v1.TargetPoolsRemoveInstanceRequest prototype]
    (TargetPoolsRemoveInstanceRequest/newBuilder prototype))
  (^com.google.cloud.compute.v1.TargetPoolsRemoveInstanceRequest$Builder []
    (TargetPoolsRemoveInstanceRequest/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.TargetPoolsRemoveInstanceRequest`"
  (^com.google.cloud.compute.v1.TargetPoolsRemoveInstanceRequest []
    (TargetPoolsRemoveInstanceRequest/getDefaultInstance )))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^TargetPoolsRemoveInstanceRequest this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^TargetPoolsRemoveInstanceRequest this]
    (-> this (.getApiMessageRequestBody))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^TargetPoolsRemoveInstanceRequest this]
    (-> this (.getFieldMask))))

(defn get-instances-list
  "URLs of the instances to be removed from target pool.

  returns: `java.util.List<com.google.cloud.compute.v1.InstanceReference>`"
  (^java.util.List [^TargetPoolsRemoveInstanceRequest this]
    (-> this (.getInstancesList))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.TargetPoolsRemoveInstanceRequest$Builder`"
  (^com.google.cloud.compute.v1.TargetPoolsRemoveInstanceRequest$Builder [^TargetPoolsRemoveInstanceRequest this]
    (-> this (.toBuilder))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^TargetPoolsRemoveInstanceRequest this]
    (-> this (.toString))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^TargetPoolsRemoveInstanceRequest this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^TargetPoolsRemoveInstanceRequest this]
    (-> this (.hashCode))))

