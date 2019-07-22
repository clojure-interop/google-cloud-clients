(ns com.google.cloud.compute.v1.ProjectGlobalInstanceTemplateName$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ProjectGlobalInstanceTemplateName$Builder]))

(defn ->builder
  "Constructor.

  project-global-instance-template-name - `com.google.cloud.compute.v1.ProjectGlobalInstanceTemplateName`"
  (^ProjectGlobalInstanceTemplateName$Builder [^com.google.cloud.compute.v1.ProjectGlobalInstanceTemplateName project-global-instance-template-name]
    (new ProjectGlobalInstanceTemplateName$Builder project-global-instance-template-name)))

(defn get-instance-template
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalInstanceTemplateName$Builder this]
    (-> this (.getInstanceTemplate))))

(defn get-project
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalInstanceTemplateName$Builder this]
    (-> this (.getProject))))

(defn set-instance-template
  "instance-template - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectGlobalInstanceTemplateName$Builder`"
  (^com.google.cloud.compute.v1.ProjectGlobalInstanceTemplateName$Builder [^ProjectGlobalInstanceTemplateName$Builder this ^java.lang.String instance-template]
    (-> this (.setInstanceTemplate instance-template))))

(defn set-project
  "project - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectGlobalInstanceTemplateName$Builder`"
  (^com.google.cloud.compute.v1.ProjectGlobalInstanceTemplateName$Builder [^ProjectGlobalInstanceTemplateName$Builder this ^java.lang.String project]
    (-> this (.setProject project))))

(defn build
  "returns: `com.google.cloud.compute.v1.ProjectGlobalInstanceTemplateName`"
  (^com.google.cloud.compute.v1.ProjectGlobalInstanceTemplateName [^ProjectGlobalInstanceTemplateName$Builder this]
    (-> this (.build))))

