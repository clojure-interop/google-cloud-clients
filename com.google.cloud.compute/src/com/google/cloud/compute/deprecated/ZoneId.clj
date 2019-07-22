(ns com.google.cloud.compute.deprecated.ZoneId
  "A Google Compute Engine zone identity."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated ZoneId]))

(defn *of
  "Returns a new zone identity given project and zone names.

  project - `java.lang.String`
  zone - `java.lang.String`

  returns: `com.google.cloud.compute.deprecated.ZoneId`"
  (^com.google.cloud.compute.deprecated.ZoneId [^java.lang.String project ^java.lang.String zone]
    (ZoneId/of project zone))
  (^com.google.cloud.compute.deprecated.ZoneId [^java.lang.String zone]
    (ZoneId/of zone)))

(defn get-zone
  "Returns the name of the zone.

  returns: `java.lang.String`"
  (^java.lang.String [^ZoneId this]
    (-> this (.getZone))))

(defn get-self-link
  "Description copied from class: ResourceId

  returns: `java.lang.String`"
  (^java.lang.String [^ZoneId this]
    (-> this (.getSelfLink))))

(defn hash-code
  "returns: `int`"
  (^Integer [^ZoneId this]
    (-> this (.hashCode))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^ZoneId this ^java.lang.Object obj]
    (-> this (.equals obj))))

