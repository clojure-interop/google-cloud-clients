(ns com.google.cloud.compute.deprecated.DiskTypeId
  "Identity for a Google Compute Engine disk type."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated DiskTypeId]))

(defn *of
  "Returns a disk type identity given project disk, zone and disk type names.

  project - `java.lang.String`
  zone - `java.lang.String`
  type - `java.lang.String`

  returns: `com.google.cloud.compute.deprecated.DiskTypeId`"
  (^com.google.cloud.compute.deprecated.DiskTypeId [^java.lang.String project ^java.lang.String zone ^java.lang.String type]
    (DiskTypeId/of project zone type))
  (^com.google.cloud.compute.deprecated.DiskTypeId [^com.google.cloud.compute.deprecated.ZoneId zone-id ^java.lang.String type]
    (DiskTypeId/of zone-id type)))

(defn get-type
  "Returns the name of the disk type.

  returns: `java.lang.String`"
  (^java.lang.String [^DiskTypeId this]
    (-> this (.getType))))

(defn get-zone
  "Returns the name of the zone this disk type belongs to.

  returns: `java.lang.String`"
  (^java.lang.String [^DiskTypeId this]
    (-> this (.getZone))))

(defn get-zone-id
  "Returns the identity of the zone this disk type belongs to.

  returns: `com.google.cloud.compute.deprecated.ZoneId`"
  (^com.google.cloud.compute.deprecated.ZoneId [^DiskTypeId this]
    (-> this (.getZoneId))))

(defn get-self-link
  "Description copied from class: ResourceId

  returns: `java.lang.String`"
  (^java.lang.String [^DiskTypeId this]
    (-> this (.getSelfLink))))

(defn hash-code
  "returns: `int`"
  (^Integer [^DiskTypeId this]
    (-> this (.hashCode))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^DiskTypeId this ^java.lang.Object obj]
    (-> this (.equals obj))))

