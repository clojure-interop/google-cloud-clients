(ns com.google.cloud.compute.deprecated.DiskId
  "Identity for a Google Compute Engine disk."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated DiskId]))

(defn *of
  "Returns a disk identity given project, zone and disks names. The disk name must be 1-63
   characters long and comply with RFC1035. Specifically, the name must match the regular
   expression [a-z]([-a-z0-9]*[a-z0-9])? which means the first character must be a
   lowercase letter, and all following characters must be a dash, lowercase letter, or digit,
   except the last character, which cannot be a dash.

  project - `java.lang.String`
  zone - `java.lang.String`
  disk - `java.lang.String`

  returns: `com.google.cloud.compute.deprecated.DiskId`"
  (^com.google.cloud.compute.deprecated.DiskId [^java.lang.String project ^java.lang.String zone ^java.lang.String disk]
    (DiskId/of project zone disk))
  (^com.google.cloud.compute.deprecated.DiskId [^com.google.cloud.compute.deprecated.ZoneId zone-id ^java.lang.String disk]
    (DiskId/of zone-id disk)))

(defn get-zone
  "Returns the name of the zone this disk belongs to.

  returns: `java.lang.String`"
  (^java.lang.String [^DiskId this]
    (-> this (.getZone))))

(defn get-zone-id
  "Returns the identity of the zone this disk belongs to.

  returns: `com.google.cloud.compute.deprecated.ZoneId`"
  (^com.google.cloud.compute.deprecated.ZoneId [^DiskId this]
    (-> this (.getZoneId))))

(defn get-disk
  "Returns the name of the disk. The name must be 1-63 characters long and comply with RFC1035.
   Specifically, the name must match the regular expression [a-z]([-a-z0-9]*[a-z0-9])?
   which means the first character must be a lowercase letter, and all following characters must
   be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.

  returns: `java.lang.String`"
  (^java.lang.String [^DiskId this]
    (-> this (.getDisk))))

(defn get-self-link
  "Description copied from class: ResourceId

  returns: `java.lang.String`"
  (^java.lang.String [^DiskId this]
    (-> this (.getSelfLink))))

(defn hash-code
  "returns: `int`"
  (^Integer [^DiskId this]
    (-> this (.hashCode))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^DiskId this ^java.lang.Object obj]
    (-> this (.equals obj))))

