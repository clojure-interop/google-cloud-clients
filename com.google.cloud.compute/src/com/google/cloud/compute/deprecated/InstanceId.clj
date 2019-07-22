(ns com.google.cloud.compute.deprecated.InstanceId
  "Identity for a Google Compute Engine virtual machine instance."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated InstanceId]))

(defn *of
  "Returns an instance identity given project, zone and instance names. The instance name must be
   1-63 characters long and comply with RFC1035. Specifically, the name must match the regular
   expression [a-z]([-a-z0-9]*[a-z0-9])? which means the first character must be a
   lowercase letter, and all following characters must be a dash, lowercase letter, or digit,
   except the last character, which cannot be a dash.

  project - `java.lang.String`
  zone - `java.lang.String`
  instance - `java.lang.String`

  returns: `com.google.cloud.compute.deprecated.InstanceId`"
  (^com.google.cloud.compute.deprecated.InstanceId [^java.lang.String project ^java.lang.String zone ^java.lang.String instance]
    (InstanceId/of project zone instance))
  (^com.google.cloud.compute.deprecated.InstanceId [^com.google.cloud.compute.deprecated.ZoneId zone-id ^java.lang.String instance]
    (InstanceId/of zone-id instance)))

(defn get-instance
  "Returns the name of the instance. The name must be 1-63 characters long and comply with
   RFC1035. Specifically, the name must match the regular expression [a-z]([-a-z0-9]*[a-z0-9])? which means the first character must be a lowercase letter, and all
   following characters must be a dash, lowercase letter, or digit, except the last character,
   which cannot be a dash.

  returns: `java.lang.String`"
  (^java.lang.String [^InstanceId this]
    (-> this (.getInstance))))

(defn get-zone
  "Returns the name of the zone this instance belongs to.

  returns: `java.lang.String`"
  (^java.lang.String [^InstanceId this]
    (-> this (.getZone))))

(defn get-zone-id
  "Returns the identity of the zone this instance belongs to.

  returns: `com.google.cloud.compute.deprecated.ZoneId`"
  (^com.google.cloud.compute.deprecated.ZoneId [^InstanceId this]
    (-> this (.getZoneId))))

(defn get-self-link
  "Description copied from class: ResourceId

  returns: `java.lang.String`"
  (^java.lang.String [^InstanceId this]
    (-> this (.getSelfLink))))

(defn hash-code
  "returns: `int`"
  (^Integer [^InstanceId this]
    (-> this (.hashCode))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^InstanceId this ^java.lang.Object obj]
    (-> this (.equals obj))))

