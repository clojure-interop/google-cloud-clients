(ns com.google.cloud.compute.v1.ProjectGlobalInterconnectLocationName$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ProjectGlobalInterconnectLocationName$Builder]))

(defn ->builder
  "Constructor.

  project-global-interconnect-location-name - `com.google.cloud.compute.v1.ProjectGlobalInterconnectLocationName`"
  (^ProjectGlobalInterconnectLocationName$Builder [^com.google.cloud.compute.v1.ProjectGlobalInterconnectLocationName project-global-interconnect-location-name]
    (new ProjectGlobalInterconnectLocationName$Builder project-global-interconnect-location-name)))

(defn get-interconnect-location
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalInterconnectLocationName$Builder this]
    (-> this (.getInterconnectLocation))))

(defn get-project
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalInterconnectLocationName$Builder this]
    (-> this (.getProject))))

(defn set-interconnect-location
  "interconnect-location - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectGlobalInterconnectLocationName$Builder`"
  (^com.google.cloud.compute.v1.ProjectGlobalInterconnectLocationName$Builder [^ProjectGlobalInterconnectLocationName$Builder this ^java.lang.String interconnect-location]
    (-> this (.setInterconnectLocation interconnect-location))))

(defn set-project
  "project - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectGlobalInterconnectLocationName$Builder`"
  (^com.google.cloud.compute.v1.ProjectGlobalInterconnectLocationName$Builder [^ProjectGlobalInterconnectLocationName$Builder this ^java.lang.String project]
    (-> this (.setProject project))))

(defn build
  "returns: `com.google.cloud.compute.v1.ProjectGlobalInterconnectLocationName`"
  (^com.google.cloud.compute.v1.ProjectGlobalInterconnectLocationName [^ProjectGlobalInterconnectLocationName$Builder this]
    (-> this (.build))))

