(ns com.google.cloud.compute.v1.XpnResourceId$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 XpnResourceId$Builder]))

(defn merge-from
  "other - `com.google.cloud.compute.v1.XpnResourceId`

  returns: `com.google.cloud.compute.v1.XpnResourceId$Builder`"
  (^com.google.cloud.compute.v1.XpnResourceId$Builder [^XpnResourceId$Builder this ^com.google.cloud.compute.v1.XpnResourceId other]
    (-> this (.mergeFrom other))))

(defn get-id
  "The ID of the service resource. In the case of projects, this field supports project id
   (e.g., my-project-123) and project number (e.g. 12345678).

  returns: `java.lang.String`"
  (^java.lang.String [^XpnResourceId$Builder this]
    (-> this (.getId))))

(defn set-id
  "The ID of the service resource. In the case of projects, this field supports project id
   (e.g., my-project-123) and project number (e.g. 12345678).

  id - `java.lang.String`

  returns: `com.google.cloud.compute.v1.XpnResourceId$Builder`"
  (^com.google.cloud.compute.v1.XpnResourceId$Builder [^XpnResourceId$Builder this ^java.lang.String id]
    (-> this (.setId id))))

(defn get-type
  "The type of the service resource.

  returns: `java.lang.String`"
  (^java.lang.String [^XpnResourceId$Builder this]
    (-> this (.getType))))

(defn set-type
  "The type of the service resource.

  type - `java.lang.String`

  returns: `com.google.cloud.compute.v1.XpnResourceId$Builder`"
  (^com.google.cloud.compute.v1.XpnResourceId$Builder [^XpnResourceId$Builder this ^java.lang.String type]
    (-> this (.setType type))))

(defn build
  "returns: `com.google.cloud.compute.v1.XpnResourceId`"
  (^com.google.cloud.compute.v1.XpnResourceId [^XpnResourceId$Builder this]
    (-> this (.build))))

(defn clone
  "returns: `com.google.cloud.compute.v1.XpnResourceId$Builder`"
  (^com.google.cloud.compute.v1.XpnResourceId$Builder [^XpnResourceId$Builder this]
    (-> this (.clone))))

