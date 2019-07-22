(ns com.google.cloud.compute.v1.ProjectGlobalLicenseResourceName$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ProjectGlobalLicenseResourceName$Builder]))

(defn ->builder
  "Constructor.

  project-global-license-resource-name - `com.google.cloud.compute.v1.ProjectGlobalLicenseResourceName`"
  (^ProjectGlobalLicenseResourceName$Builder [^com.google.cloud.compute.v1.ProjectGlobalLicenseResourceName project-global-license-resource-name]
    (new ProjectGlobalLicenseResourceName$Builder project-global-license-resource-name)))

(defn get-project
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalLicenseResourceName$Builder this]
    (-> this (.getProject))))

(defn get-resource
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalLicenseResourceName$Builder this]
    (-> this (.getResource))))

(defn set-project
  "project - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectGlobalLicenseResourceName$Builder`"
  (^com.google.cloud.compute.v1.ProjectGlobalLicenseResourceName$Builder [^ProjectGlobalLicenseResourceName$Builder this ^java.lang.String project]
    (-> this (.setProject project))))

(defn set-resource
  "resource - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectGlobalLicenseResourceName$Builder`"
  (^com.google.cloud.compute.v1.ProjectGlobalLicenseResourceName$Builder [^ProjectGlobalLicenseResourceName$Builder this ^java.lang.String resource]
    (-> this (.setResource resource))))

(defn build
  "returns: `com.google.cloud.compute.v1.ProjectGlobalLicenseResourceName`"
  (^com.google.cloud.compute.v1.ProjectGlobalLicenseResourceName [^ProjectGlobalLicenseResourceName$Builder this]
    (-> this (.build))))

