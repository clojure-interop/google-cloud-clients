(ns com.google.cloud.compute.deprecated.DeprecationStatus
  "The deprecation status associated to a Google Compute Engine resource."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.deprecated DeprecationStatus]))

(defn *new-builder
  "Returns the builder for a DeprecationStatus object given the status and replacement's
   identity.

  status - `com.google.cloud.compute.deprecated.DeprecationStatus$Status`
  replacement - `T`

  returns: `<T extends com.google.cloud.compute.deprecated.ResourceId> com.google.cloud.compute.deprecated.DeprecationStatus$Builder<T>`"
  ([^com.google.cloud.compute.deprecated.DeprecationStatus$Status status replacement]
    (DeprecationStatus/newBuilder status replacement))
  ([^com.google.cloud.compute.deprecated.DeprecationStatus$Status status]
    (DeprecationStatus/newBuilder status)))

(defn *of
  "Returns a DeprecationStatus object given the status and replacement's identity.

  status - `com.google.cloud.compute.deprecated.DeprecationStatus$Status`
  replacement - `T`

  returns: `<T extends com.google.cloud.compute.deprecated.ResourceId> com.google.cloud.compute.deprecated.DeprecationStatus<T>`"
  ([^com.google.cloud.compute.deprecated.DeprecationStatus$Status status replacement]
    (DeprecationStatus/of status replacement)))

(defn get-replacement
  "Returns the identity of the suggested replacement for a deprecated resource. The suggested
   replacement resource must be the same kind of resource as the deprecated resource.

  returns: `T`"
  ([^DeprecationStatus this]
    (-> this (.getReplacement))))

(defn get-obsolete
  "Returns the timestamp on or after which the deprecation state of this resource will be changed
   to DeprecationStatus.Status.OBSOLETE. Returns null if not set. This value should be in RFC3339
   format.

  returns: `java.lang.String`"
  (^java.lang.String [^DeprecationStatus this]
    (-> this (.getObsolete))))

(defn get-status
  "Returns the deprecation state of this resource.

  returns: `com.google.cloud.compute.deprecated.DeprecationStatus$Status`"
  (^com.google.cloud.compute.deprecated.DeprecationStatus$Status [^DeprecationStatus this]
    (-> this (.getStatus))))

(defn get-deprecated-millis
  "Returns the timestamp (in milliseconds since epoch) on or after which the deprecation state of
   this resource will be changed to DeprecationStatus.Status.DEPRECATED. Returns null if not set.

  returns: `java.lang.Long`

  throws: java.lang.IllegalStateException - if getDeprecated() is not a valid date, time or datetime"
  (^java.lang.Long [^DeprecationStatus this]
    (-> this (.getDeprecatedMillis))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^DeprecationStatus this]
    (-> this (.toString))))

(defn get-deprecated
  "Returns the timestamp on or after which the deprecation state of this resource will be changed
   to DeprecationStatus.Status.DEPRECATED. Returns null if not set. This value should be in RFC3339
   format.

  returns: `java.lang.String`"
  (^java.lang.String [^DeprecationStatus this]
    (-> this (.getDeprecated))))

(defn get-deleted
  "Returns the timestamp on or after which the deprecation state of this resource will be changed
   to DeprecationStatus.Status.DELETED. Returns null if not set. This value should be in RFC3339
   format.

  returns: `java.lang.String`"
  (^java.lang.String [^DeprecationStatus this]
    (-> this (.getDeleted))))

(defn hash-code
  "returns: `int`"
  (^Integer [^DeprecationStatus this]
    (-> this (.hashCode))))

(defn get-deleted-millis
  "Returns the timestamp (in milliseconds since epoch) on or after which the deprecation state of
   this resource will be changed to DeprecationStatus.Status.DELETED. Returns null if not set.

  returns: `java.lang.Long`

  throws: java.lang.IllegalStateException - if getDeleted() is not a valid date, time or datetime"
  (^java.lang.Long [^DeprecationStatus this]
    (-> this (.getDeletedMillis))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^DeprecationStatus this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn to-builder
  "Returns a builder for the DeprecationStatus object.

  returns: `com.google.cloud.compute.deprecated.DeprecationStatus$Builder<T>`"
  (^com.google.cloud.compute.deprecated.DeprecationStatus$Builder [^DeprecationStatus this]
    (-> this (.toBuilder))))

(defn get-obsolete-millis
  "Returns the timestamp (in milliseconds since epoch) on or after which the deprecation state of
   this resource will be changed to DeprecationStatus.Status.OBSOLETE. Returns null if not set.

  returns: `java.lang.Long`

  throws: java.lang.IllegalStateException - if getObsolete() is not a valid date, time or datetime"
  (^java.lang.Long [^DeprecationStatus this]
    (-> this (.getObsoleteMillis))))

