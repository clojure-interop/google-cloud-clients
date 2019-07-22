(ns com.google.cloud.compute.v1.ProjectGlobalImageResourceName$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ProjectGlobalImageResourceName$Builder]))

(defn ->builder
  "Constructor.

  project-global-image-resource-name - `com.google.cloud.compute.v1.ProjectGlobalImageResourceName`"
  (^ProjectGlobalImageResourceName$Builder [^com.google.cloud.compute.v1.ProjectGlobalImageResourceName project-global-image-resource-name]
    (new ProjectGlobalImageResourceName$Builder project-global-image-resource-name)))

(defn get-project
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalImageResourceName$Builder this]
    (-> this (.getProject))))

(defn get-resource
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalImageResourceName$Builder this]
    (-> this (.getResource))))

(defn set-project
  "project - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectGlobalImageResourceName$Builder`"
  (^com.google.cloud.compute.v1.ProjectGlobalImageResourceName$Builder [^ProjectGlobalImageResourceName$Builder this ^java.lang.String project]
    (-> this (.setProject project))))

(defn set-resource
  "resource - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectGlobalImageResourceName$Builder`"
  (^com.google.cloud.compute.v1.ProjectGlobalImageResourceName$Builder [^ProjectGlobalImageResourceName$Builder this ^java.lang.String resource]
    (-> this (.setResource resource))))

(defn build
  "returns: `com.google.cloud.compute.v1.ProjectGlobalImageResourceName`"
  (^com.google.cloud.compute.v1.ProjectGlobalImageResourceName [^ProjectGlobalImageResourceName$Builder this]
    (-> this (.build))))

