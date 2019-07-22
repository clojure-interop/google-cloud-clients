(ns com.google.cloud.compute.v1.InstanceReference$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 InstanceReference$Builder]))

(defn merge-from
  "other - `com.google.cloud.compute.v1.InstanceReference`

  returns: `com.google.cloud.compute.v1.InstanceReference$Builder`"
  (^com.google.cloud.compute.v1.InstanceReference$Builder [^InstanceReference$Builder this ^com.google.cloud.compute.v1.InstanceReference other]
    (-> this (.mergeFrom other))))

(defn get-instance
  "The URL for a specific instance.

  returns: `java.lang.String`"
  (^java.lang.String [^InstanceReference$Builder this]
    (-> this (.getInstance))))

(defn set-instance
  "The URL for a specific instance.

  instance - `java.lang.String`

  returns: `com.google.cloud.compute.v1.InstanceReference$Builder`"
  (^com.google.cloud.compute.v1.InstanceReference$Builder [^InstanceReference$Builder this ^java.lang.String instance]
    (-> this (.setInstance instance))))

(defn build
  "returns: `com.google.cloud.compute.v1.InstanceReference`"
  (^com.google.cloud.compute.v1.InstanceReference [^InstanceReference$Builder this]
    (-> this (.build))))

(defn clone
  "returns: `com.google.cloud.compute.v1.InstanceReference$Builder`"
  (^com.google.cloud.compute.v1.InstanceReference$Builder [^InstanceReference$Builder this]
    (-> this (.clone))))

