(ns com.google.cloud.compute.v1.ProjectGlobalImageName$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ProjectGlobalImageName$Builder]))

(defn ->builder
  "Constructor.

  project-global-image-name - `com.google.cloud.compute.v1.ProjectGlobalImageName`"
  (^ProjectGlobalImageName$Builder [^com.google.cloud.compute.v1.ProjectGlobalImageName project-global-image-name]
    (new ProjectGlobalImageName$Builder project-global-image-name)))

(defn get-image
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalImageName$Builder this]
    (-> this (.getImage))))

(defn get-project
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalImageName$Builder this]
    (-> this (.getProject))))

(defn set-image
  "image - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectGlobalImageName$Builder`"
  (^com.google.cloud.compute.v1.ProjectGlobalImageName$Builder [^ProjectGlobalImageName$Builder this ^java.lang.String image]
    (-> this (.setImage image))))

(defn set-project
  "project - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectGlobalImageName$Builder`"
  (^com.google.cloud.compute.v1.ProjectGlobalImageName$Builder [^ProjectGlobalImageName$Builder this ^java.lang.String project]
    (-> this (.setProject project))))

(defn build
  "returns: `com.google.cloud.compute.v1.ProjectGlobalImageName`"
  (^com.google.cloud.compute.v1.ProjectGlobalImageName [^ProjectGlobalImageName$Builder this]
    (-> this (.build))))

