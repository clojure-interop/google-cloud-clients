(ns com.google.cloud.compute.deprecated.Region
  "A Google Compute Engine region."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated Region]))

(defn get-zones
  "Returns a list of identities of zones available in this region.

  returns: `java.util.List<com.google.cloud.compute.deprecated.ZoneId>`"
  (^java.util.List [^Region this]
    (-> this (.getZones))))

(defn get-deprecation-status
  "Returns the deprecation status of the region. If DeprecationStatus.getStatus() is
   either DeprecationStatus.Status.DELETED or DeprecationStatus.Status.OBSOLETE
   the region should not be used. Returns null if the region is not deprecated.

  returns: `com.google.cloud.compute.deprecated.DeprecationStatus<com.google.cloud.compute.deprecated.RegionId>`"
  (^com.google.cloud.compute.deprecated.DeprecationStatus [^Region this]
    (-> this (.getDeprecationStatus))))

(defn get-status
  "Returns the status of the status.

  returns: `com.google.cloud.compute.deprecated.Region$Status`"
  (^com.google.cloud.compute.deprecated.Region$Status [^Region this]
    (-> this (.getStatus))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^Region this]
    (-> this (.toString))))

(defn get-description
  "Returns an optional textual description of the region.

  returns: `java.lang.String`"
  (^java.lang.String [^Region this]
    (-> this (.getDescription))))

(defn get-quotas
  "Returns quotas assigned to this region.

  returns: `java.util.List<com.google.cloud.compute.deprecated.Region$Quota>`"
  (^java.util.List [^Region this]
    (-> this (.getQuotas))))

(defn get-region-id
  "Returns the region's identity.

  returns: `com.google.cloud.compute.deprecated.RegionId`"
  (^com.google.cloud.compute.deprecated.RegionId [^Region this]
    (-> this (.getRegionId))))

(defn hash-code
  "returns: `int`"
  (^Integer [^Region this]
    (-> this (.hashCode))))

(defn get-creation-timestamp
  "Returns the creation timestamp in milliseconds since epoch.

  returns: `java.lang.Long`"
  (^java.lang.Long [^Region this]
    (-> this (.getCreationTimestamp))))

(defn get-generated-id
  "Returns the service-generated unique identifier for the region.

  returns: `java.lang.String`"
  (^java.lang.String [^Region this]
    (-> this (.getGeneratedId))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^Region this ^java.lang.Object obj]
    (-> this (.equals obj))))

