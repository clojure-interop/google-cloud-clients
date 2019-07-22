(ns com.google.cloud.compute.v1.ProjectGlobalLicenseName$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ProjectGlobalLicenseName$Builder]))

(defn ->builder
  "Constructor.

  project-global-license-name - `com.google.cloud.compute.v1.ProjectGlobalLicenseName`"
  (^ProjectGlobalLicenseName$Builder [^com.google.cloud.compute.v1.ProjectGlobalLicenseName project-global-license-name]
    (new ProjectGlobalLicenseName$Builder project-global-license-name)))

(defn get-license
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalLicenseName$Builder this]
    (-> this (.getLicense))))

(defn get-project
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalLicenseName$Builder this]
    (-> this (.getProject))))

(defn set-license
  "license - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectGlobalLicenseName$Builder`"
  (^com.google.cloud.compute.v1.ProjectGlobalLicenseName$Builder [^ProjectGlobalLicenseName$Builder this ^java.lang.String license]
    (-> this (.setLicense license))))

(defn set-project
  "project - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectGlobalLicenseName$Builder`"
  (^com.google.cloud.compute.v1.ProjectGlobalLicenseName$Builder [^ProjectGlobalLicenseName$Builder this ^java.lang.String project]
    (-> this (.setProject project))))

(defn build
  "returns: `com.google.cloud.compute.v1.ProjectGlobalLicenseName`"
  (^com.google.cloud.compute.v1.ProjectGlobalLicenseName [^ProjectGlobalLicenseName$Builder this]
    (-> this (.build))))

