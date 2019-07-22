(ns com.google.cloud.compute.v1.HealthStatusForNetworkEndpoint
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 HealthStatusForNetworkEndpoint]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.HealthStatusForNetworkEndpoint`

  returns: `com.google.cloud.compute.v1.HealthStatusForNetworkEndpoint$Builder`"
  (^com.google.cloud.compute.v1.HealthStatusForNetworkEndpoint$Builder [^com.google.cloud.compute.v1.HealthStatusForNetworkEndpoint prototype]
    (HealthStatusForNetworkEndpoint/newBuilder prototype))
  (^com.google.cloud.compute.v1.HealthStatusForNetworkEndpoint$Builder []
    (HealthStatusForNetworkEndpoint/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.HealthStatusForNetworkEndpoint`"
  (^com.google.cloud.compute.v1.HealthStatusForNetworkEndpoint []
    (HealthStatusForNetworkEndpoint/getDefaultInstance )))

(defn get-backend-service
  "URL of the backend service associated with the health state of the network endpoint.

  returns: `com.google.cloud.compute.v1.BackendServiceReference`"
  (^com.google.cloud.compute.v1.BackendServiceReference [^HealthStatusForNetworkEndpoint this]
    (-> this (.getBackendService))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^HealthStatusForNetworkEndpoint this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^HealthStatusForNetworkEndpoint this]
    (-> this (.toString))))

(defn get-forwarding-rule
  "URL of the forwarding rule associated with the health state of the network endpoint.

  returns: `com.google.cloud.compute.v1.ForwardingRuleReference`"
  (^com.google.cloud.compute.v1.ForwardingRuleReference [^HealthStatusForNetworkEndpoint this]
    (-> this (.getForwardingRule))))

(defn get-health-check
  "URL of the health check associated with the health state of the network endpoint.

  returns: `com.google.cloud.compute.v1.HealthCheckReference`"
  (^com.google.cloud.compute.v1.HealthCheckReference [^HealthStatusForNetworkEndpoint this]
    (-> this (.getHealthCheck))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^HealthStatusForNetworkEndpoint this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^HealthStatusForNetworkEndpoint this]
    (-> this (.getApiMessageRequestBody))))

(defn hash-code
  "returns: `int`"
  (^Integer [^HealthStatusForNetworkEndpoint this]
    (-> this (.hashCode))))

(defn get-health-state
  "Health state of the network endpoint determined based on the health checks configured.

  returns: `java.lang.String`"
  (^java.lang.String [^HealthStatusForNetworkEndpoint this]
    (-> this (.getHealthState))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^HealthStatusForNetworkEndpoint this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.HealthStatusForNetworkEndpoint$Builder`"
  (^com.google.cloud.compute.v1.HealthStatusForNetworkEndpoint$Builder [^HealthStatusForNetworkEndpoint this]
    (-> this (.toBuilder))))

