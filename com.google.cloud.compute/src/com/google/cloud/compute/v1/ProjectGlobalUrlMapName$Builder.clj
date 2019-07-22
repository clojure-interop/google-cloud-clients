(ns com.google.cloud.compute.v1.ProjectGlobalUrlMapName$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ProjectGlobalUrlMapName$Builder]))

(defn ->builder
  "Constructor.

  project-global-url-map-name - `com.google.cloud.compute.v1.ProjectGlobalUrlMapName`"
  (^ProjectGlobalUrlMapName$Builder [^com.google.cloud.compute.v1.ProjectGlobalUrlMapName project-global-url-map-name]
    (new ProjectGlobalUrlMapName$Builder project-global-url-map-name)))

(defn get-project
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalUrlMapName$Builder this]
    (-> this (.getProject))))

(defn get-url-map
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalUrlMapName$Builder this]
    (-> this (.getUrlMap))))

(defn set-project
  "project - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectGlobalUrlMapName$Builder`"
  (^com.google.cloud.compute.v1.ProjectGlobalUrlMapName$Builder [^ProjectGlobalUrlMapName$Builder this ^java.lang.String project]
    (-> this (.setProject project))))

(defn set-url-map
  "url-map - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectGlobalUrlMapName$Builder`"
  (^com.google.cloud.compute.v1.ProjectGlobalUrlMapName$Builder [^ProjectGlobalUrlMapName$Builder this ^java.lang.String url-map]
    (-> this (.setUrlMap url-map))))

(defn build
  "returns: `com.google.cloud.compute.v1.ProjectGlobalUrlMapName`"
  (^com.google.cloud.compute.v1.ProjectGlobalUrlMapName [^ProjectGlobalUrlMapName$Builder this]
    (-> this (.build))))

