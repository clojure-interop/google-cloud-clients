(ns com.google.cloud.compute.v1.BackendServiceGroupHealth
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 BackendServiceGroupHealth]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.BackendServiceGroupHealth`

  returns: `com.google.cloud.compute.v1.BackendServiceGroupHealth$Builder`"
  (^com.google.cloud.compute.v1.BackendServiceGroupHealth$Builder [^com.google.cloud.compute.v1.BackendServiceGroupHealth prototype]
    (BackendServiceGroupHealth/newBuilder prototype))
  (^com.google.cloud.compute.v1.BackendServiceGroupHealth$Builder []
    (BackendServiceGroupHealth/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.BackendServiceGroupHealth`"
  (^com.google.cloud.compute.v1.BackendServiceGroupHealth []
    (BackendServiceGroupHealth/getDefaultInstance )))

(defn get-kind
  "[Output Only] Type of resource. Always compute#backendServiceGroupHealth for the health of
   backend services.

  returns: `java.lang.String`"
  (^java.lang.String [^BackendServiceGroupHealth this]
    (-> this (.getKind))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^BackendServiceGroupHealth this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^BackendServiceGroupHealth this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^BackendServiceGroupHealth this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-health-status-list
  "Health state of the backend instances or endpoints in requested instance or network endpoint
   group, determined based on configured health checks.

  returns: `java.util.List<com.google.cloud.compute.v1.HealthStatus>`"
  (^java.util.List [^BackendServiceGroupHealth this]
    (-> this (.getHealthStatusList))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^BackendServiceGroupHealth this]
    (-> this (.getApiMessageRequestBody))))

(defn hash-code
  "returns: `int`"
  (^Integer [^BackendServiceGroupHealth this]
    (-> this (.hashCode))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^BackendServiceGroupHealth this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.BackendServiceGroupHealth$Builder`"
  (^com.google.cloud.compute.v1.BackendServiceGroupHealth$Builder [^BackendServiceGroupHealth this]
    (-> this (.toBuilder))))

