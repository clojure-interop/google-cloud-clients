(ns com.google.cloud.compute.v1.TargetPoolsRemoveHealthCheckRequest
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 TargetPoolsRemoveHealthCheckRequest]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.TargetPoolsRemoveHealthCheckRequest`

  returns: `com.google.cloud.compute.v1.TargetPoolsRemoveHealthCheckRequest$Builder`"
  (^com.google.cloud.compute.v1.TargetPoolsRemoveHealthCheckRequest$Builder [^com.google.cloud.compute.v1.TargetPoolsRemoveHealthCheckRequest prototype]
    (TargetPoolsRemoveHealthCheckRequest/newBuilder prototype))
  (^com.google.cloud.compute.v1.TargetPoolsRemoveHealthCheckRequest$Builder []
    (TargetPoolsRemoveHealthCheckRequest/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.TargetPoolsRemoveHealthCheckRequest`"
  (^com.google.cloud.compute.v1.TargetPoolsRemoveHealthCheckRequest []
    (TargetPoolsRemoveHealthCheckRequest/getDefaultInstance )))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^TargetPoolsRemoveHealthCheckRequest this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^TargetPoolsRemoveHealthCheckRequest this]
    (-> this (.getApiMessageRequestBody))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^TargetPoolsRemoveHealthCheckRequest this]
    (-> this (.getFieldMask))))

(defn get-health-checks-list
  "Health check URL to be removed. This can be a full or valid partial URL. For example, the
   following are valid URLs: -
   https://www.googleapis.com/compute/beta/projects/project/global/httpHealthChecks/health-check -
   projects/project/global/httpHealthChecks/health-check - global/httpHealthChecks/health-check

  returns: `java.util.List<com.google.cloud.compute.v1.HealthCheckReference>`"
  (^java.util.List [^TargetPoolsRemoveHealthCheckRequest this]
    (-> this (.getHealthChecksList))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.TargetPoolsRemoveHealthCheckRequest$Builder`"
  (^com.google.cloud.compute.v1.TargetPoolsRemoveHealthCheckRequest$Builder [^TargetPoolsRemoveHealthCheckRequest this]
    (-> this (.toBuilder))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^TargetPoolsRemoveHealthCheckRequest this]
    (-> this (.toString))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^TargetPoolsRemoveHealthCheckRequest this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^TargetPoolsRemoveHealthCheckRequest this]
    (-> this (.hashCode))))

