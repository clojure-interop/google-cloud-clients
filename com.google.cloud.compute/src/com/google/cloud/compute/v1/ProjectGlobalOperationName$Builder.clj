(ns com.google.cloud.compute.v1.ProjectGlobalOperationName$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ProjectGlobalOperationName$Builder]))

(defn ->builder
  "Constructor.

  project-global-operation-name - `com.google.cloud.compute.v1.ProjectGlobalOperationName`"
  (^ProjectGlobalOperationName$Builder [^com.google.cloud.compute.v1.ProjectGlobalOperationName project-global-operation-name]
    (new ProjectGlobalOperationName$Builder project-global-operation-name)))

(defn get-operation
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalOperationName$Builder this]
    (-> this (.getOperation))))

(defn get-project
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalOperationName$Builder this]
    (-> this (.getProject))))

(defn set-operation
  "operation - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectGlobalOperationName$Builder`"
  (^com.google.cloud.compute.v1.ProjectGlobalOperationName$Builder [^ProjectGlobalOperationName$Builder this ^java.lang.String operation]
    (-> this (.setOperation operation))))

(defn set-project
  "project - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectGlobalOperationName$Builder`"
  (^com.google.cloud.compute.v1.ProjectGlobalOperationName$Builder [^ProjectGlobalOperationName$Builder this ^java.lang.String project]
    (-> this (.setProject project))))

(defn build
  "returns: `com.google.cloud.compute.v1.ProjectGlobalOperationName`"
  (^com.google.cloud.compute.v1.ProjectGlobalOperationName [^ProjectGlobalOperationName$Builder this]
    (-> this (.build))))

