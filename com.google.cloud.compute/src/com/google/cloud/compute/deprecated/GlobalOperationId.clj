(ns com.google.cloud.compute.deprecated.GlobalOperationId
  "Identity for a Google Compute Engine global operation."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated GlobalOperationId]))

(defn *of
  "Returns a global operation identity given project and operation names.

  project - `java.lang.String`
  operation - `java.lang.String`

  returns: `com.google.cloud.compute.deprecated.GlobalOperationId`"
  (^com.google.cloud.compute.deprecated.GlobalOperationId [^java.lang.String project ^java.lang.String operation]
    (GlobalOperationId/of project operation))
  (^com.google.cloud.compute.deprecated.GlobalOperationId [^java.lang.String operation]
    (GlobalOperationId/of operation)))

(defn get-type
  "Description copied from class: OperationId

  returns: `com.google.cloud.compute.deprecated.OperationId.Type`"
  (^com.google.cloud.compute.deprecated.OperationId.Type [^GlobalOperationId this]
    (-> this (.getType))))

(defn get-self-link
  "Description copied from class: ResourceId

  returns: `java.lang.String`"
  (^java.lang.String [^GlobalOperationId this]
    (-> this (.getSelfLink))))

(defn hash-code
  "returns: `int`"
  (^Integer [^GlobalOperationId this]
    (-> this (.hashCode))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^GlobalOperationId this ^java.lang.Object obj]
    (-> this (.equals obj))))

