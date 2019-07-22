(ns com.google.cloud.compute.v1.BackendServiceGroupHealth$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 BackendServiceGroupHealth$Builder]))

(defn merge-from
  "other - `com.google.cloud.compute.v1.BackendServiceGroupHealth`

  returns: `com.google.cloud.compute.v1.BackendServiceGroupHealth$Builder`"
  (^com.google.cloud.compute.v1.BackendServiceGroupHealth$Builder [^BackendServiceGroupHealth$Builder this ^com.google.cloud.compute.v1.BackendServiceGroupHealth other]
    (-> this (.mergeFrom other))))

(defn get-health-status-list
  "Health state of the backend instances or endpoints in requested instance or network endpoint
   group, determined based on configured health checks.

  returns: `java.util.List<com.google.cloud.compute.v1.HealthStatus>`"
  (^java.util.List [^BackendServiceGroupHealth$Builder this]
    (-> this (.getHealthStatusList))))

(defn add-all-health-status
  "Health state of the backend instances or endpoints in requested instance or network endpoint
   group, determined based on configured health checks.

  health-status - `java.util.List`

  returns: `com.google.cloud.compute.v1.BackendServiceGroupHealth$Builder`"
  (^com.google.cloud.compute.v1.BackendServiceGroupHealth$Builder [^BackendServiceGroupHealth$Builder this ^java.util.List health-status]
    (-> this (.addAllHealthStatus health-status))))

(defn add-health-status
  "Health state of the backend instances or endpoints in requested instance or network endpoint
   group, determined based on configured health checks.

  health-status - `com.google.cloud.compute.v1.HealthStatus`

  returns: `com.google.cloud.compute.v1.BackendServiceGroupHealth$Builder`"
  (^com.google.cloud.compute.v1.BackendServiceGroupHealth$Builder [^BackendServiceGroupHealth$Builder this ^com.google.cloud.compute.v1.HealthStatus health-status]
    (-> this (.addHealthStatus health-status))))

(defn get-kind
  "[Output Only] Type of resource. Always compute#backendServiceGroupHealth for the health of
   backend services.

  returns: `java.lang.String`"
  (^java.lang.String [^BackendServiceGroupHealth$Builder this]
    (-> this (.getKind))))

(defn set-kind
  "[Output Only] Type of resource. Always compute#backendServiceGroupHealth for the health of
   backend services.

  kind - `java.lang.String`

  returns: `com.google.cloud.compute.v1.BackendServiceGroupHealth$Builder`"
  (^com.google.cloud.compute.v1.BackendServiceGroupHealth$Builder [^BackendServiceGroupHealth$Builder this ^java.lang.String kind]
    (-> this (.setKind kind))))

(defn build
  "returns: `com.google.cloud.compute.v1.BackendServiceGroupHealth`"
  (^com.google.cloud.compute.v1.BackendServiceGroupHealth [^BackendServiceGroupHealth$Builder this]
    (-> this (.build))))

(defn clone
  "returns: `com.google.cloud.compute.v1.BackendServiceGroupHealth$Builder`"
  (^com.google.cloud.compute.v1.BackendServiceGroupHealth$Builder [^BackendServiceGroupHealth$Builder this]
    (-> this (.clone))))

