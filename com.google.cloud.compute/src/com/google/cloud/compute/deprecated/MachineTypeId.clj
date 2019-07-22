(ns com.google.cloud.compute.deprecated.MachineTypeId
  "Identity for a Google Compute Engine machine type."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated MachineTypeId]))

(defn *of
  "Returns a machine type identity given project, zone and type names.

  project - `java.lang.String`
  zone - `java.lang.String`
  type - `java.lang.String`

  returns: `com.google.cloud.compute.deprecated.MachineTypeId`"
  (^com.google.cloud.compute.deprecated.MachineTypeId [^java.lang.String project ^java.lang.String zone ^java.lang.String type]
    (MachineTypeId/of project zone type))
  (^com.google.cloud.compute.deprecated.MachineTypeId [^java.lang.String zone ^java.lang.String type]
    (MachineTypeId/of zone type)))

(defn get-type
  "Returns the name of the machine type.

  returns: `java.lang.String`"
  (^java.lang.String [^MachineTypeId this]
    (-> this (.getType))))

(defn get-zone
  "Returns the name of the zone this machine type belongs to.

  returns: `java.lang.String`"
  (^java.lang.String [^MachineTypeId this]
    (-> this (.getZone))))

(defn get-zone-id
  "Returns the identity of the zone this machine type belongs to.

  returns: `com.google.cloud.compute.deprecated.ZoneId`"
  (^com.google.cloud.compute.deprecated.ZoneId [^MachineTypeId this]
    (-> this (.getZoneId))))

(defn get-self-link
  "Description copied from class: ResourceId

  returns: `java.lang.String`"
  (^java.lang.String [^MachineTypeId this]
    (-> this (.getSelfLink))))

(defn hash-code
  "returns: `int`"
  (^Integer [^MachineTypeId this]
    (-> this (.hashCode))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^MachineTypeId this ^java.lang.Object obj]
    (-> this (.equals obj))))

