(ns com.google.cloud.compute.v1.ProjectGlobalLicenseCodeName$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ProjectGlobalLicenseCodeName$Builder]))

(defn ->builder
  "Constructor.

  project-global-license-code-name - `com.google.cloud.compute.v1.ProjectGlobalLicenseCodeName`"
  (^ProjectGlobalLicenseCodeName$Builder [^com.google.cloud.compute.v1.ProjectGlobalLicenseCodeName project-global-license-code-name]
    (new ProjectGlobalLicenseCodeName$Builder project-global-license-code-name)))

(defn get-license-code
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalLicenseCodeName$Builder this]
    (-> this (.getLicenseCode))))

(defn get-project
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalLicenseCodeName$Builder this]
    (-> this (.getProject))))

(defn set-license-code
  "license-code - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectGlobalLicenseCodeName$Builder`"
  (^com.google.cloud.compute.v1.ProjectGlobalLicenseCodeName$Builder [^ProjectGlobalLicenseCodeName$Builder this ^java.lang.String license-code]
    (-> this (.setLicenseCode license-code))))

(defn set-project
  "project - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectGlobalLicenseCodeName$Builder`"
  (^com.google.cloud.compute.v1.ProjectGlobalLicenseCodeName$Builder [^ProjectGlobalLicenseCodeName$Builder this ^java.lang.String project]
    (-> this (.setProject project))))

(defn build
  "returns: `com.google.cloud.compute.v1.ProjectGlobalLicenseCodeName`"
  (^com.google.cloud.compute.v1.ProjectGlobalLicenseCodeName [^ProjectGlobalLicenseCodeName$Builder this]
    (-> this (.build))))

