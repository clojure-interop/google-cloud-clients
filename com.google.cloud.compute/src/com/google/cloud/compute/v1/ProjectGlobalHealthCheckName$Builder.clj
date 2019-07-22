(ns com.google.cloud.compute.v1.ProjectGlobalHealthCheckName$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ProjectGlobalHealthCheckName$Builder]))

(defn ->builder
  "Constructor.

  project-global-health-check-name - `com.google.cloud.compute.v1.ProjectGlobalHealthCheckName`"
  (^ProjectGlobalHealthCheckName$Builder [^com.google.cloud.compute.v1.ProjectGlobalHealthCheckName project-global-health-check-name]
    (new ProjectGlobalHealthCheckName$Builder project-global-health-check-name)))

(defn get-health-check
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalHealthCheckName$Builder this]
    (-> this (.getHealthCheck))))

(defn get-project
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalHealthCheckName$Builder this]
    (-> this (.getProject))))

(defn set-health-check
  "health-check - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectGlobalHealthCheckName$Builder`"
  (^com.google.cloud.compute.v1.ProjectGlobalHealthCheckName$Builder [^ProjectGlobalHealthCheckName$Builder this ^java.lang.String health-check]
    (-> this (.setHealthCheck health-check))))

(defn set-project
  "project - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectGlobalHealthCheckName$Builder`"
  (^com.google.cloud.compute.v1.ProjectGlobalHealthCheckName$Builder [^ProjectGlobalHealthCheckName$Builder this ^java.lang.String project]
    (-> this (.setProject project))))

(defn build
  "returns: `com.google.cloud.compute.v1.ProjectGlobalHealthCheckName`"
  (^com.google.cloud.compute.v1.ProjectGlobalHealthCheckName [^ProjectGlobalHealthCheckName$Builder this]
    (-> this (.build))))

