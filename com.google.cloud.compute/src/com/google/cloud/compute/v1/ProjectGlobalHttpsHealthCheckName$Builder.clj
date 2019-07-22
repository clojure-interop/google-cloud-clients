(ns com.google.cloud.compute.v1.ProjectGlobalHttpsHealthCheckName$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ProjectGlobalHttpsHealthCheckName$Builder]))

(defn ->builder
  "Constructor.

  project-global-https-health-check-name - `com.google.cloud.compute.v1.ProjectGlobalHttpsHealthCheckName`"
  (^ProjectGlobalHttpsHealthCheckName$Builder [^com.google.cloud.compute.v1.ProjectGlobalHttpsHealthCheckName project-global-https-health-check-name]
    (new ProjectGlobalHttpsHealthCheckName$Builder project-global-https-health-check-name)))

(defn get-https-health-check
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalHttpsHealthCheckName$Builder this]
    (-> this (.getHttpsHealthCheck))))

(defn get-project
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalHttpsHealthCheckName$Builder this]
    (-> this (.getProject))))

(defn set-https-health-check
  "https-health-check - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectGlobalHttpsHealthCheckName$Builder`"
  (^com.google.cloud.compute.v1.ProjectGlobalHttpsHealthCheckName$Builder [^ProjectGlobalHttpsHealthCheckName$Builder this ^java.lang.String https-health-check]
    (-> this (.setHttpsHealthCheck https-health-check))))

(defn set-project
  "project - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectGlobalHttpsHealthCheckName$Builder`"
  (^com.google.cloud.compute.v1.ProjectGlobalHttpsHealthCheckName$Builder [^ProjectGlobalHttpsHealthCheckName$Builder this ^java.lang.String project]
    (-> this (.setProject project))))

(defn build
  "returns: `com.google.cloud.compute.v1.ProjectGlobalHttpsHealthCheckName`"
  (^com.google.cloud.compute.v1.ProjectGlobalHttpsHealthCheckName [^ProjectGlobalHttpsHealthCheckName$Builder this]
    (-> this (.build))))

