(ns com.google.cloud.compute.v1.ProjectGlobalHttpHealthCheckName$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ProjectGlobalHttpHealthCheckName$Builder]))

(defn ->builder
  "Constructor.

  project-global-http-health-check-name - `com.google.cloud.compute.v1.ProjectGlobalHttpHealthCheckName`"
  (^ProjectGlobalHttpHealthCheckName$Builder [^com.google.cloud.compute.v1.ProjectGlobalHttpHealthCheckName project-global-http-health-check-name]
    (new ProjectGlobalHttpHealthCheckName$Builder project-global-http-health-check-name)))

(defn get-http-health-check
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalHttpHealthCheckName$Builder this]
    (-> this (.getHttpHealthCheck))))

(defn get-project
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalHttpHealthCheckName$Builder this]
    (-> this (.getProject))))

(defn set-http-health-check
  "http-health-check - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectGlobalHttpHealthCheckName$Builder`"
  (^com.google.cloud.compute.v1.ProjectGlobalHttpHealthCheckName$Builder [^ProjectGlobalHttpHealthCheckName$Builder this ^java.lang.String http-health-check]
    (-> this (.setHttpHealthCheck http-health-check))))

(defn set-project
  "project - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectGlobalHttpHealthCheckName$Builder`"
  (^com.google.cloud.compute.v1.ProjectGlobalHttpHealthCheckName$Builder [^ProjectGlobalHttpHealthCheckName$Builder this ^java.lang.String project]
    (-> this (.setProject project))))

(defn build
  "returns: `com.google.cloud.compute.v1.ProjectGlobalHttpHealthCheckName`"
  (^com.google.cloud.compute.v1.ProjectGlobalHttpHealthCheckName [^ProjectGlobalHttpHealthCheckName$Builder this]
    (-> this (.build))))

