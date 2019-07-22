(ns com.google.cloud.compute.v1.ProjectName$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ProjectName$Builder]))

(defn ->builder
  "Constructor.

  project-name - `com.google.cloud.compute.v1.ProjectName`"
  (^ProjectName$Builder [^com.google.cloud.compute.v1.ProjectName project-name]
    (new ProjectName$Builder project-name)))

(defn get-project
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectName$Builder this]
    (-> this (.getProject))))

(defn set-project
  "project - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectName$Builder`"
  (^com.google.cloud.compute.v1.ProjectName$Builder [^ProjectName$Builder this ^java.lang.String project]
    (-> this (.setProject project))))

(defn build
  "returns: `com.google.cloud.compute.v1.ProjectName`"
  (^com.google.cloud.compute.v1.ProjectName [^ProjectName$Builder this]
    (-> this (.build))))

