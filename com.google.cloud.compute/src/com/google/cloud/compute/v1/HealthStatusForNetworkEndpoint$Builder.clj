(ns com.google.cloud.compute.v1.HealthStatusForNetworkEndpoint$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 HealthStatusForNetworkEndpoint$Builder]))

(defn set-health-state
  "Health state of the network endpoint determined based on the health checks configured.

  health-state - `java.lang.String`

  returns: `com.google.cloud.compute.v1.HealthStatusForNetworkEndpoint$Builder`"
  (^com.google.cloud.compute.v1.HealthStatusForNetworkEndpoint$Builder [^HealthStatusForNetworkEndpoint$Builder this ^java.lang.String health-state]
    (-> this (.setHealthState health-state))))

(defn set-backend-service
  "URL of the backend service associated with the health state of the network endpoint.

  backend-service - `com.google.cloud.compute.v1.BackendServiceReference`

  returns: `com.google.cloud.compute.v1.HealthStatusForNetworkEndpoint$Builder`"
  (^com.google.cloud.compute.v1.HealthStatusForNetworkEndpoint$Builder [^HealthStatusForNetworkEndpoint$Builder this ^com.google.cloud.compute.v1.BackendServiceReference backend-service]
    (-> this (.setBackendService backend-service))))

(defn set-health-check
  "URL of the health check associated with the health state of the network endpoint.

  health-check - `com.google.cloud.compute.v1.HealthCheckReference`

  returns: `com.google.cloud.compute.v1.HealthStatusForNetworkEndpoint$Builder`"
  (^com.google.cloud.compute.v1.HealthStatusForNetworkEndpoint$Builder [^HealthStatusForNetworkEndpoint$Builder this ^com.google.cloud.compute.v1.HealthCheckReference health-check]
    (-> this (.setHealthCheck health-check))))

(defn get-backend-service
  "URL of the backend service associated with the health state of the network endpoint.

  returns: `com.google.cloud.compute.v1.BackendServiceReference`"
  (^com.google.cloud.compute.v1.BackendServiceReference [^HealthStatusForNetworkEndpoint$Builder this]
    (-> this (.getBackendService))))

(defn get-forwarding-rule
  "URL of the forwarding rule associated with the health state of the network endpoint.

  returns: `com.google.cloud.compute.v1.ForwardingRuleReference`"
  (^com.google.cloud.compute.v1.ForwardingRuleReference [^HealthStatusForNetworkEndpoint$Builder this]
    (-> this (.getForwardingRule))))

(defn get-health-check
  "URL of the health check associated with the health state of the network endpoint.

  returns: `com.google.cloud.compute.v1.HealthCheckReference`"
  (^com.google.cloud.compute.v1.HealthCheckReference [^HealthStatusForNetworkEndpoint$Builder this]
    (-> this (.getHealthCheck))))

(defn set-forwarding-rule
  "URL of the forwarding rule associated with the health state of the network endpoint.

  forwarding-rule - `com.google.cloud.compute.v1.ForwardingRuleReference`

  returns: `com.google.cloud.compute.v1.HealthStatusForNetworkEndpoint$Builder`"
  (^com.google.cloud.compute.v1.HealthStatusForNetworkEndpoint$Builder [^HealthStatusForNetworkEndpoint$Builder this ^com.google.cloud.compute.v1.ForwardingRuleReference forwarding-rule]
    (-> this (.setForwardingRule forwarding-rule))))

(defn build
  "returns: `com.google.cloud.compute.v1.HealthStatusForNetworkEndpoint`"
  (^com.google.cloud.compute.v1.HealthStatusForNetworkEndpoint [^HealthStatusForNetworkEndpoint$Builder this]
    (-> this (.build))))

(defn merge-from
  "other - `com.google.cloud.compute.v1.HealthStatusForNetworkEndpoint`

  returns: `com.google.cloud.compute.v1.HealthStatusForNetworkEndpoint$Builder`"
  (^com.google.cloud.compute.v1.HealthStatusForNetworkEndpoint$Builder [^HealthStatusForNetworkEndpoint$Builder this ^com.google.cloud.compute.v1.HealthStatusForNetworkEndpoint other]
    (-> this (.mergeFrom other))))

(defn clone
  "returns: `com.google.cloud.compute.v1.HealthStatusForNetworkEndpoint$Builder`"
  (^com.google.cloud.compute.v1.HealthStatusForNetworkEndpoint$Builder [^HealthStatusForNetworkEndpoint$Builder this]
    (-> this (.clone))))

(defn get-health-state
  "Health state of the network endpoint determined based on the health checks configured.

  returns: `java.lang.String`"
  (^java.lang.String [^HealthStatusForNetworkEndpoint$Builder this]
    (-> this (.getHealthState))))

