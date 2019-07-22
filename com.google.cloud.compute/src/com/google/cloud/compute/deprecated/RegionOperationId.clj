(ns com.google.cloud.compute.deprecated.RegionOperationId
  "Identity for a Google Compute Engine region's operation."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated RegionOperationId]))

(defn *of
  "Returns a region operation identity given project, region and operation names.

  project - `java.lang.String`
  region - `java.lang.String`
  operation - `java.lang.String`

  returns: `com.google.cloud.compute.deprecated.RegionOperationId`"
  (^com.google.cloud.compute.deprecated.RegionOperationId [^java.lang.String project ^java.lang.String region ^java.lang.String operation]
    (RegionOperationId/of project region operation))
  (^com.google.cloud.compute.deprecated.RegionOperationId [^com.google.cloud.compute.deprecated.RegionId region-id ^java.lang.String operation]
    (RegionOperationId/of region-id operation)))

(defn get-type
  "Description copied from class: OperationId

  returns: `com.google.cloud.compute.deprecated.OperationId.Type`"
  (^com.google.cloud.compute.deprecated.OperationId.Type [^RegionOperationId this]
    (-> this (.getType))))

(defn get-region
  "Returns the name of the region this operation belongs to.

  returns: `java.lang.String`"
  (^java.lang.String [^RegionOperationId this]
    (-> this (.getRegion))))

(defn get-region-id
  "Returns the identity of the region this operation belongs to.

  returns: `com.google.cloud.compute.deprecated.RegionId`"
  (^com.google.cloud.compute.deprecated.RegionId [^RegionOperationId this]
    (-> this (.getRegionId))))

(defn get-self-link
  "Description copied from class: ResourceId

  returns: `java.lang.String`"
  (^java.lang.String [^RegionOperationId this]
    (-> this (.getSelfLink))))

(defn hash-code
  "returns: `int`"
  (^Integer [^RegionOperationId this]
    (-> this (.hashCode))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^RegionOperationId this ^java.lang.Object obj]
    (-> this (.equals obj))))

