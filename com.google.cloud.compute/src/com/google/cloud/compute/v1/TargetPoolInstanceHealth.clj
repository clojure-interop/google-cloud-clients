(ns com.google.cloud.compute.v1.TargetPoolInstanceHealth
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 TargetPoolInstanceHealth]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.TargetPoolInstanceHealth`

  returns: `com.google.cloud.compute.v1.TargetPoolInstanceHealth$Builder`"
  (^com.google.cloud.compute.v1.TargetPoolInstanceHealth$Builder [^com.google.cloud.compute.v1.TargetPoolInstanceHealth prototype]
    (TargetPoolInstanceHealth/newBuilder prototype))
  (^com.google.cloud.compute.v1.TargetPoolInstanceHealth$Builder []
    (TargetPoolInstanceHealth/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.TargetPoolInstanceHealth`"
  (^com.google.cloud.compute.v1.TargetPoolInstanceHealth []
    (TargetPoolInstanceHealth/getDefaultInstance )))

(defn get-kind
  "[Output Only] Type of resource. Always compute#targetPoolInstanceHealth when checking the
   health of an instance.

  returns: `java.lang.String`"
  (^java.lang.String [^TargetPoolInstanceHealth this]
    (-> this (.getKind))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^TargetPoolInstanceHealth this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^TargetPoolInstanceHealth this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^TargetPoolInstanceHealth this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-health-status-list
  "returns: `java.util.List<com.google.cloud.compute.v1.HealthStatus>`"
  (^java.util.List [^TargetPoolInstanceHealth this]
    (-> this (.getHealthStatusList))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^TargetPoolInstanceHealth this]
    (-> this (.getApiMessageRequestBody))))

(defn hash-code
  "returns: `int`"
  (^Integer [^TargetPoolInstanceHealth this]
    (-> this (.hashCode))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^TargetPoolInstanceHealth this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.TargetPoolInstanceHealth$Builder`"
  (^com.google.cloud.compute.v1.TargetPoolInstanceHealth$Builder [^TargetPoolInstanceHealth this]
    (-> this (.toBuilder))))

