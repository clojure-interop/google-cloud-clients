(ns com.google.cloud.compute.deprecated.RegionId
  "A Google Compute Engine region identity."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated RegionId]))

(defn *of
  "Returns a new region identity given project and region names.

  project - `java.lang.String`
  region - `java.lang.String`

  returns: `com.google.cloud.compute.deprecated.RegionId`"
  (^com.google.cloud.compute.deprecated.RegionId [^java.lang.String project ^java.lang.String region]
    (RegionId/of project region))
  (^com.google.cloud.compute.deprecated.RegionId [^java.lang.String region]
    (RegionId/of region)))

(defn get-region
  "Returns the name of the region.

  returns: `java.lang.String`"
  (^java.lang.String [^RegionId this]
    (-> this (.getRegion))))

(defn get-self-link
  "Description copied from class: ResourceId

  returns: `java.lang.String`"
  (^java.lang.String [^RegionId this]
    (-> this (.getSelfLink))))

(defn hash-code
  "returns: `int`"
  (^Integer [^RegionId this]
    (-> this (.hashCode))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^RegionId this ^java.lang.Object obj]
    (-> this (.equals obj))))

