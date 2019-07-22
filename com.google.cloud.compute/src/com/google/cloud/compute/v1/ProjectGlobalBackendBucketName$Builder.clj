(ns com.google.cloud.compute.v1.ProjectGlobalBackendBucketName$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ProjectGlobalBackendBucketName$Builder]))

(defn ->builder
  "Constructor.

  project-global-backend-bucket-name - `com.google.cloud.compute.v1.ProjectGlobalBackendBucketName`"
  (^ProjectGlobalBackendBucketName$Builder [^com.google.cloud.compute.v1.ProjectGlobalBackendBucketName project-global-backend-bucket-name]
    (new ProjectGlobalBackendBucketName$Builder project-global-backend-bucket-name)))

(defn get-backend-bucket
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalBackendBucketName$Builder this]
    (-> this (.getBackendBucket))))

(defn get-project
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalBackendBucketName$Builder this]
    (-> this (.getProject))))

(defn set-backend-bucket
  "backend-bucket - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectGlobalBackendBucketName$Builder`"
  (^com.google.cloud.compute.v1.ProjectGlobalBackendBucketName$Builder [^ProjectGlobalBackendBucketName$Builder this ^java.lang.String backend-bucket]
    (-> this (.setBackendBucket backend-bucket))))

(defn set-project
  "project - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectGlobalBackendBucketName$Builder`"
  (^com.google.cloud.compute.v1.ProjectGlobalBackendBucketName$Builder [^ProjectGlobalBackendBucketName$Builder this ^java.lang.String project]
    (-> this (.setProject project))))

(defn build
  "returns: `com.google.cloud.compute.v1.ProjectGlobalBackendBucketName`"
  (^com.google.cloud.compute.v1.ProjectGlobalBackendBucketName [^ProjectGlobalBackendBucketName$Builder this]
    (-> this (.build))))

