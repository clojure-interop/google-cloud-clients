(ns com.google.cloud.compute.deprecated.ZoneOperationId
  "Identity for a Google Compute Engine zone operation."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated ZoneOperationId]))

(defn *of
  "Returns a zone operation identity given project, zone and operation names.

  project - `java.lang.String`
  zone - `java.lang.String`
  operation - `java.lang.String`

  returns: `com.google.cloud.compute.deprecated.ZoneOperationId`"
  (^com.google.cloud.compute.deprecated.ZoneOperationId [^java.lang.String project ^java.lang.String zone ^java.lang.String operation]
    (ZoneOperationId/of project zone operation))
  (^com.google.cloud.compute.deprecated.ZoneOperationId [^com.google.cloud.compute.deprecated.ZoneId zone-id ^java.lang.String operation]
    (ZoneOperationId/of zone-id operation)))

(defn get-type
  "Description copied from class: OperationId

  returns: `com.google.cloud.compute.deprecated.OperationId.Type`"
  (^com.google.cloud.compute.deprecated.OperationId.Type [^ZoneOperationId this]
    (-> this (.getType))))

(defn get-zone
  "Returns the name of the zone this operation belongs to.

  returns: `java.lang.String`"
  (^java.lang.String [^ZoneOperationId this]
    (-> this (.getZone))))

(defn get-zone-id
  "Returns the identity of the zone this address belongs to.

  returns: `com.google.cloud.compute.deprecated.ZoneId`"
  (^com.google.cloud.compute.deprecated.ZoneId [^ZoneOperationId this]
    (-> this (.getZoneId))))

(defn get-self-link
  "Description copied from class: ResourceId

  returns: `java.lang.String`"
  (^java.lang.String [^ZoneOperationId this]
    (-> this (.getSelfLink))))

(defn hash-code
  "returns: `int`"
  (^Integer [^ZoneOperationId this]
    (-> this (.hashCode))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^ZoneOperationId this ^java.lang.Object obj]
    (-> this (.equals obj))))

