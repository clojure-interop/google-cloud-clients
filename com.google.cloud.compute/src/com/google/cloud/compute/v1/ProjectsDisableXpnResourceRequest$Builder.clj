(ns com.google.cloud.compute.v1.ProjectsDisableXpnResourceRequest$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ProjectsDisableXpnResourceRequest$Builder]))

(defn merge-from
  "other - `com.google.cloud.compute.v1.ProjectsDisableXpnResourceRequest`

  returns: `com.google.cloud.compute.v1.ProjectsDisableXpnResourceRequest$Builder`"
  (^com.google.cloud.compute.v1.ProjectsDisableXpnResourceRequest$Builder [^ProjectsDisableXpnResourceRequest$Builder this ^com.google.cloud.compute.v1.ProjectsDisableXpnResourceRequest other]
    (-> this (.mergeFrom other))))

(defn get-xpn-resource
  "Service resource (a.k.a service project) ID.

  returns: `com.google.cloud.compute.v1.XpnResourceId`"
  (^com.google.cloud.compute.v1.XpnResourceId [^ProjectsDisableXpnResourceRequest$Builder this]
    (-> this (.getXpnResource))))

(defn set-xpn-resource
  "Service resource (a.k.a service project) ID.

  xpn-resource - `com.google.cloud.compute.v1.XpnResourceId`

  returns: `com.google.cloud.compute.v1.ProjectsDisableXpnResourceRequest$Builder`"
  (^com.google.cloud.compute.v1.ProjectsDisableXpnResourceRequest$Builder [^ProjectsDisableXpnResourceRequest$Builder this ^com.google.cloud.compute.v1.XpnResourceId xpn-resource]
    (-> this (.setXpnResource xpn-resource))))

(defn build
  "returns: `com.google.cloud.compute.v1.ProjectsDisableXpnResourceRequest`"
  (^com.google.cloud.compute.v1.ProjectsDisableXpnResourceRequest [^ProjectsDisableXpnResourceRequest$Builder this]
    (-> this (.build))))

(defn clone
  "returns: `com.google.cloud.compute.v1.ProjectsDisableXpnResourceRequest$Builder`"
  (^com.google.cloud.compute.v1.ProjectsDisableXpnResourceRequest$Builder [^ProjectsDisableXpnResourceRequest$Builder this]
    (-> this (.clone))))

