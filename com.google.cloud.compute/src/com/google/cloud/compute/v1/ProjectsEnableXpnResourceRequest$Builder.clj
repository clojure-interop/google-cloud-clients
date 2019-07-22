(ns com.google.cloud.compute.v1.ProjectsEnableXpnResourceRequest$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ProjectsEnableXpnResourceRequest$Builder]))

(defn merge-from
  "other - `com.google.cloud.compute.v1.ProjectsEnableXpnResourceRequest`

  returns: `com.google.cloud.compute.v1.ProjectsEnableXpnResourceRequest$Builder`"
  (^com.google.cloud.compute.v1.ProjectsEnableXpnResourceRequest$Builder [^ProjectsEnableXpnResourceRequest$Builder this ^com.google.cloud.compute.v1.ProjectsEnableXpnResourceRequest other]
    (-> this (.mergeFrom other))))

(defn get-xpn-resource
  "Service resource (a.k.a service project) ID.

  returns: `com.google.cloud.compute.v1.XpnResourceId`"
  (^com.google.cloud.compute.v1.XpnResourceId [^ProjectsEnableXpnResourceRequest$Builder this]
    (-> this (.getXpnResource))))

(defn set-xpn-resource
  "Service resource (a.k.a service project) ID.

  xpn-resource - `com.google.cloud.compute.v1.XpnResourceId`

  returns: `com.google.cloud.compute.v1.ProjectsEnableXpnResourceRequest$Builder`"
  (^com.google.cloud.compute.v1.ProjectsEnableXpnResourceRequest$Builder [^ProjectsEnableXpnResourceRequest$Builder this ^com.google.cloud.compute.v1.XpnResourceId xpn-resource]
    (-> this (.setXpnResource xpn-resource))))

(defn build
  "returns: `com.google.cloud.compute.v1.ProjectsEnableXpnResourceRequest`"
  (^com.google.cloud.compute.v1.ProjectsEnableXpnResourceRequest [^ProjectsEnableXpnResourceRequest$Builder this]
    (-> this (.build))))

(defn clone
  "returns: `com.google.cloud.compute.v1.ProjectsEnableXpnResourceRequest$Builder`"
  (^com.google.cloud.compute.v1.ProjectsEnableXpnResourceRequest$Builder [^ProjectsEnableXpnResourceRequest$Builder this]
    (-> this (.clone))))

