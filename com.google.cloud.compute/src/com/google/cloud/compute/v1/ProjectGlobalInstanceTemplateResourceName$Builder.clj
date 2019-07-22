(ns com.google.cloud.compute.v1.ProjectGlobalInstanceTemplateResourceName$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ProjectGlobalInstanceTemplateResourceName$Builder]))

(defn ->builder
  "Constructor.

  project-global-instance-template-resource-name - `com.google.cloud.compute.v1.ProjectGlobalInstanceTemplateResourceName`"
  (^ProjectGlobalInstanceTemplateResourceName$Builder [^com.google.cloud.compute.v1.ProjectGlobalInstanceTemplateResourceName project-global-instance-template-resource-name]
    (new ProjectGlobalInstanceTemplateResourceName$Builder project-global-instance-template-resource-name)))

(defn get-project
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalInstanceTemplateResourceName$Builder this]
    (-> this (.getProject))))

(defn get-resource
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalInstanceTemplateResourceName$Builder this]
    (-> this (.getResource))))

(defn set-project
  "project - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectGlobalInstanceTemplateResourceName$Builder`"
  (^com.google.cloud.compute.v1.ProjectGlobalInstanceTemplateResourceName$Builder [^ProjectGlobalInstanceTemplateResourceName$Builder this ^java.lang.String project]
    (-> this (.setProject project))))

(defn set-resource
  "resource - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectGlobalInstanceTemplateResourceName$Builder`"
  (^com.google.cloud.compute.v1.ProjectGlobalInstanceTemplateResourceName$Builder [^ProjectGlobalInstanceTemplateResourceName$Builder this ^java.lang.String resource]
    (-> this (.setResource resource))))

(defn build
  "returns: `com.google.cloud.compute.v1.ProjectGlobalInstanceTemplateResourceName`"
  (^com.google.cloud.compute.v1.ProjectGlobalInstanceTemplateResourceName [^ProjectGlobalInstanceTemplateResourceName$Builder this]
    (-> this (.build))))

