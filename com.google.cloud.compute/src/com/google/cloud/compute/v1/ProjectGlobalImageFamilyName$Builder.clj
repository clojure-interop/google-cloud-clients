(ns com.google.cloud.compute.v1.ProjectGlobalImageFamilyName$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ProjectGlobalImageFamilyName$Builder]))

(defn ->builder
  "Constructor.

  project-global-image-family-name - `com.google.cloud.compute.v1.ProjectGlobalImageFamilyName`"
  (^ProjectGlobalImageFamilyName$Builder [^com.google.cloud.compute.v1.ProjectGlobalImageFamilyName project-global-image-family-name]
    (new ProjectGlobalImageFamilyName$Builder project-global-image-family-name)))

(defn get-family
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalImageFamilyName$Builder this]
    (-> this (.getFamily))))

(defn get-project
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalImageFamilyName$Builder this]
    (-> this (.getProject))))

(defn set-family
  "family - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectGlobalImageFamilyName$Builder`"
  (^com.google.cloud.compute.v1.ProjectGlobalImageFamilyName$Builder [^ProjectGlobalImageFamilyName$Builder this ^java.lang.String family]
    (-> this (.setFamily family))))

(defn set-project
  "project - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectGlobalImageFamilyName$Builder`"
  (^com.google.cloud.compute.v1.ProjectGlobalImageFamilyName$Builder [^ProjectGlobalImageFamilyName$Builder this ^java.lang.String project]
    (-> this (.setProject project))))

(defn build
  "returns: `com.google.cloud.compute.v1.ProjectGlobalImageFamilyName`"
  (^com.google.cloud.compute.v1.ProjectGlobalImageFamilyName [^ProjectGlobalImageFamilyName$Builder this]
    (-> this (.build))))

