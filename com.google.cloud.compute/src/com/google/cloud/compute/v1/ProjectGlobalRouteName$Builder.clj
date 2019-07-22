(ns com.google.cloud.compute.v1.ProjectGlobalRouteName$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ProjectGlobalRouteName$Builder]))

(defn ->builder
  "Constructor.

  project-global-route-name - `com.google.cloud.compute.v1.ProjectGlobalRouteName`"
  (^ProjectGlobalRouteName$Builder [^com.google.cloud.compute.v1.ProjectGlobalRouteName project-global-route-name]
    (new ProjectGlobalRouteName$Builder project-global-route-name)))

(defn get-project
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalRouteName$Builder this]
    (-> this (.getProject))))

(defn get-route
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalRouteName$Builder this]
    (-> this (.getRoute))))

(defn set-project
  "project - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectGlobalRouteName$Builder`"
  (^com.google.cloud.compute.v1.ProjectGlobalRouteName$Builder [^ProjectGlobalRouteName$Builder this ^java.lang.String project]
    (-> this (.setProject project))))

(defn set-route
  "route - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectGlobalRouteName$Builder`"
  (^com.google.cloud.compute.v1.ProjectGlobalRouteName$Builder [^ProjectGlobalRouteName$Builder this ^java.lang.String route]
    (-> this (.setRoute route))))

(defn build
  "returns: `com.google.cloud.compute.v1.ProjectGlobalRouteName`"
  (^com.google.cloud.compute.v1.ProjectGlobalRouteName [^ProjectGlobalRouteName$Builder this]
    (-> this (.build))))

