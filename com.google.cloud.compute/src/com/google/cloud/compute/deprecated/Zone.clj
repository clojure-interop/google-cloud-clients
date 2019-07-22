(ns com.google.cloud.compute.deprecated.Zone
  "A Google Compute Engine zone."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated Zone]))

(defn get-deprecation-status
  "Returns the deprecation status of the zone. If DeprecationStatus.getStatus() is either
   DeprecationStatus.Status.DELETED or DeprecationStatus.Status.OBSOLETE the zone
   should not be used. Returns null if the zone is not deprecated.

  returns: `com.google.cloud.compute.deprecated.DeprecationStatus<com.google.cloud.compute.deprecated.ZoneId>`"
  (^com.google.cloud.compute.deprecated.DeprecationStatus [^Zone this]
    (-> this (.getDeprecationStatus))))

(defn get-status
  "Returns the status of the zone.

  returns: `com.google.cloud.compute.deprecated.Zone$Status`"
  (^com.google.cloud.compute.deprecated.Zone$Status [^Zone this]
    (-> this (.getStatus))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^Zone this]
    (-> this (.toString))))

(defn get-description
  "Returns an optional textual description of the zone.

  returns: `java.lang.String`"
  (^java.lang.String [^Zone this]
    (-> this (.getDescription))))

(defn get-zone-id
  "Returns the zone's identity.

  returns: `com.google.cloud.compute.deprecated.ZoneId`"
  (^com.google.cloud.compute.deprecated.ZoneId [^Zone this]
    (-> this (.getZoneId))))

(defn hash-code
  "returns: `int`"
  (^Integer [^Zone this]
    (-> this (.hashCode))))

(defn get-creation-timestamp
  "Returns the creation timestamp in milliseconds since epoch.

  returns: `java.lang.Long`"
  (^java.lang.Long [^Zone this]
    (-> this (.getCreationTimestamp))))

(defn get-generated-id
  "Returns the service-generated unique identifier for the zone.

  returns: `java.lang.String`"
  (^java.lang.String [^Zone this]
    (-> this (.getGeneratedId))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^Zone this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn get-region
  "Returns the identity of the region that hosts the zone.

  returns: `com.google.cloud.compute.deprecated.RegionId`"
  (^com.google.cloud.compute.deprecated.RegionId [^Zone this]
    (-> this (.getRegion))))

