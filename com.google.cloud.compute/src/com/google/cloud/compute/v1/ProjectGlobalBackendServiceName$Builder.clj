(ns com.google.cloud.compute.v1.ProjectGlobalBackendServiceName$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ProjectGlobalBackendServiceName$Builder]))

(defn ->builder
  "Constructor.

  project-global-backend-service-name - `com.google.cloud.compute.v1.ProjectGlobalBackendServiceName`"
  (^ProjectGlobalBackendServiceName$Builder [^com.google.cloud.compute.v1.ProjectGlobalBackendServiceName project-global-backend-service-name]
    (new ProjectGlobalBackendServiceName$Builder project-global-backend-service-name)))

(defn get-backend-service
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalBackendServiceName$Builder this]
    (-> this (.getBackendService))))

(defn get-project
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalBackendServiceName$Builder this]
    (-> this (.getProject))))

(defn set-backend-service
  "backend-service - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectGlobalBackendServiceName$Builder`"
  (^com.google.cloud.compute.v1.ProjectGlobalBackendServiceName$Builder [^ProjectGlobalBackendServiceName$Builder this ^java.lang.String backend-service]
    (-> this (.setBackendService backend-service))))

(defn set-project
  "project - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectGlobalBackendServiceName$Builder`"
  (^com.google.cloud.compute.v1.ProjectGlobalBackendServiceName$Builder [^ProjectGlobalBackendServiceName$Builder this ^java.lang.String project]
    (-> this (.setProject project))))

(defn build
  "returns: `com.google.cloud.compute.v1.ProjectGlobalBackendServiceName`"
  (^com.google.cloud.compute.v1.ProjectGlobalBackendServiceName [^ProjectGlobalBackendServiceName$Builder this]
    (-> this (.build))))

