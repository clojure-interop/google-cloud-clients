(ns com.google.cloud.compute.v1.ProjectGlobalInterconnectName$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ProjectGlobalInterconnectName$Builder]))

(defn ->builder
  "Constructor.

  project-global-interconnect-name - `com.google.cloud.compute.v1.ProjectGlobalInterconnectName`"
  (^ProjectGlobalInterconnectName$Builder [^com.google.cloud.compute.v1.ProjectGlobalInterconnectName project-global-interconnect-name]
    (new ProjectGlobalInterconnectName$Builder project-global-interconnect-name)))

(defn get-interconnect
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalInterconnectName$Builder this]
    (-> this (.getInterconnect))))

(defn get-project
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalInterconnectName$Builder this]
    (-> this (.getProject))))

(defn set-interconnect
  "interconnect - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectGlobalInterconnectName$Builder`"
  (^com.google.cloud.compute.v1.ProjectGlobalInterconnectName$Builder [^ProjectGlobalInterconnectName$Builder this ^java.lang.String interconnect]
    (-> this (.setInterconnect interconnect))))

(defn set-project
  "project - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectGlobalInterconnectName$Builder`"
  (^com.google.cloud.compute.v1.ProjectGlobalInterconnectName$Builder [^ProjectGlobalInterconnectName$Builder this ^java.lang.String project]
    (-> this (.setProject project))))

(defn build
  "returns: `com.google.cloud.compute.v1.ProjectGlobalInterconnectName`"
  (^com.google.cloud.compute.v1.ProjectGlobalInterconnectName [^ProjectGlobalInterconnectName$Builder this]
    (-> this (.build))))

