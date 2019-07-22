(ns com.google.cloud.compute.v1.ProjectGlobalLicenseCodeResourceName$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ProjectGlobalLicenseCodeResourceName$Builder]))

(defn ->builder
  "Constructor.

  project-global-license-code-resource-name - `com.google.cloud.compute.v1.ProjectGlobalLicenseCodeResourceName`"
  (^ProjectGlobalLicenseCodeResourceName$Builder [^com.google.cloud.compute.v1.ProjectGlobalLicenseCodeResourceName project-global-license-code-resource-name]
    (new ProjectGlobalLicenseCodeResourceName$Builder project-global-license-code-resource-name)))

(defn get-project
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalLicenseCodeResourceName$Builder this]
    (-> this (.getProject))))

(defn get-resource
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalLicenseCodeResourceName$Builder this]
    (-> this (.getResource))))

(defn set-project
  "project - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectGlobalLicenseCodeResourceName$Builder`"
  (^com.google.cloud.compute.v1.ProjectGlobalLicenseCodeResourceName$Builder [^ProjectGlobalLicenseCodeResourceName$Builder this ^java.lang.String project]
    (-> this (.setProject project))))

(defn set-resource
  "resource - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectGlobalLicenseCodeResourceName$Builder`"
  (^com.google.cloud.compute.v1.ProjectGlobalLicenseCodeResourceName$Builder [^ProjectGlobalLicenseCodeResourceName$Builder this ^java.lang.String resource]
    (-> this (.setResource resource))))

(defn build
  "returns: `com.google.cloud.compute.v1.ProjectGlobalLicenseCodeResourceName`"
  (^com.google.cloud.compute.v1.ProjectGlobalLicenseCodeResourceName [^ProjectGlobalLicenseCodeResourceName$Builder this]
    (-> this (.build))))

