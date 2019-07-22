(ns com.google.cloud.compute.v1.ProjectRegionBackendServiceName$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ProjectRegionBackendServiceName$Builder]))

(defn ->builder
  "Constructor.

  project-region-backend-service-name - `com.google.cloud.compute.v1.ProjectRegionBackendServiceName`"
  (^ProjectRegionBackendServiceName$Builder [^com.google.cloud.compute.v1.ProjectRegionBackendServiceName project-region-backend-service-name]
    (new ProjectRegionBackendServiceName$Builder project-region-backend-service-name)))

(defn get-backend-service
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectRegionBackendServiceName$Builder this]
    (-> this (.getBackendService))))

(defn get-project
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectRegionBackendServiceName$Builder this]
    (-> this (.getProject))))

(defn get-region
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectRegionBackendServiceName$Builder this]
    (-> this (.getRegion))))

(defn set-backend-service
  "backend-service - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectRegionBackendServiceName$Builder`"
  (^com.google.cloud.compute.v1.ProjectRegionBackendServiceName$Builder [^ProjectRegionBackendServiceName$Builder this ^java.lang.String backend-service]
    (-> this (.setBackendService backend-service))))

(defn set-project
  "project - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectRegionBackendServiceName$Builder`"
  (^com.google.cloud.compute.v1.ProjectRegionBackendServiceName$Builder [^ProjectRegionBackendServiceName$Builder this ^java.lang.String project]
    (-> this (.setProject project))))

(defn set-region
  "region - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectRegionBackendServiceName$Builder`"
  (^com.google.cloud.compute.v1.ProjectRegionBackendServiceName$Builder [^ProjectRegionBackendServiceName$Builder this ^java.lang.String region]
    (-> this (.setRegion region))))

(defn build
  "returns: `com.google.cloud.compute.v1.ProjectRegionBackendServiceName`"
  (^com.google.cloud.compute.v1.ProjectRegionBackendServiceName [^ProjectRegionBackendServiceName$Builder this]
    (-> this (.build))))

